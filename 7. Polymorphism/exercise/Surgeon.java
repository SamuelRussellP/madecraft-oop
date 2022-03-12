package exercise;

public class Surgeon extends Doctor {

    private String role;

    Surgeon(String role){
        this.role = role;
    }

    void doMedicine(){
        System.out.println("I am a surgeon but I can also do medicine.");
    }
    void performSurgery(){
        System.out.println("I am able to perform surgery as I am a surgeon.");
    }
}
