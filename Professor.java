import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Professor {
    public static void main(String[] args) throws IOException, InterruptedException {
        ForProfessor();

        Group.Perecluchka();
       Vuxid1();

        Group.Perecluchka1();

        Group.Perecluchka2();

        Group.Perecluchka3();
    }
     static void ForProfessor() throws IOException, InterruptedException {
        System.out.println("                          Hello Professor");
        for(int i =0;i<32;i++){
            System.out.print("*"+" ");
        }
        System.out.println(" ");
        System.out.println("Виберіть  курс");
        System.out.println("1.Java");
        System.out.println("*"+"*"+"*"+"*"+"*"+"*");
        System.out.println("2.JavaScript");
        System.out.println("*"+"*"+"*"+"*"+"*"+"*"+"*"+"*"+"*"+"*"+"*"+"*");
        System.out.println("3.C");
        System.out.println("*"+"*"+"*");
        System.out.println("4.Python");
        System.out.println("*"+"*"+"*"+"*"+"*"+"*"+"*"+"*");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Course = Integer.parseInt(reader.readLine());
        switch(Course){
            case 1:

                Group.Perecluchka();
                break;
            case 2:

                Group.Perecluchka1();
                break;
            case 3:

                Group.Perecluchka2();
                break;
            case 4:

                Group.Perecluchka3();
                break;
        }
    }//Сторінка для професорів

    private static void Vuxid1() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ви ввели не то значення");
        System.out.println("Натисныть 1 щоб повернутись до списку Студентів");
        System.out.println("Натисніть 2 щоб повернутись у меню");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            Professor.ForProfessor();
        } else if (a == 2) {
            TestAcademy.Vxod();
        }}//Метод виводить попередження про неіснуючу дію і пропонує варіанти дії
 }

