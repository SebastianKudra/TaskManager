package pl.coderslab;




import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TaskManager {
    public static final String BLUE = "\033[0;34m";
    public static final String RESET = "\033[0m";
    public static final String[] option = {"add", "remove", "list", "exit"};
    public static final String file_ex = "tasks.csv";
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Print();
    }

    public static void Print() {

        System.out.println(BLUE + "Please select an option: " + RESET);
        for (int i = 0; i < option.length; i++) {
            System.out.println(option[i]);
        }
    }
}

