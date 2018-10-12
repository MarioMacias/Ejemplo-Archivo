import javax.lang.model.util.ElementScanner6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        double total = 0;
	File entrada = new File("entrada.txt");
        Scanner escaner = new Scanner(entrada);
        while(escaner.hasNext()){
            //System.out.println(escaner.next());
            total += escaner.nextDouble();
        }
        System.out.println(total);
    }
}