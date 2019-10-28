import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
/*int time=12;

        //Guten morgen <12 --> if
        // Guten Tag <18   --> else if
        // Guten Abend >18 --> else

if (time <12){

    System.out.println("Guten Morgen ");
} else if (time < 18){
    System.out.println("Guten Tag ");
}
else {
    System.out.println("Guten Abend ");

}*/

int day = 121;
switch (day){
    case 1:
        System.out.println("Samastag");
        break;
    case 2:
        System.out.println("Sonntag");
        break;
    case 3:
        System.out.println("Montag");
        break;
    case 4:
        System.out.println("Dienstag");
        break;
    case 5:
        System.out.println("Mittwoch");
        break;
    case 6:
        System.out.println("Donnerstag");
        break;
    case 7:
        System.out.println("Freitag");
        break;
    default:
        System.out.println("لقد ادخلت رقم غير موجود");
}








    }
}

