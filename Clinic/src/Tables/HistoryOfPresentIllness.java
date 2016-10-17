package Tables;

import java.util.Date;

public class HistoryOfPresentIllness {

    private String visitNo;
    private String iDPatient;
    private Date dateOfVisit;
    private String complain;
    private String analysisOfComplain;
    private String diagnosis;
    private String treatment;
    private String requiredInvestigations;
    private Date dateOfNextExamination;

    public String getVisitNo() {
        return visitNo;
    }

    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo;
        System.out.print(String.format("  Visit_No:%s", visitNo));
    }

    public String getiDPatient() {
        return iDPatient;
    }

    public void setiDPatient(String iDPatient) {
        this.iDPatient = iDPatient;
        System.out.print(String.format("  patient's ID:%s", iDPatient));
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
        System.out.printf("  %1$s %2$tB %2$td,%2$tY", "Date of visit:", dateOfVisit);
    }

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
        System.out.print(String.format("  Complain:%s", complain));

    }

    public String getAnalysisOfComplain() {
        return analysisOfComplain;

    }

    public void setAnalysisOfComplain(String analysisOfComplain) {
        this.analysisOfComplain = analysisOfComplain;
        System.out.print(String.format("  Analysis of complain:%s", analysisOfComplain));
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
        System.out.print(String.format("  Diagnosis:%s", diagnosis));
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
        System.out.print(String.format("  Treatment:%s", treatment));
    }

    public String getRequiredInvestigations() {
        return requiredInvestigations;
    }

    public void setRequiredInvestigations(String requiredInvestigations) {
        this.requiredInvestigations = requiredInvestigations;
        System.out.println(String.format("  Required Investigations:%s", requiredInvestigations));
    }

    public Date getDateOfNextExamination() {
        return dateOfNextExamination;
    }

    public void setDateOfNextExamination(Date dateOfNextExamination) {
        this.dateOfNextExamination = dateOfNextExamination;
        System.out.printf("  %1$s %2$tB %2$td,%2$tY", "Date of Next Examination:", dateOfNextExamination);
    }

}
