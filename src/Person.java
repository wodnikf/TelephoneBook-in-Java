public class Person extends TelephoneEntry
{
    private final String name;
    private final String surname;
    private final Address address;
    private final TelephoneNumber number;

    public Person(String name, String surname, Address address, TelephoneNumber number)
    {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.number = number;
    }

    @Override
    public String description()
    {
        return name + " " + surname + " " + address + " " + number;
    }
}
