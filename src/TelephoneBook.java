import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TelephoneBook
{

    public TreeMap<TelephoneNumber, TelephoneEntry> telephoneBook = new TreeMap<>();

    public void addPerson(String name, String surname, Address address, TelephoneNumber number)
    {
        Person person = new Person(name, surname, address, number);
        this.telephoneBook.put(number, person);
    }

    public void addCompany(String name, Address address, TelephoneNumber number)
    {
        Company company = new Company(name, address, number);
        this.telephoneBook.put(number, company);
    }

    public void printTelephoneBook()
    {
        Iterator<Map.Entry<TelephoneNumber, TelephoneEntry>> iterator = this.telephoneBook.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<TelephoneNumber, TelephoneEntry> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue().description());
        }
    }

    public static void main(String[] args)
    {
        TelephoneBook telephoneBook = new TelephoneBook();

        Address address1 = new Address("Poland", "Lodz", "Aleje", "12345");
        TelephoneNumber telephoneNumber1 = new TelephoneNumber("+48", "295555432");
        telephoneBook.addPerson("Krzysztof", "Klos", address1, telephoneNumber1);

        Address address2 = new Address("Canada", "Toronto", "Bloor Street", "64721");
        TelephoneNumber telephoneNumber2 = new TelephoneNumber("+1", "4165555678");
        telephoneBook.addPerson("Adam", "Nowak", address2, telephoneNumber2);

        Address address3 = new Address("United Kingdom", "London", "Baker Street", "14163");
        TelephoneNumber telephoneNumber3 = new TelephoneNumber("+44", "2075557890");
        telephoneBook.addCompany("Rossmann", address3, telephoneNumber3);

        Address address4 = new Address("United States", "New York", "5th Avenue", "10001");
        TelephoneNumber telephoneNumber4 = new TelephoneNumber("+1", "2125551234");
        telephoneBook.addCompany("Microsoft", address4, telephoneNumber4);

        telephoneBook.printTelephoneBook();
    }
}