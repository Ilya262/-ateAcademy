import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Student {
    public static void main(String[] args) throws IOException, InterruptedException {
        StudentJava();
        StudentJavaScript();
        StudentC();
        StudentPython();
        StudentJava2();
        StudentJava3();
        StudentJavaScript2();
        StudentJavaScript3();
        StudentC2();
        StudentC3();
        StudentPython2();
        StudentPython3();
        Vuxid ();
        StudentInfo();
    }

     static void StudentJava() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("Студент курсу Java");
        for (int i = 0; i < 12; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("Professor Юрій Нікулін");
        for (int i = 0; i < 12; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
 NameFirstName[0] = "Вася Остапюк Середній бал:";NameFirstName[1] = "Артур Дирда Середній бал:";NameFirstName[2] = "Стьопа Свідрук Середній бал:";
 NameFirstName[3] = "Тимофій Чорний Середній бал:";NameFirstName[4] = "Олег Добрий Середній бал:";NameFirstName[5] = "Оля Ковальчук Середній бал:";
NameFirstName[6] = "Рома Кужньова Середній бал:";NameFirstName[7] = "Діма Гаєвич Середній бал:";NameFirstName[8] = "Микола Старий Середній бал:";
NameFirstName[9] = "Таня Гаєвська Середній бал:";
//Масив сер балу
Bal[0] = 4;Bal[1] = 3.2;Bal[2] = 4.4;Bal[3] = 3.4;Bal[4] = 3.9;Bal[5] = 5;Bal[6] = 4.7;Bal[7] = 4;Bal[8] = 4.9;Bal[9] = 3.9;
// Масив порядкового номера в журналі
ID[0] = 1;ID[1] = 2;ID[2] = 3;ID[3] = 4;ID[4] = 5;ID[5] = 6;ID[6] = 7;ID[7] = 8;ID[8] = 9;ID[9] = 10;
        }
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 18; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
        System.out.println("Повернутись до вибору курсу натиснiть 1");
        System.out.println("Вийти в меню натисніть 2");
        int menu = Integer.parseInt(reader.readLine());
        if (menu == 1) {
            Professor.ForProfessor();
        } else if (menu == 2) {

            TestAcademy.Vxod();
        }
    }//Метод для класа професор з виведенням студентів Java по порядку

    static void StudentJava2() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("Студент курсу Java");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("Professor Юрій Нікулін");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
 NameFirstName[0] = "Вася Остапюк Середній бал:";NameFirstName[1] = "Артур Дирда Середній бал:";NameFirstName[2] = "Стьопа Свідрук Середній бал:";
NameFirstName[3] = "Тимофій Чорний Середній бал:";NameFirstName[4] = "Олег Добрий Середній бал:";NameFirstName[5] = "Оля Ковальчук Середній бал:";
NameFirstName[6] = "Рома Кужньова Середній бал:";NameFirstName[7] = "Діма Гаєвич Середній бал:";NameFirstName[8] = "Микола Старий Середній бал:";
NameFirstName[9] = "Таня Гаєвська Середній бал:";
//Масив сер балу
Bal[0] = 4;Bal[1] = 3.2;Bal[2] = 4.4;Bal[3] = 3.4;Bal[4] = 3.9;Bal[5] = 5;Bal[6] = 4.7;Bal[7] = 4;Bal[8] = 4.9;Bal[9] = 3.9;
        }
        for (int i = NameFirstName.length - 1; i >= 0; i--) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 18; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
        System.out.println("Повернутись до вибору курсу натиснiть 1");
        System.out.println("Вийти в меню натисніть 2");
        int menu = Integer.parseInt(reader.readLine());
        if (menu == 1) {

            Professor.ForProfessor();
        } else if (menu == 2) {
            Vuxid ();
        }
    }//Метод для класа професор з виведенням студентів Java по порядку з кінця

     static void StudentJava3() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("Студент курсу Java");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("Professor Юрій Нікулін");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();

        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
