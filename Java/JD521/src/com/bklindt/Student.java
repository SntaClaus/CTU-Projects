package com.bklindt;

import javax.swing.*;

public class Student{
    //JD521_Brandon_Klindt_5261_FA2
    private String studentNumber;
    private String testResult;
    private String assignmentResult;
    private String examResult;
    private String averageReport;

    public String getStudentNumber(){
        return studentNumber;
    }

    public void setStudentNumber(String number){
        studentNumber = number;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String number) {
        testResult = number;
    }

    public String getAssignmentResult() {
        return assignmentResult;
    }

    public void setAssignmentResult(String number) {
        assignmentResult = number;
    }

    public String getExamResult() {
        return examResult;
    }

    public void setExamResult(String number) {
        examResult = number;
    }

    public String getAverageReport() {
        return averageReport;
    }

    public void setAverageReport(String number) {
        averageReport = number;
    }

    public void printReport(){
        float test,assignment,exam,fTest,fAssignment,fExam,total;
        test = Float.parseFloat(getTestResult());
        assignment = Float.parseFloat(getAssignmentResult());
        exam = Float.parseFloat(getExamResult());
        fTest = test * 25 / 100;
        fAssignment = assignment * 25 /100;
        fExam = exam * 50 / 100;
        total = fTest + fAssignment + fExam;
        setAverageReport(Float.toString(total));
    }

    //Constructor
    public Student(String studentNumber, String testResult, String assignmentResult, String examResult){
        //
        setStudentNumber(studentNumber);
        setTestResult(testResult);
        setAssignmentResult(assignmentResult);
        setExamResult(examResult);
        printReport();
    }

    public static void main(String[] args) {
        // Start of program execution
        final int PASS_MARK = 70;
        var sNum = CheckValidity.CheckValidEntry("Please enter Student number", "Enter only numbers!");
        var tResult = CheckValidity.CheckValidEntry("Please select test result", 100);
        var aResult = CheckValidity.CheckValidEntry("Please select assignment result", 100);
        var exResult = CheckValidity.CheckValidEntry("Please select exam result", 100);
        var obj = new Student(sNum, tResult, aResult , exResult);
        var studNumber = obj.getStudentNumber();
        var testResult = obj.getTestResult();
        var assignmentResult = obj.getAssignmentResult();
        var examResult = obj.getExamResult();
        var averageResult = obj.getAverageReport();
        String failOrPass;

        if (Float.parseFloat(averageResult) < PASS_MARK){
            failOrPass = "FAILED";
        } else {
            failOrPass = "PASSED";
        }

        System.out.println("====================================");
        System.out.println("Student number: " + studNumber);
        System.out.println("Test result: " + testResult + "%");
        System.out.println("Assignment result: " + assignmentResult + "%");
        System.out.println("Exam result: " + examResult + "%");
        System.out.println("Student average: " + averageResult + "%");
        System.out.println("====================================");

        JOptionPane.showMessageDialog(null,
                "Student Number: " + studNumber + "\n"
                + "Test Result: " + testResult + "%\n"
                + "Assignment Result: " + assignmentResult + "%\n"
                + "Exam Result: " + examResult + "%\n"
                + "Average: " + averageResult + "%\n"
                + "Student has " + failOrPass + " the subject",
                "Student \"" + studNumber + "\" Information" ,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
