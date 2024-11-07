public class Address
{
    public final String country;
    public final String city;
    public final String street;
    public final String zipcode;

    public Address(String country, String city, String street, String zipcode)
    {
        this.country = country;
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    public String toString()
    {
        return country + " " + city + " " + street + " " + zipcode;
    }
}
