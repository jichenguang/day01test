/**
 * Created by JiChenGuang on 16/3/12.
 */
public class myStringDemo {

    public static void main(String[] args) {
        String[] str = new String[]{"那就这样吧","可惜不是你","伤心太平洋","未来还好"};

        /**
         * 遍历字符串数组
         */
        for(String trimer:str){
            System.out.println(trimer);
        }

        /**
         * 显示字符串的长度
         */
        System.out.println(str.length);


        /**
         * 指定一个字符串,再打印出其中某字符的位置
         */
        String otString = "　If you can dream it, you can do it.";
        System.out.println(otString.indexOf("c"));
    }
}
