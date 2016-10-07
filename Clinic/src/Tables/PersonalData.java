package Tables;

import java.sql.Date;

public class PersonalData {

    private final int iD; // el members dol lazem lowercase
    private String patientName;
    private Date birthDate;
    private String placeOfBirth;
    private String gender;
    private String nationality;
    private String currentAddress;
    private String maritalStatus;
    private int offspring; // Represent sdflkajsdl
    private int ageOfYoungestOffspring;
    private String workNature;
    private String phoneNumber; // 25aleha string
    private String cityAddress;
    private String eMail;

    public int getiD() {
        return iD;
    }

    public PersonalData(int iD) {
        this.iD = iD;
        System.out.print("  ID:" + iD);
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
        System.out.print(String.format("  patientName:%s", patientName));
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        System.out.printf("  %1$s %2$tB %2$td,%2$tY", "BithDate:", birthDate);
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
        System.out.print(String.format("  placeOfBirth:%s", placeOfBirth));
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        System.out.print(String.format("  gender:%s", gender));
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
        System.out.print(String.format("  Nationality:%s", nationality));
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
        System.out.print(String.format("  CurrentAddress:%s", currentAddress));
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        System.out.print(String.format("  MaritalStatus:%s", maritalStatus));
    }

    public int getOffspring() {
        return offspring;
    }

    public void setOffspring(int offspring) {
        this.offspring = offspring;
        System.out.print("  Offspring:" + offspring);
    }

    public int getAgeOfYoungestOffspring() {
        return ageOfYoungestOffspring;
    }

    public void setAgeOfYoungestOffspring(int ageOfYoungestOffspring) {
        this.ageOfYoungestOffspring = ageOfYoungestOffspring;
        System.out.print("  Age Of Youngest Offspring:" + ageOfYoungestOffspring);
    }

    public String getWorkNature() {
        return workNature;
    }

    public void setWorkNature(String workNature) {
        this.workNature = workNature;
        System.out.print(String.format("  WorkNature:%s", workNature));
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.print(String.format("  PhoneNumber:%s", phoneNumber));

    }

    public String getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
        System.out.print(String.format("  CityAddress:%s", cityAddress));

    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
        System.out.println(String.format("  EMail:%s", eMail));

    }

}
