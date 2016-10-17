package Tables;

public class PersonalMedicalHistory {

    private int iDPatient; //final
    private int height;
    private int weight;
    private String aboBloodType;//A,B,AB,O
    private String rhBloodType;//POSITIVE,NEGATIVE
    private String hyperTension;//Yes,No
    private String dM;//Yes,No
    private String allergies;
    private String smoking;//Yes,No
    private String typeOfSmoking;//Cigarettes,Hubble,Bubble
    private int cigarettesDay;
    private int yearsOfSmoking;
    private String alcohol;//Yes,No
    private String cannabis;//Yes,No
    private String narcotic;//Yes,No
    private String narcoticsDrugs;
    private String stimulants;//Yes,No
    private String stimulantsDrugs;
    private String antiDepressants;//Yes,No
    private String antiDepressantsDrugs;
    private String hallucinogens;//Yes,No
    private String hallucinogensDrugs;//Yes,No

    public int getiDPatient() {
        return iDPatient;
    }

    public void setiDPatient(int iDPatient) {
        this.iDPatient = iDPatient;
        System.out.print("  Patient's ID:" + iDPatient);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        System.out.print("  Height:" + height);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        System.out.print("  Weight:" + weight);
    }

    public String getAboBloodType() {
        return aboBloodType;
    }

    public void setAboBloodType(String aboBloodType) {
        this.aboBloodType = aboBloodType;
        System.out.print(String.format("  ABO blood type:%s", aboBloodType));
    }

    public String getRhBloodType() {
        return rhBloodType;
    }

    public void setRhBloodType(String rhBloodType) {
        this.rhBloodType = rhBloodType;
        System.out.print(String.format("  RH blood type:%s", rhBloodType));
    }

    public String getHyperTension() {
        return hyperTension;
    }

    public void setHyperTension(String hyperTension) {
        this.hyperTension = hyperTension;
        System.out.print(String.format("  Hyper Tension:%s", hyperTension));
    }

    public String getdM() {
        return dM;
    }

    public void setdM(String dM) {
        this.dM = dM;
        System.out.print(String.format("  DM:%s", dM));
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
        System.out.print(String.format("  Allergies:%s", allergies));
    }

    public String getSmoking() {
        return smoking;
    }

    public void setSmoking(String smoking) {
        this.smoking = smoking;
        System.out.print(String.format("  Smoking:%s", smoking));
    }

    public String getTypeOfSmoking() {
        return typeOfSmoking;
    }

    public void setTypeOfSmoking(String typeOfSmoking) {
        this.typeOfSmoking = typeOfSmoking;
        System.out.print(String.format("  Type of smoking:%s", typeOfSmoking));
    }

    public int getCigarettesDay() {
        return cigarettesDay;
    }

    public void setCigarettesDay(int cigarettesDay) {
        this.cigarettesDay = cigarettesDay;
        System.out.print("  Cigarettes/Day:" + cigarettesDay);
    }

    public int getYearsOfSmoking() {
        return yearsOfSmoking;
    }

    public void setYearsOfSmoking(int yearsOfSmoking) {
        this.yearsOfSmoking = yearsOfSmoking;
        System.out.print("  Years of smoking:" + yearsOfSmoking);
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
        System.out.print(String.format("  Alcohol:%s", alcohol));
    }

    public String getCannabis() {
        return cannabis;
    }

    public void setCannabis(String cannabis) {
        this.cannabis = cannabis;
        System.out.print(String.format("  Cannabis:%s", cannabis));
    }

    public String getNarcotic() {
        return narcotic;
    }

    public void setNarcotic(String narcotic) {
        this.narcotic = narcotic;

        System.out.print(String.format("  Narcotic:%s", narcotic));
    }

    public String getNarcoticsDrugs() {
        return narcoticsDrugs;
    }

    public void setNarcoticsDrugs(String narcoticsDrugs) {
        this.narcoticsDrugs = narcoticsDrugs;
        System.out.print(String.format("  Narcotics drugs:%s", narcoticsDrugs));
    }

    public String getStimulants() {
        return stimulants;
    }

    public void setStimulants(String stimulants) {
        this.stimulants = stimulants;
        System.out.print(String.format("  Stimulants:%s", stimulants));
    }

    public String getStimulantsDrugs() {
        return stimulantsDrugs;
    }

    public void setStimulantsDrugs(String stimulantsDrugs) {
        this.stimulantsDrugs = stimulantsDrugs;
        System.out.print(String.format("  Stimulants Drugs:%s", stimulantsDrugs));
    }

    public String getAntiDepressants() {
        return antiDepressants;
    }

    public void setAntiDepressants(String antiDepressants) {
        this.antiDepressants = antiDepressants;
        System.out.print(String.format("  AntiDepressants:%s", antiDepressants));
    }

    public String getAntiDepressantsDrugs() {
        return antiDepressantsDrugs;
    }

    public void setAntiDepressantsDrugs(String antiDepressantsDrugs) {
        this.antiDepressantsDrugs = antiDepressantsDrugs;
        System.out.print(String.format("  AntiDepressants Drugs:%s", antiDepressantsDrugs));
    }

    public String getHallucinogens() {
        return hallucinogens;
    }

    public void setHallucinogens(String hallucinogens) {
        this.hallucinogens = hallucinogens;
        System.out.print(String.format("  Hallucinogens:%s", hallucinogens));
    }

    public String getHallucinogensDrugs() {
        return hallucinogensDrugs;
    }

    public void setHallucinogensDrugs(String hallucinogensDrugs) {
        this.hallucinogensDrugs = hallucinogensDrugs;
        System.out.println(String.format("  Hallucinogens Drug:%s", hallucinogensDrugs));
    }

}
