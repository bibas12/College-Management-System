
/**
 * The NonAcademicCourse class is another sub class of the super class Course. At the first the coding is started and the instance variables are created along with their
   data type. Then the program reads the variables and they are assigned values accordingly. Then using the accessor method values are assigned or updated. Then using 
   the setters or also known as mutators method the data types are changed using if condition. Using register method to add un arrived party into the phaser and using 
   if condition to change its value or displaying some message. Then using remove method to remve a data that has been assigned. And lastly by calling the display method
   the details are displayed if the condition are met.
 * @author (Bibas Bantawa Rai)
 * @version (5/22/2021)
 */
public class NonAcademicCourse extends Course
{
    //Different instance variables are created which are: InstructureName, Duration, StartDate, CompletionDate, ExamDate, Prerequisite, isRemoverd, isRegistered.
    private String InstructorName;
    private int Duration;
    private String StartDate;
    private String CompletionDate;
    private String ExamDate;
    private String Prerequisites;
    private boolean isRegistered;
    private boolean isRemoved;
    /*
     * The constructor of Acedemic_Course class has nine parameters.
    */
    NonAcademicCourse(String CourseID, String CourseName, int Duration, String Prerequisites)
    {
        super(CourseID, CourseName, Duration);
        this.Prerequisites = Prerequisites;
        this.StartDate = "";
        this.CompletionDate = "";
        this.ExamDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
    }
    // Using accessor/ getters method of Instructor Name
    public String getInstructorName()
    {
        return this.InstructorName;
    }
    //Using accessor/ getters method of Duration;
    public int getDuration()
    {
        return this.Duration;
    }
    //Using accessor/ getters method of Start Date
    public String getStartDate()
    {
        return this.StartDate;
    }
    //Using accessor/ getters method of Completion Date
    public String getCompletionDate()
    {
        return this.CompletionDate;
    }
    //Using accessor/ getters method of Exam Date
    public String getExamDate()
    {
        return this.ExamDate;
    }
    //Using accessor/ getters method of Prerequiste
    public String Prerequisites()
    {
        return this.Prerequisites;
    }
    //Using accessor/ getters method of isRegistered
    public boolean getisRegistered()
    {
        return this.isRegistered;        
    }
    //Using accessor/ getters method of isRemoved
    public boolean getisRemoved()
    {
        return this.isRemoved;
    }
    //Using Mutator/ setters method of Instructor Name
    public void setInstructorName(String Instructor)
    {
        if (isRegistered == false) {
            this.InstructorName = Instructor;
        }
        else if (isRegistered == true ) {
            System.out.println("The Instructor name already exists therefore it is not possible to assign a new lecturer.");
        }
    }
    //Using registor method to 
    public void register(String CourseLeader, String InstructorName, String StartDate, String CompletionDate, String ExamDate)
    {
        if (isRegistered == false) {
            setInstructorName(InstructorName);
            this.isRegistered = true;
        }
        else if(isRegistered == true){
            System.out.println("The course is already registered.");
        }
    }
    //Using method to remove a course
    public void remove()
    {
        if (isRemoved == true) {
            System.out.println("The course is removed.");
        }
        else if (isRemoved == false) {
            super.setCourseLeader("");
            this.InstructorName ="";
            this.StartDate = "";
            this.CompletionDate = "";
            this.ExamDate = "";
            this.isRegistered = true;
            this.isRemoved = true;
        }
    }
    /*
     * Using diplay method to display the details.
    */
    public void display()
    {
        super.display();
        if (isRegistered == true) {
            System.out.println("Instructor Name:" + getInstructorName());
            System.out.println("Start Date:" + getStartDate());
            System.out.println("Completion Date:" + getCompletionDate());
            System.out.println("Exam Date:" + getExamDate());
            System.out.println("Duration:" + getDuration());
        }
    }
}
