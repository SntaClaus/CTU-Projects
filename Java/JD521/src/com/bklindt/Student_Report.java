package com.bklindt;

public class Student_Report extends Student{
    //JD521_Brandon_Klindt_5261_FA2
    private String studentNumber;
    private String testResult;
    private String assignmentResult;
    private String examResult;
    private String averageReport;

    @Override
    public String getStudentNumber(){
        return studentNumber;
    }

    @Override
    public void setStudentNumber(String number){
        studentNumber = number;
    }

    @Override
    public String getTestResult() {
        return testResult;
    }

    @Override
    public void setTestResult(String number) {
        testResult = number;
    }

    @Override
    public String getAssignmentResult() {
        return assignmentResult;
    }

    @Override
    public void setAssignmentResult(String number) {
        assignmentResult = number;
    }

    @Override
    public String getExamResult() {
        return examResult;
    }

    @Override
    public void setExamResult(String number) {
        examResult = number;
    }

    @Override
    public String getAverageReport() {
        return averageReport;
    }

    @Override
    public void setAverageReport(String number) {
        averageReport = number;
    }

    public Student_Report(){
        super(null,null,null,null);
    }

    public static void main(String[] args) {
        //
    }

}
