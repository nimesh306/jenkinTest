/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author lkfaswuser2
 */
public class NIC_Details {

    String id;
    int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    boolean isNewFormat = false;

    public NIC_Details(String nicNumber) {
        id = nicNumber;
    }

    public int getYear() {
        if (isNewFormat) {
            return (Integer.parseInt(id.substring(0, 4)));
        }
        return (1900 + Integer.parseInt(id.substring(0, 2)));
    }

    public int getDays() {
        int d;
        if (isNewFormat) {
            d = Integer.parseInt(id.substring(4, 7));
        } else {
            d = Integer.parseInt(id.substring(2, 5));
        }
        if (d > 500) {
            return (d - 500);
        } else {
            return d;
        }
    }

    public String getDay() {
        int mo = 0, da = 0;
        int days = getDays();

        for (int i = 0; i < month.length; i++) {
            if (days < month[i]) {
                mo = i + 1;
                da = days;
                break;
            } else {
                days = days - month[i];
            }
        }

        if(da<10){
        return "0" + da;
        }else{
        return "" + da;
        }
    }

    public String getMonth() {
        int mo = 0, da = 0;
        int days = getDays();

        for (int i = 0; i < month.length; i++) {
            if (days < month[i]) {
                mo = i + 1;
                da = days;
                break;
            } else {
                days = days - month[i];
            }
        }
        
        if(mo<10){
        return "0" + mo;
        }else{
        return "" + mo;
        }

    }

    public String getSex() {
        String M = "Male", F = "Female";
        int d;
        if (isNewFormat) {
            d = Integer.parseInt(id.substring(4, 7));
        } else {
            d = Integer.parseInt(id.substring(2, 5));
        }
        if (d > 500) {
            return F;
        } else {
            return M;
        }
    }

    public static void main(String[] args) {
        NIC_Details N = new NIC_Details("912802256V");
//        NIC_Details N = new NIC_Details("911772094V");
        System.out.println("Year : " + N.getYear() + "-" + N.getMonth() + "-" + N.getDay());
        System.out.println("Sex : " + N.getSex());
    }
}
