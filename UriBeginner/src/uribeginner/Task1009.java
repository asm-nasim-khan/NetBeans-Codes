/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uribeginner;
import java.util.Scanner;
/**
 *
 * @author Piplu
 */
public class Task1009 {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    String name;
    double salary,sale,total;
    name = scan.nextLine();
    salary = scan.nextDouble();
    sale = scan.nextDouble();
    total = (salary +(sale * 0.15));
    System.out.printf("TOTAL = R$ %.2f\n" , total);
    }
}
