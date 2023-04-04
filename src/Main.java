import java.util.Scanner;

public class Main {
    //Function
    public static double getAver(int n, int[] arr) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum / n;
    }

    public static void main(String[] args) {
        //Function work check
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] myArr = new int[10];
        for (int i = 0; i < n; i++) {
            myArr[i] = sc.nextInt();
        }
        System.out.println(getAver(n, myArr));
    }
}