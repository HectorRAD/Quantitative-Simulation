import java.io.*;
import java.util.*;

public class Day02{
   
    public static double weightMean(int N, int[] values, int[] frecuence){
        double mean = 0;
        int sum = 0;
        int denom = 0;

        for(int i = 0; i < N; i++){
            sum += frecuence[i];
            denom += (values[i]* frecuence[i]);
        }

        mean = round(((double) denom / (double) sum),1);

        return mean;
    }

    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] values = new int[N];
        int[] frecuence = new int[N];
        
        String valuesTemp = scanner.nextLine();
        
        String[] strs = valuesTemp.trim().split("\\s+");

        for (int i = 0; i < strs.length; i++) {
            values[i] = Integer.parseInt(strs[i]);
        }  

        String frecuenceTemp = scanner.nextLine();
        strs = frecuenceTemp.trim().split("\\s+");

        for (int i = 0; i < strs.length; i++) {
            frecuence[i] = Integer.parseInt(strs[i]);
        }  

        scanner.close();

        System.out.println(weightMean(N,values,frecuence));
    }
}