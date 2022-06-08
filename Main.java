
/**
 * Write a description of class Main here.
 *
 */
public class Main
{
    public static void main(String[] args){
        Students newStudent = new Students("123456789", "Bobby Brown", "bobby@comcast.net");
        newStudent.courseCompletion("History of Western Civilizations", 1.7);
        newStudent.courseCompletion("Algebra II", 3.9);
        newStudent.courseCompletion("Geometry I", 3.7);
        newStudent.courseCompletion("History of Western Civilizations", 3.0);
        System.out.println(newStudent);
        Teacher newTeach = new Teacher("ss9482", "Samantha Smith", "sammy@microsoft.com");
        newTeach.addCourseTaught("Algebra II");
        newTeach.addCourseTaught("Intro To Programming");
        System.out.println(newTeach);
        Students newStudent2 = new Students("986754321", "Raymond Falkner", "cccald@gmail.com");
        newStudent2.courseCompletion("Sociology I ", 4.0);
        System.out.println(newStudent2);
    }
}

