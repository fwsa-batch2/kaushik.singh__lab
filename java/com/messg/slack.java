package com.messg;

// super class of sub 

public class slack {
    int noofstudents = 30;
    private String students = "Kaushik";
    protected String userdetails = "fwsa student";
    public String chanels = "#fwsabatch_2";
    public String bot = "fwsa_bot";   
}

// sub class of slack

class fwsa extends slack {
    int noofstudents;
    protected String userdetails;
    public String chanels;
    public String bot;
}  

// non sub class 

class freshbuzz {
    public String chanels;
    public String bot;
}


