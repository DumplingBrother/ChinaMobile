package test01;

import java.io.*;
public class points{
public static void main(String args[]) throws Exception{
   BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
   System.out.println("Please input the profit：");
   String in = input.readLine();
   double amount = Double.parseDouble(in);
   int x = reNum(amount);
   double points;
   switch(x){
    case 1:
     points = 0.1 * amount;
     System.out.println("Your points is:"+"RMB "+points+" thousand");
     break;
    case 2:
     points = 0.1 * 100 + 0.075 * (amount-100);
     System.out.println("Your points is:" +" RMB "+points+" thousand");
     break;
    case 3:
     points = 0.1 * 100 + 0.075 * 100 + 0.05 * (amount-200);
     System.out.println("Your points is:" +" RMB "+points+" thousand");
     break;
    case 4:
     points = 0.1 * 100 + 0.075 * 100 + 0.05 * 200 + 0.03 * (amount-400);
     System.out.println("Your points is:" +" RMB "+points+" thousand");
     break;
    case 5:
     points = 0.1 * 100 + 0.075 * 100 + 0.05 * 200 + 0.03 * 200 + 0.015 * (amount-600);
     System.out.println("Your points is:" +" RMB "+points+" thousand");
     break;
    case 6:
     points = 0.1 * 100 + 0.075 * 100 + 0.05 * 200 + 0.03 * 200 + 0.015 * 400 + 0.01 * (amount-1000);
     System.out.println("Your points is:" +" RMB "+points+" thousand");
     break;
   }
}

/**
* Using switch to distinguish the profit levels
*/
public static int reNum(double d){
   if(d<=100){
    return 1;
   }else if (d>100 && d<=200){
    return 2;
   }else if (d>200 && d<=400){
    return 3;
   }else if (d>400 && d<=600){
    return 4;
   }else if (d>600 && d<=1000){
    return 5;
   }else{
    return 6;
   }
}
}
