/**
 * Created by 700sfriend on 16/3/5.
 */
public class Switch {


    public static void main(String[] args) {
        int level = Integer.parseInt(args[0]);

        System.out.println("您输入的年龄阶段是：" + level);
        System.out.print("您是：");
        switch (level){
            case 1:
                System.out.println("学龄前儿童");
                break;
            case 2:
                System.out.println("小学生");
                break;
            case 3:
                System.out.println("中学生");
                break;
            case 4:
                System.out.println("大学生");
                break;
            default:
                System.out.println("职场人");
        }
    }
}
