
/**
 * A class to create a teacher object.
 *
 * @author (Hamidou diallo)
 * @version (Homework 7; 3/7/2018)
 */
public class Teacher extends Person
{
   
    private String[] coursesTaught = new String[50];
    private int nextCourseIndex;

    /**
     * The contructor method
     * @param id  type String
     * @param name      type String
     * @param email  Type String
     * @return
     */
    public Teacher(String id, String name, String email){
        super(id, name, email);
        nextCourseIndex = 0;
    }

    /**
     * isValidId() to validate the the teachers alpha numric id's
     * @param id   type String
     * @return true or false  type boolean
     */
    public boolean isValidId(String id){
        return id.matches("[A-Za-z0-9]{6}");
    }

    /**
     * addCourseTaught() to add courses tuaght by a teacher
     * @param courseName type String
     * @return
     */
    public void addCourseTaught(String courseName){
        coursesTaught[nextCourseIndex] = courseName;
        nextCourseIndex++;
    }

    /**
     * getCoursesTaught() a method to get courses taught by teacher
     * @param index  type integer
     * @return coursesTaught    returns the course taught at specified index
     */
    public String getCoursesTaught(int index){
        return coursesTaught[index];
    }

    /**
     * Method to get the number course taught by teacher
     * @param
     * @return nextCourseTaught type interger
     */
    public int getNumberOfCoursesTaught(){
        return nextCourseIndex;
    }

    /**
     *toString() which overid the Students toString() to display info about the teacher
     * @param
     * @return res    type String
     * */
    public String toString(){
        String res = super.toString();
        res += "Has taught " + nextCourseIndex + " course(s)" + "\n";
        for(int i = 0; i < nextCourseIndex; i++){
            res += String.format("%5s", "-");
            res += getCoursesTaught(i);
            res += "\n";
        }
        return res;
    }
}