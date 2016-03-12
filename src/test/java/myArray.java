/**
 * Created by JiChenGuang on 16/3/12.
 */
public class myArray {

    public static void main(String[] args) {
        /**
         * 指定一个字符串,再打印出其中某字符的位置
         */
        String otString = "　If you can dream it, you can do it.";
        System.out.println(otString.indexOf(""));

        /**
         * 输出字符串的每个字符
         */
        String sotString[] = otString.split(" ");

        for(String str: sotString){
           System.out.println(str);
        }

        /**
         * 倒序输出字符串
         */

        for(int i = otString.length()-1;i>=0;i--){
            System.out.print(otString.charAt(i));
        }



    }

}
