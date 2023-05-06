public class BmiService {
    public float calculate(float weightKg, float heightM) {
       float bmiIndex = weightKg / (heightM * heightM);

        return bmiIndex;
    }
}

