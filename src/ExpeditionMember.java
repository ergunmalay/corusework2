public class ExpeditionMember {

    private String name;
    private String studentID;

    public static int memberCounter = 0;

    public ExpeditionMember(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;

        memberCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}