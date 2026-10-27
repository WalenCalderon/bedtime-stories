import java.io.FileReader; // Reads on the file without buffering
import java.io.BufferedReader;
import java.util.Locale;


/*----------------------------------------------------------------------------------------------------------------------|
* import java.io.*;
public class Program {
public static void main(String[] args) {
try {
// create a FileReader object connected to the File
FileReader fileReader = new FileReader("poem.txt");
// create a BufferedReader to manage input stream
BufferedReader bufReader = new BufferedReader(fileReader);
String input;
// read until there is no more data
while((input = bufReader.readLine()) != null) {
System.out.println(input);
}
// close the stream and release the resources
bufReader.close();
}
catch(IOException e) {
// display stack trace if there was an error
e.printStackTrace();
}
}
}-----------------------------------------------------------------------------------------------------------------------|*/


public class Main {
    public static void main(String[] args) {
        String fileName;
        do {
            fileName = Console.promptForString("What bed story for today? ");

            try {


                FileReader file = new FileReader("src/main/resources/" + fileName);
                BufferedReader br = new BufferedReader(file);
                String storie;
                int counter = 0 ;
                while ((storie = br.readLine()) != null){
                    counter++;
                    System.out.println(counter + "- " + storie);
                    Thread.sleep(300);
                }
                br.close();
                break;
            } catch (Exception e ) {
                System.out.println("Unable to find the reference file.");
            }

        }while(true);

    }


    //public static String bookReader(){}

}
