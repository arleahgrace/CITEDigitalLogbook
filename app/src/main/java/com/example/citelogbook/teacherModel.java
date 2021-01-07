package com.example.citelogbook;

public class teacherModel{
    private String fullname, idNumber, userID,
    /*Monday*/
    day1, amSubject1, amSection1, amSTime1, amETime1, day2, amSubject2, amSection2, amSTime2, amETime2, day3, amSubject3, amSection3, amSTime3, amETime3, day4, pmSubject4, pmSection4, pmSTime4, pmETime4, day5, pmSubject5, pmSection5, pmSTime5, pmETime5,      
    //Tuesday
     day6, amSubject6, amSection6, amSTime6, amETime6, day7, amSubject7, amSection7, amSTime7, amETime7, day8, amSubject8, amSection8,amSTime8, amETime8, day9, pmSubject9, pmSection9, pmSTime9, pmETime9, day10, pmSubject10, pmSection10, pmSTime10, pmETime10,
    //Wednesday
     day11, amSubject11, amSection11, amSTime11, amETime11, day12, amSubject12, amSection12, amSTime12, amETime12, day13, amSubject13, amSection13, amSTime13, amETime13, day14, pmSubject14, pmSection14, pmSTime14, pmETime14, day15, pmSubject15, pmSection15, pmSTime15, pmETime15,
    //Thursday
     day16, amSubject16, amSection16, amSTime16, amETime16, day17, amSubject17, amSection17, amSTime17, amETime17, day18, amSubject18, amSection18, amSTime18, amETime18, day19, pmSubject19, pmSection19, pmSTime19, pmETime19, day20, pmSubject20, pmSection20, pmSTime20, pmETime20,
    //Friday
     day21, amSubject21, amSection21, amSTime21, amETime21, day22, amSubject22, amSection22, amSTime22, amETime22, day23, amSubject23, amSection23, amSTime23, amETime23, day24, pmSubject24, pmSection24, pmSTime24, pmETime24, day25, pmSubject25, pmSection25, pmSTime25, pmETime25;


    private teacherModel(){}

