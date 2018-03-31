package com.practice.fileReadWrite;

import java.io.*;

/**
 * Created by dashsan on 5/11/2017.
 */
public class ReadFile {

    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String currentLine;
        while (( currentLine = br.readLine() )!= null){
            System.out.println(currentLine);
        }
        br.close();
        fr.close();
    }
}
