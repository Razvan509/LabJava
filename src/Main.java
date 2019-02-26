import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //int x = 2, y = 3;
        //System.out.println("suma numerelor " + x + " " + y + " este " + (x + y));
        System.out.print("Ia zi ceva bossulica: ");
        Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        //System.out.println(s);

        //actiuni
        //0 = exit, 1 = suma, 2 = diferenta
        System.out.println("0 = exit, 1 = suma, 2 = diferenta");
        int act;
        act = sc.nextInt();
        while(act!=0){
            if(act==1){
                int a,b;
                System.out.print("Baga primu nr: ");
                a = sc.nextInt();
                System.out.print("Baga al doilea nr sefulica: ");
                b = sc.nextInt();
                System.out.println("O suma valoroasa: " + (a+b));
            }else{
                if(act==2){
                    int a,b;
                    System.out.print("Baga primu nr: ");
                    a = sc.nextInt();
                    System.out.print("Baga al doilea nr sefulica: ");
                    b = sc.nextInt();
                    System.out.println("O diferenta scandaloasa: " + (a-b));
                }else{
                    System.out.println("M-ai nenorocit, nu stiu ce sa fac!");
                }
            }
            System.out.println("0 = exit, 1 = suma, 2 = diferenta");
            act = sc.nextInt();
        }

    }
}
