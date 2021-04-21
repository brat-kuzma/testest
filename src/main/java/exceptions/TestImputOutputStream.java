package exceptions;

import java.io.*;

public class TestImputOutputStream {
    public static void main(String[] args) throws IOException
    {
        InputStream inStream = new FileInputStream("/Users/user/IdeaProjects/testest/src/main/java/exceptions/prank.txt");
        OutputStream outStream = new FileOutputStream("/Users/user/IdeaProjects/testest/src/main/java/exceptions/prank_copy.txt");

        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один байт из потока для чтения
            outStream.write(data); //записываем прочитанный байт в другой поток.
        }

        inStream.close(); //закрываем потоки
        outStream.close();
    }
}
