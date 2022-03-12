package exercise;

public class GeneralPractitioner extends Doctor{
    private String role;

    GeneralPractitioner(String role){
        this.role = role;
    }

    void doMedicine(){
        System.out.println("I am a "+ role +", and I am also able to do medicine");
    }

    void makeHouseCalls(){
        System.out.println("My main duty as a "+role+" is to make house calls.");
    }

}
