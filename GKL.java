import java.util.*;
public class GKL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            int d = sc.nextInt();
            int gcd = gcd(d, n);
            
            for(int i=0;i<gcd;i++) {
                int temp = arr[i];
                int j = i;
                int k;
                while(true) {
                    k = j + d;
                    if(k>=n)
                        k = k - n;
    
                    if(k==i)
                        break;
                    arr[j] = arr[k];
                    j=k;
                }
                arr[j] = temp;
            }
            
            for(int i=0;i<n;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            T--;
        }
    }

    private static int gcd(int a, int b) {
        if(a==0)
            return b;
        return gcd(b%a, a);
    }
}