    private teacherModel(String fullname,String idNumber,String userID,
                        String day1, String amSubject1,String amSection1,String amSTime1,String amETime1,String day2,String amSubject2,String amSection2,String amSTime2,String amETime2,
                         String day3,String amSubject3,String amSection3,String amSTime3,String amETime3,String day4, String pmSubject4, String pmSection4,String pmSTime4,String pmETime4,String day5,String pmSubject5,
                         String pmSection5,String pmSTime5,String pmETime5,String day6,String amSubject6,String amSection6,String amSTime6,String amETime6,String day7,String amSubject7,String amSection7,String amSTime7,
                         String amETime7,String day8,String amSubject8,String amSection8,String amSTime8,String amETime8,String day9,String pmSubject9,String pmSection9,String pmSTime9,String pmETime9,String day10,
                         String pmSubject10,String pmSection10,String pmSTime10,String pmETime10, String day11, String amSubject11,String amSection11,String amSTime11,String amETime11,String day12,String amSubject12,
                         String amSection12,String amSTime12,String amETime12,String day13,String amSubject13,String amSection13,String amSTime13,String amETime13,String day14,String pmSubject14,String pmSection14,
                         String pmSTime14,String pmETime14,String day15,String pmSubject15,String pmSection15,String pmSTime15,String pmETime15,String day16,String amSubject16,String amSection16,String amSTime16,String amETime16,
                         String day17,String amSubject17,String amSection17,String amSTime17,String amETime17,String day18,String amSubject18,String amSection18,String amSTime18,String amETime18, String day19,
                         String pmSubject19,String pmSection19,String pmSTime19,String pmETime19,String day20,String pmSubject20,String pmSection20,String pmSTime20,String pmETime20, String day21, String amSubject21, String amSection21,
                         String amSTime21,String  amETime21,String  day22,String  amSubject22,String  amSection22,String  amSTime22,String  amETime22,String  day23,String  amSubject23,String  amSection23,String  amSTime23,
                         String amETime23,String  day24,String  pmSubject24,String  pmSection24,String  pmSTime24,String  pmETime24,String  day25,String  pmSubject25,String  pmSection25,String  pmSTime25,String  pmETime25
    ){
        this.fullname = fullname;
        this.idNumber = idNumber;
        this.userID = userID;
        this.day1 = day1;
        this.day2 = day2;
        this.day3 = day3;
        this.day4 = day4;
        this.day5 = day5;
        this.day6 = day6;
        this.day7 = day7;
        this.day8 = day8;
        this.day9 = day9;
        this.day10 = day10;
        this.day11 = day11;
        this.day12 = day12;
        this.day13 = day13;
        this.day14 = day14;
        this.day15 = day15;
        this.day16 = day16;
        this.day17 = day17;
        this.day18 = day18;
        this.day19 = day19;
        this.day20 = day20;
        this.day21 = day21;
        this.day22 = day22;
        this.day23 = day23;
        this.day24 = day24;
        this.day25 = day25;
        //monday am
        this.amSubject1 = amSubject1;
        this.amSection1 = amSection1;
        this.amSTime1 = amSTime1;
        this.amETime1 = amETime1;
        this.amSubject2 = amSubject2;
        this.amSection2 = amSection2;
        this.amSTime2 = amSTime2;
        this.amETime2 = amETime2;
        this.amSubject3 = amSubject3;
        this.amSection3 = amSection3;
        this.amSTime3 = amSTime3;
        this.amETime3 = amETime3;
        //monday pm
        this.pmSubject4 = pmSubject4;
        this.pmSection4 = pmSection4;
        this.pmSTime4 = pmSTime4;
        this.pmETime4 = pmETime4;
        this.pmSubject5 = pmSubject5;
        this.pmSection5 = pmSection5;
        this.pmSTime5 = pmSTime5;
        this.pmETime5 = pmETime5;
        //tuesday am
        this.amSubject6 = amSubject6;
        this.amSection6 =amSection6;
        this.amSTime6 = amSTime6;
        this.amETime6 = amETime6;
        this.amSubject7 = amSubject7;
        this.amSection7 = amSection7;
        this.amSTime7 = amSTime7;
        this.amETime7 = amETime7;
        this.amSubject8 = amSubject8;
        this.amSection8 = amSection8;
        this.amSTime8 = amSTime8;
        this.amETime8 = amETime8;
        //tueday pm
        this.pmSubject9 = pmSubject9;
        this.pmSection9 = pmSection9;
        this.pmSTime9 = pmSTime9;
        this.pmETime9 = pmETime9;
        this.pmSubject10 = pmSubject10;
        this.pmSection10 = pmSection10;
        this.pmSTime10 = pmSTime10;
        this.pmETime10 = pmETime10;
        //wednesday am
        this.amSubject11 = amSubject11;
        this.amSection11 = amSection11;
        this.amSTime11 = amSTime11;
        this.amETime11 = amETime11;
        this.amSubject12 = amSubject12;
        this.amSection12 = amSection12;
        this.amSTime12 = amSTime12;
        this.amETime12 = amETime12;
        this.amSubject13 = amSubject13;
        this.amSection13 = amSection13;
        this.amSTime13 = amSTime13;
        this.amETime13 = amETime13;
        //wednesday pm
        this.pmSubject14 = pmSubject14;
        this.pmSection14 = pmSection14;
        this.pmSTime14 = pmSTime14;
        this.pmETime14 = pmETime14;
        this.pmSubject15 = pmSubject15;
        this.pmSection15 = pmSection15;
        this.pmSTime15 = pmSTime15;
        this.pmETime15 = pmETime15;
        //thursday am
        this.amSubject16 = amSubject16;
        this.amSection16 = amSection16;
        this.amSTime16 = amSTime16;
        this.amETime16 = amETime16;
        this.amSubject17 = amSubject17;
        this.amSection17 = amSection17;
        this.amSTime17 = amSTime17;
        this.amETime17 = amETime17;
        this.amSubject18 = amSubject18;
        this.amSection18 = amSection18;
        this.amSTime18 = amSTime18;
        this.amETime18 = amETime18;
        //thursday pm
        this.pmSubject19 = pmSubject19;
        this.pmSection19 = pmSection19;
        this.pmSTime19 = pmSTime19;
        this.pmETime19 = pmETime19;
        this.pmSubject20 = pmSubject20;
        this.pmSection20 = pmSection20;
        this.pmSTime20 = pmSTime20;
        this.pmETime20 = pmETime20;
        //friday am
        this.amSubject21 = amSubject21;
        this.amSection21 = amSection21;
        this.amSTime21 = amSTime21;
        this.amETime21 = amETime21;
        this.amSubject22 = amSubject22;
        this.amSection22 = amSection22;
        this.amSTime22 = amSTime22;
        this.amETime22 = amETime22;
        this.amSubject23 = amSubject23;
        this.amSection23 = amSection23;
        this.amSTime23 = amSTime23;
        this.amETime23 = amETime23;
        //friday pm
        this.pmSubject24 = pmSubject24;
        this.pmSection24 = pmSection24;
        this.pmSTime24 = pmSTime24;
        this.pmETime24 = pmETime24;
        this.pmSubject25 = pmSubject25;
        this.pmSection25 = pmSection25;
        this.pmSTime25 = pmSTime25;
        this.pmETime25 = pmETime25;

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getDay1() {
        return day1;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }

    public String getAmSubject1() {
        return amSubject1;
    }

    public void setAmSubject1(String amSubject1) {
        this.amSubject1 = amSubject1;
    }

    public String getAmSection1() {
        return amSection1;
    }

    public void setAmSection1(String amSection1) {
        this.amSection1 = amSection1;
    }

    public String getAmSTime1() {
        return amSTime1;
    }

    public void setAmSTime1(String amSTime1) {
        this.amSTime1 = amSTime1;
    }

    public String getAmETime1() {
        return amETime1;
    }

    public void setAmETime1(String amETime1) {
        this.amETime1 = amETime1;
    }

    public String getDay2() {
        return day2;
    }

    public void setDay2(String day2) {
        this.day2 = day2;
    }

    public String getAmSubject2() {
        return amSubject2;
    }

    public void setAmSubject2(String amSubject2) {
        this.amSubject2 = amSubject2;
    }

    public String getAmSection2() {
        return amSection2;
    }

    public void setAmSection2(String amSection2) {
        this.amSection2 = amSection2;
    }

    public String getAmSTime2() {
        return amSTime2;
    }

    public void setAmSTime2(String amSTime2) {
        this.amSTime2 = amSTime2;
    }

    public String getAmETime2() {
        return amETime2;
    }

    public void setAmETime2(String amETime2) {
        this.amETime2 = amETime2;
    }

    public String getDay3() {
        return day3;
    }

    public void setDay3(String day3) {
        this.day3 = day3;
    }

    public String getAmSubject3() {
        return amSubject3;
    }

    public void setAmSubject3(String amSubject3) {
        this.amSubject3 = amSubject3;
    }

    public String getAmSection3() {
        return amSection3;
    }

    public void setAmSection3(String amSection3) {
        this.amSection3 = amSection3;
    }

    public String getAmSTime3() {
        return amSTime3;
    }

    public void setAmSTime3(String amSTime3) {
        this.amSTime3 = amSTime3;
    }

    public String getAmETime3() {
        return amETime3;
    }

    public void setAmETime3(String amETime3) {
        this.amETime3 = amETime3;
    }

    public String getDay4() {
        return day4;
    }

    public void setDay4(String day4) {
        this.day4 = day4;
    }

    public String getPmSubject4() {
        return pmSubject4;
    }

    public void setPmSubject4(String pmSubject4) {
        this.pmSubject4 = pmSubject4;
    }

    public String getPmSection4() {
        return pmSection4;
    }

    public void setPmSection4(String pmSection4) {
        this.pmSection4 = pmSection4;
    }

    public String getPmSTime4() {
        return pmSTime4;
    }

    public void setPmSTime4(String pmSTime4) {
        this.pmSTime4 = pmSTime4;
    }

    public String getPmETime4() {
        return pmETime4;
    }

    public void setPmETime4(String pmETime4) {
        this.pmETime4 = pmETime4;
    }

    public String getDay5() {
        return day5;
    }

    public void setDay5(String day5) {
        this.day5 = day5;
    }

    public String getPmSubject5() {
        return pmSubject5;
    }

    public void setPmSubject5(String pmSubject5) {
        this.pmSubject5 = pmSubject5;
    }

    public String getPmSection5() {
        return pmSection5;
    }

    public void setPmSection5(String pmSection5) {
        this.pmSection5 = pmSection5;
    }

    public String getPmSTime5() {
        return pmSTime5;
    }

    public void setPmSTime5(String pmSTime5) {
        this.pmSTime5 = pmSTime5;
    }

    public String getPmETime5() {
        return pmETime5;
    }

    public void setPmETime5(String pmETime5) {
        this.pmETime5 = pmETime5;
    }

    public String getDay6() {
        return day6;
    }

    public void setDay6(String day6) {
        this.day6 = day6;
    }

    public String getAmSubject6() {
        return amSubject6;
    }

    public void setAmSubject6(String amSubject6) {
        this.amSubject6 = amSubject6;
    }

    public String getAmSection6() {
        return amSection6;
    }

    public void setAmSection6(String amSection6) {
        this.amSection6 = amSection6;
    }

    public String getAmSTime6() {
        return amSTime6;
    }

    public void setAmSTime6(String amSTime6) {
        this.amSTime6 = amSTime6;
    }

    public String getAmETime6() {
        return amETime6;
    }

    public void setAmETime6(String amETime6) {
        this.amETime6 = amETime6;
    }

    public String getDay7() {
        return day7;
    }

    public void setDay7(String day7) {
        this.day7 = day7;
    }

    public String getAmSubject7() {
        return amSubject7;
    }

    public void setAmSubject7(String amSubject7) {
        this.amSubject7 = amSubject7;
    }

    public String getAmSection7() {
        return amSection7;
    }

    public void setAmSection7(String amSection7) {
        this.amSection7 = amSection7;
    }

    public String getAmSTime7() {
        return amSTime7;
    }

    public void setAmSTime7(String amSTime7) {
        this.amSTime7 = amSTime7;
    }

    public String getAmETime7() {
        return amETime7;
    }

    public void setAmETime7(String amETime7) {
        this.amETime7 = amETime7;
    }

    public String getDay8() {
        return day8;
    }

    public void setDay8(String day8) {
        this.day8 = day8;
    }

    public String getAmSubject8() {
        return amSubject8;
    }

    public void setAmSubject8(String amSubject8) {
        this.amSubject8 = amSubject8;
    }

    public String getAmSection8() {
        return amSection8;
    }

    public void setAmSection8(String amSection8) {
        this.amSection8 = amSection8;
    }

    public String getAmSTime8() {
        return amSTime8;
    }

    public void setAmSTime8(String amSTime8) {
        this.amSTime8 = amSTime8;
    }

    public String getAmETime8() {
        return amETime8;
    }

    public void setAmETime8(String amETime8) {
        this.amETime8 = amETime8;
    }

    public String getDay9() {
        return day9;
    }

    public void setDay9(String day9) {
        this.day9 = day9;
    }

    public String getPmSubject9() {
        return pmSubject9;
    }

    public void setPmSubject9(String pmSubject9) {
        this.pmSubject9 = pmSubject9;
    }

    public String getPmSection9() {
        return pmSection9;
    }

    public void setPmSection9(String pmSection9) {
        this.pmSection9 = pmSection9;
    }

    public String getPmSTime9() {
        return pmSTime9;
    }

    public void setPmSTime9(String pmSTime9) {
        this.pmSTime9 = pmSTime9;
    }

    public String getPmETime9() {
        return pmETime9;
    }

    public void setPmETime9(String pmETime9) {
        this.pmETime9 = pmETime9;
    }

    public String getDay10() {
        return day10;
    }

    public void setDay10(String day10) {
        this.day10 = day10;
    }

    public String getPmSubject10() {
        return pmSubject10;
    }

    public void setPmSubject10(String pmSubject10) {
        this.pmSubject10 = pmSubject10;
    }

    public String getPmSection10() {
        return pmSection10;
    }

    public void setPmSection10(String pmSection10) {
        this.pmSection10 = pmSection10;
    }

    public String getPmSTime10() {
        return pmSTime10;
    }

    public void setPmSTime10(String pmSTime10) {
        this.pmSTime10 = pmSTime10;
    }

    public String getPmETime10() {
        return pmETime10;
    }

    public void setPmETime10(String pmETime10) {
        this.pmETime10 = pmETime10;
    }

    public String getDay11() {
        return day11;
    }

    public void setDay11(String day11) {
        this.day11 = day11;
    }

    public String getAmSubject11() {
        return amSubject11;
    }

    public void setAmSubject11(String amSubject11) {
        this.amSubject11 = amSubject11;
    }

    public String getAmSection11() {
        return amSection11;
    }

    public void setAmSection11(String amSection11) {
        this.amSection11 = amSection11;
    }

    public String getAmSTime11() {
        return amSTime11;
    }

    public void setAmSTime11(String amSTime11) {
        this.amSTime11 = amSTime11;
    }

    public String getAmETime11() {
        return amETime11;
    }

    public void setAmETime11(String amETime11) {
        this.amETime11 = amETime11;
    }

    public String getDay12() {
        return day12;
    }

    public void setDay12(String day12) {
        this.day12 = day12;
    }

    public String getAmSubject12() {
        return amSubject12;
    }

    public void setAmSubject12(String amSubject12) {
        this.amSubject12 = amSubject12;
    }

    public String getAmSection12() {
        return amSection12;
    }

    public void setAmSection12(String amSection12) {
        this.amSection12 = amSection12;
    }

    public String getAmSTime12() {
        return amSTime12;
    }

    public void setAmSTime12(String amSTime12) {
        this.amSTime12 = amSTime12;
    }

    public String getAmETime12() {
        return amETime12;
    }

    public void setAmETime12(String amETime12) {
        this.amETime12 = amETime12;
    }

    public String getDay13() {
        return day13;
    }

    public void setDay13(String day13) {
        this.day13 = day13;
    }

    public String getAmSubject13() {
        return amSubject13;
    }

    public void setAmSubject13(String amSubject13) {
        this.amSubject13 = amSubject13;
    }

    public String getAmSection13() {
        return amSection13;
    }

    public void setAmSection13(String amSection13) {
        this.amSection13 = amSection13;
    }

    public String getAmSTime13() {
        return amSTime13;
    }

    public void setAmSTime13(String amSTime13) {
        this.amSTime13 = amSTime13;
    }

    public String getAmETime13() {
        return amETime13;
    }

    public void setAmETime13(String amETime13) {
        this.amETime13 = amETime13;
    }

    public String getDay14() {
        return day14;
    }

    public void setDay14(String day14) {
        this.day14 = day14;
    }

    public String getPmSubject14() {
        return pmSubject14;
    }

    public void setPmSubject14(String pmSubject14) {
        this.pmSubject14 = pmSubject14;
    }

    public String getPmSection14() {
        return pmSection14;
    }

    public void setPmSection14(String pmSection14) {
        this.pmSection14 = pmSection14;
    }

    public String getPmSTime14() {
        return pmSTime14;
    }

    public void setPmSTime14(String pmSTime14) {
        this.pmSTime14 = pmSTime14;
    }

    public String getPmETime14() {
        return pmETime14;
    }

    public void setPmETime14(String pmETime14) {
        this.pmETime14 = pmETime14;
    }

    public String getDay15() {
        return day15;
    }

    public void setDay15(String day15) {
        this.day15 = day15;
    }

    public String getPmSubject15() {
        return pmSubject15;
    }

    public void setPmSubject15(String pmSubject15) {
        this.pmSubject15 = pmSubject15;
    }

    public String getPmSection15() {
        return pmSection15;
    }

    public void setPmSection15(String pmSection15) {
        this.pmSection15 = pmSection15;
    }

    public String getPmSTime15() {
        return pmSTime15;
    }

    public void setPmSTime15(String pmSTime15) {
        this.pmSTime15 = pmSTime15;
    }

    public String getPmETime15() {
        return pmETime15;
    }

    public void setPmETime15(String pmETime15) {
        this.pmETime15 = pmETime15;
    }

    public String getDay16() {
        return day16;
    }

    public void setDay16(String day16) {
        this.day16 = day16;
    }

    public String getAmSubject16() {
        return amSubject16;
    }

    public void setAmSubject16(String amSubject16) {
        this.amSubject16 = amSubject16;
    }

    public String getAmSection16() {
        return amSection16;
    }

    public void setAmSection16(String amSection16) {
        this.amSection16 = amSection16;
    }

    public String getAmSTime16() {
        return amSTime16;
    }

    public void setAmSTime16(String amSTime16) {
        this.amSTime16 = amSTime16;
    }

    public String getAmETime16() {
        return amETime16;
    }

    public void setAmETime16(String amETime16) {
        this.amETime16 = amETime16;
    }

    public String getDay17() {
        return day17;
    }

    public void setDay17(String day17) {
        this.day17 = day17;
    }

    public String getAmSubject17() {
        return amSubject17;
    }

    public void setAmSubject17(String amSubject17) {
        this.amSubject17 = amSubject17;
    }

    public String getAmSection17() {
        return amSection17;
    }

    public void setAmSection17(String amSection17) {
        this.amSection17 = amSection17;
    }

    public String getAmSTime17() {
        return amSTime17;
    }

    public void setAmSTime17(String amSTime17) {
        this.amSTime17 = amSTime17;
    }

    public String getAmETime17() {
        return amETime17;
    }

    public void setAmETime17(String amETime17) {
        this.amETime17 = amETime17;
    }

    public String getDay18() {
        return day18;
    }

    public void setDay18(String day18) {
        this.day18 = day18;
    }

    public String getAmSubject18() {
        return amSubject18;
    }

    public void setAmSubject18(String amSubject18) {
        this.amSubject18 = amSubject18;
    }

    public String getAmSection18() {
        return amSection18;
    }

    public void setAmSection18(String amSection18) {
        this.amSection18 = amSection18;
    }

    public String getAmSTime18() {
        return amSTime18;
    }

    public void setAmSTime18(String amSTime18) {
        this.amSTime18 = amSTime18;
    }

    public String getAmETime18() {
        return amETime18;
    }

    public void setAmETime18(String amETime18) {
        this.amETime18 = amETime18;
    }

    public String getDay19() {
        return day19;
    }

    public void setDay19(String day19) {
        this.day19 = day19;
    }

    public String getPmSubject19() {
        return pmSubject19;
    }

    public void setPmSubject19(String pmSubject19) {
        this.pmSubject19 = pmSubject19;
    }

    public String getPmSection19() {
        return pmSection19;
    }

    public void setPmSection19(String pmSection19) {
        this.pmSection19 = pmSection19;
    }

    public String getPmSTime19() {
        return pmSTime19;
    }

    public void setPmSTime19(String pmSTime19) {
        this.pmSTime19 = pmSTime19;
    }

    public String getPmETime19() {
        return pmETime19;
    }

    public void setPmETime19(String pmETime19) {
        this.pmETime19 = pmETime19;
    }

    public String getDay20() {
        return day20;
    }

    public void setDay20(String day20) {
        this.day20 = day20;
    }

    public String getPmSubject20() {
        return pmSubject20;
    }

    public void setPmSubject20(String pmSubject20) {
        this.pmSubject20 = pmSubject20;
    }

    public String getPmSection20() {
        return pmSection20;
    }

    public void setPmSection20(String pmSection20) {
        this.pmSection20 = pmSection20;
    }

    public String getPmSTime20() {
        return pmSTime20;
    }

    public void setPmSTime20(String pmSTime20) {
        this.pmSTime20 = pmSTime20;
    }

    public String getPmETime20() {
        return pmETime20;
    }

    public void setPmETime20(String pmETime20) {
        this.pmETime20 = pmETime20;
    }

    public String getDay21() {
        return day21;
    }

    public void setDay21(String day21) {
        this.day21 = day21;
    }

    public String getAmSubject21() {
        return amSubject21;
    }

    public void setAmSubject21(String amSubject21) {
        this.amSubject21 = amSubject21;
    }

    public String getAmSection21() {
        return amSection21;
    }

    public void setAmSection21(String amSection21) {
        this.amSection21 = amSection21;
    }

    public String getAmSTime21() {
        return amSTime21;
    }

    public void setAmSTime21(String amSTime21) {
        this.amSTime21 = amSTime21;
    }

    public String getAmETime21() {
        return amETime21;
    }

    public void setAmETime21(String amETime21) {
        this.amETime21 = amETime21;
    }

    public String getDay22() {
        return day22;
    }

    public void setDay22(String day22) {
        this.day22 = day22;
    }

    public String getAmSubject22() {
        return amSubject22;
    }

    public void setAmSubject22(String amSubject22) {
        this.amSubject22 = amSubject22;
    }

    public String getAmSection22() {
        return amSection22;
    }

    public void setAmSection22(String amSection22) {
        this.amSection22 = amSection22;
    }

    public String getAmSTime22() {
        return amSTime22;
    }

    public void setAmSTime22(String amSTime22) {
        this.amSTime22 = amSTime22;
    }

    public String getAmETime22() {
        return amETime22;
    }

    public void setAmETime22(String amETime22) {
        this.amETime22 = amETime22;
    }

    public String getDay23() {
        return day23;
    }

    public void setDay23(String day23) {
        this.day23 = day23;
    }

    public String getAmSubject23() {
        return amSubject23;
    }

    public void setAmSubject23(String amSubject23) {
        this.amSubject23 = amSubject23;
    }

    public String getAmSection23() {
        return amSection23;
    }

    public void setAmSection23(String amSection23) {
        this.amSection23 = amSection23;
    }

    public String getAmSTime23() {
        return amSTime23;
    }

    public void setAmSTime23(String amSTime23) {
        this.amSTime23 = amSTime23;
    }

    public String getAmETime23() {
        return amETime23;
    }

    public void setAmETime23(String amETime23) {
        this.amETime23 = amETime23;
    }

    public String getDay24() {
        return day24;
    }

    public void setDay24(String day24) {
        this.day24 = day24;
    }

    public String getPmSubject24() {
        return pmSubject24;
    }

    public void setPmSubject24(String pmSubject24) {
        this.pmSubject24 = pmSubject24;
    }

    public String getPmSection24() {
        return pmSection24;
    }

    public void setPmSection24(String pmSection24) {
        this.pmSection24 = pmSection24;
    }

    public String getPmSTime24() {
        return pmSTime24;
    }

    public void setPmSTime24(String pmSTime24) {
        this.pmSTime24 = pmSTime24;
    }

    public String getPmETime24() {
        return pmETime24;
    }

    public void setPmETime24(String pmETime24) {
        this.pmETime24 = pmETime24;
    }

    public String getDay25() {
        return day25;
    }

    public void setDay25(String day25) {
        this.day25 = day25;
    }

    public String getPmSubject25() {
        return pmSubject25;
    }

    public void setPmSubject25(String pmSubject25) {
        this.pmSubject25 = pmSubject25;
    }

    public String getPmSection25() {
        return pmSection25;
    }

    public void setPmSection25(String pmSection25) {
        this.pmSection25 = pmSection25;
    }

    public String getPmSTime25() {
        return pmSTime25;
    }

    public void setPmSTime25(String pmSTime25) {
        this.pmSTime25 = pmSTime25;
    }

    public String getPmETime25() {
        return pmETime25;
    }

    public void setPmETime25(String pmETime25) {
        this.pmETime25 = pmETime25;
    }
}