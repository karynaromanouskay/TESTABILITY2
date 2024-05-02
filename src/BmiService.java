public class BmiService {
    public int calculate(double weightKg, double heightMeters) {
        double result;
        result = weightKg / (heightMeters * heightMeters);
        int index = (int) result;
        return index;
    }
}