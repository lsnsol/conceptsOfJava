/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.File;

/**
 *
 * @author ADMIN
 */
public class FileEg1 {
    
    final static String ROOT_PATH = "D:\\";
    public static void main(String[] argv)
            throws NullPointerException,Exception 
    {
        File dir = new File(ROOT_PATH); 
        File[] far = dir.listFiles();
        
        for(File fone:far)
        {
            System.out.print(fone.getName()+"   ");
            
            if(fone.isDirectory())
            {
                System.out.println(" <<Folder>>");
            }
            else
            {
                System.out.println(" <<File>>");
            }
        }
        
        System.out.println("No. of files/fodlers:"+ far.length);
    }
}
