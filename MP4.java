import java.util.Scanner;


public class MP4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of storage: ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            for(int i = 0 ; i < n; i++){
                System.out.print("Enter element " + (i+1) + ": ");
                arr[i] = sc.nextInt();
            }
            
            int sum = 0;
            System.out.println("Collected Data: ");
            for(int i = 0 ; i < n; i++){
                sum += arr[i];
                System.out.println(arr[i]);
            }

            double avg = sum/ (double) n;
            System.out.println("Elements");

            for(int i = 0; i < n; i++) {
                System.out.println(arr[i]);
                System.out.println("Total: " + sum);
                System.out.println("Average: " + avg);
            }
}
}