NameFirstName[0] = "Вася Остапюк Середній бал:";NameFirstName[1] = "Артур Дирда Середній бал:";NameFirstName[2] = "Стьопа Свідрук Середній бал:";
NameFirstName[3] = "Тимофій Чорний Середній бал:";NameFirstName[4] = "Олег Добрий Середній бал:";NameFirstName[5] = "Оля Ковальчук Середній бал:";
NameFirstName[6] = "Рома Кужньова Середній бал:";NameFirstName[7] = "Діма Гаєвич Середній бал:";NameFirstName[8] = "Микола Старий Середній бал:";
NameFirstName[9] = "Таня Гаєвська Середній бал:";
//Масив сер балу
Bal[0] = 4;Bal[1] = 3.2;Bal[2] = 4.4;Bal[3] = 3.4;Bal[4] = 3.9;Bal[5] = 5;Bal[6] = 4.7;Bal[7] = 4;Bal[8] = 4.9;Bal[9] = 3.9;
// Масив порядкового номера в журналі
ID[0] = 1;ID[1] = 2;ID[2] = 3;ID[3] = 4;ID[4] = 5;ID[5] = 6;ID[6] = 7;ID[7] = 8;ID[8] = 9;ID[9] = 10;
        }
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println("Викличте студента за номером в журналі " );
            int Id=Integer.parseInt(reader.readLine());
            switch (Id){
                case 1:
                    System.out.println( " " + NameFirstName[0] + " " + Bal[0]);
                    break;
                case 2:
                    System.out.println(  " " + NameFirstName[1] + " " + Bal[1]); break;
                case 3:
                    System.out.println( " " + NameFirstName[2] + " " + Bal[2]); break;
                case 4:
                    System.out.println( " " + NameFirstName[3] + " " + Bal[3]); break;
                case 5:
                    System.out.println( " " + NameFirstName[4] + " " + Bal[4]); break;
                case 6:
                    System.out.println(" " + NameFirstName[5] + " " + Bal[5]); break;
                case 7:
                    System.out.println( " " + NameFirstName[6] + " " + Bal[6]); break;
                case 8:
                    System.out.println( " " + NameFirstName[7] + " " + Bal[7]); break;
                case 9:
                    System.out.println( " " + NameFirstName[8] + " " + Bal[8]); break;
                case 10:
                    System.out.println( " " + NameFirstName[9] + " " + Bal[9]); break;
                default:
                    Vuxid1();
                    break;
            }
            System.out.println("");
            //Вивід масива в консоль
            System.out.println("Повернутись до вибору курсу натисніть 1");
            System.out.println("Вийти в меню натисніть 2");
            int menu = Integer.parseInt(reader.readLine());
            if(menu==1)
            {
                Professor professor = new Professor();
                Professor.ForProfessor();
            }
            else if(menu==2)
            {

                TestAcademy.Vxod();
            }}}//Метод для класа професор з дією вибора студента Java

  static void StudentJavaScript() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("Студент курсу Java Script");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("Professor Богдан Ступка");
        for (int i = 0; i < 21; i++) {
            System.out.print("*" + " ");
        }
        System.out.println(" ");
        //Староста групи
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив порядкового номера в журналі,масив імені та прізвища,масив сер.балу
// Масив порядкового номера в журналі2
 NameFirstName[0] = "Валерія Броварчук Середній бал:";NameFirstName[1] = " Тетяна Крамарчук Середній бал:";NameFirstName[2] = "Катерина Мірошниченко Середній бал:";
 NameFirstName[3] = "Тетяна Петренко Середній бал:";NameFirstName[4] = "Олена Броваренко Середній бал:";NameFirstName[5] = "Олег Захарчук  Середній бал:";
 NameFirstName[6] = "Bсеволод Сергієнко Середній бал:";NameFirstName[7] = "Надія Кравченко Середній бал:";NameFirstName[8] = "Артур Мишкевич Середній бал:";
 NameFirstName[9] = "Квітослава Гаєвська Середній бал:";
 Bal[0] = 3.7;Bal[1] = 3.1;Bal[2] = 5;Bal[3] = 4.9;Bal[4] = 4.9;Bal[5] = 5;Bal[6] = 4.8;Bal[7] = 5;Bal[8] = 3.4;Bal[9] = 3.9;
 ID[0] = 1;ID[1] = 2;ID[2] = 3;ID[3] = 4; ID[4] = 5; ID[5] = 6;ID[6] = 7;ID[7] = 8;ID[8] = 9; ID[9] = 10;
        }
            System.out.println();
            //Вивід масива в консоль
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 20; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
        System.out.println("Повернутись до вибору курсу натиснiть 1");
        System.out.println("Вийти в меню натисніть 2");
        int menu = Integer.parseInt(reader.readLine());
        if( menu==1){

            Professor.ForProfessor();
        }
        else if( menu==2){

            TestAcademy.Vxod();
        }
    }//Метод для класа професор з виведенням студентів Java Script по порядку

 static void StudentJavaScript2() throws IOException, InterruptedException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("Студент курсу Java Script");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("Professor Богдан Ступка");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
