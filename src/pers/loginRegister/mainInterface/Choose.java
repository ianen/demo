package pers.loginRegister.mainInterface;

import pers.loginRegister.mainInterface.LoginRegister;

import java.util.Scanner;
public class Choose {
    public static int choice;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到我们刘墉的一星级国际外卖平台，请输入数字来选择你的身份：");
        System.out.println("[1]上帝（顾客）    [2]卖家\n");
        int num = scanner.nextInt();
        if(num==1){
            choice=1;
            LoginRegister.selectMenu();
        }
        else if(num==2){
            choice=2;
            LoginRegister.selectMenu();
        }
        scanner.close();
    }
}