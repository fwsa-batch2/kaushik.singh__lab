package com.fwsa;

import com.messg.*; 

    public class dupslack {
        public String chanels;
        public String bot;    
    }

    class employes extends dupslack{
        public String chanels;
        public String bot;
    }

    class director extends slack{
        protected String userdetails;
        public String chanels;
        public String bot;
    }

    class ceo{
        public String chanels;
        public String bot;
    }

    class freshworks {
        public static void main(String[] args) {
            slack obj = new slack();
            System.out.println(obj.chanels);
            System.out.println(obj.bot);
        } 
    }   
   
   
