package com.example.HackerRankRecursion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RecursiveDigitSum {

    // Complete the superDigit function below.
    
    private static long superDigit(String str, int i) {
            
        return findVal(str,i,true);
    }

    private static long findVal(String s,int k, boolean isFirst) {
        if(s.length()==1) {
            return Long.valueOf(s);
        }
        else {
            long sum=0;
            char c;
            for(int j=0;j<s.length();j++) {
                c=s.charAt(j);
                sum += (c - '0');
            }
            if(isFirst) {
                sum=sum*k;
            }
            return findVal(Long.toString(sum),k,false);
        }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        long result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
