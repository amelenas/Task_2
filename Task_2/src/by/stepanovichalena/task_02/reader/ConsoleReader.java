package by.stepanovichalena.task_02.reader;

import java.util.Scanner;

public class ConsoleReader {
    private Scanner scanner = new Scanner(System.in);

    public String readString() {
        String result;
        System.out.println("Enter a value: ");
        result = scanner.nextLine();
        return result;
    }
}
