import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Group {

public static void main(String[] args) throws IOException, InterruptedException {
        Java();
       JavaScript();
        C();
        Python();
        Vuxid();
        Gues();
        Gues1();
        Gues2();
        Gues3();
        Vxod1();
        //Виклик Методів
    }

static void Java() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("         Студенти курсу Java");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
            NameFirstName[0] = "Вася Остапюк Середній бал:";
            NameFirstName[1] = "Артур Дирда Середній бал:";
            NameFirstName[2] = "Стьопа Свідрук Середній бал:";
            NameFirstName[3] = "Тимофій Чорний Середній бал:";
            NameFirstName[4] = "Олег Добрий Середній бал:";
            NameFirstName[5] = "Оля Ковальчук Середній бал:";
            NameFirstName[6] = "Рома Кужньова Середній бал:";
            NameFirstName[7] = "Діма Гаєвич Середній бал:";
            NameFirstName[8] = "Микола Старий Середній бал:";
            NameFirstName[9] = "Таня Гаєвська Середній бал:";
//Масив сер балу
            Bal[0] = 4;
            Bal[1] = 3.2;
            Bal[2] = 4.4;
            Bal[3] = 3.4;
            Bal[4] = 3.9;
            Bal[5] = 5;
            Bal[6] = 4.7;
            Bal[7] = 4;
            Bal[8] = 4.9;
            Bal[9] = 3.9;
// Масив порядкового номера в журналі
            ID[0] = 1;
            ID[1] = 2;
            ID[2] = 3;
            ID[3] = 4;
            ID[4] = 5;
            ID[5] = 6;
            ID[6] = 7;
            ID[7] = 8;
            ID[8] = 9;
            ID[9] = 10;
        }
        System.out.println( "\n");
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 18; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
        System.out.println("Cтароста групи: " + NameFirstName[5] + " " + Bal[5]);
        System.out.println();
