import java.util.Scanner;

public class Matcher extends Input {
    public float adultCost;
    public float childrenCost;
    public int classCost;

    final private String[] cityArray = {"M", "ND", "K", "B", "P", "H", "C", "A", "V", "S", "J", "K", "L", "N", "G"};

    protected Matcher() {

        super();

        switch (this.checkStringMaker()) {
            //SWITCH CASES FOR 1.MUMBAI

            case "M12":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "M13":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "M14":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "M15":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "M16":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "M17":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "M18":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "M19":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "M110":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "M111":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "M112":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "M113":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "M114":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "M115":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

            //SWITCH CASES FOR 2.NEW DELHI

            case "ND21":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "ND23":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "ND24":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "ND25":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "ND26":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "ND27":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "ND28":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "ND29":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "ND210":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "ND211":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "ND212":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "ND213":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "ND214":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "ND215":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;


            //SWITCH CASES FOR 3. KOLKATA

            case "K32":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "K31":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "K34":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "K35":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "K36":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "K37":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "K38":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "K39":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "K310":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "K311":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "K312":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "K313":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "K314":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "K315":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

            //SWITCH CASES FOR 4.BANGLORE

            case "B42":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "B43":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "B41":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "B45":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "B46":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "B47":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "B48":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "B49":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "B410":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "B411":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "B412":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "B413":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "B414":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "B415":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

//SWITCH CASES FOR 5.PUNE

            case "P52":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "P53":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "P54":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "P51":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "P56":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "P57":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "P58":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "P59":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "P510":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "P511":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "P512":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "P513":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "P514":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "P515":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

//SWITCH CASES FOR 6. HYDERABAD

            case "H62":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "H63":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "H64":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "H65":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "H61":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "H67":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "H68":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "H69":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "H610":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "H611":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "H612":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "H613":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "H614":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "H615":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

//SWITCH CASES FOR 7.CHENNAI

            case "C72":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "C73":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "C74":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "C75":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "C76":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "C71":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "C78":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "C79":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "C710":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "C711":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "C712":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "C713":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "C714":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "C715":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

//SWITCH CASES FOR 8. AHMEDABAD

            case "A82":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "A83":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "A84":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "A85":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "A86":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "A87":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "A81":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "A89":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "A810":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "A811":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "A812":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "A813":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "A814":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "A815":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

//SWITCH CASES FOR 9. VISHAKAPATNAM

            case "V92":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "V93":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "V94":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "V95":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "V96":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "V97":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "V98":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "V91":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "V910":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "V911":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "V912":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "V913":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "V914":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "V915":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

//SWITCH CASES FOR 10. SURAT

            case "S102":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "S103":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "S104":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "S105":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "S106":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "S107":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "S108":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "S109":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "S101":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "S1011":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "S1012":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "S1013":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "S1014":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "S1015":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

//SWITCH CASES FOR 11. JAIPUR

            case "J112":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "J113":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "J114":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "J115":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "J116":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "J117":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "J118":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "J119":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "J1110":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "J111":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "J1112":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "J1113":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "J1114":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "J1115":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

//SWITCH CASES FOR 12. KANPUR

            case "K122":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "K123":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "K124":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "K125":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "K126":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "K127":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "K128":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "K129":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "K1210":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "K1211":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "K121":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "K1213":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "K1214":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "K1215":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

//SWITCH CASES FOR 13. LAKHNOW

            case "L132":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "L133":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "L134":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "L135":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "L136":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "L137":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "L138":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "L139":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "L1310":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "L1311":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "L1312":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "L131":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "L1314":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "L1315":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

//SWITCH CASES FOR 14. NAGPURE

            case "N142":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "N143":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "N144":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "N145":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "N146":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "N147":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "N148":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "N149":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "N1410":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "N1411":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "N1412":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "N1413":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "N141":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "N1415":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;

//SWITCH CASES FOR 15. GHAZIBAD

            case "G152":
                adultCost = 2712f;
                childrenCost = 2000f;
                break;
            case "G153":
                adultCost = 3081f;
                childrenCost = 2500f;
                break;
            case "G154":
                adultCost = 3080f;
                childrenCost = 2580f;
                break;
            case "G155":
                adultCost = 2000f;
                childrenCost = 1500f;
                break;
            case "G156":
                adultCost = 2500f;
                childrenCost = 2000f;
                break;
            case "G157":
                adultCost = 2599f;
                childrenCost = 2100f;
                break;
            case "G158":
                adultCost = 2672f;
                childrenCost = 2200f;
                break;
            case "G159":
                adultCost = 3500f;
                childrenCost = 2900f;
                break;
            case "G1510":
                adultCost = 1900f;
                childrenCost = 1500f;
                break;
            case "G1511":
                adultCost = 3307f;
                childrenCost = 2800f;
                break;
            case "G1512":
                adultCost = 3699f;
                childrenCost = 3120f;
                break;
            case "G1513":
                adultCost = 2742f;
                childrenCost = 2100f;
                break;
            case "G1514":
                adultCost = 2790f;
                childrenCost = 2200f;
                break;
            case "G151":
                adultCost = 2689f;
                childrenCost = 2110f;
                break;


            default:
                System.out.println(" NO COST TO STAY IN THE CITY ");
        }


        switch (super.classChoice) {
            case 0:
                System.out.println("");
            case 1:
                this.classCost = 10;
                break;
            case 2:
                this.classCost = 5;
                break;
            case 3:
                this.classCost = 1;
                break;
            default:
                System.out.println(" SUCH CLASS IS NOT AVAILABLE ");
        }
    }


    private String checkStringMaker() {
        return (cityArray[super.homeCity - 1] + super.homeCity + super.destinationCity);
    }


}

