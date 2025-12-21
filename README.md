**1. Project Overview **

 

This project is a student management system written in Java. 

It allows you to create and manage Student objects, track their GPA and credits, and organize them into Course objects. 

This project covers topics such as: 

1. Classes and Objects 

2. Constructors 

3. Encapsulation and Data Hiding 

4. Composition 

5. Object Arrays 

6. Loops and Conditionals 

The main goal is to learn Java while creating a meaningful and well-structured application. 




**2. Class Descriptions **

 ** Student Class: **

Explanation of Student class fields, constructor, methods: 

name - Full name of the student 
 
id - Student id 

major - study field 

gpa - average score 
 
credits — Total earned credits  
 
 ** Constructor: **

Student(String name, String id, String major) 

Initializes name, id, major, sets gpa = 0.0 and credits = 0. 

 ** Methods: **

getters and setters for all fields 
 
addCredits(int c) - adds credits 
      
updateGPA(double newGPA) - updates gpa 
 
isHonors() - returns true if gpa >= 3.5 
 
toString() - returns a textual representation of the student 


  **Course Class:** 

Explanation of Student class fields, constructor, methods: 

courseName — Name of the course 
 
instructor — Instructor’s name 
 
students[] — Array of Student objects 
 
 ** Constructor: **

Course(String courseName, String instructor, int size) 

Initializes a course name,instructor, and size of students 

  **Methods: **

addStudent(Student s, int index) — adds a student with hisindex 
 
courseAverageGPA() — calculates the average score of all students 
 
highestCreditStudent() — returns the student with the highest credits 
 
toString() — summary of the course 
 
 

  **Composition relationship: **
Course contains an array of Student objects, demonstrating has-a relationship. 



**3. How to Compile and Run**
   
Navigate to the src directory in the terminal. 
Compile all Java files: javac *.java 
Run the main program: java Main 


**5. Reflection Section **

During this project, I learned how to better utilize OOP principles in Java, including data hiding, composition, and working with object arrays. 
I had some trouble using student class objects as array elements of a single class object. 
Overall, this assignment helped me understand Java better, giving me an understanding of classes, objects, and the relationships between them. 
