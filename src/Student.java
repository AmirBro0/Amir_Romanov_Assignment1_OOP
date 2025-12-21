public class Student {
    private String name;
    private int id;
    private String major;
    private double gpa;
    private int credits;

    Student(String name , int id , String major){
        this.name = name;
        this.id = id;
        this.major = major;
        gpa = 0.0;
        credits = 0;
    }
    public void setid(int id){
        if (id > 0){
            this.id = id;
        }
    }
    public int getid(){
        return id;
    }
    public void setname(String name){

        this.name = name;

    }
    public String getname(){
        return name;
    }
    public void setmajor(String major){

        this.major = major;

    }
    public String getmajor(){
        return major;
    }
    public void updateGPA(double newGPA){
        gpa = newGPA;
    }
    public double getgpa(){
        return gpa;
    }
    public void addCredits(int c){

        credits = c;

    }
    public int getCredits(){
        return credits;
    }

    public boolean isHonors(){
        if(gpa >= 3.5){
            return true;
        }
        return false;
    }

    public String toString() {
        return "Student table \n\nname='" + name + "'\nid=" + id + "\nmajor='" + major + "'\ngpa=" + gpa + "\ncredits=" + credits;
    }

}
