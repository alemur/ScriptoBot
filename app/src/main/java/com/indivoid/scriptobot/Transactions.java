package com.indivoid.scriptobot;

import java.util.Date;

/**
 * Created by INETOID on 16.03.2017.
 */

public class Transactions {
    public String date;
    public String title;
    public String sum;


    public Transactions(String date, String title, int sum) {
        this.date = date;
        this.title = title;
        this.sum = Integer.toString(sum);

    }


}
