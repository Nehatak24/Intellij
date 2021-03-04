package com.test_framework.Util;

import org.openqa.selenium.JavascriptExecutor;

public class Utils extends DriverManager
{
    public static void waitForSomeTime(){

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {

        }


    }

    public static void waitForLongTime(){

        try {
            Thread.sleep(2300);
        } catch (InterruptedException e) {

        }


    }

    public static void waitForExtraLongTime() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
    }

    public static void waitForTooLongTime()
    {
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollSmooth()
    {
        for(int i=0; i<1000; i++) {
            ((JavascriptExecutor) driver).executeScript("window.scrollby(0,3)");
        }

    }
}
