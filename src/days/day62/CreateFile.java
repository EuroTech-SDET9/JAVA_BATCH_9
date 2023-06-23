package days.day62;

import days.day47.second.Pro;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\days\\day62\\test.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//
//        }
        file.createNewFile();

        Writer writer = new FileWriter(file);
        writer.write("Bye Bye\n");
        writer.write("Java Lessons\n");
        writer.write("Hello Selenium!!!\n");
        writer.write("Enjoyyyyyy!!!!!\n");
        writer.close();

        Reader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            System.out.println("scanner.next() = " + scanner.nextLine());
        }
        String path = "src\\days\\day62\\dev.txt";
        file = new File(path);
        file.createNewFile();
        file.delete();

        file = new File("src\\days\\day62\\dev.properties");
        file.createNewFile();
        file.delete();
        file = new File("dev.properties");
        file.createNewFile();


        Writer writer1 = new FileWriter(file, true);
        writer1.write("username = superMario\n");
        writer1.write("Password = Super!\n");
        writer1.write("name = Ronaldo\n");
        writer1.write("club = Real Madrid\n");
        writer1.close();

        FileInputStream fileInputStream = new FileInputStream(file);//reading the file
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println("properties.get(\"name\") = " + properties.get("name"));
        System.out.println("properties.get(\"Password\") = " + properties.get("Password"));
        FileOutputStream outputStream = new FileOutputStream(file);//writing to the file
        Properties properties1 = new Properties();
        properties1.setProperty("email", "supermario@gmail.com");
        properties1.store(outputStream, "created file and created username");

        createFile("pro.txt");
        deleteFile("pro.txt");
    }

    public static void createFile(String path) throws IOException {
        File file = new File(path);
        file.createNewFile();
    }

    public static void deleteFile(String path) throws IOException {
        File file = new File(path);
        file.delete();
    }


}
