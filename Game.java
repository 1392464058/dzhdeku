import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.print("请输入主角的名字");
        Scanner scanner1 = new Scanner(System.in);
            String name1 = scanner1.nextLine();
        System.out.print("请输入主角的生命值");
        int hp1 = scanner1.nextInt();
        System.out.print("请输入主角的攻击力");
        int atk1 = scanner1.nextInt();
        System.out.print("请输入主角的防御力");
        int de1 = scanner1.nextInt();
        System.out.print("请输入怪物的名字");
        Scanner scanner2 = new Scanner(System.in);
        String name2 = scanner2.nextLine();
        System.out.print("请输入怪物的生命值");
        int hp2 = scanner2.nextInt();
        System.out.print("请输入怪物的攻击力");
        int atk2 = scanner2.nextInt();
        System.out.print("请输入怪物体的防御力");
        int de2 = scanner2.nextInt();
        System.out.println("开始战斗");
        System.out.println("请输入想要的对战回合数");
        Scanner turn = new Scanner(System.in);
        System.out.println("第"+turn+"回合");
        int a = (atk1-de2);
        if(a<1){
            a=1;
        }
        System.out.println(name1+"对"+name2+"造成了"+a+"点伤害");
        int b = (atk2-de1);
        if(b<1){
            b=1;
        }
        System.out.println(name2+"对"+name1+"造成了"+b+"点伤害");
        System.out.println("第一回合结束");
    }
}
