import java.util.Scanner;
public class Main {
    public static void main(String[] orgs) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Havanın derecesini giriniz : ");
        heat = input.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (heat >= 5 && heat<= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat >= 15 && heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}




























