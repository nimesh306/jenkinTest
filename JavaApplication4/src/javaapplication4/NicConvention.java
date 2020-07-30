/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author lkfaswuser2
 */
public class NicConvention {
//    public static void main(String[] args) {
//        NicConvention.getNic("912802256V");
//    }

    public static void getNic(String NICNo) {
        int dayText = 0;
        String year = "";
        String month = "";
        int day = 0;
        String gender = "";
        if (NICNo.length() != 10 && NICNo.length() != 12) {
            System.out.println("1Invalid NIC NO");
        }  else {
            // Year
            if (NICNo.length() == 10) {
                year = "19" + NICNo.substring(0, 2);
                dayText = Integer.parseInt(NICNo.substring(2, 3));
            } else {
                year = NICNo.substring(0, 4);
                dayText = Integer.parseInt(NICNo.substring(4, 3));
            }

            // Gender
            if (dayText > 500) {
                gender = "Female";
                dayText = dayText - 500;
            } else {
                gender = "Male";
            }

            // Day Digit Validation
            if (dayText < 1 && dayText > 366) {
                System.out.println("Invalid NIC NO");
            } else {

                //Month
                if (dayText > 335) {
                    day = dayText - 335;
                    month = "12";
                } else if (dayText > 305) {
                    day = dayText - 305;
                    month = "11";
                } else if (dayText > 274) {
                    day = dayText - 274;
                    month = "10";
                } else if (dayText > 244) {
                    day = dayText - 244;
                    month = "09";
                } else if (dayText > 213) {
                    day = dayText - 213;
                    month = "08";
                } else if (dayText > 182) {
                    day = dayText - 182;
                    month = "07";
                } else if (dayText > 152) {
                    day = dayText - 152;
                    month = "06";
                } else if (dayText > 121) {
                    day = dayText - 121;
                    month = "05";
                } else if (dayText > 91) {
                    day = dayText - 91;
                    month = "04";
                } else if (dayText > 60) {
                    day = dayText - 60;
                    month = "03";
                } else if (dayText < 32) {
                    month = "01";
                    day = dayText;
                } else if (dayText > 31) {
                    day = dayText - 31;
                    month = "02";
                }

                // Show Details
                System.out.println("Gender : " + gender);
                System.out.println("Year : " + year);
                System.out.println("Month : " + month);
                System.out.println("Day :" + day);

                String birthDay=year+"-"+month+"-"+day;
                String genderr=gender;
            }
        }
    }
}
