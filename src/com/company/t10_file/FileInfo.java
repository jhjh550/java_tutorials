package com.company.t10_file;

import java.io.File;

/**
 * Created by Mirim on 2015-09-01.
 */
public class FileInfo {
    public static void main(String[] args){
        String filePath = "C:"+File.separator+"Temp"+File.separator+"SLog.log";
        File f = new File(filePath);
        if(f.exists()){
            System.out.println("length : "+f.length());
            System.out.println("absolutePath : "+f.getAbsolutePath());
            System.out.println("name : "+f.getName());
        }

        File f2 = new File("C:\\Temp");
        if(f2.isDirectory()){
            File[] fileList = f2.listFiles();
            for(int i=0; i<fileList.length; i++){
                System.out.println(fileList[i].getName());
            }
        }
    }
}









