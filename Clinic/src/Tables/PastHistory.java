package Tables;

public class PastHistory {

    private String iDPatient;
    private String surgeries;
    private String injuriesOrAccidents;
    private String hcv;//kan enum
    private String hbv;//kan enum
    private String tb;//kan enum
    private String bloodtransfusion;//kan enum
    private String bilharziasis;//kan enum

    public String getiDPatient() {
        return iDPatient;
    }

    public void setiDPatient(String iDPatient) {
        this.iDPatient = iDPatient;
        System.out.print(String.format("  Patient's ID:%s", iDPatient));
    }

    public String getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(String surgeries) {
        this.surgeries = surgeries;
        System.out.print(String.format("  Surgeries:%s", surgeries));
    }

    public String getInjuriesOrAccidents() {
        return injuriesOrAccidents;
    }

    public void setInjuriesOrAccidents(String injuriesOrAccidents) {
        this.injuriesOrAccidents = injuriesOrAccidents;
        System.out.print(String.format("  Injuries Or Accidents:%s", injuriesOrAccidents));
    }

    public String getHcv() {
        return hcv;
    }

    public void setHcv(String hcv) {
        this.hcv = hcv;
        System.out.print(String.format("  HCV:%s", hcv));
    }

    public String getHbv() {
        return hbv;
    }

    public void setHbv(String hbv) {
        this.hbv = hbv;
        System.out.print(String.format("  HBV:%s", hbv));
    }

    public String getTb() {
        return tb;
    }

    public void setTb(String tb) {
        this.tb = tb;
        System.out.print(String.format("  TB:%s", tb));
    }

    public String getBloodtransfusion() {
        return bloodtransfusion;
    }

    public void setBloodtransfusion(String bloodtransfusion) {
        this.bloodtransfusion = bloodtransfusion;
        System.out.print(String.format("  Blood Transfusion:%s", bloodtransfusion));
    }

    public String getBilharziasis() {
        return bilharziasis;
    }

    public void setBilharziasis(String bilharziasis) {
        this.bilharziasis = bilharziasis;
        System.out.println(String.format("  Bilharziasis:%s", bilharziasis));
    }

}
