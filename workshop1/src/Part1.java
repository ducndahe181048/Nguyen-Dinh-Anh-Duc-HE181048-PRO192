
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anhdu
 */
public class Part1 {
    public static void main(String[] args) {
        int rows;
        int cols;
        int matrix[][];
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        cols = sc.nextInt();
        matrix = new int[rows][cols];
        System.out.println("Enter the matrix: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.println("\nm["+i+"]["+j+"] = ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix inputted: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println("\n");
        }
        
        //get sum of values
        int sum = 0;
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                sum = sum + matrix[i][j];
            }   
        }
        System.out.println("Sum: "+sum);
    
        //get aaverage of values
        System.out.println("Average: "+((float)sum/(rows*cols)));
        
    
    }
}
