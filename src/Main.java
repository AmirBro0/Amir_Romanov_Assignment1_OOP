import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Student s1 = new Student("AMir Romanov", 1, "SE");
        s1.updateGPA(4.0);
        s1.addCredits(150);
        Student s2 = new Student("Orazbai Bakytzhan", 2, "CS");
        s2.updateGPA(3.2);
        s2.addCredits(75);
        Student s3 = new Student("Akezhanov Assanali", 3, "Cyber-Security");
        s3.updateGPA(3.9);
        s3.addCredits(110);
        Student s4 = new Student("Kabdolda Rustam", 4, "PM");
        s4.updateGPA(2.9);
        s4.addCredits(60);
        Student s5 = new Student("Niazi Hamid", 5, "BioChem");
        s5.updateGPA(3.6);
        s5.addCredits(95);
        Student students[] = {s1, s2, s3, s4, s5};
        Course cs = new Course("Object Oriented Programming", "Aidana Aidynkyzy", students.length);
        for(int i = 0 ; i < students.length;i++){
            cs.addStudent(students[i],i);
        }
        System.out.println("\n" + cs.toString());
        System.out.println("\naverage gpa: " + cs.courseAverageGPA());
        System.out.println("\nstudent with highest credit: " + cs.highestCreditStudent());
        System.out.println("\nstudent with top gpa: " + getTopStudent(students));
        System.out.println("\nhonors sum: " + countHonors(students));
        System.out.println("\ntotal credit: " + totalCredits(students));

    }
    public static String getTopStudent(Student students[]) {
        double max = students[0].getgpa();
        Student student  = students[0];
        for(int i = 0 ; i < students.length; i++){
            if(students[i].getgpa() > max ){
                max = students[i].getgpa();
                student = students[i];
            }
        }
        return student.getname();
    }
    public static int countHonors(Student students[]) {
        int count = 0;
        for (int i = 0 ; i < students.length;i++) {
            if (students[i].isHonors()) {
                count++;
            }
        }
        return count;
    }
    public static int totalCredits(Student students[]) {
        int sum = 0;
        for (int i = 0 ; i < students.length;i++) {
            sum += students[i].getCredits();
        }
        return sum;
    }
}
//изменение для пуша