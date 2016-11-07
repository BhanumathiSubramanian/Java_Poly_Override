class Bank
{
    public void  getRateOfInterest()
    {
        System.out.println("Calculation of Interest Rate");
    }
    
}
class ICICI extends Bank
{
    public void getRateOfInterest()
    {
        System.out.println("This is ICICI bank: 8%");
        
    }
    
}
class SBI extends Bank
{
    public void getRateOfInterest()
    {
        System.out.println("This is SBI bank: 4%");
        
    }
    
}
class AXIS extends Bank
{
    public void getRateOfInterest()
    {
        System.out.println("This is AXIS bank: 6%");
        
    }
    
}

public class InterestRates{

     public static void main(String []args){
       ICICI obj = new ICICI();
       obj.getRateOfInterest();
       AXIS obj1 = new AXIS();
       obj1.getRateOfInterest();
       SBI obj2 = new SBI();
       obj2.getRateOfInterest();
     }
}
