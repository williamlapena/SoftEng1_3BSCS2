public class Student{
    private String studentNo;
    private String lastName;
    private String firstName;

    
    public Student(String studentNo, String lastName, String firstName) {
        this.studentNo = studentNo;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String getStudentNo() {
        return studentNo;
    }
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
}