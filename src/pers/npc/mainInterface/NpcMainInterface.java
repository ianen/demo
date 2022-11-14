package pers.npc.mainInterface;

import pers.loginRegister.mainInterface.LoginRegister;
import pers.npc.tools.Menu;
import java.util.Scanner;

public class NpcMainInterface {
    public static void npcmenu(){
        Menu.menuDisplay();
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        System.out.println("请选择你需要的功能：");
        System.out.println("[1]增加美食    [2]删除美食");
        System.out.println("[3]修改美食    [4]查询美食");
        System.out.println("[5]退出");
        if(answer==1){
            System.out.println("请输入你想添加的美食的信息：");
            String add = scan.nextLine();
            Menu.add();
        }
        else if(answer==2){
            System.out.println("请输入你想删除美食的名称：");
            String name = scan.nextLine();
            Menu.delete();
        }
        else if(answer==3){
            Menu.amend();
        }
        else if(answer==4){
            Menu.search();
        }
        else if(answer==5){
            LoginRegister.selectMenu();
        }
        else{//没按要求输入
            System.out.println("您输入的东西我看不懂哦，请再试一次吧");
            npcmenu();
        }
    }
}
