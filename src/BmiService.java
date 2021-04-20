public class BmiService {
    public double calculate(double weight, double hight) {
        double bmIndex =weight / (hight * hight);
        return bmIndex;
    }
}