NameFirstName[0] = "Валерія Броварчук Середній бал:";NameFirstName[1] = " Тетяна Крамарчук Середній бал:";NameFirstName[2] = "Катерина Мірошниченко Середній бал:";
NameFirstName[3] = "Тетяна Петренко Середній бал:";NameFirstName[4] = "Олена Броваренко Середній бал:";NameFirstName[5] = "Олег Захарчук  Середній бал:";
NameFirstName[6] = "Bсеволод Сергієнко Середній бал:";NameFirstName[7] = "Надія Кравченко Середній бал:";NameFirstName[8] = "Артур Мишкевич Середній бал:";
NameFirstName[9] = "Квітослава Гаєвська Середній бал:";
Bal[0] = 3.7;Bal[1] = 3.1;Bal[2] = 5;Bal[3] = 4.9;Bal[4] = 4.9;Bal[5] = 5;Bal[6] = 4.8;Bal[7] = 5;Bal[8] = 3.4;Bal[9] = 3.9;
ID[0] = 1;ID[1] = 2;ID[2] = 3;ID[3] = 4; ID[4] = 5; ID[5] = 6;ID[6] = 7;ID[7] = 8;ID[8] = 9; ID[9] = 10;        }
        for (int i = NameFirstName.length - 1; i >= 0; i--) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 20; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
        System.out.println("Повернутись до вибору курсу натисныть 1");
        System.out.println("Вийти в меню натисніть 2");
        int menu = Integer.parseInt(reader.readLine());
        if (menu == 1) {
            Professor professor = new Professor();
            Professor.ForProfessor();
        } else if (menu == 2) Vuxid();
    } //Метод для класа професор з виведенням студентів Java Script по порядку з кінця

  static void StudentJavaScript3() throws IOException, InterruptedException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];

        System.out.println("Студент курсу Java Script");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("Professor Богдан Ступка");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
NameFirstName[0] = "Валерія Броварчук Середній бал:";NameFirstName[1] = " Тетяна Крамарчук Середній бал:";NameFirstName[2] = "Катерина Мірошниченко Середній бал:";
NameFirstName[3] = "Тетяна Петренко Середній бал:";NameFirstName[4] = "Олена Броваренко Середній бал:";NameFirstName[5] = "Олег Захарчук  Середній бал:";
NameFirstName[6] = "Bсеволод Сергієнко Середній бал:";NameFirstName[7] = "Надія Кравченко Середній бал:";NameFirstName[8] = "Артур Мишкевич Середній бал:";
NameFirstName[9] = "Квітослава Гаєвська Середній бал:";
Bal[0] = 3.7;Bal[1] = 3.1;Bal[2] = 5;Bal[3] = 4.9;Bal[4] = 4.9;Bal[5] = 5;Bal[6] = 4.8;Bal[7] = 5;Bal[8] = 3.4;Bal[9] = 3.9;
        }
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println("Викличте студента за номером в журналі " );
            int Id=Integer.parseInt(reader.readLine());
            switch (Id){
                case 1:
                    System.out.println( " " + NameFirstName[0] + " " + Bal[0]);
                    break;
                case 2:
                    System.out.println(  " " + NameFirstName[1] + " " + Bal[1]); break;
                case 3:
                    System.out.println( " " + NameFirstName[2] + " " + Bal[2]); break;
                case 4:
                    System.out.println( " " + NameFirstName[3] + " " + Bal[3]); break;
                case 5:
                    System.out.println( " " + NameFirstName[4] + " " + Bal[4]); break;
                case 6:
                    System.out.println(" " + NameFirstName[5] + " " + Bal[5]); break;
                case 7:
                    System.out.println( " " + NameFirstName[6] + " " + Bal[6]); break;
                case 8:
                    System.out.println( " " + NameFirstName[7] + " " + Bal[7]); break;
                case 9:
                    System.out.println( " " + NameFirstName[8] + " " + Bal[8]); break;
                case 10:
                    System.out.println( " " + NameFirstName[9] + " " + Bal[9]); break;
                default:
                    Vuxid1();
                    break;
            }
            System.out.println();
            //Вивід масива в консоль
            System.out.println("Повернутись до вибору курсу натисніть 1");
            System.out.println("Вийти в меню натисніть 2");
            int menu = Integer.parseInt(reader.readLine());
            if(menu==1)
            {
                Professor.ForProfessor();
            }
            else if(menu==2)
            {
                TestAcademy.Vxod();
            }}}//Метод для класа професор з дією вибора студента Java Script

 static void StudentC() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("Студенти курсу C");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("Professor Ростислав Болгар");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
