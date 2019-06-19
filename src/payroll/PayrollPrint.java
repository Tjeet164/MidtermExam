/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**This class for
 * printing final salary including bonus
 * @author srinivsi
 */
public class PayrollPrint 
{
public static void main(String[] args) 
{
/* here assumed that 50 employee accounts can be created
 for the given bank */

Scanner sc=new Scanner(System.in);
for(int i=0;i<41;i++)
{

System.out.println("Please enter the employee name:");
String name=sc.next();//add code
System.out.println("Please enter the salary: salary <=3000");
       
double sal=sc.nextDouble();
if (sal<=3000)
{System.out.println("are u sure the salary u entered is correct (0/1)");
int n=sc.nextInt();
if(n==0)
{System.out.println("Please enter the salary: salary <=3000");
       
 sal=sc.nextDouble();}}
Payroll ac =new Payroll(sal,name);
System.out.println("salary bfore bonus "+sal);



System.out.println("The final Salary including bonus is: " + ac.calcBonus(sal));         

}}}


