package clinic;

import DAO.DrugsTakenDao;
import DAO.PersonalDataDao;
import java.util.Scanner;

public class clinic {

    public static void main(String[] args) {
        int table;
        int action;
        Scanner t = new Scanner(System.in);
        System.out.println("Tables are: ");
        System.out.println("1.Personal Data ");
        System.out.println("2.Past History ");
        System.out.println("3.Investigations ");
        System.out.println("4.History Of present illness ");
        System.out.println("5.Family History ");
        System.out.println("6.Drugs Taken ");
        System.out.println("Please select a table : ");
        table = t.nextInt();

        switch (table) {
            case 1:
                Scanner a = new Scanner(System.in);
                System.out.println("1.Fetch data  ");
                System.out.println("2.Insert data ");
                System.out.println("3.Delete data ");
                System.out.println("Please select an action : ");
                action = a.nextInt();
                switch (action) {
                    case 1:
                        PersonalDataDao personaldata = new PersonalDataDao();
                        personaldata.GetAllPersonalDatas();
                        break;

                    case 2:

                        break;
                    case 3:

                        break;
                }
                break;
            case 2:
                Scanner b = new Scanner(System.in);
                System.out.println("1. fetch data  ");
                System.out.println("2.insert data ");
                System.out.println("3.delete data ");
                System.out.println("Please select an action : ");
                action = b.nextInt();
                switch (action) {
                    case 1:

                        break;
                }
                break;
            case 3:
                Scanner c = new Scanner(System.in);
                System.out.println("1. fetch data  ");
                System.out.println("2.insert data ");
                System.out.println("3.delete data ");
                System.out.println("Please select an action : ");
                action = c.nextInt();
                switch (action) {
                    case 1:

                        break;
                }
            case 4:
                Scanner d = new Scanner(System.in);
                System.out.println("1. fetch data  ");
                System.out.println("2.insert data ");
                System.out.println("3.delete data ");
                System.out.println("Please select an action : ");
                action = d.nextInt();
                switch (action) {
                    case 1:

                        break;
                }
            case 5:
                Scanner e = new Scanner(System.in);
                System.out.println("1. fetch data  ");
                System.out.println("2.insert data ");
                System.out.println("3.delete data ");
                System.out.println("Please select an action : ");
                action = e.nextInt();
                switch (action) {
                    case 1:

                        break;
                }
            case 6:
                Scanner f = new Scanner(System.in);
                System.out.println("1.fetch data  ");
                System.out.println("2.insert data ");
                System.out.println("3.delete data ");
                System.out.println("Please select an action : ");
                action = f.nextInt();
                switch (action) {
                    case 1:
                        DrugsTakenDao drugstaken = new DrugsTakenDao();
                        drugstaken.GetAllDrugs();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                }
                break;

            default:
                break;
        }

    }

}
