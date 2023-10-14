import java.util.Scanner;

public class solve_of_last_task {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++){
            int num = in.nextInt();
            arr[i] = num;
        }
        int m = in.nextInt();
        int mas[] = new int[m];
        for (int i = 0; i < mas.length; i++){
            int num = in.nextInt();
            mas[i] = num;
        }
        int count = 0;
        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (mas[i] == arr[j]) count++;
            }
            System.out.print(count + " ");
            count = 0;
        }
    }
}
