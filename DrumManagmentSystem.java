// ClassName.........: DrumManagmentSystem.java
// Developed By......: Donald Brumit, Sebastian Krywult and Christopher Liebenrood
// Week..............: Week 5
// Date Created......: 08/18/2015
// Purpose...........: Drum Managment System Class 
//
package pkgfinal;

public class DrumManagmentSystem {

    enum CATEGORY {

        Oil, Water, Cotton
    }

    enum STATUS {

        Empty, InUse, Full
    }

    private String serial;
    private double weight;
    private CATEGORY category;
    private STATUS status;

    int counter = 0;

    //  private DrumManagmentSystem[] list = new DrumManagmentSystem[100];
    public DrumManagmentSystem(String pSerial, double pWeight, CATEGORY pCategory, STATUS pStatus) {
        serial = pSerial;
        weight = pWeight;
        category = pCategory;
        status = pStatus;
    }

    public void setSerial(String pSerial) {
        serial = pSerial;

    }

    public String getSerial() {
        return serial;
    }

    public void setWeight(double pWeight) {
        weight = pWeight;
    }

    public String getWeight() {
        return String.valueOf(weight);
    }

    public void setCategory(CATEGORY pCategory) {
        category = pCategory;
    }

    public CATEGORY getCategory() {
        return category;
    }

    public String getCategoryString() {
        return category.toString();
    }

    public void setStatus(STATUS pStatus) {
        status = pStatus;
    }

    public STATUS getStatus() {
        return status;
    }

    public String getStatusString() {
         if (weight == 0) {
            status = STATUS.Empty;
        } else if ((weight > 0) && (weight < 30)) {
            status = STATUS.InUse;
        } else if (weight >= 30) {
            status = STATUS.Full;
        }
         
         
        return String.valueOf(status);

    }
    
    public boolean equals(Object v) 
    {
        boolean returnValue = false;

        if (v instanceof DrumManagmentSystem)
        {
            DrumManagmentSystem ptr = (DrumManagmentSystem) v;
            if (ptr.serial == serial)
                returnValue = true;
        }
        return returnValue;
  }

}
