public class StudentProfileInstances {
    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("Asadullah","Salim","Computer Science",3.14,2024);
        StudentProfile profileTwo = new StudentProfile("Max","Fisherman","Computer Science",3.6,2022);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.yearToGraduate);
    }
}
