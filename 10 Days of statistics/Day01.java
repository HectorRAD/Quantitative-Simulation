import java.io.*;
import java.util.*;

public class Day01{

    public static double mean(int N, int[] values){
        int sum = 0; 
        double mean;
        for(int i = 0; i<N; i++){
            sum += values[i];
        }

        mean = (double) sum/ (double) N;
        return mean; 
    }

    public static double median(int N, int[] values){
        double median = 0; 
        if(N%2 == 0){
            median = (double) (values[(N/2) - 1] + values[(N/2)]) / 2.0;
         }else{
            median = values[(int) Math.ceil(N/2)];
        }
        return median;
    }

    public static int mode(int N, int[] values){
        int mode = 0, maxCount = 0;

        for (int i = 0; i < N; ++i) {
            int count = 0;
 
            for (int j = 0; j < N; ++j) {
               if (values[j] == values[i])
               ++count;
            }
   
            if (count > maxCount) {
               maxCount = count;
               mode = values[i];
            }
         }

        if(maxCount == 1){
            mode = values[0];
        }

        return mode; 
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] values = new int[N];
        
        String valuesTemp = scanner.nextLine();
        
        String[] strs = valuesTemp.trim().split("\\s+");

        scanner.close();
                
        for (int i = 0; i < strs.length; i++) {
            values[i] = Integer.parseInt(strs[i]);
        }  
        Arrays.sort(values);
        System.out.println(mean(N,values));
        System.out.println(median(N, values));
        System.out.println(mode(N,values));
    }
}


