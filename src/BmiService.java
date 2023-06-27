public class BmiService {
    public int calculate(double meters, int kilogram) {
            double index = (double) kilogram / (meters * meters);
            return (int)index;
    }
}
