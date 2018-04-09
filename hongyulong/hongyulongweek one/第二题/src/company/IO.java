package company;
import java.io.*;

public class IO
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("dormforce");
        print(file);
    }
    public static void print(File file) throws IOException {
        int x=0;
        if(file.isDirectory())
        {
            File resul[] = file.listFiles();
            if(resul!=null)
            {
                for ( x=0;x<resul.length;x++)
                {
                    print(resul[x]);
                }
            }
        }

        if(file.isFile())try {
            soud(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void soud(File file) throws IOException {
        if(file.exists())
        {
            Reader im= new FileReader(file);
            char data[]=new char[1024];
            im.read(data);
            try {
                im.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String str=new String(data);
            boolean status;
            if (str.contains("NetUnion")) status = true;
            else status = false;
            if(status)
            {
                System.out.print(file+"\n");
            }
        }
    }
}
