import utility.Person;
import utility.Date;

public class Test
{
    public static void main(String[] args)
    {
        Person p = new Person(22);
        Date d = new Date(12,10,2004);

        System.out.println(p.display());
        System.out.println(d.display());
    }
}