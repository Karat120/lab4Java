import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Human {

    private int age;
    private double height;
    private double weight;
    private String name;
    private String surname;
    Brain brain=new Brain();
    public Human() {
        age = 0;
        height = 0;
        weight = 0;
        name = " ";
        surname = " ";
        brain = new Brain();
    }
    Human(String name, String surname, int age, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        brain =new Brain(90,110);
    }
    void display(){
        System.out.println("Имя:\t" + this.name+"\n");
        System.out.println("Фамилия:\t" + this.surname+"\n");
        System.out.println("Возраст:\t" + this.age+"\n");
        System.out.println("Рост:\t" + this.height +"\n");
        System.out.println("Вес:\t" + this.weight +"\n");
    }
    void setName(String name){
        this.name=name;
    }
    void setSurname(String surname){
        this.surname=surname;
    }
    void setAge(int age){
        this.age = age;
    }
    void setHeight(double height){
        this.height = height;
    }
    void setWeight(double weight){
        this.weight = weight;
    }
void getName(){
        System.out.println(this.name);
}
void getSurname(){
        System.out.println(this.surname);

}

retage retage=new retage() {
    @Override
    public int getAge() {

        return age;
    }
};
    int getAge(){
        System.out.println("Возврат из вспомогательного класса\n");
      return retage.getAge();
    }
    void getNameUp(){
        this.name=this.name.toUpperCase();
        System.out.println(this.name);
    }
}
