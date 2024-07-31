package filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Reader {
    public static void main(String[] args) throws IOException {
        File file = new File("Text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> list = bufferedReader.lines().toList();
        System.out.println(list);
        bufferedReader.close();
    }
}