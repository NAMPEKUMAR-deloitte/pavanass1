import java.util.*;

class Animal
{
    private String Species;
    private String Name;
    private String Colour;

    void setSpecies(String Species){
        this.Species = Species;}

    void setName(String Name){
        this.Name = Name;}

    void setColour(String Colour){
        this.Colour = Colour;}

    public void print(){
        System.out.println("Animal Species: "+Species);
        System.out.println("Animal Name: "+Name);
        System.out.println("Animal Colour: "+Colour);
    }
}
 class Pet
{
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.setSpecies("Dog");
        ani.setName("Tommmy");
        ani.setColour("White");
        ani.print();
    }
}
