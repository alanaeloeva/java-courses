package pack;

/**
 * Created by home on 23.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Clinic clinic = new Clinic(4);
        clinic.addClient(0, new Client("Игорь", new Cat ("Васька")));
        clinic.addClient(1, new Client("Анатолий", new Cat("Барсик")));
        clinic.addClient(2, new Client("Екатерина", new Cat("Мурзик")));
        clinic.addClient(3, new Client("Наталья", new Cat("Барбос")));

        clinic.showAllClients();

        clinic.findClientsByPetName("Мурзик");
        clinic.findPetByClientName("Игорь");


    }
}
