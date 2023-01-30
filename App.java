import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
            
        int[] arr = new int[n];
        
        for(int i = 0 ; i < n; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Collected Data:  \n");

        for(int i = 0 ; i < n; i++){
            System.out.println(arr[i]);
        }

        

}

}

    

