package Lab4_5;

import java.io.*;

public class FileSort {
    public static void main(String[] args) {
        String filepath = (new File("")).getAbsolutePath();
        String names = filepath + "\\src\\Lab4_5\\names.txt";
        System.out.println(filepath);
        try {
            FileReader fileReader = new FileReader(names);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String bigFile = filepath + "\\src\\Lab4_5\\large.txt";
            String smallFile = filepath + "\\src\\Lab4_5\\small.txt";
            BufferedWriter bigfileWriter = new BufferedWriter(new FileWriter(bigFile));
            BufferedWriter smallfileWriter = new BufferedWriter(new FileWriter(smallFile));
            while((line = bufferedReader.readLine()) != null) {
                if(line.length()<=5) smallfileWriter.write(line + "\n");
                else bigfileWriter.write(line + "\n");
            }
            bigfileWriter.close();
            smallfileWriter.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
