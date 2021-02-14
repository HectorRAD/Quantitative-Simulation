import java.io.*;
import java.util.*;

public class Day12{

    public static int[] dataSet(int N, int numElements, int[] values, int[] frecuence){
        int [] dataSet = new int[numElements];
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < frecuence[i]; j++) {
                dataSet[index] = values[i];
                index++;   
            }
        }
        Arrays.sort(dataSet);
        return dataSet;
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
    
    public static double q1(int N, int[] values){
        double q1 = 0;
        q1 = median((int) (Math.floor(N/2)), values);

        return q1;
    }

    public static double q3(int N, int[] values){
        double q3 = 0;
        int[] tempValues = new int[(int)Math.ceil(N/2)]; 
        int j = 0;
        
        for(double i = Math.ceil(N/2); i < N-1; i++ ){
            tempValues[j] = values[(int)i];
            j++;
        }
        if(N%2==0)
            q3 = median(tempValues.length,tempValues);
        else
            q3 = median(j+2,tempValues);

        return q3;
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

        int numOfElemen = 0;
        for (int i = 0; i < strs.length; i++) {
            frecuence[i] = Integer.parseInt(strs[i]);
            numOfElemen += frecuence[i];
        }  

        scanner.close();

        int[] dataSet = dataSet(N,numOfElemen, values, frecuence);
        System.out.println(q3(numOfElemen, dataSet)-q1(numOfElemen, dataSet));
        
    }

}