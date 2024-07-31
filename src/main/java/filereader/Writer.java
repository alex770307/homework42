package filereader;

import history.ExamplesHistory;
import history.History;
import printer.FilePrinter;
import printer.Printer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {



    public static void main(String[] args) throws IOException {
        FilePrinter filePrinter = new FilePrinter();
        ExamplesHistory examplesHistory = new ExamplesHistory(filePrinter);
        File file = new File("Text.txt");
    FileWriter fileWriter = new FileWriter(file);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(String.valueOf(examplesHistory));

        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
}
}
