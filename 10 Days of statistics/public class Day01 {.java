import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day01{
    
    public int N;
    public int[] values;

    public static double mean(int N, int[] values){
        int sum = 0; 
        for(int i = 0; i<N; i++){
            sum += values[0];
        }

        return sum/N; 
    }

    public static void main(String[] args) {
        N = 6;
        values = [1,2,3,4,5,5];

        System.out.println(mean(N,values));
    }
}