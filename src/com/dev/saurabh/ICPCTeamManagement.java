package com.dev.saurabh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Saurabh Kumar Singh on 8/5/15.
 */
public class ICPCTeamManagement {

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int testCases = Integer.parseInt(line);
        for (int i = 0; i < testCases; i++) {
            String [] in = br.readLine().split(" ");
            int N = Integer.parseInt(in[0]);
            int K = Integer.parseInt(in[1]);

            int [] nameLength = new int[101];
            for(int j=0; j<N; j++) {
                String name = br.readLine();
                nameLength[name.length()] ++;
            }

            String result = "Possible";
            for(int j=1; j<=100; j++) {
                if((nameLength[j] % K) != 0) {
                    result = "Not possible";
                    break;
                }
            }

            System.out.println(result);
        }
    }
}
