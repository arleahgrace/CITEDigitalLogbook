 package com.example.citelogbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

 public class leave_content extends AppCompatActivity {
    TextView content_name, content_email, content_date, content_reason;
    String textname,textemail, textdate,textreason, textLeaveUID, sEmail, sPassword;
    Button backleave_content, approve_button, decline_button;
    FirebaseFirestore mFstore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leave_content_layout);

        mFstore = FirebaseFirestore.getInstance();
        content_name = findViewById(R.id.details_name);
        content_email = findViewById(R.id.details_email);
        content_date = findViewById(R.id.details_date);
        content_reason = findViewById(R.id.details_reason);
        backleave_content = findViewById(R.id.backleave_content);
        approve_button = findViewById(R.id.approve_button);
        decline_button = findViewById(R.id.decline_button);

        textname = getIntent().getStringExtra("name");
        textemail = getIntent().getStringExtra("email");
        textdate = getIntent().getStringExtra("date");
        textreason = getIntent().getStringExtra("reason");
        textLeaveUID = getIntent().getStringExtra("leaveUID");

        content_name.setText(textname);
        content_email.setText(textemail);
        content_date.setText(textdate);
        content_reason.setText(textreason);

        //Sender email credential
        sEmail = "citelogbook@gmail.com";
        sPassword = "citelogbook123";

        approve_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //initialize properties

                Properties properties = new Properties();
                properties.put("mail.smtp.auth","true");
                properties.put("mail.smtp.starttls.enable", "true");
                properties.put("mail.smtp.host", "smtp.gmail.com");
                properties.put("mail.smtp.port", "587");

                //initialize session
                Session session = Session.getInstance(properties, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(sEmail, sPassword);
                    }
                });


                try {
                    //initialize email content
                    Message message = new MimeMessage(session);
                    //Sender Email
                    message.setFrom(new InternetAddress(sEmail));
                    //Recepient Email
                    message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(content_email.getText().toString().trim()));
                    //email subject
                    message.setSubject("Approved Leave Request");
                    //email message
                    message.setText("Good Day! This is to inform you that your leave reaquest has been approved. Thank you!");

                    //send email

                    new SendMail().execute(message);

                } catch (MessagingException e) {
                    e.printStackTrace();
                }


            }
        });

        decline_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //initialize properties

                Properties declineprop = new Properties();
                declineprop.put("mail.smtp.auth","true");
                declineprop.put("mail.smtp.starttls.enable", "true");
                declineprop.put("mail.smtp.host", "smtp.gmail.com");
                declineprop.put("mail.smtp.port", "587");

                //initialize session
                Session session = Session.getInstance(declineprop, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(sEmail, sPassword);
                    }
                });


                try {
                    //initialize email content
                    Message decmessage = new MimeMessage(session);
                    //Sender Email
                    decmessage.setFrom(new InternetAddress(sEmail));
                    //Recepient Email
                    decmessage.setRecipients(Message.RecipientType.TO,InternetAddress.parse(content_email.getText().toString().trim()));
                    //email subject
                    decmessage.setSubject("Leave Request Declined");
                    //email message
                    decmessage.setText("Good Day! This is to inform you that your leave reaquest has been declined. Please message the admin for other concerns. Thank you!");

                    //send email

                    new SendDeclineMail().execute(decmessage);

                } catch (MessagingException e) {
                    e.printStackTrace();
                }

            }
        });

        backleave_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLeave=new Intent(leave_content.this,Leave_admin.class);
                startActivity(toLeave);
            }
        });

    }

    private class SendDeclineMail extends AsyncTask<Message, String, String>{

        //initial progress dialog

        private ProgressDialog progressDecDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            //create  and show progress dialog

            progressDecDialog = ProgressDialog.show(leave_content.this, "Please Wait", "Sending Mail...", true, false);
        }

        @Override
        protected String doInBackground(Message... messages) {
            //when success
            try {
                Transport.send(messages[0]);
                return "Success";
            } catch (MessagingException e) {
                //when error
                e.printStackTrace();
                return "Error";
            }
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            //dismiss progress dialog
            progressDecDialog.dismiss();
            if (s.equals("Success")) {
                //when success
                //initialize toast
                mFstore.collection("leave_requests").document(textLeaveUID).delete().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(leave_content.this,"Request Declined", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(leave_content.this,"Something Went Wrong, Please Try again", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                Toast.makeText(leave_content.this, "Mail Sent Successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(leave_content.this, "Something Went Wrong", Toast.LENGTH_SHORT).show();
            }


        }
    }

     private class SendMail extends AsyncTask<Message, String, String> {
        //initial progress dialog

        private ProgressDialog progressDialog;

         @Override
         protected void onPreExecute() {
             super.onPreExecute();

             //create  and show progress dialog

             progressDialog = ProgressDialog.show(leave_content.this, "Please Wait", "Sending Mail...", true, false);
         }

         @Override
         protected String doInBackground(Message... messages) {
             //when success
             try {
                 Transport.send(messages[0]);
                 return "Success";
             } catch (MessagingException e) {
                 //when error
                 e.printStackTrace();
                 return "Error";
             }
         }

         @Override
         protected void onPostExecute(String s) {
             super.onPostExecute(s);
             //dismiss progress dialog
             progressDialog.dismiss();
             if(s.equals("Success")){
                 //when success
                 //initialize toast
                 mFstore.collection("leave_requests").document(textLeaveUID).delete();
                 DocumentReference approvedUID = mFstore.collection("approved_requests").document();

                 Map<String, String> approvedMap = new HashMap<>();

                 approvedMap.put("approved_name", content_name.getText().toString());
                 approvedMap.put("approved_date", content_date.getText().toString());
                 approvedMap.put("approved_reason", content_reason.getText().toString());
                 approvedMap.put("status","approved");
                 approvedMap.put("approvedUID", approvedUID.getId());

                 approvedUID.set(approvedMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                     @Override
                     public void onComplete(@NonNull Task<Void> task) {
                         if(task.isSuccessful()){
                             Toast.makeText(leave_content.this, "Request Successfully Approved", Toast.LENGTH_SHORT).show();
                             finish();
                         }
                         else{
                             Toast.makeText(leave_content.this, "Failed Approving Request", Toast.LENGTH_SHORT).show();
                         }
                     }
                 }).addOnFailureListener(new OnFailureListener() {
                     @Override
                     public void onFailure(@NonNull Exception e) {
                         String error = e.getMessage();
                         Toast.makeText(leave_content.this,"Error: "+ error,Toast.LENGTH_SHORT).show();
                     }
                 });
                 Toast.makeText(leave_content.this, "Mail Sent Successfully", Toast.LENGTH_SHORT).show();
             }
             else{
                 Toast.makeText(leave_content.this, "Something Went Wrong", Toast.LENGTH_SHORT).show();
             }
         }
     }
 }