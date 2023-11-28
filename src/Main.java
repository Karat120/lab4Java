// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
interface retage{
    public int getAge();
}
public class Main {
    public static void main(String[] args) {

Human adam=new Human("Adam","Adamovich",34,180,70);
System.out.println("Изменение строки в верхний регистр: ");
adam.getName();
System.out.println("\nИзменение строки в верхний регистр: ");
adam.getNameUp();

StringBuilder strings=new StringBuilder("Hello");

strings.append( " teacher\n" );
System.out.println(strings);
Human [] humans=new Human[3];
humans[0]= new Human("Egor","Volodov",32,192,20);
humans[1]=new Human("Evgeniy","Marchinskiy",20,180,72);
humans[2]=new Human("Victor","Zima",19,181,100);
        //
        //возврат из вспомогательного класса
         Human humananonim=new Human(){
            public int getAge(){
                int age;
                Human a=new Human("Evgeniy","Marchinskiy",20,180,72);
                System.out.println("Возрат из анонимного класса");
                age=a.getAge();
                return age;
            }
        };

        //возврат из вспомогательного одноразового класса
        Human a=new Human("Evgeniy","Marchinskiy",20,180,72);
System.out.println(a.getAge());
        }
    }
