public class SchoolDetails {

    public School details(){
        School schoold = new School();
        System.out.println(schoold);
        return (schoold);

    }
    public static void main(String[] args){
        SchoolDetails scl = new SchoolDetails();
        scl.details() ;
    }

}
