package org.example.functional;
import java.util.List;
//Program to Print wheterher given number is Even and odd number

public class Ex_02_PrintEvenOddNumber {

    interface checkEvenOdd{
        void check(int a);
    }
    public static void main(String args[]){
        Ex_02_PrintEvenOddNumber.checkEvenOdd chkobj1=(a)->{
            if(a%2==0)
                System.out.println(a+" is even");
            else
                System.out.println(a +" is odd");
        };
        chkobj1.check(10);
    }
}
