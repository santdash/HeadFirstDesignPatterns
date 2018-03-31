package com.practice.fileReadWrite.hpe;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

/**
 * Created by dashsan on 5/11/2017.
 */
public class PropertyMerger {
    private String miscFile;
    private String sharedFile;
    private HashMap<String, String> miscCommentForProp = new HashMap<>();
    private HashMap<String, String> miscProp = new HashMap<>();
    private HashMap<String, String> sharedCommentForProp = new HashMap<>();
    private HashMap<String, String> sharedProp = new HashMap<>();

    public PropertyMerger(String miscFile, String sharedFile) throws IOException {
        this.miscFile = miscFile;
        this.sharedFile = sharedFile;
        Properties properties = getProperties(miscFile);
    }

    private Properties getProperties( String file ) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream(new File(file)));
        return prop;
    }

    private void setUnCommentedHash() throws IOException {
        Properties properties = getProperties(miscFile);

    }

    private void mapCommentedProperties( String file ) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream(new File(file)));
    }


    public void readPropertyFile(String filename) throws IOException {
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String cLine;
        StringBuffer allLines = new StringBuffer();
        StringBuffer unCommented = new StringBuffer();
        StringBuffer commented = new StringBuffer();
        while ((cLine = br.readLine()) != null){
            allLines.append(cLine + "\n");
           if ( cLine.startsWith("#!") ){
               commented.append(cLine + "\n");
           }
           else
           {
               unCommented.append(cLine + "\n" );

           }
        }

    }


}
