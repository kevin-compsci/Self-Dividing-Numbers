/*
Kevin Nguyen
Basic Java program.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java JavaSDN"
*/

//imports
import java.io.*;
import java.util.*;

//class
class JavaSDN {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		
		//call selfDividingNumbers with appropriate params

		//display result
	}

	//selfDividingNumbers will output a list of numbers where each number with its digits are divisble w/ each other
    public List<Integer> selfDividingNumbers(int left, int right) {
        //local declarations
        int i = 0, size = 0, temp = 0;
        String currentIntStr;
        List<Integer> result = new ArrayList<Integer>();
        
        //loop through low bound to upper bound
        while(left <= right) {
            currentIntStr = Integer.toString(left); //current integer string
            size = currentIntStr.length(); //size of current Int string
            
            //if currentIntStr contains a 0 then skip?
            if(currentIntStr.contains(0+"")) {
                left++; i=0;
                continue;
            }
            result.add(left);
            
            //loop through every digit in currentIntStr 
            while(i < size) {
                temp = Character.getNumericValue(currentIntStr.charAt(i)); //turn char into int digit
                if((left % temp) != 0) {
                    result.remove(result.size()-1); //removes last appended element
                    break;
                }
                i++;
            }
            
            left++; i=0;
        }
        return result;        
    }	
}