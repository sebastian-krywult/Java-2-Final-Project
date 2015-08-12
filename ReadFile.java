// ClassName.........: ReadFile.java
// Developed By......: Donald Brumit, Sebastian Krywult and Christopher Liebenrood
// Week..............: Week 5
// Date Created......: 08/18/2015
// Purpose...........: Reads file for Gui Class 
//
package pkgfinal;

import java.util.*;
import java.io.*;
import javax.swing.*;

public class ReadFile 
{
    private Scanner read;
    
    public void openFile(){
        try{
            read = new Scanner(new File("drumInventory.txt"));
        }
        catch(Exception e){
            System.out.println("File not found!");
        }
    }
    public void readFile(){
        while(read.hasNext()){
            String a = read.next();
            String b = read.next();
            String c = read.next();
            String d = read.next();                
        }
    }
    public void closeFile(){
        read.close();
    
    }
}
