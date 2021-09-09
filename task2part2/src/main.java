import java.util.ArrayList;
import java.util.Scanner;
public class main
{



    public static void main(String[] args)
    {
        ArrayList<Person> person_info = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("enter no. of persons");
        int no_persons = scn.nextInt();

        for(int i = 0 ; i < no_persons ; i ++)
        {
        System.out.println("enter age then name of the person");
        int a = scn.nextInt();
        String n = scn.next();
        if (a == -1)
        {
            break;
        }

        person_info.add(new Person(n,a));
        }
        for (Person p1 : person_info)
        {
            System.out.println(p1.getName() + " , "+ p1.getAge());
        }

    }

}
