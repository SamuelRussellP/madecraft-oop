package exercise;

public class MainClass {
    public static void main (String[] args){
        Doctor doctor = new Doctor();
        Surgeon surgeon = new Surgeon("Surgeon");
        GeneralPractitioner generalPractitioner = new GeneralPractitioner("General Practitioner");
        doctor.doMedicine();
        surgeon.doMedicine();
        surgeon.performSurgery();
        generalPractitioner.doMedicine();
        generalPractitioner.makeHouseCalls();
    }
}
