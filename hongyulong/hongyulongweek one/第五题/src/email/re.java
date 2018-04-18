package email;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class re{

     public static void main(String[] args) throws IOException {

         String name="shyk";
         String regex="reg_Name*";
         File file = new File("email.html");
         File file2 = new File("email3.html");
         BufferedReader buf = new BufferedReader( new FileReader(file));
         String str=null;
         String str2=null;
         while((str=buf.readLine())!=null)
         {str2=str2+str;}
         System.out.print(str2);
         Pattern p=Pattern.compile(regex);
         Matcher m=p.matcher(str2);
         StringBuffer sb=new StringBuffer();
         boolean result = m.find();
         while(result) {
             m.appendReplacement(sb, name);
             result = m.find();//继续下一步匹配
         }
         m.appendTail(sb);
         System.out.println("\n"+sb.toString());
         buf.close();
         if(file2.exists()!=true)
         {
             file2.createNewFile();
             Writer out =new FileWriter(file2);
             out.write(sb.toString());
             out.close();
         }
     }
 }
