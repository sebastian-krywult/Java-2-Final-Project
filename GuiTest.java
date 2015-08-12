// ClassName.........: GUI.java
// Developed By......: Donald Brumit, Sebastian Krywult and Christopher Liebenrood
// Week..............: Week 5
// Date Created......: 08/1/2015
// Purpose...........: Creates GUI 
//
package pkgfinal;

import javax.swing.JFrame;

public class GuiTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI myGui = new GUI();
        myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Set close conditions
        myGui.setSize(535, 200); //Window size
        myGui.setLocation(400, 300); //Window location
        myGui.setVisible(true);

    }

}
/*
Build a Drum Management System, which can retrieve / saves the information to a permanent data store (file).

The information to be tracked for this system are:
•Serial Number of the drum (e.g. S0001) - First Character is Alpha Numeric, rest four are numeric.
•Category - Either Oil or Water or Cotton
•Weight - (Should not be greater than 30 kg)
•Status (Auto Computed) ◦Empty - When created.
◦In Use - When item is entered
◦Full  - when it is 30 kg

One should be able to perform all these operations such as Add / Delete / Search / Next / Previous / Save and Retrieve from file

The user must be able to perform all the above operations, without exiting the program. When user wishes to exit the program, then it must validate if the information needs to be stored in the file or not.

When the user runs the program, it must load the information from the file (if the file exists).

For Delete and Search should be possible using the Serial Number. When searching the drum it must display the information about the drum.

The program must demonstrate the use of:
•ArrayList
•Exception Handling
•Reading and writing to file

*/
