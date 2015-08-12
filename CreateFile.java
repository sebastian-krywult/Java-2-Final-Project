// ClassName.........: CreateFile.java
// Developed By......: Donald Brumit, Sebastian Krywult and Christopher Liebenrood
// Week..............: Week 5
// Date Created......: 08/18/2015
// Purpose...........: Creates file and reads file for Gui Class 
//

package pkgfinal;

import java.util.*;
import java.io.*;
import java.lang.*;

public class CreateFile {

    private Formatter inventory;

       public void openFile() {
        try {
            inventory = new Formatter("drumInventory.txt");
        } catch (Exception e) {
            System.out.println("File Error");
        }
    }

    public void addRecords() {
        inventory.format("%s%s%s%s");

    }

    public void closeFile() {
        inventory.close();
    }

}
