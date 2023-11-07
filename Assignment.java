
import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Ax Qy
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/
public class Assignment {
	public static void main(String args[]) throws IOException {
		// ***** constants *******
	    
	    // ***** variables *****
	    
			String strin = ""; 				// used to split
	        String banner = "";             // output banner
	        int x = 0;                      // assignemnt number for banner
	        int y = 0;                      // question number for banner
	        int low = 1;
	        int high = 50;
	        
	        
	        // a new line character that works on every computer system
	        String nl = System.lineSeparator();
	    
	    // ***** objects *****
	        Random r = new Random();
	        
	    
	    // ***** print banners *****
	    
	        
	        
	        System.out.println(getBanner(nl, x, y));
	        //fout.print(banner);
	    
	    // ***** Get Input *****
	        try{
	            PrintWriter fileout = new PrintWriter(new FileWriter("counter.txt"));
	               for (int i = 1; i < 1000; i++ )
	   	        {
	   	        int result = r.nextInt (high)+low;
	   	        //System.out.println(result);
                fileout.println(result);
	            }         
	               fileout.close();
	               System.out.println("success...");
	           }
	        catch(Exception e)
	        	{
	        	   System.out.println(e);
	        	   }
	
	    // ***** Main Processing *****
	        BufferedReader fin = new BufferedReader(new FileReader("counter.txt"));

	        String[] lines = new String[1000];
	        int lineCount = 0;

	        String line;
	        while ((line = fin.readLine()) != null) {
	            lines[lineCount] = line;
	            lineCount++;
	        }

	        // Close the file
	        fin.close();


	    // ***** Print Formatted Output *****

	        HashMap<String, Integer> frequencyMap = new HashMap<>();

	        for (int i = 0; i < lineCount; i++) {
	            String num = lines[i];
	            if (frequencyMap.containsKey(num)) {
	                frequencyMap.put(num, frequencyMap.get(num) + 1);
	            } else {
	                frequencyMap.put(num, 1);
	            }
	        }

	        for (String num : frequencyMap.keySet()) {
	            int count = frequencyMap.get(num);
	            System.out.println(num + " occured " + count + " times");
	        }
	    // ***** Closing Message *****
	    
	        printClosingMessage();
	        
	        	
	    
	        
	        //fout.println("End of Processing");
	        
	    // **** close io buffers *****
	    
	        //fin.close();
	        //fout.close();
	}//end main 
	    
	    // **** user defined methods ****
	    
	    public static String getBanner(String nl, int x, int y){
	        String banner = "";   // banner to be returned to calling function 
	        
	        banner = "*****************************" + nl;
	        banner += "Name:        Sveinson" + nl;
	        banner += "Class:       CS30S" + nl;
	        banner += "Assignment:  A" + x + " Q" + y + nl;
	        banner += "*****************************" + nl + nl;
	        
	        return banner;
	    }//end banner
	    
	    public static void printClosingMessage(){
	        System.out.println();
	        System.out.println("end of processing");
	}//end main
}

