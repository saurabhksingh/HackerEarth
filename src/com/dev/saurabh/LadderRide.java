package com.dev.saurabh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Saurabh Kumar Singh on 8/5/15.
 */
public class LadderRide {

    public static final int MAX  = 1000005;
    public static final int MOD = 1000000007;

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String [] in = line.split(" ");
        int testCases = Integer.parseInt(in[0]);
        int stairSteps = Integer.parseInt(in[1]);

        long [] defaultSteps = new long[MAX];
        long [] addSteps = new long[MAX];

        defaultSteps[0] = 0 ; defaultSteps[1] = 0 ;
        defaultSteps[2] = 1 ; defaultSteps[3] = 0 ;
        defaultSteps[4] = 1 ; defaultSteps[5] = 1 ;
        for(int i=6; i<=stairSteps; i++) {
            defaultSteps[i] = (defaultSteps[i-2] + defaultSteps[i-5]) % MOD;
        }

        for (int i = 0; i < testCases; i++) {

            in = br.readLine().split(" ");
            int cur = Integer.parseInt(in[0]);
            int k = Integer.parseInt(in[1]);

            if( (cur < k) || ( k == 2 ) || ( k == 5 )) {
                System.out.println(defaultSteps[cur]);
            }
            else if(cur == k) {
                System.out.println((defaultSteps[cur] +  1)%MOD);
            }
            else {
                for( int p = 0 ; p <= k ; p++ ) addSteps[p] = defaultSteps[p] ;
                addSteps[k] = (addSteps[k]+1)%MOD;
                for( int p = k+1 ; p <= cur ; p++ ) addSteps[p] = (addSteps[p-2] + addSteps[p-5] + addSteps[p-k])%MOD ;
                System.out.println(addSteps[cur]);
            }
        }
    }
}
