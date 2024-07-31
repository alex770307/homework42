package main;

import calculator.MathCalculator;
import filereader.Writer;
import history.ExamplesHistory;
import parser.StringParser;
import printer.ConsolePrinter;
import printer.FilePrinter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FilePrinter filePrinter = new FilePrinter();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        ExamplesHistory examplesHistory = new ExamplesHistory(consolePrinter);
        MathCalculator mathCalculator = new MathCalculator(consolePrinter);
        Scanner scanner = new Scanner(System.in);
        StringParser stringParser = new StringParser(mathCalculator, scanner,examplesHistory);
        //Writer writer = new Writer();

        stringParser.parse();

        scanner.close();
    }
}