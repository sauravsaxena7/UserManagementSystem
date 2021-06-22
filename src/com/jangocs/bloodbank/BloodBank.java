package com.jangocs.bloodbank;

import java.time.LocalDate;
import java.util.Calendar;

public class BloodBank {
	
	static String str="30 Jul 2021";
	static String year="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int count=0;
         for(int i=0;i<str.length();i++){



             if(str.charAt(i)==' '){

                 count=count+1;

             }

             if(count==2&&str.charAt(i)==' ') {
                 int j=0;
                 j=i+1;
                 while(j<str.length())
                 {
                     year=year+str.charAt(j);
                     j=j+1;

                 }



             }

         }
         
         int dob_year= Integer.parseInt(year);
         
        int year1 = Calendar.getInstance().get(Calendar.YEAR);
        int dob=dob_year-year1;
        
        
        int count1=0;
        String dob_str="DOB : 28 Jul 2000";
        String dob1="";
        for(int i=0;i<dob_str.length();i++){
            if(count==2)
            {
                dob1=dob1+dob_str.charAt(i);
            }
            if(dob_str.charAt(i)==':')
            {
                count=1;
                
            }
            else if(dob_str.charAt(i-1)==':'&&dob_str.charAt(i)==' ')
            {
            	count=2;
            }

        }
        dob_str="";

        dob_str=dob1;

        String dob2="28 Jul 2000";
       
        System.out.println(dob1);
        System.out.println(dob2);

	}

}
