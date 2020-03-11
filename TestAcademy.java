import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class TestAcademy {
    public static void main(String[] args) throws IOException, InterruptedException {
        TestAcademy.Welcome();
        TestAcademy.Vxod();
        TestAcademy.Case();
        Professor.ForProfessor();//Виклик методів
    }
    private static void Welcome() {
        for (int i = 0; i < 23; i++) {
            System.out.print("*" + " ");
        }
        for (int j = 0; j < 1; j++) {
            System.out.println(" ");
            System.out.format("*----------Welcome to Mate Academy----------*%n");
            System.out.println("*-------------------------------------------*");
        }
        for (int x = 0; x < 23; x++) System.out.print("*" + " ");
        System.out.println();
    }//Сторінка з привітанням
    static void Vxod() throws IOException, InterruptedException {
        System.out.println("1.Інформація про Mate Academy");
        System.out.println("2.Для студентів");
        System.out.println("3.Інформація про студентів");
        System.out.println("4.Для професорів");
        System.out.println("5.Обрати курс навчання");
        System.out.println("6.Про завдання");
        System.out.println("7.Інструкція завдання");
        System.out.println("8.Exit");
        TestAcademy.Case();
    }//Меню
    private static void Case() throws IOException, InterruptedException {
String q=("                             Навчаємо програмувати безкоштовно поки ти не знайдеш роботу!");
String w =("                 Наша ціль-допомогти тобі розпочати кар'єру в ІТ та сприйняти її подальшому розвитку." );
String e =("Саме тому ми створили курси програмування,метою яких є працевлаштування.Навчання безкоштовне,оплата після успішного працевлаштування ");
String r =("                                              Як розпочати навчання?  ");
String t =("                                            Натисни 1 щоб Подати заявку ");
String y =("                                           Натисни 2 щоб поверутись назад ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введіть число-");
        int menu = Integer.parseInt(reader.readLine());
       /*Оператор керує вибором дій*/ switch (menu) {
            case 1:
                System.out.println(q);
                System.out.println(w);
                System.out.println(e);
                System.out.println(r);
                System.out.println(t);
                System.out.println(y);
                int Info = Integer.parseInt(reader.readLine());
                switch (Info) {
                    case 1:

                        InfoAcademy.Info();
                    case 2:
                        TestAcademy.Vxod();
                        break;
                }
            case 2:

                Course.Course1();
                break;
            case 3:
                Student.StudentInfo();
                break;
            case 4:

                Professor.ForProfessor();
                break;
            case 5:
                Lessons.Info();
                break;
            case 6:
                Instruction.ZavdaniaInfo();
                break;
            case 7:
                Instruction.Info();
                break;
            case 8:System.out.println("            Автор Івасик Ілля-тест в Mate Academy 2019©");
                System.exit(0);
        }
    }//Вибір дій в меню


}