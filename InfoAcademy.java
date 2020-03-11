
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InfoAcademy {
    public static void main(String[] args) throws IOException, InterruptedException {
        InfoAcademy.Info();
        InfoAcademy.Vuxid();//Виклик методів
    }
     static void Info() throws IOException, InterruptedException {


         System.out.println("Заявка");//Форма заявки на вступ в академію
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//Введення з клавіатури
            System.out.println("Введіть Ім'я -");
           String Name = reader.readLine();//Введення з клавіатури Ім'я
            System.out.println("Введіть Прізвище -");
         String LastName = reader.readLine();//Введення з клавіатури Прізвища
            System.out.println("Введіть По батькові -");
         String   Surname = reader.readLine();//Введення з клавіатури по батькові
            System.out.println("Введіть скільки вам років -");
         int Age = Integer.parseInt(reader.readLine());//Введення з клавіатури кіькість років
            System.out.println("Введіть номер телефону -");
           int Phone = Integer.parseInt(reader.readLine());//Введення з клавіатури номер телефону
            System.out.println("Введіть E-mail -");
         //Оголощення змінних
         char E_mail = (char) reader.read();//Введення з клавіатури E-mail
         System.out.println("Курс на якому бажаєте вчитись -");
         String   Course = reader.readLine();//Введення з клавіатури курсу на якому бажають вчитись
            System.out.println("Розкажіть про себе і свої навички в цій галузі -");
         String  AboutMe = reader.readLine();//Введення з клавіатури інформації про вступника
            InfoAcademy. Vuxid();
        }
        static void Vuxid() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Натисніть 1 щоб відправити заявку і повернутись в меню");
            int a = Integer.parseInt(reader.readLine());
            if (a == 1) {
                TestAcademy.Vxod();
            } else {
                System.out.println("Ви ввели не то значення"+" "+"Введіть ще раз");
                for(int i=0;i<20;i++){
                    System.out.print("*"+" ");}
        System.out.println();
        InfoAcademy. Vuxid();}
    }//Повернення в меню
        }