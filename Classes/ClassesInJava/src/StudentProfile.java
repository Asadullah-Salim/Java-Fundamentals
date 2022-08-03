public class StudentProfile {
    String firstName;
    String lastName;
    String declaredMajor;
    double gpa;
    int yearToGraduate;

    public StudentProfile(String firstName,String lastName, String declaredMajor, double gpa, int
                          yearToGraduate){

        this.firstName = firstName;
        this.lastName =lastName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.yearToGraduate = yearToGraduate;

    }

    public void incrementExpectedGraduationYear(){
        this.yearToGraduate = this.yearToGraduate + 1;
    }
}
