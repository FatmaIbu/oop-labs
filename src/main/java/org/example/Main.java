package org.example;
import com.sun.source.doctree.SummaryTree;
import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.*;
//8)Create a method called drawStarsPiramid that will accept the number of rows as a parameter
// and print a half piramid shape where the number of rows will be dictated by the sent parameter.
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(" Enter the  Number of Stars : ");
        int numOfRows = Integer.valueOf(reader.nextLine());
        System.out.println("What shape you want ? \n 1:starsPyramid 2: InvertStarsPyramid 3 :NumberPyramid 4: InvertNumberPyramid 5: HollowPyramid");
        int respond=Integer.parseInt(reader.nextLine());
        if(respond==1){
            drawStarsPyramid(numOfRows);
        }
        else if (respond==2) {
            drawInvertStarsPyramid(numOfRows);
        } else if (respond==3) {
            drawNumberPyramid(numOfRows);
        } else if (respond==4) {
            drawInvertNumberPyramid(numOfRows);
        } else if (respond==5) {
            drawHollowPyramid(numOfRows);
        }
    }
    public static void drawStarsPyramid(int num){
        for (int i =1; i<= num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            } System.out.println();
        }
    }
    public static void drawInvertStarsPyramid(int num){
        for(int i = num; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void drawNumberPyramid(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
    public static void drawInvertNumberPyramid(int num){
        for(int i=num;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
    public static void drawHollowPyramid(int num){
        for (int i = 1; i <= num; i++) {
            // Print spaces for the left side of the pyramid
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // Print the first star
            System.out.print("*");
            // Print spaces for the hollow part
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print(" ");
            }
            // Print the last star, but only if it's not the first row
            if (i > 1) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }

}