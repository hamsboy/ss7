
/**
 * A class to create a student object. Student inherited from the person class
 *
 *=
 */
public class Students extends Person
{
    private String[] courseTaken = new String[30];
    private double[] courseGrades = new double[30];
    private int nextCourseIndex;

    /**
     * Constructor to construct student 
     * @param id   type string
     * @param name type string  
     * @param email    type string
     * @return
     */
    public Students(String id, String name, String email){
        super(id, name, email);
        nextCourseIndex = 0;
    }

    /**
     * isValidId() to validate the id
     * @param id   type String
     * @return true/false      
     */
    public boolean isValidId(String id){
        return id.matches("[0-9]{9}");
    }

   

    /**
     * coursecompletion()
     * @param courseName    type String
     * @param courseGrade   type double
     * @return
     */
    public void courseCompletion(String courseName, double courseGrade){
        courseTaken[nextCourseIndex] = courseName;
        courseGrades[nextCourseIndex] = courseGrade;
        nextCourseIndex++;
    }

    /**
     * getCourseGrade to get the course grade by using an index
     * @param index type integer
     * @return courseGrades    type double
     */
    public double getCourseGrade(int index){
        return courseGrades[index];
    }

    /**
     * getCoursetaken() to get course
     * @param index   type integer
     * @return coursesTaken  type string
     */
    public String getCourseTaken(int index){
        return courseTaken[index];
    }

    /**
     * Method to get average grade
     * @param
     * @return average grade type double
     */
    public double getAverageGrade(){
        double grade = 0.0;
        for(int i = 0; i < nextCourseIndex; i++){
            grade += courseGrades[i];
        }

        if(nextCourseIndex == 0){ 
            return -1.0;
        }else{
            return grade/nextCourseIndex;
        }
    }

    /**
     *toString(0 method to display ythe Student info
     * @param
     * @return res    type String
     */
    public String toString(){
        String res = super.toString();
        if(getAverageGrade()==-1.0){
            res += "Student has not completed any courses.";
        }else{
            res += "Current grade average is " + getAverageGrade() + "\n";
            res += "Student has completed " + nextCourseIndex + " course(s) so far: " + "\n";
            for(int i = 0; i < nextCourseIndex; i++){
                res += String.format("%5s", "-");
                res += getCourseTaken(i) + " (" + getCourseGrade(i) + ")";
                res += "\n";
            }
        }
        return res;
    }
}
