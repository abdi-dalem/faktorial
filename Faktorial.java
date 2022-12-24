import java.util.Scanner;

public class Faktorial
{
    private int num;

    public static void main(String[] args)
    {
        Faktorial Fact = new Faktorial();
        Scanner number = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int num = number.nextInt();

        Fact.getNumber(num);
        Fact.Factorial();

        number.close();
    }

    public void getNumber (int num)
    {
        this.num = num;
    }

    public int Factorial()
    {
        int fact = 1;
        for (int i = 1; i <= this.num; i++)
        {
            fact = fact * i;
        }
        System.out.println(this.num + "! = " + fact);
        return fact;
    }
}
