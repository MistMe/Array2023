import java.util.Scanner;


public class MP3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of storage: ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            for(int i = 0 ; i < n; i++){
                System.out.print("Enter element " + (i+1) + ": ");
                arr[i] = sc.nextInt();
            }
        
            System.out.println("Collected Data: ");
            for(int i = 0 ; i < n; i++){
                System.out.println(arr[i]);
            }

            System.out.println("Reversed Data: ");
            for(int i = n-1 ; i >= 0; i--){
                System.out.println(arr[i]);
            }


    
    }
}
