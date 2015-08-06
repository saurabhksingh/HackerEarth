package com.dev.saurabh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Saurabh Kumar Singh on 8/4/15.
 */
public class NumberOfRs {

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int testCases = Integer.parseInt(line);
        for (int i = 0; i < testCases; i++) {

            String inString  = br.readLine();
            char [] input = inString.toCharArray();

            //consider K as +1 and R as -1

            int maxSoFar = 0;
            int maxEndingHere = 0;

            int rCount = 0;
            for(int j=0; j<input.length; j++) {
                int val = 1;
                if(input[j] == 'R') {
                    val = -1;
                    rCount++;
                }

                maxEndingHere += val;
                if(maxEndingHere <0) {
                    maxEndingHere = 0;
                }
                else if(maxEndingHere > maxSoFar) {
                    maxSoFar = maxEndingHere;
                }
            }

            System.out.println(maxSoFar + rCount);
        }
    }
}
