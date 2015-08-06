package com.dev.saurabh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Saurabh Kumar Singh on 8/5/15.
 */
public class Dhoom4 {

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String [] in = line.split(" ");
        int seedKey =  Integer.parseInt(in[0]);
        int targetKey = Integer.parseInt(in[1]);

        int otherKeyCount = Integer.parseInt(br.readLine());
        int [] otherKeys = new int[otherKeyCount];

        in = br.readLine().split(" ");
        for(int i=0; i<in.length; i++) {
            otherKeys[i] = Integer.parseInt(in[i]);
        }


    }
}
