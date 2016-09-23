package pack;

/**
 * Created by home on 23.09.2016.
 */
public class Client {

    private String id;
    private  Pet pet;

    public Client(String id, Pet pet){
        this.id = id;
        this.pet = pet;
    }

    public String getId(){
        return this.id;
    }
    public  void setId(String id){

        this.id = id;
    }

    public Pet getPet() {

       return this.pet;
    }

    public void setPet(Pet pet){
        this.pet = pet;
    }

}
