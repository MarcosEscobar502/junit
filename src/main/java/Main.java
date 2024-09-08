import org.springframework.format.number.money.MonetaryAmountFormatter;

public class Main {

    public static void main (String [] args ){
        double salary = 1000;
        System.out.println(Moneyutil.format(salary));
    }
}
