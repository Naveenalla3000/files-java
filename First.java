package filesInJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class First {
    public static void main(String[] args) throws IOException {
        String fileLocation = "/Users/naveen/Developer/Code/java";
        // FileWriter fw = new FileWriter(fileLocation + "/one.txt");
        // String str = "learning java is feel good";
        // fw.write(str);
        // fw.close();

        // FileReader fr = new FileReader(fileLocation + "/one.txt");
        // int i;
        // while ((i = fr.read()) != -1){
        //     System.out.print((char)i);
        // }
        // fr.close();

        //assci value of blank space is 32

        FileOutputStream fos = new FileOutputStream(fileLocation + "/one.txt");
        FileInputStream fis = new FileInputStream(fileLocation + "/one.txt");

        int n = 45;
        fos.write(n);

        int j;
        while ((j = fis.read()) != -1) {
            System.out.println(j);
        }
        fos.close();
        fis.close();

    }
    
}