//Вибір нового старости
        System.out.println("Вибрати іншого старосту натисніть 1");
       System.out.println("************************************");
        System.out.println("Вийти в меню натисніть 2");
        int a;
        a = Integer.parseInt(reader.readLine());
        if (a == 2) {
            Vxod1();
        }
        if (a == 1) {
            System.out.println("Cтароста має бути відмінником");
            System.out.println("Вибрати іншого старосту по номеру в журналі:");

            int Starosta = Integer.parseInt(reader.readLine());
            switch (Starosta) {
                case 1:
                    if (Bal[0]==5){
                        System.out.println("Новий староста: " + " " + ID[0] + " " + NameFirstName[0] + " " + Bal[0]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int b = Integer.parseInt(reader.readLine());
                    if(b==1){
                        Java();
                    }
                    else if (b == 2) {
                        Vxod1();
                    }
                    break;
                case 2:
                    if (Bal[1]==5){
                        System.out.println("Новий староста: " + " " + ID[1] + " " + NameFirstName[1] + " " + Bal[1]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int c = Integer.parseInt(reader.readLine());
                    if(c==1){
                        Java();
                    }
                    else if (c == 2) {
                        Vxod1();
                    }
                    break;
                case 3:
                    if (Bal[2]==5){
                        System.out.println("Новий староста: " + " " + ID[2] + " " + NameFirstName[2] + " " + Bal[2]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int d = Integer.parseInt(reader.readLine());
                    if(d==1){
                        Java();
                    }
                    else if (d == 2) {
                        Vxod1();
                    }
                    break;
                case 4:
                    if (Bal[3]==5){
                        System.out.println("Новий староста: " + " " + ID[3] + " " + NameFirstName[3] + " " + Bal[3]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int f = Integer.parseInt(reader.readLine());
                    if(f==1){
                        Java();
                    }
                    else if (f == 2) {
                        Vxod1();
                    }
                    break;
                case 5:
                    if (Bal[4]==5){
                        System.out.println("Новий староста: " + " " + ID[4] + " " + NameFirstName[4] + " " + Bal[4]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int e= Integer.parseInt(reader.readLine());
                    if(e==1){
                        Java();
                    }
                    else if (e == 2) {
                        Vxod1();
                    }
                    break;
                case 6:
                    if (Bal[5]==5){
                        System.out.println("Новий староста: " + " " + ID[5] + " " + NameFirstName[5] + " " + Bal[5]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int w = Integer.parseInt(reader.readLine());
                    if(w==1){
                        Java();
                    }
                    else if (w == 2) {
                        Vxod1();
                    }
                    break;
                case 7:
                    if (Bal[6]==5){
                        System.out.println("Новий староста: " + " " + ID[6] + " " + NameFirstName[6] + " " + Bal[6]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int r = Integer.parseInt(reader.readLine());
                    if(r==1){
                        Java();
                    }
                    else if (r == 2) {
                        Vxod1();
                    }
                case 8:
                    if (Bal[7]==5){
                        System.out.println("Новий староста: " + " " + ID[7] + " " + NameFirstName[7] + " " + Bal[7]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int t = Integer.parseInt(reader.readLine());
                    if(t==1){
                        Java();
                    }
                    else if (t == 2) {
                        Vxod1();
                    }
                    break;
                case 9:
                    if (Bal[8]==5){
                        System.out.println("Новий староста: " + " " + ID[8] + " " + NameFirstName[8] + " " + Bal[8]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int u = Integer.parseInt(reader.readLine());
                    if(u==1){
                        Java();
                    }
                    else if (u == 2) {
                        Vxod1();
                    }
                    break;

                case 10:
                    if (Bal[9]==5){
                        System.out.println("Новий староста: " + " " + ID[9] + " " + NameFirstName[9] + " " + Bal[9]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int o = Integer.parseInt(reader.readLine());
                    if(o==1){
                        Java();
                    }
                    else if (o == 2) {
                        Vxod1();
                    }
                    break;
            }

        }
    }//Сторінка курсу Java-програмістів

static void JavaScript() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("         Студенти курсу JavaScript");
        for (int i = 0; i < 22; i++) {
            System.out.print("*" + " ");
        }
        System.out.println("\n");
        //Староста групи
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив порядкового номера в журналі,масив імені та прізвища,масив сер.балу
// Масив порядкового номера в журналі2
NameFirstName[0] = "Валерія Броварчук Середній бал:";NameFirstName[1] = " Тетяна Крамарчук Середній бал:";NameFirstName[2] = "Катерина Мірошниченко Середній бал:";
NameFirstName[3] = "Тетяна Петренко Середній бал:";NameFirstName[4] = "Олена Броваренко Середній бал:";NameFirstName[5] = "Олег Захарчук  Середній бал:";
NameFirstName[6] = "Bсеволод Сергієнко Середній бал:";NameFirstName[7] = "Надія Кравченко Середній бал:";NameFirstName[8] = "Артур Мишкевич Середній бал:";
NameFirstName[9] = "Квітослава Гаєвська Середній бал:";
Bal[0] = 3.7;Bal[1] = 3.1;Bal[2] = 5;Bal[3] = 4.9;Bal[4] = 4.9;Bal[5] = 5;Bal[6] = 4.8;Bal[7] = 5;Bal[8] = 3.4;Bal[9] = 3.9;
//Масив порядкового номеру
ID[0] = 1;ID[1] = 2;ID[2] = 3;ID[3] = 4;ID[4] = 5;ID[5] = 6;ID[6] = 7;ID[7] = 8;ID[8] = 9;ID[9] = 10;
        }
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 22; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
        System.out.println();
        System.out.println("Cтароста групи: " + NameFirstName[7] + " " + Bal[7]);
        System.out.println();
//Вибір нового старости
        System.out.println("Вибрати іншого старосту натисніть 1");
    System.out.println("************************************");
        System.out.println("Вийти в меню натисніть 2");
        int a;
        a = Integer.parseInt(reader.readLine());
        if (a == 2) {
            Vxod1();
        }
        if (a == 1) {
            System.out.println("Вибрати іншого старосту по номеру в журналі:");
            System.out.println("Cтароста має бути відмінником");
            int Starosta = Integer.parseInt(reader.readLine());
            switch (Starosta) {
                case 1:
                    if (Bal[0]==5){
                    System.out.println("Новий староста: " + " " + ID[0] + " " + NameFirstName[0] + " " + Bal[0]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int b = Integer.parseInt(reader.readLine());
                    if(b==1){
                        JavaScript();
                    }
                    else if (b == 2) {
                        Vxod1();

                    }
                    break;

                case 2:
                    if (Bal[1]==5){
                        System.out.println("Новий староста: " + " " + ID[1] + " " + NameFirstName[1] + " " + Bal[1]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int c = Integer.parseInt(reader.readLine());
                    if(c==1){
                        JavaScript();
                    }
                    else if (c == 2) {
                        Vxod1();
                    }
                    break;
                case 3:
                    if (Bal[2]==5){
                        System.out.println("Новий староста: " + " " + ID[2] + " " + NameFirstName[2] + " " + Bal[2]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int d = Integer.parseInt(reader.readLine());
                    if(d==1){
                        JavaScript();
                    }
                    else if (d == 2) {
                        Vxod1();
                    }
                    break;
                case 4:
                    if (Bal[3]==5){
                        System.out.println("Новий староста: " + " " + ID[3] + " " + NameFirstName[3] + " " + Bal[3]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int f = Integer.parseInt(reader.readLine());
                    if(f==1){
                        JavaScript();
                    }
                    else if (f == 2) {
                        Vxod1();
                    }
                case 5:
                    if (Bal[4]==5){
                        System.out.println("Новий староста: " + " " + ID[4] + " " + NameFirstName[4] + " " + Bal[4]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int e = Integer.parseInt(reader.readLine());
                    if(e==1){
                        JavaScript();
                    }
                    else if (e == 2) {
                        Vxod1();
                    }
                case 6:
                    if (Bal[5]==5){
                        System.out.println("Новий староста: " + " " + ID[5] + " " + NameFirstName[5] + " " + Bal[5]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int w = Integer.parseInt(reader.readLine());
                    if(w==1){
                        JavaScript();
                    }
                    else if (w == 2) {
                        Vxod1();
                    }
                    break;
                case 7:
                    if (Bal[6]==5){
                        System.out.println("Новий староста: " + " " + ID[6] + " " + NameFirstName[6] + " " + Bal[6]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int r = Integer.parseInt(reader.readLine());
                    if(r==1){
                        JavaScript();
                    }
                    else if (r == 2) {
                        Vxod1();
                    }
                    break;
                case 8:
                    if (Bal[7]==5){
                        System.out.println("Новий староста: " + " " + ID[7] + " " + NameFirstName[7] + " " + Bal[7]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int t = Integer.parseInt(reader.readLine());
                    if(t==1){
                        JavaScript();
                    }
                    else if (t == 2) {
                        Vxod1();
                    }
                    break;
                case 9:
                    if (Bal[8]==5){
                        System.out.println("Новий староста: " + " " + ID[8] + " " + NameFirstName[8] + " " + Bal[8]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int y = Integer.parseInt(reader.readLine());
                    if(y==1){
                        JavaScript();
                    }
                    else if (y == 2) {
                        Vxod1();
                    }
                    break;
                case 10:
                    if (Bal[9]==5){
                        System.out.println("Новий староста: " + " " + ID[9] + " " + NameFirstName[9] + " " + Bal[9]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int u = Integer.parseInt(reader.readLine());
                    if(u==1){
                        JavaScript();
                    }
                    else if (u == 2) {
                        Vxod1();
                    }
                    break;
            }
        }
    }//Сторінка курсу Java Script-програмістів

static void C() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("            Студенти курсу C");
        for (int i = 0; i < 22; i++) {
            System.out.print("*" + " ");
        }
        System.out.println("\n");
        //Староста групи
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив порядкового номера в журналі,масив імені та прізвища,масив сер.балу
// Масив порядкового номера в журналі2
NameFirstName[0] = "Володимир Мельниченко Середній бал:";NameFirstName[1] = "Йосип Шевчук Середній бал:";NameFirstName[2] = "Ірина Микитюк  Середній бал:";
NameFirstName[3] = "Роман Борис Середній бал:";NameFirstName[4] = "Костя Щербюк Середній бал:";NameFirstName[5] = "Ігор Мельник Середній бал:";
NameFirstName[6] = "Наталя Ковалюк  Середній бал:";NameFirstName[7] = "Діма Опришко Середній бал:";NameFirstName[8] = "Микола Грозний Середній бал:";
NameFirstName[9] = "Таня Широка Середній бал:";
Bal[0] = 5;Bal[1] = 3.9;Bal[2] = 4.6;Bal[3] = 3.4;Bal[4] = 3.9;Bal[5] = 4.4;Bal[6] = 4.7;Bal[7] = 3;Bal[8] = 3.2;Bal[9] = 3.9;
ID[0] = 1;ID[1] = 2;ID[2] = 3;ID[3] = 4;ID[4] = 5;ID[5] = 6;ID[6] = 7;ID[7] = 8;ID[8] = 9;ID[9] = 10;
        }
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 22; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
         System.out.println();
        System.out.println("Cтароста групи: " + NameFirstName[0] + " " + Bal[0]);
         System.out.println();
//Вибір нового старости
        System.out.println("Вибрати іншого старосту натисніть 1");
    System.out.println("************************************");
        System.out.println("Вийти в меню натисніть 2");
        int a;
        a = Integer.parseInt(reader.readLine());
        if (a == 2) {
            Vxod1();
        }
        if (a == 1) {
            System.out.println("Cтароста має бути відмінником");
            System.out.println("Вибрати іншого старосту по номеру в журналі:");
            int Starosta = Integer.parseInt(reader.readLine());
            switch (Starosta) {
                case 1:
                    if (Bal[0]==5){
                        System.out.println("Новий староста: " + " " + ID[0] + " " + NameFirstName[0] + " " + Bal[0]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int u = Integer.parseInt(reader.readLine());
                    if(u==1){
                        C();
                    }
                    else if (u == 2) {
                        Vxod1();}
                    break;
                case 2:
                    if (Bal[1]==5){
                        System.out.println("Новий староста: " + " " + ID[1] + " " + NameFirstName[1] + " " + Bal[1]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int i = Integer.parseInt(reader.readLine());
                    if(i==1){
                        C();
                    }
                    else if (i == 2) {
                        Vxod1();}
                    break;
                case 3:
                    if (Bal[2]==5){
                        System.out.println("Новий староста: " + " " + ID[2] + " " + NameFirstName[2] + " " + Bal[2]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int q = Integer.parseInt(reader.readLine());
                    if(q==1){
                        C();
                    }
                    else if (q == 2) {
                        Vxod1();}
                    break;
                case 4:
                    if (Bal[3]==5){
                        System.out.println("Новий староста: " + " " + ID[3] + " " + NameFirstName[3] + " " + Bal[3]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int w = Integer.parseInt(reader.readLine());
                    if(w==1){
                        C();
                    }
                    else if (w == 2) {
                        Vxod1();}
                    break;

                case 5:
                    if (Bal[4]==5){
                        System.out.println("Новий староста: " + " " + ID[4] + " " + NameFirstName[4] + " " + Bal[4]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int e = Integer.parseInt(reader.readLine());
                    if(e==1){
                        C();
                    }
                    else if (e == 2) {
                        Vxod1();}
                    break;
                case 6:
                    if (Bal[5]==5){
                        System.out.println("Новий староста: " + " " + ID[5] + " " + NameFirstName[5] + " " + Bal[5]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int r = Integer.parseInt(reader.readLine());
                    if(r==1){
                        C();
                    }
                    else if (r == 2) {
                        Vxod1();}
                    break;
                case 7:
                    if (Bal[6]==5){
                        System.out.println("Новий староста: " + " " + ID[6] + " " + NameFirstName[6] + " " + Bal[6]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int t = Integer.parseInt(reader.readLine());
                    if(t==1){
                        C();
                    }
                    else if (t == 2) {
                        Vxod1();}
                    break;
                case 8:
                    if (Bal[7]==5){
                        System.out.println("Новий староста: " + " " + ID[7] + " " + NameFirstName[7] + " " + Bal[7]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int o = Integer.parseInt(reader.readLine());
                    if(o==1){
                        C();
                    }
                    else if (o == 2) {
                        Vxod1();}
                    break;
                case 9:
                    if (Bal[8]==5){
                        System.out.println("Новий староста: " + " " + ID[8] + " " + NameFirstName[8] + " " + Bal[8]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int s = Integer.parseInt(reader.readLine());
                    if(s==1){
                        C();
                    }
                    else if (s == 2) {
                        Vxod1();}
                    break;
                case 10:
                    if (Bal[9]==5){
                        System.out.println("Новий староста: " + " " + ID[9] + " " + NameFirstName[9] + " " + Bal[9]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int b = Integer.parseInt(reader.readLine());
                    if(b==1){
                       C();
                    }
                    else if (b == 2) {
                        Vxod1();
                    }
                    break;

            }
        }  if (a != 1 && a != 2) {

            Group.Vuxid();
        }
    }//Сторінка курсу С-програмістів

static void Python() throws IOException, InterruptedException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println(" ");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("         Студенти курсу Python");
        for (int i = 0; i < 22; i++) {
            System.out.print("*" + " ");
        }
        System.out.println("\n");
        //Староста групи
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив порядкового номера в журналі,масив імені та прізвища,масив сер.балу
// Масив порядкового номера в журналі2
NameFirstName[0] = "Тарас Микитин Середній бал:";NameFirstName[1] = "Ілля Романів Середній бал:";NameFirstName[2] = "Ліля Настюк Середній бал:";
NameFirstName[3] = "Ольга Дмитренко Середній бал:";NameFirstName[4] = "Лев Троцький Середній бал:";NameFirstName[5] = "Ольга Антоненко Середній бал:";
NameFirstName[6] = "Вікторія Лисенко Середній бал:";NameFirstName[7] = "Надія Маєвич Середній бал:";NameFirstName[8] = "Руслан Лютий Середній бал:";
NameFirstName[9] = "Віталій Кушнір Середній бал:";
Bal[0] = 4.6;Bal[1] = 3.2;Bal[2] = 4;Bal[3] = 3.4;Bal[4] = 3.9;Bal[5] = 4;Bal[6] = 3.8;Bal[7] = 4;Bal[8] = 4.8;Bal[9] = 5;
ID[0] = 1;ID[1] = 2;ID[2] = 3;ID[3] = 4;ID[4] = 5;ID[5] = 6;ID[6] = 7;ID[7] = 8;ID[8] = 9;ID[9] = 10;
        }
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 20; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
        System.out.println();
        System.out.println("Cтароста групи: " + NameFirstName[9] + " " + Bal[9]);
      System.out.println();
//Вибір нового старости
        System.out.println("Вибрати іншого старосту натисніть 1");
    System.out.println("************************************");
        System.out.println("Вийти в меню натисніть 2");
        int a;
        a = Integer.parseInt(reader.readLine());
        if (a == 2) {
            Vxod1();
        }
        if (a == 1) {
            System.out.println("Cтароста має бути відмінником");
            System.out.println("Вибрати іншого старосту по номеру в журналі:");
            int Starosta = Integer.parseInt(reader.readLine());
            switch (Starosta) {
                case 1:
                    if (Bal[0]==5){
                        System.out.println("Новий староста: " + " " + ID[0] + " " + NameFirstName[0] + " " + Bal[0]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int b = Integer.parseInt(reader.readLine());
                    if(b==1){
                        Python();
                    }
                    else if (b == 2) {
                        Vxod1();
                    }
                    break;
                case 2:
                    if (Bal[1]==5){
                        System.out.println("Новий староста: " + " " + ID[1] + " " + NameFirstName[1] + " " + Bal[1]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int s = Integer.parseInt(reader.readLine());
                    if(s==1){
                        Python();
                    }
                    else if (s == 2) {
                        Vxod1();
                    }
                    break;
                case 3:
                    if (Bal[2]==5){
                        System.out.println("Новий староста: " + " " + ID[2] + " " + NameFirstName[2] + " " + Bal[2]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int f = Integer.parseInt(reader.readLine());
                    if(f==1){
                       Python();
                    }
                    else if (f == 2) {
                        Vxod1();
                    }
                    break;

                case 4:
                    if (Bal[3]==5){
                        System.out.println("Новий староста: " + " " + ID[3] + " " + NameFirstName[3] + " " + Bal[3]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int d = Integer.parseInt(reader.readLine());
                    if(d==1){
                        Python();
                    }
                    else if (d == 2) {
                        Vxod1();
                    }
                    break;
                case 5:
                    if (Bal[4]==5){
                        System.out.println("Новий староста: " + " " + ID[4] + " " + NameFirstName[4] + " " + Bal[4]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int g = Integer.parseInt(reader.readLine());
                    if(g==1){
                        Python();
                    }
                    else if (g == 2) {
                        Vxod1();
                    }
                    break;

                case 6:
                    if (Bal[5]==5){
                        System.out.println("Новий староста: " + " " + ID[5] + " " + NameFirstName[5] + " " + Bal[5]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int h = Integer.parseInt(reader.readLine());
                    if(h==1){
                        Python();
                    }
                    else if (h == 2) {
                        Vxod1();
                    }
                    break;
                case 7:
                    if (Bal[6]==5){
                        System.out.println("Новий староста: " + " " + ID[6] + " " + NameFirstName[6] + " " + Bal[6]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int j = Integer.parseInt(reader.readLine());
                    if(j==1){
                        Python();
                    }
                    else if (j == 2) {
                        Vxod1();
                    }
                    break;
                case 8:
                    if (Bal[7]==5){
                        System.out.println("Новий староста: " + " " + ID[7] + " " + NameFirstName[7] + " " + Bal[7]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int k = Integer.parseInt(reader.readLine());
                    if(k==1){
                        JavaScript();
                    }
                    else if (k == 2) {
                        Vxod1();
                    }
                    break;
                case 9:
                    if (Bal[8]==5){
                        System.out.println("Новий староста: " + " " + ID[8] + " " + NameFirstName[8] + " " + Bal[8]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int l = Integer.parseInt(reader.readLine());
                    if(l==1){
                        Python();
                    }
                    else if (l == 2) {
                        Vxod1();
                    }
                    break;
                case 10:
                    if (Bal[9]==5){
                        System.out.println("Новий староста: " + " " + ID[9] + " " + NameFirstName[9] + " " + Bal[9]);}
                    else{System.out.println("Cтароста має бути відмінником");
                    }
                    System.out.println();
                    System.out.println("Щоб переглянути список ще раз натисніть 1");
                    System.out.println("Щоб повернутись в меню натисніть 2");
                    int z = Integer.parseInt(reader.readLine());
                    if(z==1){
                        Python();
                    }
                    else if (z == 2) {
                        Vxod1();
                    }
                    break;
            }
        } if (a != 1 && a != 2) {

            Group.Vuxid();
        }
    }//Сторінка курсу Python-програмістів

private static void Vuxid() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ви ввели не то значення");
        System.out.println("Введіть ще раз");
        System.out.println("Натисныть 1 щоб повернутись до списку Студентів");
        System.out.println("Натисніть 2 щоб повернутись у меню");
        int a = Integer.parseInt(reader.readLine());

        if (a == 1) {
            Group.JavaScript();
        }if (a == 2) {
            TestAcademy.Vxod();
        }
    }//Метод виводить попередження про неіснуючу дію і пропонує варіанти дії

static void Perecluchka() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println("        Студенти курсу Java");
        for (int i = 0; i < 18; i++) System.out.print("*" + " ");
        System.out.println();
        System.out.println("Зробити перекличку натисніть 1/викликати студента ");
        System.out.println("Вийти в меню натисніть 2");
        int a;
        a = Integer.parseInt(reader.readLine());
        if (a == 2) {
            TestAcademy.Vxod();
        }
        if (a == 1) {
            System.out.println("Зробити перекличку натисніть 1");
            System.out.println("Зробити перекличку в зворотньому порядку натисніть 2 ");
            System.out.println("Викликати студента 3 ");
            int Perecluchka = Integer.parseInt(reader.readLine());
            switch (Perecluchka) {
                case 1:
                    Student.StudentJava();
                    break;
                case 2:
                    Student.StudentJava2();
                    break;
                case 3:

                    Student.StudentJava3();
            }
        }
    }//Вибір дій професора для сторінки Java-програмістів

static void Perecluchka1() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println("        Студенти курсу Java Script");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println("\n");
        System.out.println("Зробити перекличку натисніть 1/викликати студента ");
        System.out.println("Вийти в меню натисніть 2");
        int a;
        a = Integer.parseInt(reader.readLine());
        if (a == 2) {

            TestAcademy.Vxod();
        }
        if (a == 1) {
            System.out.println("Зробити перекличку натисніть 1");
            System.out.println("Зробити перекличку в зворотньому порядку натисніть 2 ");
            System.out.println("Викликати студента натисніть 3 ");
            int Perecluchka;
            Perecluchka = Integer.parseInt(reader.readLine());
            switch (Perecluchka) {
                case 1:

                    Student.StudentJavaScript();
                    break;
                case 2:

                    Student.StudentJavaScript2();
                    break;
                case 3:

                    Student.StudentJavaScript3();
            }
        }
    }//Вибір дій професора для сторінки Java Script-програмістів

static void Perecluchka2() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println("        Студенти курсу C");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println("\n");
        System.out.println("Зробити перекличку натисніть 1/викликати студента ");
        System.out.println("Вийти в меню натисніть 2");
        int a;
        a = Integer.parseInt(reader.readLine());
        if (a == 2) {

            TestAcademy.Vxod();
        }
        if (a == 1) {
            System.out.println("Зробити перекличку натисніть 1");
            System.out.println("Зробити перекличку в зворотньому порядку натисніть 2 ");
            System.out.println("Викликати студента 3 ");
            int Perecluchka;
            Perecluchka = Integer.parseInt(reader.readLine());
            switch (Perecluchka) {
                case 1:
                    Student.StudentC();
                    break;
                case 2:

                    Student.StudentC2();
                    break;
                case 3:
                    Student.StudentC3();
            }

            }
        }//Вибір дій професора для сторінки С

static void Perecluchka3() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println("        Студенти курсу Python");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println("\n");
        System.out.println("Зробити перекличку натисніть 1/викликати студента ");
        System.out.println("Вийти в меню натисніть 2");
        int a;
        a = Integer.parseInt(reader.readLine());
        if (a == 2) {
            TestAcademy.Vxod();
        } else if (a == 1) {
            System.out.println("Зробити перекличку натисніть 1");
            System.out.println("Зробити перекличку в зворотньому порядку натисніть 2 ");
            System.out.println("Викликати студента 3 ");
            int Perecluchka;
            Perecluchka = Integer.parseInt(reader.readLine());
            switch (Perecluchka) {
                case 1:

                    Student.StudentPython();
                    break;
                case 2:
                    Student.StudentPython2();
                    break;
                case 3:

                    Student.StudentPython3();
            }
        }
    }//Вибір дій професора для сторінки Python-програмістів

static void Gues() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("        Студенти курсу Java");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
    System.out.println("\n");
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


        System.out.println("Cередній бал групи");
       int sum=0;
        for (double v : Bal) {
            sum += v;
        }
        System.out.println(             sum/10);
        System.out.println();
        System.out.println("Професор групи Юрій Нікулін");
        System.out.println();
        System.out.println("Щоб переглянути список ще раз нажміть 1");
        System.out.println("Щоб вийти в меню натисніть 2");
        int Guest;
        Guest = Integer.parseInt(reader.readLine());
        if ( Guest  != 1 &&  Guest  != 2) {
            Vuxid();
        }
        switch (Guest) {
            case 1:
                Gues();
                break;
            case 2:
                TestAcademy.Vxod();
                break;
        }}//Сторінка з інформацією про Java-програмістів

static void Gues1() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n");
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("      Студенти курсу Java Script");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
NameFirstName[0] = "Валерія Броварчук Середній бал:";NameFirstName[1] = " Тетяна Крамарчук Середній бал:";NameFirstName[2] = "Катерина Мірошниченко Середній бал:";
NameFirstName[3] = "Тетяна Петренко Середній бал:";NameFirstName[4] = "Олена Броваренко Середній бал:";NameFirstName[5] = "Олег Захарчук  Середній бал:";
NameFirstName[6] = "Bсеволод Сергієнко Середній бал:";NameFirstName[7] = "Надія Кравченко Середній бал:";NameFirstName[8] = "Артур Мишкевич Середній бал:";
NameFirstName[9] = "Квітослава Гаєвська Середній бал:";
Bal[0] = 3.7;Bal[1] = 3.1;Bal[2] = 5;Bal[3] = 4.9;Bal[4] = 4.9;Bal[5] = 5;Bal[6] = 4.8;Bal[7] = 5;Bal[8] = 3.4;Bal[9] = 3.9;
//Масив порядкового номеру
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

        System.out.println("Cередній бал групи");
        double sum=0;
         for (double v : Bal) {
             sum += v;
         }
        System.out.println(sum/10);
        System.out.println();
        System.out.println("Професор групи Богдан Ступка");
        System.out.println();
        System.out.println("Щоб переглянути список ще раз нажміть 1");
        System.out.println("Щоб вийти в меню натисніть 2");
        int Guest;
        Guest = Integer.parseInt(reader.readLine());
        if ( Guest  != 1 &&  Guest  != 2) {
            Vuxid();
        }
        switch (Guest) {
            case 1:
                Gues();
                break;
            case 2:
                TestAcademy.Vxod();
                break;
        }}//Сторінка з інформацією про Java Script-програмістів

static void Gues2() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("        Студенти курсу С");
        for (int i = 0; i < 18; i++) {
            System.out.print("*" + " ");
        }
    System.out.println("\n");
        for (int i = 0; i < NameFirstName.length; i++) {
            // Масив імен та прізвищ
NameFirstName[0] = "Володимир Мельниченко Середній бал:";NameFirstName[1] = "Йосип Шевчук Середній бал:";NameFirstName[2] = "Ірина Микитюк  Середній бал:";
NameFirstName[3] = "Роман Борис Середній бал:";NameFirstName[4] = "Костя Щербюк Середній бал:";NameFirstName[5] = "Ігор Мельник Середній бал:";
NameFirstName[6] = "Наталя Ковалюк  Середній бал:";NameFirstName[7] = "Діма Опришко Середній бал:";NameFirstName[8] = "Микола Грозний Середній бал:";
NameFirstName[9] = "Таня Широка Середній бал:";
Bal[0] = 5;Bal[1] = 3.9;Bal[2] = 4.6;Bal[3] = 3.4;Bal[4] = 4;Bal[5] = 4.4;Bal[6] = 4.7;Bal[7] = 3;Bal[8] = 3.2;Bal[9] = 3.9;
ID[0] = 1;ID[1] = 2;ID[2] = 3;ID[3] = 4;ID[4] = 5;ID[5] = 6;ID[6] = 7;ID[7] = 8;ID[8] = 9;ID[9] = 10;        }
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 22; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }

    System.out.println("Cередній бал групи");
    double sum=0;
    for (double v : Bal) {
        sum += v;
    }
    System.out.println(sum/10);
    System.out.println();
        System.out.println("Професор групи Ростислав Болгар");
    System.out.println();
        System.out.println("Щоб переглянути список ще раз нажміть 1");
        System.out.println("Щоб вийти в меню натисніть 2");
        int Guest;
        Guest = Integer.parseInt(reader.readLine());
        if ( Guest  != 1 &&  Guest  != 2) {
            Vuxid();
        }
        switch (Guest) {
            case 1:
                Gues2();
                break;
            case 2:
                TestAcademy.Vxod();
                break;
        }}//Сторінка з С

static void Gues3() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        String[] NameFirstName = new String[10];
        double[] Bal = new double[10];
        int[] ID = new int[10];
        System.out.println("        Студенти курсу Python");
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
ID[0] = 1;ID[1] = 2;ID[2] = 3;ID[3] = 4;ID[4] = 5;ID[5] = 6;ID[6] = 7;ID[7] = 8;ID[8] = 9;ID[9] = 10;
        }
        for (int i = 0; i < NameFirstName.length; i++) {
            System.out.println(ID[i] + " " + NameFirstName[i] + " " + Bal[i]);
            for (int j = 0; j < 19; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            //Вивід масива в консоль
        }
    System.out.println("Cередній бал групи");
    double sum=0;
    for (double v : Bal) {
        sum += v;
    }
    System.out.println(sum/10);
    System.out.println();
        System.out.println("Професор групи Валерій Корсак");
    System.out.println();
        System.out.println("Щоб переглянути список ще раз нажміть 1");
        System.out.println("Щоб вийти в меню натисніть 2");
        int Guest;
        Guest = Integer.parseInt(reader.readLine());
        if ( Guest  != 1 &&  Guest  != 2) {
            Vuxid();
        }
        switch (Guest) {
            case 1:
                Gues3();
                break;
            case 2:
                TestAcademy.Vxod();
                break;
        }}//Сторінка з інформацією про Python-програмістів

private static void Vxod1() throws IOException, InterruptedException {
        TestAcademy.Vxod();}//Метод вихлду в меню
}