NameFirstName[0] = "Володимир Мельниченко Середній бал:";NameFirstName[1] = "Йосип Шевчук Середній бал:";NameFirstName[2] = "Ірина Микитюк  Середній бал:";
NameFirstName[3] = "Роман Борис Середній бал:";NameFirstName[4] = "Костя Щербюк Середній бал:";NameFirstName[5] = "Ігор Мельник Середній бал:";
NameFirstName[6] = "Наталя Ковалюк  Середній бал:";NameFirstName[7] = "Діма Опришко Середній бал:";NameFirstName[8] = "Микола Грозний Середній бал:";
NameFirstName[9] = "Таня Широка Середній бал:";
Bal[0] = 5;Bal[1] = 3.9;Bal[2] = 4.6;Bal[3] = 3.4;Bal[4] = 3.9;Bal[5] = 4.4;Bal[6] = 4.7;Bal[7] = 3;Bal[8] = 3.2;Bal[9] = 3.9;
ID[0] = 1; ID[1] = 2;ID[2] = 3;ID[3] = 4;ID[4] = 5;ID[5] = 6; ID[6] = 7;ID[7] = 8;ID[8] = 9; ID[9] = 10;
        }
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 22; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
        System.out.println("Повернутись до вибору курсу натисныть 1");
        System.out.println("Вийти в меню натисніть 2");
        int menu = Integer.parseInt(reader.readLine());
        if( menu==1){

            Professor.ForProfessor();
        }
        else if( menu==2){

            TestAcademy.Vxod();
        }
    } //Метод для класа професор з виведенням студентів С по порядку

 static void StudentC2() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("Студенти курсу C");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("Professor Ростислав Болгар");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
NameFirstName[0] = "Володимир Мельниченко Середній бал:";NameFirstName[1] = "Йосип Шевчук Середній бал:";NameFirstName[2] = "Ірина Микитюк  Середній бал:";
NameFirstName[3] = "Роман Борис Середній бал:";NameFirstName[4] = "Костя Щербюк Середній бал:";NameFirstName[5] = "Ігор Мельник Середній бал:";
NameFirstName[6] = "Наталя Ковалюк  Середній бал:";NameFirstName[7] = "Діма Опришко Середній бал:";NameFirstName[8] = "Микола Грозний Середній бал:";
NameFirstName[9] = "Таня Широка Середній бал:";
Bal[0] = 5;Bal[1] = 3.9;Bal[2] = 4.6;Bal[3] = 3.4;Bal[4] = 3.9;Bal[5] = 4.4;Bal[6] = 4.7;Bal[7] = 3;Bal[8] = 3.2;Bal[9] = 3.9;
ID[0] = 1; ID[1] = 2;ID[2] = 3;ID[3] = 4;ID[4] = 5;ID[5] = 6; ID[6] = 7;ID[7] = 8;ID[8] = 9; ID[9] = 10;
        }
        for (int i = NameFirstName.length - 1; i >= 0; i--) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 22; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
        System.out.println("Повернутись до вибору курсу натиснiть 1");
        System.out.println("Вийти в меню натисніть 2");
        int menu = Integer.parseInt(reader.readLine());
        if( menu==1){

            Professor.ForProfessor();
        }
         else if (menu == 2) {
            Vuxid ();
        }
    } //Метод для класа професор з виведенням студентів С по порядку з кінця

 static void StudentC3() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println(" ");
        String[] NameFirstName = new String[10];

        double[] Bal = new double[10];
     System.out.println("Студенти курсу C");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("Professor Ростислав Болгар");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println();
     for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
