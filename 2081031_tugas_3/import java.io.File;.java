import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile{
    public static void main(Strings[] args){
        try{
            File bacaFile = new File("unai.txt"); //membuka file unai.txt
            Scanner bacaInput = new Scanner(bacaFile);
            while(bacaInput.hasNextLine()){
                String teks = bacaInput.nextLine();
                System.out.println(teks);
            }
            bacaInput.close();
        } catch (FileNotFoundException file) {
            System.out.println("Terjadi kesalahan dalam Program. File tidak ditemukan.");
            e.printStackTrace();
        }
    }
}