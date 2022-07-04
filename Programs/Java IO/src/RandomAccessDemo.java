import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.io.RandomAccessFile; 

 public class RandomAccessDemo{ 
     public static void main(String args[]) 
     { String data = "KitKat (4.4 - 4.4.2)";

     writeRAF("sample.txt", 10, data); 
     System.out.println("String written: " + data); 
     
     writeRAF("sample.txt", 12, "yyyyyyyyy"); 
     
     String fromFile = readRAF("sample.txt", 8); 
     System.out.println("String read : " + fromFile); 
     } 
/* * Utility method to read from RandomAccessFile in Java */ 
public static String readRAF(String file, int position) 
{ 
    String record = null;
 try 
 { 
     RandomAccessFile fileStore = new RandomAccessFile(file, "rw");
 // moves file pointer to position specified 
     fileStore.seek(position); // reading String from RandomAccessFile 
     record = fileStore.readUTF(); fileStore.close(); 
 } catch (IOException e) { e.printStackTrace(); } 
 return record;
} 

public static void writeRAF(String file, int position, String record) 
{ 
    try { 
        RandomAccessFile fileStore = new RandomAccessFile(file, "rw"); // moves file pointer to position specified 
fileStore.seek(position); // writing String to RandomAccessFile 
fileStore.writeUTF(record); 
fileStore.close(); 
} catch (IOException e) { e.printStackTrace(); } 
} 
}

