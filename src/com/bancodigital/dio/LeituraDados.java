package com.bancodigital.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeituraDados {

    public static String lerLinha() throws IOException {

        String line;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        line = br.readLine();

        return line;
    }

}