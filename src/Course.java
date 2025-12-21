public class Course {
    private String courseName;
    private String instructor;
    private Student students[];


    Course(String courseName , String instructor , int a){
        this.courseName = courseName;
        this.instructor = instructor;
        students = new Student[a];

    }
    public void addStudent(Student s, int index){
        students[index] = s;
    }
    public double courseAverageGPA(){
        double averag = 0;
        for(int i = 0 ; i < students.length ; i ++){
            averag += students[i].getgpa();
        }
        return (averag / students.length);
    }
    public String highestCreditStudent(){
        int max = students[0].getCredits();
        Student student  = students[0];
        for(int i = 0 ; i < students.length; i++){
            if(students[i].getCredits() > max ){
                max = students[i].getCredits();
                student = students[i];
            }
        }
        return student.getname();
    }
    public String toString(){
        return "Course name- " + courseName + "\nCourse instructor - " + instructor + "\ntotal students - " + students.length;
    }
}
