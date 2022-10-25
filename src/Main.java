import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int j=0,jmin=0,comp1,comp2,min,n2=0,n3=0,n4=0,n5=0;
        Scanner input= new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz: ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i+". sayıyı giriniz: ");
            j= input.nextInt();
            comp1=j-n2;
            comp2=j-n4;
            if(comp1>0 || i==1){
                n2=j;
                n3=n2;
            }
            if(comp2<0 || i==1){
                n4=j;
                n5=n4;
            }
        }
        System.out.println("En büyük sayı: "+n3);
        System.out.print("En küçük sayı: "+n5);
    }
}