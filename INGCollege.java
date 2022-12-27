import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class INGCollege
{
    private JFrame frame = new JFrame("Course Registration");
    private CardLayout cardLayout = new CardLayout();
    private JPanel containerPanel = new JPanel();
    private Font labelFont = new Font("Arial",Font.BOLD, 16);
    private ArrayList<Course> courses = new ArrayList<>();
    private Font buttonFont = new Font("Arial",Font.BOLD,14);
    private Font titleFont = new Font("Times New Roman",Font.BOLD,30);
    private JPanel academicCoursePanel, nonAcademicCoursePanel;
    private JTextField academicCourseIdField, academicCourseNameField, academicDurationField, academicLevelField, academicLecturerNameField, academicCourseLeaderField, academicCreditField, 
    academicStartDateField, academicCompletionDateField, academicNumberOfAssessmentsField;
    private JTextField nonAcademicCourseIdField, nonAcademicCourseNameField, nonAcademicCourseLeaderField, nonAcademicDurationField, nonAcedemicInstructorNameField, nonAcedemicExamDateField,
    nonAcademicStartDateField, nonAcademicCompletionDateField, nonAcedemicPrerequisiteField;
    private JComboBox  nonAcademicStartDateYear, nonAcademicStartDateMonth, nonAcademicStartDateDay,    nonAcademicCompletionDateYear, nonAcademicCompletionDateMonth, 
    nonAcademicCompletionDateDay, nonAcademicExamDateYear, nonAcademicExamDateMonth, nonAcademicExamDateDay, academicStartDateYear, academicStartDateMonth, academicStartDateDay,
    academicCompletionDateYear, academicCompletionDateMonth, academicCompletionDateDay;
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private String[] days = new String[31];
    private String[] years = new String[20];
    
    public int getDuration(String type) {
        String duration = "";
        if(type == "academic") {
            duration = this.academicDurationField.getText();
        }
        else if(type == "non academic") {
            duration = this.nonAcademicDurationField.getText();
        }
        return Integer.parseInt(duration);
    }
    
    public int getNumberOfAssessments() {
        return Integer.parseInt(this.academicNumberOfAssessmentsField.getText());
    }
    
    public void createAcademicCourseGUI() {
        academicCoursePanel = new JPanel();
        academicCoursePanel.setLayout(null);
        academicCoursePanel.setBackground(Color.cyan);
        
        //Academic Course label
        JLabel academicCourseLabel = new JLabel("Academic Course");
        academicCourseLabel.setBounds(390, 40, 400, 35);
        academicCourseLabel.setForeground(Color.gray);
        academicCourseLabel.setFont(titleFont);
        academicCoursePanel.add(academicCourseLabel);

         //course id label
        JLabel courseIdLabel = new JLabel("Course ID:");
        courseIdLabel.setBounds(50, 180, 160, 25);
        courseIdLabel.setFont(labelFont);
    
        //course id text field
        academicCourseIdField = new JTextField();
        academicCourseIdField.setBounds(220, 177, 220, 30);
        academicCoursePanel.add(academicCourseIdField);
        
        //course name label
        JLabel courseNameLabel = new JLabel("Course Name:");
        courseNameLabel.setBounds(50, 220, 160, 25);
        courseNameLabel.setFont(labelFont);
        
        //course name text field
        academicCourseNameField = new JTextField();
        academicCourseNameField.setBounds(220, 217, 220, 30);
        academicCoursePanel.add(academicCourseNameField);
        
        // duration label
        JLabel durationLabel = new JLabel("Duration:");
        durationLabel.setBounds(50, 300, 160, 25);
        durationLabel.setFont(labelFont);
        
        //duration text field
        academicDurationField = new JTextField();
        academicDurationField.setBounds(220, 297, 220, 30);
        academicCoursePanel.add(academicDurationField);
    
        //level label
        JLabel levelLabel = new JLabel("Level:");
        levelLabel.setBounds(50, 340, 160, 25);
        levelLabel.setFont(labelFont);
        
        //level text field
        academicLevelField = new JTextField();
        academicLevelField.setBounds(220, 337, 220, 30);
        academicCoursePanel.add(academicLevelField);
        
        //lecturer name label
        JLabel lecturerNameLabel = new JLabel("Lecturer Name:");
        lecturerNameLabel.setBounds(550, 180, 160, 25);
        lecturerNameLabel.setFont(labelFont);
        
        //lecturer name text field
        academicLecturerNameField = new JTextField();
        academicLecturerNameField.setBounds(720, 177, 220, 30);
        academicCoursePanel.add(academicLecturerNameField);
        
        //course leader label
        JLabel courseLeaderLabel = new JLabel("Course Leader:");
        courseLeaderLabel.setBounds(550, 220, 160, 25);
        courseLeaderLabel.setFont(labelFont);
        
        //course leader text field
        academicCourseLeaderField = new JTextField();
        academicCourseLeaderField.setBounds(720, 217, 220, 30);
        academicCoursePanel.add(academicCourseLeaderField);
        
        //credit label
        JLabel creditLabel = new JLabel("Credit:");
        creditLabel.setBounds(50, 260, 160, 25);
        creditLabel.setFont(labelFont);
        
        //credit text field
        academicCreditField = new JTextField();
        academicCreditField.setBounds(220, 257, 220, 30);
        academicCoursePanel.add(academicCreditField);
        
        //start date label
        JLabel startDateLabel = new JLabel("Start Date:");
        startDateLabel.setBounds(550, 260, 160, 25);
        startDateLabel.setFont(labelFont);
        
        academicStartDateYear = new JComboBox(years);
        academicStartDateMonth = new JComboBox(months); 
        academicStartDateDay = new JComboBox(days);

        academicStartDateYear.setBounds(720, 257, 80, 30);
        academicStartDateMonth.setBounds(805, 257, 120, 30);
        academicStartDateDay.setBounds(930, 257, 60, 30);
        
        academicCoursePanel.add(academicStartDateYear);
        academicCoursePanel.add(academicStartDateMonth);        
        academicCoursePanel.add(academicStartDateDay);
        
        //completion date label
        JLabel completionDateLabel = new JLabel("Completion Date:");
        completionDateLabel.setBounds(550, 300, 160, 25);
        completionDateLabel.setFont(labelFont);
        
        //completion date text field        
        academicCompletionDateYear = new JComboBox(years);
        academicCompletionDateMonth = new JComboBox(months); 
        academicCompletionDateDay = new JComboBox(days);

        academicCompletionDateYear.setBounds(720, 297, 80, 30);
        academicCompletionDateMonth.setBounds(805, 297, 120, 30);
        academicCompletionDateDay.setBounds(930, 297, 60, 30);
        
        academicCoursePanel.add(academicCompletionDateYear);
        academicCoursePanel.add(academicCompletionDateDay);
        academicCoursePanel.add(academicCompletionDateMonth);
        
        //number of assessments label
        JLabel numberOfAssessmentsLabel = new JLabel("No Of Assessments:");
        numberOfAssessmentsLabel.setBounds(50, 380, 185, 25);
        numberOfAssessmentsLabel.setFont(labelFont);
        
        //number of assessments text field
        academicNumberOfAssessmentsField = new JTextField();
        academicNumberOfAssessmentsField.setBounds(245, 377, 180, 30);
        academicCoursePanel.add(academicNumberOfAssessmentsField);
        
        academicCoursePanel.add(courseIdLabel);
        academicCoursePanel.add(courseNameLabel);
        academicCoursePanel.add(durationLabel);
        academicCoursePanel.add(courseLeaderLabel);
        academicCoursePanel.add(lecturerNameLabel);
        academicCoursePanel.add(levelLabel);
        academicCoursePanel.add(creditLabel);
        academicCoursePanel.add(startDateLabel);
        academicCoursePanel.add(completionDateLabel);
        academicCoursePanel.add(numberOfAssessmentsLabel);
        
        //Add button
        JButton addButton = new JButton("Add Academic Course");
        addButton.setBounds(50, 420, 390, 35);
        addButton.setFont(buttonFont);
        addButton.setActionCommand("add");
        addButton.addActionListener(getAcademicCourseActionListener());
        academicCoursePanel.add(addButton);
        
        //Register button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(550, 340, 390, 35);
        registerButton.setFont(buttonFont);
        registerButton.setActionCommand("register");
        registerButton.addActionListener(getAcademicCourseActionListener());
        academicCoursePanel.add(registerButton);
        
        //Display button
        JButton displayButton = new JButton("Display");
        displayButton.setBounds(550, 390, 190, 35);
        displayButton.setFont(buttonFont);
        displayButton.setActionCommand("display");
        displayButton.addActionListener(getAcademicCourseActionListener());
        academicCoursePanel.add(displayButton);
        
        //Clear button
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(750, 390, 190, 35);
        clearButton.setFont(buttonFont);
        clearButton.setActionCommand("clear");
        clearButton.addActionListener(getAcademicCourseActionListener());
        academicCoursePanel.add(clearButton);
        
        //Switch button
        JButton switchButton = new JButton("Switch To Non Academic Course Form");
        switchButton.setBounds(550, 120, 390, 35);
        switchButton.setFont(buttonFont);
        switchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(containerPanel, "nonAcademicCoursePanel");
            }
        });
        academicCoursePanel.add(switchButton);
    }
    
    public void createNonAcademicCourseGUI() {
        nonAcademicCoursePanel = new JPanel();
        nonAcademicCoursePanel.setLayout(null);
        nonAcademicCoursePanel.setBackground(Color.cyan);
        
        //Non Academic Course label
        JLabel nonAcademicCourseLabel = new JLabel("Non Academic Course");
        nonAcademicCourseLabel.setBounds(380, 40, 400, 35);
        nonAcademicCourseLabel.setForeground(Color.gray);
        nonAcademicCourseLabel.setFont(titleFont);
        nonAcademicCoursePanel.add(nonAcademicCourseLabel);
            
        //course id label
        JLabel courseIdLabel = new JLabel("Course ID:");
        courseIdLabel.setBounds(50, 180, 160, 25);
        courseIdLabel.setFont(labelFont);
    
        //course id text field
        nonAcademicCourseIdField = new JTextField();
        nonAcademicCourseIdField.setBounds(220, 177, 220, 30);
        nonAcademicCoursePanel.add(nonAcademicCourseIdField);
        
        //course name label
        JLabel courseNameLabel = new JLabel("Course Name:");
        courseNameLabel.setBounds(50, 220, 160, 25);
        courseNameLabel.setFont(labelFont);
        
        //course name text field
        nonAcademicCourseNameField = new JTextField();
        nonAcademicCourseNameField.setBounds(220, 217, 220, 30);
        nonAcademicCoursePanel.add(nonAcademicCourseNameField);
        
        // duration label
        JLabel durationLabel = new JLabel("Duration:");
        durationLabel.setBounds(50, 260, 160, 25);
        durationLabel.setFont(labelFont);
        
        //duration text field
        nonAcademicDurationField = new JTextField();
        nonAcademicDurationField.setBounds(220, 257, 220, 30);
        nonAcademicCoursePanel.add(nonAcademicDurationField);
        
        //prerequisites label
        JLabel prerequisitesLabel = new JLabel("Prerequisites:");
        prerequisitesLabel.setBounds(50, 300, 160, 25);
        prerequisitesLabel.setFont(labelFont);
        
        //prerequisites text field
        nonAcedemicPrerequisiteField = new JTextField();
        nonAcedemicPrerequisiteField.setBounds(220, 297, 220, 30);
        nonAcademicCoursePanel.add(nonAcedemicPrerequisiteField);
        
        //course leader label
        JLabel courseLeaderLabel = new JLabel("Course Leader:");
        courseLeaderLabel.setBounds(550, 220, 160, 25);
        courseLeaderLabel.setFont(labelFont);
        
        //course leader text field
        nonAcademicCourseLeaderField = new JTextField();
        nonAcademicCourseLeaderField.setBounds(720, 217, 220, 30);
        nonAcademicCoursePanel.add(nonAcademicCourseLeaderField);
        
        //instructor name label
        JLabel instructorNameLabel = new JLabel("Instructor Name:");
        instructorNameLabel.setBounds(550, 180, 160, 25);
        instructorNameLabel.setFont(labelFont);
                    
        //instructor name text field
        nonAcedemicInstructorNameField = new JTextField();
        nonAcedemicInstructorNameField.setBounds(720, 177, 220, 30);
        nonAcademicCoursePanel.add(nonAcedemicInstructorNameField);
        
        //start date label
        JLabel startDateLabel = new JLabel("Start Date:");
        startDateLabel.setBounds(550, 260, 160, 25);
        startDateLabel.setFont(labelFont);
        
        //start date text field        
        nonAcademicStartDateYear = new JComboBox(years);
        nonAcademicStartDateMonth = new JComboBox(months); 
        nonAcademicStartDateDay = new JComboBox(days);

        nonAcademicStartDateYear.setBounds(720, 257, 80, 30);
        nonAcademicStartDateMonth.setBounds(805, 257, 120, 30);
        nonAcademicStartDateDay.setBounds(930, 257, 60, 30);

        nonAcademicCoursePanel.add(nonAcademicStartDateYear);
        nonAcademicCoursePanel.add(nonAcademicStartDateMonth);        
        nonAcademicCoursePanel.add(nonAcademicStartDateDay);
        
        //completion date label
        JLabel completionDateLabel = new JLabel("Completion Date:");
        completionDateLabel.setBounds(550, 300, 160, 25);
        completionDateLabel.setFont(labelFont);
        
        //completion date text field        
        nonAcademicCompletionDateYear = new JComboBox(years);
        nonAcademicCompletionDateMonth = new JComboBox(months); 
        nonAcademicCompletionDateDay = new JComboBox(days);


        nonAcademicCompletionDateYear.setBounds(720, 297, 80, 30);
        nonAcademicCompletionDateMonth.setBounds(805, 297, 120, 30);
        nonAcademicCompletionDateDay.setBounds(930, 297, 60, 30);
        
        nonAcademicCoursePanel.add(nonAcademicCompletionDateYear);
        nonAcademicCoursePanel.add(nonAcademicCompletionDateMonth);
        nonAcademicCoursePanel.add(nonAcademicCompletionDateDay);
        
        //exam date label
        JLabel examDateLabel = new JLabel("Exam Date:");
        examDateLabel.setBounds(550, 340, 160, 25);
        examDateLabel.setFont(labelFont);
        
        //exam date text field        
        nonAcademicExamDateYear = new JComboBox(years);
        nonAcademicExamDateMonth = new JComboBox(months); 
        nonAcademicExamDateDay = new JComboBox(days);

        nonAcademicExamDateYear.setBounds(720, 337, 80, 30);
        nonAcademicExamDateMonth.setBounds(805, 337, 120, 30);
        nonAcademicExamDateDay.setBounds(930, 337, 60, 30);


        nonAcademicCoursePanel.add(nonAcademicExamDateYear);
        nonAcademicCoursePanel.add(nonAcademicExamDateMonth);
        nonAcademicCoursePanel.add(nonAcademicExamDateDay);
        
        nonAcademicCoursePanel.add(courseIdLabel);
        nonAcademicCoursePanel.add(courseNameLabel);
        nonAcademicCoursePanel.add(durationLabel);
        nonAcademicCoursePanel.add(courseLeaderLabel);        
        nonAcademicCoursePanel.add(instructorNameLabel);
        nonAcademicCoursePanel.add(startDateLabel);
        nonAcademicCoursePanel.add(completionDateLabel);
        nonAcademicCoursePanel.add(examDateLabel);
        nonAcademicCoursePanel.add(prerequisitesLabel);
        
        //Add button
        JButton addButton = new JButton("Add Non Academic Course");
        addButton.setBounds(50, 340, 390, 35);
        addButton.setFont(buttonFont);
        addButton.setActionCommand("add");
        addButton.addActionListener(getNonAcademicCourseActionListener());
        nonAcademicCoursePanel.add(addButton);
        
        //Register button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(550, 380, 190, 35);
        registerButton.setFont(buttonFont);
        registerButton.setActionCommand("register");
        registerButton.addActionListener(getNonAcademicCourseActionListener());
        nonAcademicCoursePanel.add(registerButton);
        
        //Remove button
        JButton removeButton = new JButton("Remove");
        removeButton.setBounds(750, 380, 190, 35);
        removeButton.setFont(buttonFont);
        removeButton.setActionCommand("remove");
        removeButton.addActionListener(getNonAcademicCourseActionListener());
        nonAcademicCoursePanel.add(removeButton);
        
        //Display button
        JButton displayButton = new JButton("Display");
        displayButton.setBounds(550, 430, 190, 35);
        displayButton.setFont(buttonFont);
        displayButton.setActionCommand("display");
        displayButton.addActionListener(getNonAcademicCourseActionListener());
        nonAcademicCoursePanel.add(displayButton);
        
        //Clear button
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(750, 430, 190, 35);
        clearButton.setFont(buttonFont);
        clearButton.setActionCommand("clear");
        clearButton.addActionListener(getNonAcademicCourseActionListener());
        nonAcademicCoursePanel.add(clearButton);
        
        //Switch button
        JButton switchButton = new JButton("Switch To Academic Course Form");
        switchButton.setBounds(550, 120, 390, 35);
        switchButton.setFont(buttonFont);
        switchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(containerPanel, "academicCoursePanel");
            }
        });
        nonAcademicCoursePanel.add(switchButton);
    }
    
    public ActionListener getAcademicCourseActionListener() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String command = actionEvent.getActionCommand();
                if(command.equals("add") ){                    
                    try {
                        String courseId = academicCourseIdField.getText();
                        String courseName = academicCourseNameField.getText();
                        String level = academicLevelField.getText();
                        String credit = academicCreditField.getText();
                        int duration = getDuration("academic");
                        int numberOfAssessments = getNumberOfAssessments();
                        if(courseId.equals("") ||courseName.equals("") || level.equals("") || academicDurationField.getText().equals("") 
                        || academicNumberOfAssessmentsField.getText().equals("")) {
                            JOptionPane.showMessageDialog(frame,"Please provide value for the following fields! \n - courseId \n - courseName \n - level \n - credit \n - duration" + 
                            "\n - numberOfAssessments","Alert",JOptionPane.WARNING_MESSAGE); 
                        }
                        else {
                            if(courseExists(courseId)) {
                                JOptionPane.showMessageDialog(frame,"Course with id "+courseId+" already exists!","Alert",JOptionPane.WARNING_MESSAGE);  
                            }
                            else {
                                AcademicCourse academicCourse = new AcademicCourse(courseId, courseName, duration, level, credit, numberOfAssessments);
                                courses.add(academicCourse);
                                JOptionPane.showMessageDialog(frame,"The academic course with \n courseId: " + courseId + "\n courseName: " + courseName + "\n level: "+ level +
                                "\n credit: " + credit +"\n duration: " + duration +  "\n numberOfAssessments: " + numberOfAssessments + "\n has been added.");
                                clearAcademicCourseFields();
                            }
                        }
                        
                    } catch (NumberFormatException exception) {
                        JOptionPane.showMessageDialog(frame,"Please provide following fields in number only format! \n - duration \n - numberOfAssessments","Alert"
                        ,JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(command.equals("register") ){
                    try {
                        String courseLeaderName = academicCourseLeaderField.getText();
                        String lecturerName = academicLecturerNameField.getText();
                        String startDateYear = academicStartDateYear.getSelectedItem().toString();
                        String startDateMonth = academicStartDateMonth.getSelectedItem().toString();
                        String startDateDay = academicStartDateDay.getSelectedItem().toString();
                        String completionDateYear = academicCompletionDateYear.getSelectedItem().toString();
                        String completionDateMonth = academicCompletionDateMonth.getSelectedItem().toString();
                        String completionDateDay = academicCompletionDateDay.getSelectedItem().toString();
                        String courseId = academicCourseIdField.getText();
                    
                        if(courseLeaderName.equals("") || lecturerName.equals("") || startDateYear.equals("") || startDateMonth.equals("")|| startDateDay.equals("")
                        || completionDateYear.equals("") || completionDateMonth.equals("") || completionDateDay.equals("") || courseId.equals("")) {
                            JOptionPane.showMessageDialog(frame,"Please provided value for following fields! \n - courseId \n - courseLeaderName \n - lecturerName" +
                            "\n - startDate year, month, day \n - completionDate year, month, day","Alert",JOptionPane.WARNING_MESSAGE); 
                        }
                        else {
                            if(!courseExists(courseId)) {
                                JOptionPane.showMessageDialog(frame,"Academic Course with id "+courseId+" does not exists!","Alert",JOptionPane.WARNING_MESSAGE);  
                            }
                            else {
                                String startDate = startDateDay + " " + startDateMonth + ", " + startDateYear;
                                String completionDate = completionDateDay + " " + completionDateMonth + ", " + completionDateYear;
                                AcademicCourse courseToRegister = (AcademicCourse)findCourseByCourseId(courseId);
                                if(courseToRegister.getIsRegistered()) {
                                    JOptionPane.showMessageDialog(frame,"Acadmeic Course with id " +courseId+ " is already registered!","Alert",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    courseToRegister.register(courseLeaderName, lecturerName, startDate, completionDate);
                                    JOptionPane.showMessageDialog(frame,"The academic course with \n courseId: "+courseId + " \n courseLeader: "+ courseLeaderName +
                                    "\n lecturerName: " + lecturerName + "\n startDate: "+ startDate + "\n completionDate: "+ completionDate + "\n has been registered.");
                                    clearAcademicCourseFields();
                                }
                            }
                        }
                    }catch(ClassCastException exception) {
                        JOptionPane.showMessageDialog(frame,"Academic course with provided id does not exists!","Alert",JOptionPane.WARNING_MESSAGE);  
                    }
                }
                else if(command.equals("display") ){
                    try {
                        String courseId = academicCourseIdField.getText();
                        if(courseId.equals("")) {
                            JOptionPane.showMessageDialog(frame,"Please provide the course id!","Alert",JOptionPane.WARNING_MESSAGE); 
                        }
                        else {
                            if(!courseExists(courseId)) {
                                JOptionPane.showMessageDialog(frame,"Academic Course with id " + courseId +" does not exists!","Alert",JOptionPane.WARNING_MESSAGE);  
                            }
                            else {
                                AcademicCourse courseToRegister = (AcademicCourse)findCourseByCourseId(courseId);
                                courseToRegister.display();
                            }
                        }
                    }
                    catch(ClassCastException exception) {
                        JOptionPane.showMessageDialog(frame,"Academic course with provided id does not exists!","Alert",JOptionPane.WARNING_MESSAGE);  
                    }
                }
                else if(command.equals("clear") ){
                    clearAcademicCourseFields();
                }
            }
        };
    }
    
    public ActionListener getNonAcademicCourseActionListener() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String command = actionEvent.getActionCommand();
                
                if(command.equals("add") ){
                    try {
                        String courseId = nonAcademicCourseIdField.getText();
                        String courseName = nonAcademicCourseNameField.getText();
                        String prerequisite = nonAcedemicPrerequisiteField.getText();
                        int duration = getDuration("non academic");
                        if(courseId.equals("") ||courseName.equals("") || prerequisite.equals("") || nonAcademicDurationField.getText().equals("")) {
                            JOptionPane.showMessageDialog(frame,"Please provide value for the following fields! \n - courseId \n - courseName \n - duration \n - prerequisite"
                            ,"Alert",JOptionPane.WARNING_MESSAGE); 
                        }
                        else {
                            if(courseExists(courseId)) {
                                JOptionPane.showMessageDialog(frame,"Course with id " + courseId + " already exists!","Alert",JOptionPane.WARNING_MESSAGE); 
                            }
                            else {
                                NonAcademicCourse nonAcademicCourse = new NonAcademicCourse(courseId, courseName, duration, prerequisite);
                                courses.add(nonAcademicCourse);
                                JOptionPane.showMessageDialog(frame,"The Non-Academic course with \n courseId: " +courseId+ "\n courseName: "+courseName
                                +"\n duration: "+duration+"\n prerequisite: "+prerequisite+"\n has been added.");
                                clearNonAcademicCourseFields();
                            }
                        }
                        
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(frame,"Please provide the following fields in number only format! \n - duration","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(command.equals("register") ){
                    try {
                        String courseLeaderName = nonAcademicCourseLeaderField.getText();
                        String instructorName = nonAcedemicInstructorNameField.getText();                        
                        String startDateYear = nonAcademicStartDateYear.getSelectedItem().toString();
                        String startDateMonth = nonAcademicStartDateMonth.getSelectedItem().toString();
                        String startDateDay = nonAcademicStartDateDay.getSelectedItem().toString();
                        String completionDateYear = nonAcademicCompletionDateYear.getSelectedItem().toString();
                        String completionDateMonth = nonAcademicCompletionDateMonth.getSelectedItem().toString();
                        String completionDateDay = nonAcademicCompletionDateDay.getSelectedItem().toString();
                        String examDateYear = nonAcademicExamDateYear.getSelectedItem().toString();
                        String examDateMonth = nonAcademicExamDateMonth.getSelectedItem().toString();
                        String examDateDay = nonAcademicExamDateDay.getSelectedItem().toString();
                        String courseId = nonAcademicCourseIdField.getText();
                    
                        if(courseLeaderName.equals("") || instructorName.equals("") ||  startDateYear.equals("") || startDateMonth.equals("")|| startDateDay.equals("")
                        || completionDateYear.equals("") || completionDateMonth.equals("") || completionDateDay.equals("") || examDateYear.equals("")
                        || examDateMonth.equals("")|| examDateDay.equals("") || courseId.equals("")) {
                            JOptionPane.showMessageDialog(frame,"Please provide value for all the following fields! \n - courseId \n - courseLeaderName \n - instructorName"+
                            "\n - startDate year, month, day \n - completionDate year, month, day \n - examDate year, month, day","Alert",JOptionPane.WARNING_MESSAGE); 
                        }
                        else {
                            if(!courseExists(courseId)) {
                                JOptionPane.showMessageDialog(frame,"Non-Academic Course with id "+courseId+" does not exists!","Alert",JOptionPane.WARNING_MESSAGE);  
                            }
                            else {
                                String startDate = startDateDay + " " + startDateMonth + ", " + startDateYear;
                                String completionDate = completionDateDay + " " + completionDateMonth + ", " + completionDateYear;
                                String examDate = examDateDay + " " + examDateMonth + ", " + examDateYear;
                                NonAcademicCourse courseToRegister = (NonAcademicCourse)findCourseByCourseId(courseId);
                                if(courseToRegister.getIsRegistered()) {
                                    JOptionPane.showMessageDialog(frame,"Non-Academic Course with id "+courseId+ " is already registered!","Alert",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    courseToRegister.register(courseLeaderName, instructorName, startDate, completionDate, examDate);
                                    JOptionPane.showMessageDialog(frame,"The Non-Academic course with \n courseId: "+courseId+"\n courseLeaderName: "+courseLeaderName
                                    +"\n instructorName: "+ instructorName+ "\n startDate: "+startDate+"\n completionDate: "+completionDate+"\n examDate: "+
                                    examDate+"\n has been registered.");
                                    clearNonAcademicCourseFields();
                                }
                            }
                        }
                    }catch(ClassCastException exception) {
                        JOptionPane.showMessageDialog(frame,"Non Academic course with provided id does not exists!","Alert",JOptionPane.WARNING_MESSAGE);  
                    }
                }
                else if(command.equals("remove") ){
                    try {
                        String courseId = nonAcademicCourseIdField.getText();
                    
                        if(courseId.equals("")) {
                            JOptionPane.showMessageDialog(frame,"Please provided the course id!","Alert",JOptionPane.WARNING_MESSAGE); 
                        }
                        else {
                            if(!courseExists(courseId)) {
                                JOptionPane.showMessageDialog(frame,"Non-Academic Course with id "+courseId+" does not exists!","Alert",JOptionPane.WARNING_MESSAGE);  
                            }
                            else {
                                NonAcademicCourse courseToRegister = (NonAcademicCourse)findCourseByCourseId(courseId);
                                courseToRegister.remove();
                                courses.remove(findCourseByCourseId(courseId));
                                JOptionPane.showMessageDialog(frame,"Non-Academic course with id "+courseId+" has been removed.");
                                clearNonAcademicCourseFields();
                            }
                        }
                    }
                    catch(ClassCastException exception) {
                        JOptionPane.showMessageDialog(frame,"Non Academic course with provided id does not exists!","Alert",JOptionPane.WARNING_MESSAGE);  
                    }
                }
                else if(command.equals("display") ){
                    try {
                        String courseId = nonAcademicCourseIdField.getText();
                    
                        if(courseId.equals("")) {
                            JOptionPane.showMessageDialog(frame,"Please provided the course id!","Alert",JOptionPane.WARNING_MESSAGE); 
                        }
                        else {
                            if(!courseExists(courseId)) {
                                JOptionPane.showMessageDialog(frame,"Non-Academic Course with id "+courseId+" does not exists!","Alert",JOptionPane.WARNING_MESSAGE);  
                            }
                            else {
                                NonAcademicCourse courseToRegister = (NonAcademicCourse)findCourseByCourseId(courseId);
                                courseToRegister.display();
                            }
                        }
                    }
                    catch(ClassCastException exception) {
                        JOptionPane.showMessageDialog(frame,"Non Academic course with provided id does not exists!","Alert",JOptionPane.WARNING_MESSAGE);  
                    }
                }
                else if(command.equals("clear") ){
                    clearNonAcademicCourseFields();
                }
            }
        };
    }
    
    public void clearNonAcademicCourseFields() {
        this.nonAcademicCourseIdField.setText("");
        this.nonAcademicCourseNameField.setText("");
        this.nonAcademicCourseLeaderField.setText("");
        this.nonAcademicDurationField.setText("");
        this.nonAcedemicInstructorNameField.setText("");
        this.nonAcademicStartDateYear.setSelectedIndex(0);
        this.nonAcademicStartDateMonth.setSelectedIndex(0);
        this.nonAcademicStartDateDay.setSelectedIndex(0);
        this.nonAcademicCompletionDateYear.setSelectedIndex(0);
        this.nonAcademicCompletionDateMonth.setSelectedIndex(0);
        this.nonAcademicCompletionDateDay.setSelectedIndex(0);
        this.nonAcademicExamDateYear.setSelectedIndex(0);
        this.nonAcademicExamDateMonth.setSelectedIndex(0);
        this.nonAcademicExamDateDay.setSelectedIndex(0);
        this.nonAcedemicPrerequisiteField.setText("");        
    }
    
    public void clearAcademicCourseFields() {
        this.academicCourseIdField.setText("");
        this.academicCourseNameField.setText(""); 
        this.academicDurationField.setText(""); 
        this.academicLevelField.setText(""); 
        this.academicLecturerNameField.setText(""); 
        this.academicCourseLeaderField.setText(""); 
        this.academicCreditField.setText(""); 
        this.academicStartDateYear.setSelectedIndex(0);
        this.academicStartDateMonth.setSelectedIndex(0);
        this.academicStartDateDay.setSelectedIndex(0);
        this.academicCompletionDateYear.setSelectedIndex(0);
        this.academicCompletionDateMonth.setSelectedIndex(0);
        this.academicCompletionDateDay.setSelectedIndex(0); 
        this.academicNumberOfAssessmentsField.setText(""); 
    }
    
    public boolean courseExists(String courseId) {
        for(Course course : courses) {
            if(course.getCourseID().equals(courseId)) {
                return true;
            }
        }
        
        return false;
    }
    
    public Course findCourseByCourseId(String courseId) {
        for(Course course : courses) {
            if(course.getCourseID().equals(courseId)) {
                return course;
            }
        }
        
        return null;
    }
    
    public INGCollege() {
        for(int i = 1; i<=31; i++) {
            days[i-1] = i+"";
        }
        int yearValue = 2010;
        for(int i = 0; i<=19; i++) {
            years[i] = yearValue+"";
            yearValue++;
        }
        containerPanel.setLayout(cardLayout);
        createAcademicCourseGUI();
        createNonAcademicCourseGUI();
        containerPanel.add(academicCoursePanel, "academicCoursePanel");
        containerPanel.add(nonAcademicCoursePanel, "nonAcademicCoursePanel");
        cardLayout.show(containerPanel, "academicCoursePanel");
        frame.add(containerPanel);
        frame.setBounds(10, 10, 1040, 560);
        frame.setResizable(false);
        frame.setVisible(true);
        
    }
    
    public static void main(String args[]) {
        INGCollege ingCollege = new INGCollege();
    }
}