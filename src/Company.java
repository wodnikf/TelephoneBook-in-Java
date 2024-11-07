public class Company extends TelephoneEntry
{
    private final String name;
    private final Address address;
    private final TelephoneNumber number;

    public Company(String name, Address address, TelephoneNumber number)
    {
        this.name = name;
        this.address = address;
        this.number = number;
    }


    @Override
    public String description()
    {
        return name + " " + address + " "  + number;
    }
}
