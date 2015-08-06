package com.dev.saurabh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * Created by Saurabh Kumar Singh on 8/5/15.
 */
public class LittleAshishAndWife {

    public static final String LAME = "Lame husband";
    public static final String BAD = "Bad husband";
    public static final String PERFECT = "Perfect husband";

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int testCases = Integer.parseInt(line);
        for (int i = 0; i < testCases; i++) {
            String [] in  = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int x = Integer.parseInt(in[1]);

            in = br.readLine().split(" ");
            HashSet<String> input = new HashSet<String>();

            for(String str : in) {
                input.add(str);
            }
            int uniquePriceCount = input.size();
            if(uniquePriceCount == x) {
                System.out.println(PERFECT);
            }
            else if(uniquePriceCount < x) {
                System.out.println(BAD);
            }
            else {
                System.out.println(LAME);
            }
        }
    }
}
