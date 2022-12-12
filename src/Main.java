import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı girmek istersiniz");
        int howmanynum = input.nextInt();
        int maxnum =-1000000000,minnum=1000000000,num;
        for (int i = 1;i<=howmanynum;i++){
            System.out.print(i+". sayıyı giriniz : ");
            num = input.nextInt();
            if (num > maxnum){
                maxnum = num;
            }
            if (num<minnum){
                minnum = num;
            }
        }
        System.out.println("En küçük sayımız : " + minnum);
        System.out.println("En büyük sayımız : "+maxnum);
    }
}