package com.example.rusha.myapplication.backend;

import com.example.JokeTeller;
/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private JokeTeller jokeTeller;

    public MyBean(){
        jokeTeller = new JokeTeller();
    }

    public String getJoke()
    {
        return jokeTeller.getJoke();
    }
}