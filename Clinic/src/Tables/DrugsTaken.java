package Tables;

import java.util.Date;

public class DrugsTaken {

    private int number;
    private int idPatient;
    private String medicineName;
    private int dosage;
    private Date startDate;
    private Date endDate;
    private String stillTakingIt;

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
        System.out.print("  id_Patient:"+idPatient);
    }
    
    
//    public DrugsTaken(int idPatient) {
//        this.idPatient = idPatient;
//        System.out.println("  id_Patient:"+idPatient);
//    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        System.out.print("  Number:"+number);
        
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
        System.out.print(String.format("  Medicine Name:%s",medicineName));
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
        System.out.print("  Dosage:"+dosage);
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
        System.out.printf("  %1$s %2$tB %2$td,%2$tY", "Start Date:", startDate);
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
        System.out.printf("  %1$s %2$tB %2$td,%2$tY", "End Date:", endDate);
    }

    public String getStillTakingIt() {
        return stillTakingIt;
    }

    public void setStillTakingIt(String stillTakingIt) {
        this.stillTakingIt = stillTakingIt;
        System.out.print(String.format("  Still Taking It:%s",stillTakingIt));
    }
    

}

    
