/**
 * Created by JiChenGuang on 16/3/12.
 */
public class Person {

    String name ="";
    int age = 0;


    public  Person(String name, int age){
        this.name = name;
        this.age = age;

        String Per = name + "," + age;
        System.out.println(Per);

    }
    public String  Speak(){
//        System.out.print("Hello!");
        return "来访者你好!";
    }


}
