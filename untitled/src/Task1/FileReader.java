package Task1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    public FileReader( String fileToRead ) {
    }

    public static ArrayList <String> FileReader( String fileToRead ) throws FileNotFoundException {
        File file = new File ( fileToRead );
        ArrayList <String> students = new ArrayList <String> ();
        Scanner in = new Scanner ( file );
        while (in.hasNextLine ()) {
            students.add ( in.nextLine () );
        }
        in.close ();

        return students;
    }
}



