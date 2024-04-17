package practice;

import java.util.ArrayList;
import java.util.List;

public class ClumsyFactorial {

    public static int clumsy(int n) {
        int div = n / 4;
        int remain = n % 4;
        int ans = 0;
        if(div > 0){
            ans = ans + (n * ((n - 1)) / (n - 2))+(n-3);
            n = n - 4;
        }
        for (int i = 1; i < div; i++) {
                ans = ans - (n * ((n - 1)) / (n - 2))+(n-3);;
            n = n - 4;
        }
        if (remain == 0)
            return ans;
        else if (remain == 1)
            return Math.abs(ans - 1);
        else if (remain == 2)
            return Math.abs(ans - 2);
        else
            return Math.abs(ans - 6);


    }

    public static void main(String[] args) {
        int num = 10;

        System.out.println(clumsy(num));

    }
}
