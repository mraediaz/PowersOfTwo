/*
 * Class: PowersOfTwo
 * Author: Melany Diaz
 * Creation date: Jan 13, 2016
 */

import java.math.*;
import java.util.Scanner;

/**
 * This is a class made for MiniLab1 for Design and Analysis of Algorithms
 * professor, Gerry Howser. This class accepts an integer from the user between
 * 0-20 and then shows the powers of two up until that integer. 
 * @author Melany Diaz
 */

public class PowersOfTwo {
public static void main(String[] args){
	
	//calls the user to input a number n between 0-20
	Scanner reader = new Scanner(System.in);  // Reading from System.in
	System.out.println("Enter a number between 0 and 20: ");
	
	//Saves the user input as an integer n
	int n = reader.nextInt(); 

	//Prints the powers of 2 from 0 until n
	for (int i=0; i<n+1; i++)
		System.out.println("2 to the power of " + i + " = " + Math.pow(2, i));
	
}
}
