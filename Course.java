
/**
 * The class Course is created as the parent class along with four instance variables. The instance variables are Course ID, Course Name, Course Leader and Duration.
   The variables are assigned values by the constructor. Each variable is converted into parameters and getting called by using the accessors method which is also known 
   as getters method. Since, the value wasn’t assigned to the Course Leader the value was set and displayed using display method. 
 * @author (Bibas Bantawa Rai)
 * @version (5/22/2021)
 */
public class Course
{
    //Four instance variables are created: CourseID, CourseName, CourseLeader
    String CourseID;
    String CourseName;
    String CourseLeader;
    int Duration;
    
    /*
     * A constructor is created with 4 parameters:....
     * This construtor assigns value to instance variables.
     */
    Course(String CourseID, String CourseName, int Duration)
    {
        this.CourseID = CourseID;
        this.CourseName = CourseName;
        this.CourseLeader = "";
        this.Duration = Duration;
    }
    //Using accessor/ getters method of Course ID
    public String getCourseID()
    {
        return this.CourseID;
    }
    //Using accessor/ getters method of Course Name
    public String getCourseName()
    {
        return this.CourseName;
    }
    //Using accessor/ getters method of Course leader
    public String getCourseLeader()
    {
        return this.CourseLeader;
    }
    //Using accessor/ getters method of Duration
    public int getDuration()
    {
        return this.Duration;
    }
    //Using Mutators/ settors method of Course Leader
    public void setCourseLeader(String CourseLeader)
    {
        this.CourseLeader = CourseLeader;
    }
    //Using display method
    public void display()
    {
        System.out.println(CourseID);
        System.out.println(CourseName);
        System.out.println(CourseLeader);
        System.out.println(Duration);
    }
}
