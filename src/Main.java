import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    int a = 3; //задача1
    int b = 2;
    System.out.println(a+b);


    //задача 2
    int c = 5;
    int d = 7;
    boolean e = c <= d;
    System.out.println(e);

    int q = -7;
    int w = -12;
    boolean r = q <= w;
    System.out.println(r);

    int t = -7;
    int y = -12;
    boolean u = t >= y;
    System.out.println(u);

    int s = 13;
    int f = 13;
    boolean n = s == f;
    System.out.println(n);

    //Гарри и Ларри 4 7  6 3
    int bb = 10; //общее кол-во банок
    int gr = 4; //гарри
    int lr = 7; //ларри
    System.out.println(bb - gr); //на выходе 6
    System.out.println(bb-lr); //на выходе 3

    //bmi = weight / height^2

    Scanner scanner = new Scanner(System.in);
    int weight = scanner.nextInt();
    System.out.println("weight=" + weight);
    //scanner.nextLine();
    Scanner scanner12 = new Scanner(System.in);
    int hight1 = scanner.nextInt();
    System.out.println("hight=" + Math.pow(hight1, 2));
    int bmi = hight1 / weight;
    System.out.println("bmi=" + bmi);
    if (bmi <= 18.5); {
       System.out.println("недовес");
    }
    if (bmi <= 25.0);{
        System.out.println("все в норме");
    }
    if (bmi <= 30.0); {
        System.out.println("Лишний вес");
   }
    if (bmi > 30);
        System.out.println("ожирение");

    }


        }






