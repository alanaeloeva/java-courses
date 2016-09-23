package pack;

import java.util.Scanner;

/**
 * Created by home on 23.09.2016.
 */
public class Clinic {

    private final Client [] clients;

    public Clinic(final int size){
        this.clients = new Client[size];

    }

    public void addClient(final int position, final Client client){
        this.clients[position] = client;
    }

    public Client[] getClients() {
       return this.clients;
    }

    public void removeClient(int pos){

        this.clients[pos] = null;
    }

    public void findPetByClientName(String clientName){

        for(Client client: clients){
            if(client != null ) {
                if(client.getId().equals(clientName)){
                    System.out.println("Клиенту " + clientName + " принадлежит питомец - " + client.getPet().getPetName());

                }
            }
        }
    }

    public void findClientsByPetName(String petName){

        for( Client client : clients){
            if(client!=null){
                if(client.getPet().getPetName().equals(petName)){
                    System.out.println("Владельцем питомца " + petName + " является - " + client.getId());
                }
            }

        }
    }

    public void showAllClients(){
        System.out.println("Список клиентов: ");
        for( Client client: this.clients){

            if(client!=null){
                Pet pet = client.getPet();
                System.out.print("Клиент: " + client.getId());
                if(pet!=null){
                    System.out.println(", питомец: " + client.getPet().getPetName());

                }
            }
        }

    }
}
