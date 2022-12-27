
/**
 * The class Academic_course id the sub class of the super class Course. The sub class calles the superclass from time to time to get the values or the diplay method
   from the super class. In this this class the Academic_corse is extended to the super clsas and variables are assigned. Then the Constructor constructs six parameters
   and aslo calls from the super class. Then by using the accessor method the values are updated or assigned. Then using the mutators method the variables are changed.
   using the register method the and if condition whether the progrm should be printed or the values must be changed are decided and finally the diaply method diplay's 
   all the values that were assigned.
 * @author (Bibas Bantawa Rai)
 * @version (5/22/2021)
 */
public class AcademicCourse extends Course
{
    //The attributes of class Academic_Course are:
    String LecturerName;
    String Level;
    String Credit;
    String StartDate;
    String CompletionDate;
    int NumberofAssesments;
    boolean isRegistered;
    /*
     * The constructor of Acedemic_Course class has six parameters.
    */
    AcademicCourse(String CourseID, String CourseName, int Duration, String Level, String Credit, int NumberofAssesments)
    {
        super(CourseID, CourseName, Duration);
        this.LecturerName = "";
        this.StartDate = "";
        this.CompletionDate = "";
        this.isRegistered = false;
    }
    
    //Using accessor/ getters method of Lecturer Name
    public String getLecturerName()
    {
        return this.LecturerName;
    }
    //Using accessor/ getters mothod of level
    public String getlevel()
    {
        return this.Level;
    }
    //Using accessor method/ getters method of Credit
    public String getCredit()
    {
        return this.Credit;
    }
    //Using accessor/ getters method of Start Date
    public String getStartDate()
    {
        return this.StartDate;
    }
    //Using accessor/ getters method of CompletionDate
    public String getCompletionDate()
    {
        return this.CompletionDate;
    }
    //Using accessor/ getters method of Number of Assesments
    public int getNumberofAssesments()
    {
        return this.NumberofAssesments;
    }
    //Using accessor/ getters method of isRegistered
    public boolean getisRegistered()
    {
        return this.isRegistered;
    }
    //Mutator/ setters method of Lecturer Name
    public void setLecturerName(String Lecturer)
    {
        this.LecturerName = LecturerName;
    }
    //Mutator/ setters method of Number of assignments
    public void setNumberofAssesments(int Number)
    {
        this.NumberofAssesments = NumberofAssesments;
    }
    //Using register method to assign un arrived values
public void register(String CourseLeader, String LecturerName, String StartDate,
    String CompletionDate)
    {
        if(this.isRegistered == true)
        {
            System.out.println("The course is already registerd.");
            System.out.println("The lecturer's name is :" + this.LecturerName);
            System.out.println("The course leader's name is : " + this.CourseLeader);
            System.out.println("The starting date is :" + this.StartDate);
            System.out.println("The completionDate is : " + this.CompletionDate);
        }
        else if(this.isRegistered == false)
        {
            super.setCourseLeader(CourseLeader);
            this.LecturerName = LecturerName;
            this.StartDate = StartDate;
            this.CompletionDate = CompletionDate;
            this.isRegistered = true;
        }
    }
    //Using diplay method
    public void display()
    {
        super.display();
        if(this.isRegistered == true)
        {
            System.out.println("The lecturers' name is: " + this.LecturerName);
            System.out.println("The level is: " + this.Level);
            System.out.println("The time duration is: "+ this.Duration);
            System.out.println("The credit is: " + this.Credit);
            System.out.println("The starting Date is: " + this.StartDate);
            System.out.println("The completion Date is: " + this.CompletionDate);
        }
    }
}
