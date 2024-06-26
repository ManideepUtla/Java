public class School {
    public int noOfStudents=500;
    public int noOfTeacher=25;
    public String nameOfTheSchool="govt_school";
    public String nameOfThePrincipal="Venkateswaralu";
    public String address="Hyd";
    public int noOfWorkingdays=250;
    public double schoolFees=100000;

    @Override
    public String toString() {
        return "School{" +
                "noOfStudents=" + noOfStudents +
                ", noOfTeacher=" + noOfTeacher +
                ", nameOfTheSchool='" + nameOfTheSchool + '\'' +
                ", nameOfThePrincipal='" + nameOfThePrincipal + '\'' +
                ", address='" + address + '\'' +
                ", noOfWorkingdays=" + noOfWorkingdays +
                ", schoolFees=" + schoolFees +
                '}';
    }
}
