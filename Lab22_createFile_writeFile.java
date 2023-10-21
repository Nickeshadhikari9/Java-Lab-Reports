import java.io.FileWriter;
import java.io.IOException;

public class Lab22_createFile_writeFile {
    public static void main(String[] args) {
        String desktopPath = "C:\\Users\\Dell\\OneDrive\\Desktop\\javafile\\";
        String fileName = desktopPath + "lab22.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("This is a Lab Report file.\n");
            writer.write("Java is a Programming Language.");
            writer.close();
            System.out.println("Content has been written to the file: " + fileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
