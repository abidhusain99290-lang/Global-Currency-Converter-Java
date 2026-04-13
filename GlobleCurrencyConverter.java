import java.util.Scanner;

class ConvertEngineCurrency{
    public static final double USD_TO_INR=83.0;
    public static final double EUR_TO_INR=90.0;
    public static final double GBP_TO_INR=105.0;

    public static double convert(double amount,String CurrencyType){
        if(CurrencyType.equals("USD"))
            return amount*USD_TO_INR;
        else if(CurrencyType.equals("EUR"))
            return amount*EUR_TO_INR;
        else if(CurrencyType.equals("GBP"))
            return amount*GBP_TO_INR;
        else{
            System.out.println("Invalid Currency :");
              return 0;
        }
    }
}
 public class GlobleCurrencyConverter{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your amount:");
        double Amount=sc.nextDouble();
        System.out.println("Enter your CurrencyType:");
        String CurrencyType1=sc.next();
      double result= ConvertEngineCurrency.convert(Amount,CurrencyType1);
      System.out.println("Total Indian Currency Amount: "+result);
    }
 }