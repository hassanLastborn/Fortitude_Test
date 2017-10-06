package fortitude_testt;




import java.util.Scanner;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author test
 */
public class CheckDigit {

    public static void main (String args[]){
                System.out.print("Please input numbers with length of 11\n");

        Scanner a=new Scanner(System.in);
        long num1 =a.nextLong();
        
    String str1 = Long.toString(num1);

    char[] ch1 = str1.toCharArray();

    long[] t1 = new long[ch1.length];

    for(int i=0;i<ch1.length;i++)
        t1[i]= (int) ch1[i]-48;
    
 
       //A,B,C initialization
        
       long A=0;
        for(int i=0;i<t1.length; i +=3){
        long add=t1[i]*3;
        A+=add;
        }
        System.out.println("A is :"+A);
        
        long B=0;
        for(int i=1;i<t1.length; i +=3){
        long add=t1[i]*5;
        B+=add;
        }
        System.out.println("B is :"+B);
        
        long C=0;
        for(int i=2;i<t1.length; i +=3){
        long add=t1[i]*7;
        C+=add;
        }
        System.out.println("C is :"+C);
        
    
  //2nd part
    
    long add =A+B+C;
    if(add!=0)
    {
        long sum = ((add%9==0) ? 9 : add%9);
        System.out.println("The check digit is: "+sum);                         //check digit
        System.out.print("The generated reference number is ."+num1);           //input number + lastdigit
        System.out.println(sum);
    }
        
    }
    
}
