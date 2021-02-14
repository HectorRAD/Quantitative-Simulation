import java.io.*;
import java.util.*;

public class Day13{

    public static double mean(int N, int[] values){
        int sum = 0; 
        double mean;
        for(int i = 0; i<N; i++){
            sum += values[i];
        }

        mean = (double) sum/ (double) N;
        return mean; 
    }

    public static double standard(int N, int[] values){
        double standard=0;
        double mean = mean(N, values);
        double sum = 0;

        for(int i = 0; i<N; i++){
            sum += Math.pow((values[i]- mean),2);
        }

        standard= Math.sqrt(sum/N);

        return standard;
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

        System.out.println(standard(N, values));

    }

}