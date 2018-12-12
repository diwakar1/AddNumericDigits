package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=input.nextInt();
        System.out.println("The sum of digit in first method is: "+ addDigit(num));
        System.out.println("The sum pf digit  in second method is : "+ addDigits(num));
        System.out.println("The sum pf digit  in third method is : "+ addNumber(num));
    }
    public static int addDigit(int d){
        int sum= 0;
        while(d!=0){
            sum+= d%10;
            d=d/10;
        }
        return sum;
    }

    public static int addDigits(int number){
        int sum=0;
        String st= Integer.toString(number);
        for(int i=0;i<st.length();i++){
            String sub=st.substring(i,i+1);
            int num= Integer.parseInt(sub);
            sum=sum+num;
        }
        return sum;
    }

    public static int addNumber(int n){
        String string= Integer.toString(n);
        int sum= 0;
        for(int i=0;i<string.length();i++){
            sum+= Character.getNumericValue(string.charAt(i));
        }
        return sum;
    }
}
