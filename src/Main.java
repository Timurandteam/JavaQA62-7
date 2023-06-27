public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double meters = 1.87;
        int kilogram = 98;
        double index = (double) service.calculate(meters, kilogram);
        System.out.println(index);
    }
}