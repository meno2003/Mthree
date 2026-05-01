package Practice.Methods;

public class StudentGradeCalc {
    public static void main(String[] args) {

        double mathsGrade = 75.2;
        double EnglishGrade = 64.2;
        double HistoryGrade = 94.1;
        String name = "jev";

        double average = StudentGradeCalc.calculateAverage(mathsGrade, EnglishGrade, HistoryGrade);
        String gradeM = returnGrade(mathsGrade);
        String gradeE = returnGrade(EnglishGrade);
        String gradeH = returnGrade(HistoryGrade);

        printReport(name,gradeM,gradeE,gradeH,average);




    }

    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }



    public static String returnGrade(double x) {
        if (x > 90) {
            return "A";
        } else if (x > 80 && x < 90) {
            return "B";
        } else if (x > 70 && x < 80) {
            return "C";
        } else if (x > 60 && x < 70) {
            return "D";
        }
        return "F";
    }

    public static void  printReport(String a, String b, String c, String d, double avg){
        System.out.println("name : " + a );
        System.out.println("Maths Grade : " + b );
        System.out.println("English Grade :  " + c );
        System.out.println("History Grade :  " + d );
        System.out.println("Average score : " + avg );

    }
}


