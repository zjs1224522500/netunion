package shuru;

import java.io.*;
import java.util.Scanner;

public class input {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        if(file.exists()!=true)
        {
            file.createNewFile();
        }
;       FileWriter out = new FileWriter(file,true);
        System.out.print("in:");
        Scanner in = new Scanner(System.in);
        String str=in.next();
        out.write(str);
        out.close();
    }
}