NameFirstName[0] = "Володимир Мельниченко Середній бал:";NameFirstName[1] = "Йосип Шевчук Середній бал:";NameFirstName[2] = "Ірина Микитюк  Середній бал:";
NameFirstName[3] = "Роман Борис Середній бал:";NameFirstName[4] = "Костя Щербюк Середній бал:";NameFirstName[5] = "Ігор Мельник Середній бал:";
NameFirstName[6] = "Наталя Ковалюк  Середній бал:";NameFirstName[7] = "Діма Опришко Середній бал:";NameFirstName[8] = "Микола Грозний Середній бал:";
NameFirstName[9] = "Таня Широка Середній бал:";
Bal[0] = 5;Bal[1] = 3.9;Bal[2] = 4.6;Bal[3] = 3.4;Bal[4] = 3.9;Bal[5] = 4.4;Bal[6] = 4.7;Bal[7] = 3;Bal[8] = 3.2;Bal[9] = 3.9;
        }
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println("Викличте студента за номером в журналі " );
            int Id=Integer.parseInt(reader.readLine());
            switch (Id){
                case 1:
                    System.out.println( " " + NameFirstName[0] + " " + Bal[0]);
                    break;
                case 2:
                    System.out.println(  " " + NameFirstName[1] + " " + Bal[1]); break;
                case 3:
                    System.out.println( " " + NameFirstName[2] + " " + Bal[2]); break;
                case 4:
                    System.out.println( " " + NameFirstName[3] + " " + Bal[3]); break;
                case 5:
                    System.out.println( " " + NameFirstName[4] + " " + Bal[4]); break;
                case 6:
                    System.out.println(" " + NameFirstName[5] + " " + Bal[5]); break;
                case 7:
                    System.out.println( " " + NameFirstName[6] + " " + Bal[6]); break;
                case 8:
                    System.out.println( " " + NameFirstName[7] + " " + Bal[7]); break;
                case 9:
                    System.out.println( " " + NameFirstName[8] + " " + Bal[8]); break;
                case 10:
                    System.out.println( " " + NameFirstName[9] + " " + Bal[9]); break;
                default:
                    Vuxid1();
                    break;
            }
            System.out.println();
            //Вивід масива в консоль
            System.out.println("Повернутись до вибору курсу натисніть 1");
            System.out.println("Вийти в меню натисніть 2");
            int menu = Integer.parseInt(reader.readLine());
            if(menu==1)
            {

                Professor.ForProfessor();
            }
            else if(menu==2)
            {

                TestAcademy.Vxod();
            }}}//Метод для класа професор з дією вибора студента С

    static void StudentPython() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("Студенти курсу Python");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("Professor Валерій Корсак");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
 NameFirstName[0] = "Тарас Микитин Середній бал:";NameFirstName[1] = "Ілля Романів Середній бал:";NameFirstName[2] = "Ліля Настюк Середній бал:";
 NameFirstName[3] = "Ольга Дмитренко Середній бал:";NameFirstName[4] = "Лев Троцький Середній бал:";NameFirstName[5] = "Ольга Антоненко Середній бал:";
 NameFirstName[6] = "Вікторія Лисенко Середній бал:";NameFirstName[7] = "Надія Маєвич Середній бал:";NameFirstName[8] = "Руслан Лютий Середній бал:";
 NameFirstName[9] = "Віталій Кушнір Середній бал:";
 Bal[0] = 4.6;Bal[1] = 3.2;Bal[2] = 4;Bal[3] = 3.4;Bal[4] = 3.9;Bal[5] = 4;Bal[6] = 3.8;Bal[7] = 4;Bal[8] = 4.8;Bal[9] = 5;
 ID[0] = 1; ID[1] = 2;ID[2] = 3;ID[3] = 4;ID[4] = 5;ID[5] = 6; ID[6] = 7;ID[7] = 8;ID[8] = 9; ID[9] = 10;
        }
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 19; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
        System.out.println("Повернутись до вибору курсу натиснiть 1");
        System.out.println("Вийти в меню натисніть 2");
        int menu = Integer.parseInt(reader.readLine());
        if( menu==1){
            Professor.ForProfessor();
        }
        else if( menu==2){
            TestAcademy.Vxod();
        }
    }//Метод для класа професор з виведенням студентів Python по порядку

     static void StudentPython2() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
         int[] ID = new int[10];
        System.out.println("Студенти курсу Python");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("Professor Валерій Корсак");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
