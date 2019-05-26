//判断一个年份是平年还是闰年
import java.util.Scanner;

public class zuoye9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a%4==0&&a%100!=0){
            System.out.println(a+"是闰年");
        }else if (a%400==0){
            System.out.println(a+"是世纪闰年");
        }else {
            System.out.println(a+"是平年");
        }
    }
}
