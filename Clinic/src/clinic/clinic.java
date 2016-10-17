package clinic;

import DAO.DrugsTakenDao;
import DAO.FamilyHistoryDao;
import DAO.HistoryOfPresentIllnessDao;
import DAO.InvestigationsDao;
import DAO.PastHistoryDao;
import DAO.PersonalDataDao;
import DAO.PersonalMedicalHistoryDao;
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
        System.out.println("7.Personal Medical History ");
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
                        PersonalDataDao personal_data = new PersonalDataDao();
                        personal_data.InsertPersonalData();
                        break;

                    case 3:
                        PersonalDataDao personaldataa = new PersonalDataDao();
                        personaldataa.DeletePersonalData();
                        break;
                }
                break;

            case 2:
                Scanner b = new Scanner(System.in);
                System.out.println("1.Fetch data  ");
                System.out.println("2.Insert data ");
                System.out.println("3.Delete data ");
                System.out.println("Please select an action : ");
                action = b.nextInt();
                switch (action) {
                    case 1:
                        PastHistoryDao pasthistory = new PastHistoryDao();
                        pasthistory.GetAllPastHistoryy();
                        break;

                    case 2:
                        PastHistoryDao pasthistoryy = new PastHistoryDao();
                        pasthistoryy.InsertPastHistory();
                        break;

                    case 3:
                        PastHistoryDao past_history = new PastHistoryDao();
                        past_history.DeletePastHistory();
                        break;
                }
                break;

            case 3:
                Scanner c = new Scanner(System.in);
                System.out.println("1.Fetch data  ");
                System.out.println("2.Insert data ");
                System.out.println("3.Delete data ");
                System.out.println("Please select an action : ");
                action = c.nextInt();
                switch (action) {
                    case 1:
                        InvestigationsDao investigations = new InvestigationsDao();
                        investigations.GetAllInvestigationss();
                        break;

                    case 2:
                        InvestigationsDao investigation = new InvestigationsDao();
                        investigation.InsertInvestigations();
                        break;

                    case 3:
                        InvestigationsDao investigationss = new InvestigationsDao();
                        investigationss.DeleteInvestigations();
                        break;
                }
                break;

            case 4:
                Scanner d = new Scanner(System.in);
                System.out.println("1.Fetch data  ");
                System.out.println("2.Insert data ");
                System.out.println("3.Delete data ");
                System.out.println("Please select an action : ");
                action = d.nextInt();
                switch (action) {
                    case 1:
                        HistoryOfPresentIllnessDao historyofpresentillness = new HistoryOfPresentIllnessDao();
                        historyofpresentillness.GetAllHistoryOfPresentIllnesss();
                        break;

                    case 2:
                        HistoryOfPresentIllnessDao history_ofpresentillness = new HistoryOfPresentIllnessDao();
                        history_ofpresentillness.InsertHistoryOfPresentIllness();
                        break;

                    case 3:
                        HistoryOfPresentIllnessDao historyofpresent_illness = new HistoryOfPresentIllnessDao();
                        historyofpresent_illness.DeleteHistoryOfPresentIllness();
                        break;
                }
                break;
            case 5:
                Scanner e = new Scanner(System.in);
                System.out.println("1.Fetch data  ");
                System.out.println("2.Insert data ");
                System.out.println("3.Delete data ");
                System.out.println("Please select an action : ");
                action = e.nextInt();
                switch (action) {
                    case 1:
                        FamilyHistoryDao familyhistoryy = new FamilyHistoryDao();
                        familyhistoryy.GetAllFamilyHistoryy();
                        break;

                    case 2:
                        FamilyHistoryDao familyhistory = new FamilyHistoryDao();
                        familyhistory.InsertFamilyHistory();
                        break;

                    case 3:
                        FamilyHistoryDao family_history = new FamilyHistoryDao();
                        family_history.DeleteFamilyHistory();
                        break;
                }
                break;

            case 6:
                Scanner f = new Scanner(System.in);
                System.out.println("1.Fetch data  ");
                System.out.println("2.Insert data ");
                System.out.println("3.Delete data ");
                System.out.println("Please select an action : ");
                action = f.nextInt();
                switch (action) {
                    case 1:
                        DrugsTakenDao drugstaken = new DrugsTakenDao();
                        drugstaken.GetAllDrugs();
                        break;

                    case 2:
                        DrugsTakenDao drugstakenn = new DrugsTakenDao();
                        drugstakenn.InsertDrugsTaken();
                        break;

                    case 3:
                        DrugsTakenDao drugs_taken = new DrugsTakenDao();
                        drugs_taken.DeleteDrugsTaken();
                        break;
                }
                break;

            case 7:
                Scanner g = new Scanner(System.in);
                System.out.println("1.Fetch data  ");
                System.out.println("2.Insert data ");
                System.out.println("3.Delete data ");
                System.out.println("Please select an action : ");
                action = g.nextInt();
                switch (action) {
                    case 1:
                        PersonalMedicalHistoryDao PersonalMedicalHistory = new PersonalMedicalHistoryDao();
                        PersonalMedicalHistory.GetPersonalMedicalHistory();
                        break;
                    case 2:
                        PersonalMedicalHistoryDao Personal_MedicalHistory = new PersonalMedicalHistoryDao();
                        Personal_MedicalHistory.InsertPersonalMedicalHistory();
                        break;
                    case 3:
                        PersonalMedicalHistoryDao PersonalMedical_History = new PersonalMedicalHistoryDao();
                        PersonalMedical_History.DeletePersonalMedicalHistory();
                        break;
                }
                break;

            default:
                break;
        }

    }

}
