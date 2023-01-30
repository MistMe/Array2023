import java.util.Scanner;


public class MP3_1 {
    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of storage: ");
        int n = sc.nextInt();

        int num[] = new int[n];

        for(int i = 0; i < n; i=i+1){
            System.out.print("Enter element " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }

        System.out.print("\nData: ");
        for(int i = 0; i < num.length; i=i+1){
            System.out.print(num[i] + ", ");
        }

        System.out.print("\nReverse Data: ");
        for(int i = num.length-1; i >= 0; i=i-1){
            System.out.print(num[i] + ", ");
        }
}
}