package com.seleniumprograms.testng;



import org.testng.ITestContext;

import org.testng.ITestListener;

import org.testng.ITestResult;
import org.testng.Reporter;

public class RealTimeReport implements ITestListener{

    @Override

    public void onStart(ITestContext arg0) {

         Reporter.log("Start Of Execution(TEST)->"+arg0.getName());

    }

    @Override

    public void onTestStart(ITestResult arg0) {

        Reporter.log("Test Started->"+arg0.getName());

    }

    @Override

    public void onTestSuccess(ITestResult arg0) {

        Reporter.log("Test Pass->"+arg0.getName());

    }

    @Override

    public void onTestFailure(ITestResult arg0) {

        Reporter.log("Test Failed->"+arg0.getName());

    }

    @Override

    public void onTestSkipped(ITestResult arg0) {

        Reporter.log("Test Skipped->"+arg0.getName());

    }

    @Override

    public void onFinish(ITestContext arg0) {

    	Reporter.log("END Of Execution(TEST)->"+arg0.getName());

    }

    @Override

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

        // TODO Auto-generated method stub

        

    }

    

}