NameFirstName[0] = "Тарас Микитин Середній бал:";NameFirstName[1] = "Ілля Романів Середній бал:";NameFirstName[2] = "Ліля Настюк Середній бал:";
NameFirstName[3] = "Ольга Дмитренко Середній бал:";NameFirstName[4] = "Лев Троцький Середній бал:";NameFirstName[5] = "Ольга Антоненко Середній бал:";
NameFirstName[6] = "Вікторія Лисенко Середній бал:";NameFirstName[7] = "Надія Маєвич Середній бал:";NameFirstName[8] = "Руслан Лютий Середній бал:";
NameFirstName[9] = "Віталій Кушнір Середній бал:";
Bal[0] = 4.6;Bal[1] = 3.2;Bal[2] = 4;Bal[3] = 3.4;Bal[4] = 3.9;Bal[5] = 4;Bal[6] = 3.8;Bal[7] = 4;Bal[8] = 4.8;Bal[9] = 5;
        }
        for (int i = NameFirstName.length - 1; i >= 0; i--) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 19; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
        System.out.println("Повернутись до вибору курсу натиснiть 1");
        System.out.println("Вийти в меню натисніть 2");
        int menu = Integer.parseInt(reader.readLine());
        if (menu == 1) {
            Professor.ForProfessor();
        } else if (menu == 2) {
            Vuxid ();
        }
    }//Метод для класа професор з виведенням студентів Python по порядку з кінця

    static void StudentPython3() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println(" ");

        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        System.out.println("Студенти курсу Python");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("Professor Валерій Корсак");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
NameFirstName[0] = "Тарас Микитин Середній бал:";NameFirstName[1] = "Ілля Романів Середній бал:";NameFirstName[2] = "Ліля Настюк Середній бал:";
NameFirstName[3] = "Ольга Дмитренко Середній бал:";NameFirstName[4] = "Лев Троцький Середній бал:";NameFirstName[5] = "Ольга Антоненко Середній бал:";
NameFirstName[6] = "Вікторія Лисенко Середній бал:";NameFirstName[7] = "Надія Маєвич Середній бал:";NameFirstName[8] = "Руслан Лютий Середній бал:";
NameFirstName[9] = "Віталій Кушнір Середній бал:";
Bal[0] = 4.6;Bal[1] = 3.2;Bal[2] = 4;Bal[3] = 3.4;Bal[4] = 3.9;Bal[5] = 4;Bal[6] = 3.8;Bal[7] = 4;Bal[8] = 4.8;Bal[9] = 5;
        }
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println("Викличте студента за номером в журналі " );
            int Id=Integer.parseInt(reader.readLine());
            switch (Id){
                case 1:
                    System.out.println( " " + NameFirstName[0] + " " + Bal[0]);
                    break;
                case 2:
                    System.out.println(  " " + NameFirstName[1] + " " + Bal[1]); break;
                case 3:
                    System.out.println( " " + NameFirstName[2] + " " + Bal[2]); break;
                case 4:
                    System.out.println( " " + NameFirstName[3] + " " + Bal[3]); break;
                case 5:
                    System.out.println( " " + NameFirstName[4] + " " + Bal[4]); break;
                case 6:
                    System.out.println(" " + NameFirstName[5] + " " + Bal[5]); break;
                case 7:
                    System.out.println( " " + NameFirstName[6] + " " + Bal[6]); break;
                case 8:
                    System.out.println( " " + NameFirstName[7] + " " + Bal[7]); break;
                case 9:
                    System.out.println( " " + NameFirstName[8] + " " + Bal[8]); break;
                case 10:
                    System.out.println( " " + NameFirstName[9] + " " + Bal[9]); break;
                default:
                    Vuxid1();
                    break;
            }
            System.out.println();
            //Вивід масива в консоль
            System.out.println("Повернутись до вибору курсу натисніть 1");
            System.out.println("Вийти в меню натисніть 2");
            int menu = Integer.parseInt(reader.readLine());
            if(menu==1)
            {
                Professor.ForProfessor();
            }
            else if(menu==2)
            {

                TestAcademy.Vxod();
            }}}//Метод для класа професор з дією вибора студента Python

    private static void Vuxid1() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ви ввели не то значення");
        System.out.println("Натиснiть 1 щоб повернутись до списку Студентів");
        System.out.println("Натисніть 2 щоб повернутись у меню");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            Professor.ForProfessor();
        } else if (a == 2) {
            TestAcademy.Vxod();
}}//Метод виводить попередження про неіснуючу дію і пропонує варіанти дії

     private static void Vuxid() throws IOException, InterruptedException {

        TestAcademy.Vxod();
    }//Метод повертає в меню
    static void StudentInfo() throws IOException, InterruptedException {
        System.out.println("                          Hello Guest");
        for(int i =0;i<32;i++){
            System.out.print("*"+" ");
        }
        System.out.println(" ");
        System.out.println("                        Виберіть  курс");
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

               Group.Gues();
                break;
            case 2:
                Group.Gues1();
                break;
            case 3:
                Group.Gues2();
                break;
            case 4:
                Group.Gues3();
                break;
        }
    }//Кейс для сторінки "гостей",інформації про студентів
    }






