package Tables;

import java.sql.Blob;
import java.util.Date;

public class Investigations {

    private String no;
    private String IDPatient;
    private String testName;
    private String testType;
    private Date date;
    private String report;
    private Blob additionalAttachment;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
        System.out.print(String.format("  Number:%s", no));
    }

    public String getIDPatient() {
        return IDPatient;
    }

    public void setIDPatient(String IDPatient) {
        this.IDPatient = IDPatient;
        System.out.print(String.format("  Patient's ID:%s", IDPatient));
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
        System.out.print(String.format("  Test Name:%s", testName));
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
        System.out.print(String.format("  Test Type:%s", testType));
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
        System.out.printf("  %1$s %2$tB %2$td,%2$tY", "Date:", date);
    }

    public Blob getAdditionalAttachment() {
        return additionalAttachment;
    }

    public void setAdditionalAttachment(Blob additionalAttachment) {
        this.additionalAttachment = additionalAttachment;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
        System.out.println(String.format("  Report:%s", report));
    }

}
