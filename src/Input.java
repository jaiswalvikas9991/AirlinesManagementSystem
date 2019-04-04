import java.util.Scanner;

public class Input {
    public int homeCity;
    public int destinationCity;
    public int classChoice;
    public int numberOfAdults;
    public int numberOfChildren;
    public int numberOfInfant;
    Scanner newScanner = new Scanner(System.in);

    protected Input() {
        getInput();
    }

    int getInput() {
        System.out.println(" ENTER THE CHOICE OF HOME CITY FROM THE FOLLOWING CITIES");
        this.supportedCities();
        this.homeCity = newScanner.nextInt();
        System.out.println(" ENTER THE CHOICE OF DESTINATION CITY FROM THE FOLLOWING CITIES");
        this.supportedCities();
        this.destinationCity = newScanner.nextInt();
        if (this.homeCity == this.destinationCity)
            return 0;
        System.out.println(" ENTER THE NUMBER OF ADULTS( ABOVE AGE OF 12)");
        this.numberOfAdults = newScanner.nextInt();
        System.out.println(" ENTER THE NUMBER OF CHILDREN( BETWEEN AGE OF 2 TO 12)");
        this.numberOfChildren = newScanner.nextInt();
        System.out.println(" ENTER THE NUMBER OF INFANTS( UNDER THE AGE OF 2)");
        this.numberOfInfant = newScanner.nextInt();
        if (this.numberOfAdults == 0 && this.numberOfChildren == 0 && this.numberOfInfant == 0)
            return 0;
        System.out.println(" ENTER THE CLASS\n1.FIRST CLASS\n2.BUSINESS\n3.ECONOMIC\n");
        this.classChoice = newScanner.nextInt();
        return 1;
    }

    void supportedCities() {
        System.out.println("1.Mumbai\n2.New Delhi\n3.Kolkata\n4.Bangalore\n5.Pune\n6.Hyderabad\n7.Chennai\n8.Ahmedabad\n9.Visakhapatnam\n10.Surat\n11.Jaipur\n12.Kanpur\n13.Lucknow \n14.Nagpur\n15.Ghaziabad \n");
    }
}