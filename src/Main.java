import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;
public class Main{
    public static void main(String[] args) throws Exception{
        try{
            FileReader fr = new FileReader("C:\\Users\\User\\IdeaProjects\\HW112\\src\\main\\java\\ocenki.txt");
            Scanner scan = new Scanner(fr);
            double sredn=0;
            int ocenka =0;
            int j = 0;
            System.out.println("Ученики, чья оценка меньше 3 баллов:");
            while(scan.hasNext()) {
                j++;
                String s1=scan.nextLine();
                ocenka=Integer.parseInt(s1.replaceAll("\\D",""));
                sredn+=ocenka;
                if(ocenka<3) {
                    System.out.println(s1);
                }}
            sredn/=j;
            fr.close();
            System.out.println("Средний балл по классу:"+sredn);
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}