import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ebob, ekok;
        int smallNum;
        System.out.print("n1 Sayisini Giriniz : ");
        n1 = input.nextInt();
        System.out.print("n2 Sayisini Giriniz : ");
        n2 = input.nextInt();

        if (n1 < n2) {
            smallNum = n1;
        } else {
            smallNum = n2;
        }
        int i = smallNum;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println("EBOB : " + ebob);
                ekok = (n1 * n2) / ebob;
                System.out.println("EKOK : " + ekok);
                break;
            } else {
                i--;
            }
        }
    }
}



