import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Course {
    public static void main(String[] args) throws IOException, InterruptedException {
        Course1();
        Lessons();
    }
     static void Course1() throws IOException, InterruptedException {
System.out.println("                   Hello Student \n"+
        "Порада дня \n"+
        "Учітесь, читайте, І чужому научайтесь, Й свого не цурайтесь.");
        for(int i =0;i<32;i++){
            System.out.print("*"+" ");
        }
        System.out.println();
        System.out.println("Виберіть свій курс\n"+
         "******************\n"+
        "1.Java \n"+
        "******\n"+
       "2.JavaScript \n"+
        "************\n"+
        "3.C\n"+
        "***\n"+
        "4.Python\n"+
        "********\n");
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Course = Integer.parseInt(reader.readLine());
        switch(Course){
            case 1:
                Group.Java();
                break;
            case 2:
                Group.JavaScript();
                break;
            case 3:
                Group.C();
                break;
            case 4:

                Group.Python();
                break;
        }
    }//Кейс вибору для сторінки студентів
   static void Lessons() throws IOException, InterruptedException {

        System.out.println("Hello Applicant");
        for(int i =0;i<32;i++){
            System.out.print("*"+" ");
        }
        System.out.println("");
        System.out.println("Вибери курс на якому бажаєш вчитись\n"+
                "******************\n"+
                "1.Java \n"+
                "******\n"+
                "2.JavaScript \n"+
                "************\n"+
                "3.C\n"+
                "***\n"+
                "4.Python\n"+
                "********\n");
        String java ="Java";
        String javaScript ="JavaScript";
        String c ="C";
        String python ="Python";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Course = Integer.parseInt(reader.readLine());
        switch(Course){
            case 1:
                Lessons lessons =new Lessons();
                Lessons.Info();
                break;
            case 2: System.out.println(javaScript);
                Lessons lessons1 =new Lessons();
                Lessons.Info();
                break;
            case 3: System.out.println(c);
                Lessons lessons2 =new Lessons();
                Lessons.Info();
                break;
            case 4: System.out.println(python);
                Lessons lessons3 =new Lessons();
                Lessons.Info();
                break;
        }
    }//Кейс виблору для вступника



    }
