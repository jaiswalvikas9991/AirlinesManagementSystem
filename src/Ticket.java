import java.util.Scanner;
import java.applet.Applet;
import java.awt.*;

public class Ticket extends Applet {
    protected int homeCity;
    protected int destinationCity;
    protected int classChoice;
    protected int numberOfAdults;
    protected int numberOfChildren;
    protected int numberOfInfant;
    protected float totalCost;
    Font font1, font2, font3;
    String[] cityArray = {"Mumbai", "New Delhi", "Kolkata", "Bangalore", "Pune", "Hyderabad", "Chennai", "Ahmedabad", "Visakhapatnam", "Surat", "Jaipur", "Kanpur", "Lucknow", "Nagpur", "Ghaziabad"};
    String[] classArray = {"FIRST", "BUSINESS", "ECONOMIC"};

    public void init() {
        Output one = new Output();
        this.homeCity = one.homeCity;
        this.destinationCity = one.destinationCity;
        this.classChoice = one.classChoice;
        this.numberOfAdults = one.numberOfAdults;
        this.numberOfChildren = one.numberOfChildren;
        this.numberOfInfant = one.numberOfInfant;
        this.totalCost = one.totalCost;
        font1 = new Font("Elephant", Font.ITALIC, 28);
        font2 = new Font("", Font.ITALIC, 18);

    }

    public void paint(Graphics g) {
        if (this.numberOfChildren == 0 && this.numberOfAdults == 0 || this.classChoice > 3 || this.classChoice < 1 || this.homeCity == this.destinationCity) {
            resize(600, 300);
            setBackground(Color.DARK_GRAY);
            g.setColor(Color.red);
            g.setFont(font1);
            g.drawString("JET AIRWAYS", 200, 30);
            g.setColor(Color.CYAN);
            g.drawString("BOOKING FAILED", 100, 110);
        } else {
            resize(600, 300);
            setBackground(Color.DARK_GRAY);
            g.setColor(Color.red);
            g.setFont(font1);
            g.drawString("JET AIRWAYS", 200, 30);
            g.setColor(Color.CYAN);
            g.setFont(font2);
            g.drawString("YOUR FLIGHT FROM " + this.cityArray[this.homeCity - 1] + " TO " + this.cityArray[this.destinationCity - 1], 100, 110);
            g.drawString(" HAS BEEN SUCCESSFULLY BOOKED", 100, 130);
            g.drawString("CLASS : " + this.classArray[this.classChoice - 1], 100, 190);
            g.drawString("NUMBER OF ADULTS ARE : " + this.numberOfAdults, 100, 210);
            g.drawString("NUMBER OF CHILDREN ARE : " + this.numberOfChildren, 100, 230);
            g.drawString("NUMBER OF INFANTS ARE : " + this.numberOfInfant, 100, 250);
            g.drawString("TOTAL FAIR FOR THE JOURNEY IS : " + this.totalCost + " RUPEES", 100, 270);
        }

    }

}
/* <applet code = "Ticket.class" width = 300 height = 300>
</applet>
 */
