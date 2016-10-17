package Tables;

public class FamilyHistory {

    private String iDPatient;
    private String typeOfIllness;
    private String FamilyMemeberWhoHaveSameIllness;
    private String description;

    public String getiDPatient() {
        return iDPatient;
    }

    public void setiDPatient(String iDPatient) {
        this.iDPatient = iDPatient;
        System.out.print(String.format("  Patient's ID:%s", iDPatient));
    }

    public String getType_illness() {
        return typeOfIllness;
    }

    public void setType_illness(String type_illness) {
        this.typeOfIllness = type_illness;
        System.out.print(String.format("  Type Of Illness:%s", type_illness));
    }

    public String getFamily_member() {
        return FamilyMemeberWhoHaveSameIllness;
    }

    public void setFamily_member(String family_member) {
        this.FamilyMemeberWhoHaveSameIllness = family_member;
        System.out.print(String.format("  Family Memeber Who Have Same Illness:%s", FamilyMemeberWhoHaveSameIllness));

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        System.out.println(String.format("  Description:%s", description));
    }

}
