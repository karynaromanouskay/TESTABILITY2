public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 98;
        double heightMeters = 1.87;
        int index = service.calculate(weightKg, heightMeters);
        System.out.println("Body mass index: " + index);
    }
}