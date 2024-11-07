public class TelephoneNumber implements Comparable<TelephoneNumber>
{
    private final String countryCode;
    private final String localNumber;


    public TelephoneNumber(String countryCode, String localNumber)
    {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    @Override
    public String toString()
    {
        return countryCode + " " + localNumber;
    }

    @Override
    public int compareTo(TelephoneNumber other)
    {
        if (this.countryCode.equals(other.countryCode))
        {
            return this.localNumber.compareTo(other.localNumber);
        }
        return this.countryCode.compareTo(other.countryCode);
    }
}
