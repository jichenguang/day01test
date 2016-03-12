/**
 * Created by JiChenGuang on 16/3/12.
 */
public class myString {

    public static void main(String[] args) {
        String str = new String("abc"); //初始化
        String str1 = "abc"; //初始化
        System.out.println("str == str1? 是否同一个对象：" + (str == str1));

        System.out.println("字符串长度：" + str.length());
        System.out.println("字符c在字符串str中的位置(下标)：" + str.indexOf("c"));
        System.out.println("字符串str第2个位置是什么字符：" + str.charAt(1));

        str = "   |" + str + "|   ";
        System.out.println("加上空格后的str：" + str);
        System.out.println("去除str两头的空格后：" + str.trim());
        System.out.println("把|都去除：" + str.replace("|", ""));
        System.out.println("str的内容与str1的内容是否相同：" + str1.equals(str.trim().replace("|", "")));

        String s = "abcd,efgh,dddj";
        String[] sArray = s.split(",");
        System.out.println(s + " 分割后结果：");
        for (String item : sArray) {
            System.out.println(item);
        }
    }
}
