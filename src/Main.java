public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weightKg = 53;
        float heightM = 1.65F;
        float bmiIndex = service.calculate(weightKg, heightM);
        System.out.println((int) bmiIndex);
    }
}
