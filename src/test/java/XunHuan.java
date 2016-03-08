import javax.sound.midi.Soundbank;

/**
 * Created by 700sfriend on 16/3/5.
 */
public class XunHuan {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;  //sum = sum + i;
            System.out.println("sum的值是:"+sum);

        }
        System.out.println("答案是?"+"1+2+3+...+100=" + sum);
        System.out.println("Sum现在的值是"+sum);

    }
}
