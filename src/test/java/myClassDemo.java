/**
 * Created by JiChenGuang on 16/3/12.
 */
public class myClassDemo {



    public static void main(String[] args) {
        String name = "吕布";
        int age =15;

        Person  dada = new Person(name,age);
        dada.Speak();
        System.out.println(dada.Speak());
    }
}
