import java.io.*;

public class SingletonClass {
    private static SingletonClass singletonInstance;
    String state;
    private static final String FILE_NAME = "myapp.cfg";
    private SingletonClass() {
        state = readFromFile();
    }

    //constructor
    public static synchronized SingletonClass getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new SingletonClass();
        }
        return singletonInstance;
    }

    @Override
    public String toString() {
        return "SingletonClass{" +
                "state='" + state + '\'' +
                '}';
    }

    //setstate
    public void setState(String state) {
        this.state = state;
        writeToFile(this.state);
    }

    // Method to write content to a file
    public static void writeToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    //Method to read from file
    public String readFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. It might not exist yet.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        return content.toString();
    }

    /*
    public static void main(String[] args) {
        // Check if the file exists and read from it if it does
        File file = new File(FILE_NAME);
        if (file.exists()) {
            System.out.println("Reading from the config file:");
            String fileContent = readFromFile();
            System.out.println(fileContent);
        } else {
            System.out.println("File not found. Creating a new file.");
        }
    }*/
}
