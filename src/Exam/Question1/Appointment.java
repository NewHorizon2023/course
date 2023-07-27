package Exam.Question1;

/**
 * @author Xiangnan Liu
 * @date 2023-07-27 14:21
 */
public class Appointment {
    /**
     * Patient Code:
     */
    private String code;
    /**
     * Patient Name
     */
    private String name;
    /**
     * Patient Phone No
     */
    private String phoneNo;
    /**
     * Symptoms
     */
    private String symptoms;
    /**
     * Diagnosis
     */
    private String diagnosis;

    public Appointment() {
    }

    public Appointment(String code, String name, String phoneNo, String symptoms, String diagnosis) {
        this.code = code;
        this.name = name;
        this.phoneNo = phoneNo;
        this.symptoms = symptoms;
        this.diagnosis = diagnosis;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
