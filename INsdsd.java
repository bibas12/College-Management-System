
/**
 * Write a description of class INGCollege here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;
import java.util.ArrayList;

public class INsdsd
{
    //instance variables 
    private ArrayList<Course> course_ = new ArrayList<>();
    private String CourseID, CourseName, CourseLeader, LecturerName, InstructorName, Duration, Level, Credit, Prerequisites, NumberofAssesments, cmd, StartDate, CompletionDate, ExamDate;
    
    //
    //instance variables of JButton
    private JButton addac, rnac, renac;
    
    //instance variable of JTextField
    private JTextField ID, CN, Dur, Lvl, Crdt, Preq, Asses, CourseL, LecturerN, InstructorN;
    
    //instance variable of JComboBox
    private JComboBox Y, Ye, Yea, M, Mo, Mon, D, Da, Dab;
    
    private String StartYear, StartMonth, StartDay, CompletionYear, CompletionMonth, CompletionDay, ExamYear, ExamMonth, ExamDay;
    
    //instance variable
    private JFrame f;
    private JPanel p;
    private JOptionPane msg1;
    
    public int getDuration(String type) {
        String Duration = "";
        if(type == "academic") {
            Duration = this.Dur.getText();
        }
        else if(type == "non academic") {
            Duration = this.Dur.getText();
        }
        return Integer.parseInt(Duration);
    }
    
    public int getNumberofAssesments() {
        return Integer.parseInt(this.Asses.getText());
    }
    
    public void CreateAcadmicCourseGUI()
    {
       JFrame f= new JFrame();
       JPanel p = new JPanel();
       p.setBounds(0,0,950,435);
       p.setLayout(null);
       
       //set color 
       Color cc = new Color(209,208,206);
       p.setBackground(cc);
       
       //JLabel --> Course
       JLabel label_AC = new JLabel("COURSE");
       label_AC.setBounds(400,40,335,35);
       
       //font for Course
       Font ff = new Font("Times New Roman",Font.PLAIN,30);
       label_AC.setFont(ff);
       p.add(label_AC);
       
       //JLabel --> CourseID
       JLabel CourseIDLabel = new JLabel();
       CourseIDLabel.setText("CourseID:");
       CourseIDLabel.setBounds(18,95,135,25);
       //font --> CourseID
       Font f1 = new Font("Times New Roman",Font.PLAIN,21);
       CourseIDLabel.setFont(f1);
       p.add(CourseIDLabel);
       //JTextField --> CourseID
       JTextField ID = new JTextField();
       ID.setBounds(190,95,250,30);
       p.add(ID);
       
       //JLabel --> Course Name
       JLabel CourseNameLabel= new JLabel();
       CourseNameLabel.setText("CourseName:");
       CourseNameLabel.setBounds(18,150,135,25);
       //font --> Course Name
       CourseNameLabel.setFont(f1);
       p.add(CourseNameLabel);
       //JTextField --> Course Name 
       JTextField CN = new JTextField();
       CN.setBounds(190,150,250,30);
       p.add(CN);
       
       //JLabel --> Duration
       JLabel DurationLabel = new JLabel();
       DurationLabel.setText("Duration:");
       DurationLabel.setBounds(18,205,135,25);
       //font --> Duration
       DurationLabel.setFont(f1);
       p.add(DurationLabel);
       //JTextField --> Duration 
       JTextField Dur= new JTextField();
       Dur.setBounds(190,205,250,30);
       p.add(Dur);
       
       //JLabel --> Level
       JLabel LevelLabel= new JLabel();
       LevelLabel.setText("Level:");
       LevelLabel.setBounds(18,260,135,25);
       //font --> Level
       LevelLabel.setFont(f1);
       p.add(LevelLabel);
       //JTextField --> Level
       JTextField Lvl= new JTextField();
       Lvl.setBounds(190,260,250,30);
       p.add(Lvl);
       
       //JLabel --> Credit
       JLabel CreditLabel= new JLabel();
       CreditLabel.setText("Credit:");
       CreditLabel.setBounds(18,315,135,25);
       //font --> Credit
       CreditLabel.setFont(f1);
       p.add(CreditLabel);
       //JTextField --> Credit 
       JTextField Crdt= new JTextField();
       Crdt.setBounds(190,315,250,30);
       p.add(Crdt);
       
       //JLabel --> No. of Assesments
       JLabel NumberofAssesmentsLabel= new JLabel();
       NumberofAssesmentsLabel.setText("No. of Assesments:");
       NumberofAssesmentsLabel.setBounds(18,370,135,25);
       //font --> No. of Assesments
       NumberofAssesmentsLabel.setFont(f1);
       p.add(NumberofAssesmentsLabel);
       //JTextField --> No. of Assesments 
       JTextField Asses= new JTextField();
       Asses.setBounds(190,370,250,30);
       p.add(Asses);
       
       //JLabel --> Course Leader
       JLabel CourseLeaderLabel= new JLabel();
       CourseLeaderLabel.setText("Course Leader:");
       CourseLeaderLabel.setBounds(490,150,135,25);
       //font --> Course Leader
       CourseLeaderLabel.setFont(f1);
       p.add(CourseLeaderLabel);
       //JTextField --> CourseLeader
       JTextField CourseL= new JTextField();
       CourseL.setBounds(650,150,250,30);
       p.add(CourseL);
       
       //JLabel --> Lecturer Name
       JLabel LecturerNameLabel = new JLabel();
       LecturerNameLabel.setText("Lecturer Name:");
       LecturerNameLabel.setBounds(490,205,135,25);
       //font --> Lecturer Name
       LecturerNameLabel.setFont(f1);
       p.add(LecturerNameLabel);
       //JTextField --> Lecturer Name
       JTextField LecturerN= new JTextField();
       LecturerN.setBounds(650,205,250,30);
       p.add(LecturerN);
       
       //JLabel --> Start Date
       JLabel StartDateLabel = new JLabel();
       StartDateLabel.setText("Start Date:");
       StartDateLabel.setBounds(490,370,135,25);
       //font --> Start Date
       StartDateLabel.setFont(f1);
       p.add(StartDateLabel);
       //JComboBox --> Start Date(Year)
       String StartYear[] = {"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
       JComboBox Y = new JComboBox(StartYear);
       Y.setBounds(650,370,75,25);
       //font --> Start Date(Year)
       Y.setFont(f1);
       p.add(Y);
       //JCombobox --> Start Date(Day)
       String StartDay[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
       JComboBox D = new JComboBox(StartDay);
       D.setBounds(728,370,50,25);
       //font --> Start Date(Day)
       D.setFont(f1);
       p.add(D);
       //JComboBox --> Start Date(Month)
       String StartMonth[] = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
       JComboBox M = new JComboBox(StartMonth);
       M.setBounds(780,370,120,25);
       //font --> Start Date(Month)
       M.setFont(f1);
       p.add(M);
       
       //JLabel --> Completion Date
       JLabel CompletionDateLabel = new JLabel();
       CompletionDateLabel.setText("CompletionDate:");
       CompletionDateLabel.setBounds(490,425,155,25);
       //font --> CompletionDate
       CompletionDateLabel.setFont(f1);
       p.add(CompletionDateLabel);
       //JComboBox --> CompletionDate(Year)
       String CompletionYear[] = {"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
       JComboBox Ye= new JComboBox(CompletionYear);
       Ye.setBounds(650,425,75,25);
       //font --> Completion Date(Year)
       Ye.setFont(f1);
       p.add(Ye);
       //JCombobox --> Completion Date(Day)
       String CompletionDay[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
       JComboBox Da = new JComboBox(CompletionDay);
       Da.setBounds(728,425,50,25);
       //font --> Completion Date(Day)
       Da.setFont(f1);
       p.add(Da);
       //JComboBox --> Completion Date(Month)
       String CompletionMonth[] = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
       JComboBox Mo = new JComboBox(CompletionMonth);
       Mo.setBounds(780,425,120,25);
       //font --> Completion Date(Month)
       Mo.setFont(f1);
       p.add(Mo);
       
       //JButton --> Add for Academic Course
       JButton addac = new JButton("Add to Academic Course");
       addac.setBounds(18,465,420,35);
       //Button font
       addac.setFont(f1);
       addac.setActionCommand("add");
       addac.addActionListener(getAcademicCourseActionListener());
       p.add(addac);
       
       //JButton --> Register for Academic Course
       JButton rac = new JButton("Register to Academic Course");
       rac.setBounds(18,510,420,35);
       //Button font
       rac.setFont(f1);
       rac.setActionCommand("register");
       rac.addActionListener(getAcademicCourseActionListener());
       p.add(rac);
       
       //JButton --> Display
       JButton Display = new JButton("Display");
       Display.setBounds(490,555,200,85);
       //Button font
       Display.setFont(f1);
       Display.setActionCommand("display");
       Display.addActionListener(getAcademicCourseActionListener());
       p.add(Display);
       
       //JButton --> Clear
       JButton Clear = new JButton("Clear");
       Clear.setBounds(700,555,200,85);
       //Button font
       Clear.setFont(f1);
       Clear.setActionCommand("clear");
       Clear.addActionListener(getAcademicCourseActionListener());
       p.add(Clear);
       
       //Switch Button
       JButton change = new JButton("Change to Non Academic Course");
       change.setBounds(550,120,390,35);
       change.setFont(f1);
       change.addActionListener(getAcademicCourseActionListener());
       
       f.add(p);
       f.setBounds(10, 10, 950, 720);
       f.setResizable(false);
       f.setVisible(true);
    }
    
    //ActionPerformed method of Add to Academic Course button
    public ActionListener getAcademicCourseActionListener()
    {
        return new ActionListener() 
        {
            public void actionPerformed(ActionEvent actionEvent)
            {
                cmd = actionEvent.getActionCommand();
                if(cmd.equals("add"))
                {
                    try
                    {
                        CourseID = ID.getText();
                        CourseName = CN.getText();
                        Level = Lvl.getText();
                        Credit = Crdt.getText();
                        int Duration = getDuration("Academic");
                        int NumberofAssesments = getNumberofAssesments();
                        
                        if(CourseID.equals("")||CourseName.equals("")||Level.equals("")||Dur.getText().equals("")||Asses.getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(f, "Fill the values in the required fields CourseID CourseName level Credit Duration NumberofAssesments","Reminder",JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            if(courseExists(CourseID))
                            {
                                JOptionPane.showMessageDialog(f,"Course: " +CourseID+"already exists!!","Reminder",JOptionPane.WARNING_MESSAGE);
                            }
                            else
                            {
                                AcademicCourse AcademicC = new AcademicCourse(CourseID,CourseName,Duration,Level,Credit,NumberofAssesments);
                                course_.add(AcademicC);
                                JOptionPane.showMessageDialog(f,"CourseID: "+CourseID+ "CourseName: " +CourseName+ "Duration: " +Duration+ "Number of Assesments: "+NumberofAssesments+ "has been added to Academic Course.");
                                clearAcademicCourseFields();
                            }
                        }
                    }
                    catch(NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(f, "Please input in numerical form only! Duration NumberOfAssesments","Reminder",JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(cmd.equals("register"))
                {
                    try
                    {
                        CourseLeader = CourseL.getText();
                        LecturerName = LecturerN.getText();
                        CourseID = ID.getText();
                        StartYear = Y.getSelectedItem().toString();
                        StartMonth = M.getSelectedItem().toString();
                        StartDay = D.getSelectedItem().toString();
                        CompletionYear = Ye.getSelectedItem().toString();
                        CompletionMonth = Mo.getSelectedItem().toString();
                        CompletionDay = Da.getSelectedItem().toString();
                        
                        if(CourseLeader.equals("")||LecturerName.equals("")||CourseID.equals("")||StartYear.equals("")||StartMonth.equals("")||StartDay.equals("")||CompletionYear.equals("")
                        ||CompletionMonth.equals("")||CompletionDay.equals(""))
                        {
                            JOptionPane.showMessageDialog(f, "Fill the values in the required fields CourseLeader CourseName CourseID, StartYear,StartMonth,StartDay CompletionYear,CompletionMonth,CompletionDay","Remainder",
                            JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {
                            if(!courseExists(CourseID))
                            {
                                JOptionPane.showMessageDialog(f,"CourseID:"+CourseID+"doesn't exist!!","Reminder",JOptionPane.WARNING_MESSAGE);
                            }
                            else
                            {
                                StartDate = StartDay +""+ StartMonth +","+ StartYear;
                                CompletionDate = CompletionDay +""+ CompletionMonth +","+ CompletionYear;
                                AcademicCourse courseToRegister = (AcademicCourse)findCourseByCourseID(CourseID);
                                if(courseToRegister.getisRegistered()) 
                                {
                                    JOptionPane.showMessageDialog(f, "CourseID: "+CourseID+"is already registered.", "Reminder",JOptionPane.WARNING_MESSAGE);
                                }
                                else
                                {
                                    courseToRegister.register(CourseLeader,LecturerName,StartDate,CompletionDate);
                                    JOptionPane.showMessageDialog(f,"CourseLeader: " + CourseLeader + "CourseName: " + CourseName + "CourseID: " + CourseID + "StartDate: " + StartDate + "CompletionDate: " + CompletionDate + "has been registered to Academic Course.");
                                    clearAcademicCourseFields();
                                }
                            }
                        }
                    }catch(ClassCastException execption)
                    {
                        JOptionPane.showMessageDialog(f, "Given CourseID in Academic Course doesn't exist!! ","Reminder",JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(cmd.equals("Display"))
                {
                    try
                    {
                        CourseID = ID.getText();
                        if(CourseID.equals("")) 
                        {
                            JOptionPane.showMessageDialog(f,"Please input an ID!!","Reminder",JOptionPane.WARNING_MESSAGE); 
                        }
                        else 
                        {
                            if(!courseExists(CourseID)) 
                            {
                                JOptionPane.showMessageDialog(f,"CourseID:" + CourseID +" does not exist in Academic Course","Reminder",JOptionPane.WARNING_MESSAGE);  
                            }
                            else 
                            {
                                Course courseToRegister = (Course)findCourseByCourseID(CourseID);
                                courseToRegister.display();
                            }
                        }
                    }catch(ClassCastException exception) 
                    {
                        JOptionPane.showMessageDialog(f,"Given CourseID in Academic Course doesn't exist!! ","Reminder",JOptionPane.WARNING_MESSAGE);  
                    }
                }
                else if(cmd.equals("clear"))
                {
                    clearAcademicCourseFields();
                }
            }
        }; 
    }
    
    public void clearAcademicCourseFields()
    {
        this.ID.setText("");
        this.CN.setText("");
        this.Dur.setText("");
        this.Lvl.setText("");
        this.LecturerN.setText("");
        this.CourseL.setText("");
        this.Crdt.setText("");
        this.Y.setSelectedIndex(0);
        this.M.setSelectedIndex(0);
        this.D.setSelectedIndex(0);
        this.Ye.setSelectedIndex(0);
        this.Mo.setSelectedIndex(0);
        this.Da.setSelectedIndex(0);
        this.Yea.setSelectedIndex(0);
        this.Mon.setSelectedIndex(0);
        this.Dab.setSelectedIndex(0);
    }
    
    public boolean courseExists(String CourseID)
    {
        for(Course course : course_)
        {
            if(course.getCourseID().equals(CourseID))
            {
                return true;
            }
        }
        return false;
    }
    
    public Course findCourseByCourseID(String CourseID)
    {
        for(Course course : course_)
        {
            if(course.getCourseID().equals(CourseID))
            {
                return course;
            }
        }
        return null;
    }
    
    public static void main(String args[])
    {
        INGCollege ingCollege = new INGCollege();
    }
}
