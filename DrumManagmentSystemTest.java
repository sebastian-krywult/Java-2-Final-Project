// ClassName.........: DrumManagmentSystem.java
// Developed By......: Donald Brumit, Sebastian Krywult and Christopher Liebenrood
// Week..............: Week 5
// Date Created......: 08/18/2015
// Purpose...........: Test Class for Drum Managment System
//
package pkgfinal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrumManagmentSystemTest
{

    /**
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException
    {

        String serialNumber = null;
        double weight = 0.0;
        DrumManagmentSystem.CATEGORY category = null;
        DrumManagmentSystem.STATUS status = null;

        BufferedReader input = new BufferedReader(new InputStreamReader(
            System.in));

        DrumManagmentSystem drum = new DrumManagmentSystem(serialNumber, weight, category, status);

        DrumManagmentSystem[] drumsArray = new DrumManagmentSystem[100];

        for (int i = 0; i < drumsArray.length; i++)
        {

            System.out.println("Enter drum serial (or # to stop): ");
            serialNumber = input.readLine();

            if (!("#".equals(serialNumber)))
            {
drumsArray[i] = drum;
                drum.setSerial(serialNumber);

                System.out.println("Enter drum weight: ");
                weight = Double.parseDouble(input.readLine());
                drumsArray[i] = drum;
                drum.setWeight(weight);

                System.out.println("Enter category - Oil, Water or Cotton: ");
                category = category.valueOf(input.readLine());
                drumsArray[i] = drum;
                drum.setCategory(category);

                System.out.println("Enter status - Empty, InUse or Full: ");
                status = status.valueOf(input.readLine());
                drumsArray[i] = drum;
                drum.setStatus(status);

                drumsArray[i] = new DrumManagmentSystem(serialNumber, weight, category, status);
                drumsArray[i] = drum;
                drum.setSerial(serialNumber);

                System.out.println("Enter drum weight: ");
                weight = Double.parseDouble(input.readLine());
                drumsArray[i] = drum;
                drum.setWeight(weight);

                System.out.println("Enter category - Oil, Water or Cotton: ");
                category = category.valueOf(input.readLine());
                drumsArray[i] = drum;
                drum.setCategory(category);

                System.out.println("Enter status - Empty, InUse or Full: ");
                status = status.valueOf(input.readLine());
                drumsArray[i] = drum;
                drum.setStatus(status);

                drumsArray[i] = new DrumManagmentSystem(serialNumber, weight, category, status);

            }

            else
            {
                System.out.println("\t\tDrums:\n");
                System.out.println("\t\tSerial \t\tWeight \t\tCategory \tStatus");
                for (int j = 0; j < drumsArray.length; j++)
                {
                    if(drumsArray[j]!=null)
                    {
                        System.out.println("\t\t" +
                            drumsArray[j].getSerial() + "\t\t" +
                            drumsArray[j].getWeight() + "\t\t" +
                            drumsArray[j].getCategory() + "\t\t" +
                            drumsArray[j].getStatus());
                    }
                }
                break;
            }

        }

    }
}