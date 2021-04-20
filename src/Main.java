public class Main {
    public static void main(String[] args) {
       BmiService service= new BmiService();
       double weight = 62.8 ;
       double hight =  1.75;
       int BmiService = (int) Math.floor(service.calculate(weight,hight));
       System.out.println(BmiService);
    }
}

