import java.util.Random;

public class random 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();

        int num = rand.nextInt(6);
        System.out.println(num);
    }
}
