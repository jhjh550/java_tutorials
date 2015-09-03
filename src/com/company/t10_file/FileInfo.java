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

        int totalLength = 0;
        File f2 = new File("C:\\Users\\Mirim");
        if(f2.isDirectory()){
            File[] fileList = f2.listFiles();
            for(int i=0; i<fileList.length; i++){
                if(fileList[i].isDirectory()) {
                    System.out.print("["+fileList[i].getName()+"]");
                }else{
                    System.out.print(fileList[i].getName());
                    totalLength += fileList[i].length();
                    //System.out.print("\t");
                    //System.out.print(fileList[i].length());

                }
                System.out.print("\n");
            }
            System.out.println(totalLength+"¹ÙÀÌÆ®");
        }
    }
}









