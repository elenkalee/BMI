public class BmiService {
    public int calculate(int massKG, int heightCM) {
        int BMI = massKG * 10000 / heightCM / heightCM;
        return BMI;
    }
}