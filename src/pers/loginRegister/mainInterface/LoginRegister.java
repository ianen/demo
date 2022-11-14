package pers.loginRegister.mainInterface;

import pers.buyer.mainInterface.BuyerMainInterface;
import pers.loginRegister.tools.Login;
import pers.loginRegister.tools.Register;
import pers.npc.mainInterface.NpcMainInterface;

import java.util.Scanner;
public class LoginRegister {
    public static void selectMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean success = true;
        System.out.println("请选择注册还是登录");
        System.out.println("[1]登录   [2]注册");
        String answer = scanner.nextLine();
        if(answer.equals("2")){//注册,记录username,password和address
            while(success) {
                System.out.println("请输入用户名：");
                String username = scanner.nextLine();
                System.out.println("请输入密码：");
                String password = scanner.nextLine();
                System.out.println("请再次输入密码：");
                String password2 = scanner.nextLine();
                if (password.equals(password2)) {//判断密码是否一致
                    Login.nameDetection();//判断用户名是否存在
                    if (true) {
                        System.out.println("该用户名已经存在辽");
                    }
                    else {
                        System.out.println("请输入您的收货地址哦：");
                        String address = scanner.nextLine();
                        System.out.println("注册成功！");
                        Login.npSave();//储存用户名和密码
                        success = false;
                        if(Choose.choice == 1)
                        {
                            BuyerMainInterface.buyermenu();
                        }
                        else if(Choose.choice == 2){
                            NpcMainInterface.npcmenu();
                        }
                    }
                }
                else {
                    System.out.println("抱歉哦您密码不一致");
                }
            }
        }
        else if(answer.equals("1")){//登录
            while(success) {
                System.out.println("请输入用户名：");
                String username = scanner.nextLine();
                System.out.println("请输入密码：");
                String password = scanner.nextLine();
                Register.npJudge();//判断用户名与密码是否正确
                if (true) {
                    System.out.println("登录成功！");
                    success = false;
                    if(Choose.choice == 1)
                    {
                        BuyerMainInterface.buyermenu();
                    }
                    else if(Choose.choice == 2){
                        NpcMainInterface.npcmenu();
                    }
                }
                else {
                    System.out.println("用户名或密码错误哦");
                }
            }
        }
        else{//没按规定输入
            System.out.println("您输入的东西我看不懂哦，请再试一次吧");
            selectMenu();
        }
        scanner.close();
    }
}
