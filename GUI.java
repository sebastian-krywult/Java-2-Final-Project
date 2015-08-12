// ClassName.........: GUI.java
// Developed By......: Donald Brumit, Sebastian Krywult and Christopher Liebenrood
// Week..............: Week 5
// Date Created......: 08/1/2015
// Purpose...........: Creates GUI 
//
package pkgfinal;

import java.awt.FlowLayout;  //Adds itmes to the right or next line if needed
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI extends JFrame {

    private JButton add;
    private JButton delete;
    private JButton search;
    private JButton previous;
    private JButton next;
    private JButton save;
    private JButton retrive;
    private JLabel item1;
    private JLabel item2;
    private JLabel item3;
    private JLabel item4;
    int currentIndex = -1;//Index of currenly slected item
    int maxIndex = -1; //Highest index

    public GUI() {

        super("Final Project"); //title of Window
        setLayout(new FlowLayout());
        add = new JButton("add");
        add(add);
        delete = new JButton("delete");
        add(delete);
        search = new JButton("search");
        add(search);
        previous = new JButton("previous");
        add(previous);
        next = new JButton("next");
        add(next);
        save = new JButton("save");
        add(save);
        retrive = new JButton("retrive");
        add(retrive);

        item1 = new JLabel("None");
        item1.setToolTipText("Serial Number");
    //    item1.setLocation(50, 50);
        add(item1);

        item2 = new JLabel("0");
        item2.setToolTipText("Weight");
        add(item2);

        item3 = new JLabel("None");
        item3.setToolTipText("Category");
        add(item3);

        item4 = new JLabel("Empty");
        item4.setToolTipText("STATUS");
        add(item4);

        HandlerClass handler = new HandlerClass();
        delete.addActionListener(handler);
        add.addActionListener(handler);
        search.addActionListener(handler);
        previous.addActionListener(handler);
        next.addActionListener(handler);
        save.addActionListener(handler);
        retrive.addActionListener(handler);
    }

    private class HandlerClass implements ActionListener {

        String inputValue = null;
        String serialNumber = null;
        String categorySTR = null;
        String weightSTR = null;

        double weight = 0.0;
        //      String category = null;

        DrumManagmentSystem.CATEGORY category = null;
        DrumManagmentSystem.STATUS status = null;
        ArrayList<DrumManagmentSystem> drum = new ArrayList<DrumManagmentSystem>();
        //     DrumManagmentSystem[] drumsArray = new DrumManagmentSystem[100];
        //    DrumManagmentSystem drum = new DrumManagmentSystem(serialNumber, weight, category, status);

        public void actionPerformed(ActionEvent event) {
            //  int currentIndex;
            String myCase = event.getActionCommand();
            switch (myCase) {
                case "delete": //Replace popup with real method call
                    JOptionPane.showMessageDialog(null, String.format("Pressed Delete"));
                    break;
                case "add":
                    //Collect data
                    serialNumber = JOptionPane.showInputDialog("Enter Serial Number Sxxxx");
                    categorySTR = JOptionPane.showInputDialog("Enter Category");
                    category = category.valueOf(categorySTR);
                    weightSTR = JOptionPane.showInputDialog("Enter Weight");
                    weight = Double.parseDouble(weightSTR);
                    //Add new record
                    drum.add(new DrumManagmentSystem(serialNumber, weight, category, status));
                    //Update Display
                    item1.setText(drum.get(drum.size() - 1).getSerial());
                    item2.setText(drum.get(drum.size() - 1).getCategoryString());
                    item3.setText(drum.get(drum.size() - 1).getWeight());
                    item4.setText(drum.get(drum.size() - 1).getStatusString());

                    DrumManagmentSystem myDrum = new DrumManagmentSystem(serialNumber, weight, category, status);
                    currentIndex = drum.indexOf(myDrum);
                    maxIndex = currentIndex;
                    //      x = drum.size();
                    //      System.out.println(x);
                    break;
                case "search":
                    currentIndex = this.drum.indexOf("S");

                    JOptionPane.showMessageDialog(null, String.format("Pressed search"));
                    break;
                case "previous":// 0 needs to be replaced with current index -1
                    if (currentIndex == 0) {
                        currentIndex = maxIndex;
                    } else {
                        currentIndex--;
                    }
                    item1.setText(drum.get(currentIndex).getSerial());
                    item2.setText(drum.get(currentIndex).getCategoryString());
                    item3.setText(drum.get(currentIndex).getWeight());
                    item4.setText(drum.get(currentIndex).getStatusString());
                    //     JOptionPane.showMessageDialog(null, String.format("Pressed previous"));
                    break;
                case "next":// 1 needs to be replaced with current index +1
                    if (currentIndex == maxIndex) {
                        currentIndex = 0;
                    } else {
                        currentIndex++;
                    }
                    item1.setText(drum.get(currentIndex).getSerial());
                    item2.setText(drum.get(currentIndex).getCategoryString());
                    item3.setText(drum.get(currentIndex).getWeight());
                    item4.setText(drum.get(currentIndex).getStatusString());
                    //    JOptionPane.showMessageDialog(null, String.format("Pressed next"));
                    break;
                case "display":
                    JOptionPane.showMessageDialog(null, String.format("Pressed display"));
                    break;
                case "save":
                    JOptionPane.showMessageDialog(null, String.format("Pressed save"));
                    break;
                case "retrive":
                    JOptionPane.showMessageDialog(null, String.format("Pressed retrive"));
                    break;
            }

        }

    }

}
