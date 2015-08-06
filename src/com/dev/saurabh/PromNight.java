package com.dev.saurabh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Saurabh Kumar Singh on 8/5/15.
 */
public class PromNight {

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int testCases = Integer.parseInt(line);
        for (int i = 0; i < testCases; i++) {

            String [] in = br.readLine().split(" ");
            int M = Integer.parseInt(in[0]);
            int N = Integer.parseInt(in[1]);

            in = br.readLine().split(" ");
            int [] boys = new int[201];
            for(int j=0; j<M; j++) {
                boys[Integer.parseInt(in[j])]++;
            }

            in = br.readLine().split(" ");
            int [] girls = new int[201];
            for(int j=0; j<N; j++) {
                girls[Integer.parseInt(in[j])]++;
            }

            for(int k=1, p=1; k<=200 && p<=200;) {
                if(boys[p] == 0) {
                    p++;
                    if(p > 200) break;
                }
                else {
                    if(girls[k] == 0) {
                        k++;
                        if(k > 200) break;
                    }
                    else {
                        if(k < p) {
                            int girlsCount = girls[k];
                            int boysCount = boys[p];
                            boys[p] = Math.max(boys[p]-girlsCount, 0);
                            girls[k] = Math.max(girlsCount-boysCount, 0);
                        }
                        else {
                            k++;
                        }

                    }

                }
            }

            String answer = "YES";
            for(int k=1; k<=200; k++) {
                if(boys[k] > 0) {
                    answer = "NO";
                    break;
                }
            }

            System.out.println(answer);
        }
    }
}
