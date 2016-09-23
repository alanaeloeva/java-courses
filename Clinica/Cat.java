package pack;

/**
 * Created by home on 23.09.2016.
 */
public class Cat implements Pet {

    private  String name;

     public Cat(final String name){
         this.name = name;
     }


    public void setName(){
        this.name = name;
    }

    @Override
    public void setPetNames(String name) {

    }

    @Override
    public String getPetName() {
        return this.name;
    }
}
