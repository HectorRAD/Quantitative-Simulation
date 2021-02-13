import java.io.*;
import java.util.*;

public class Day11{

    public static double median(int N, int[] values){
        double median = 0; 
        if(N%2 == 0){
            median = (double) (values[(N/2) - 1] + values[(N/2)]) / 2.0;
         }else{
            median = values[(int) Math.ceil(N/2)];
        }
        
        return median;
    }
    
    public static void q1(int N, int[] values){
        double q1 = 0;
        q1 = median((int) (Math.floor(N/2)), values);

        System.out.println(q1);;
    }

    public static void q3(int N, int[] values){
        double q3 = 0;
        int[] tempValues = new int[(int)Math.ceil(N/2)]; 
        int j = 0;
        
        for(double i = Math.ceil(N/2); i < N-1; i++ ){
            tempValues[j] = values[(int)i];
            j++;
           // System.out.println(tempValues[j]);
        }
        if(N%2==0)
            q3 = median(tempValues.length,tempValues);
        else
        q3 = median(j+2,tempValues);

        System.out.println(q3);
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

        q1(N, values);
        System.out.println(median(N, values));
        q3(N, values);
        
    }
}