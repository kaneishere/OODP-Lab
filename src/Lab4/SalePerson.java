package Lab4;

public class SalePerson implements Comparable {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        totalSales = 0;
    }

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    @Override
    public String toString() {
        return String.format("<%s> , <%s> : <%d>",lastName, firstName, totalSales);
    }

    @Override
    public int compareTo(Object o) {
        // we assume that Object o is of type SalePerson
        SalePerson salePerson = (SalePerson) o;

        if(totalSales>salePerson.getTotalSales()) return 1;

        else if(totalSales<salePerson.getTotalSales()) return -1;

        return salePerson.getLastName().compareTo(lastName);

    }

    public boolean equals(Object o) {
        if(o.getClass()!=SalePerson.class) {
            return false;
        }
        SalePerson salePerson = (SalePerson) o;
        if(firstName.equals(salePerson.firstName) && lastName.equals(salePerson.lastName))
            return true;

        return false;
    }
}
