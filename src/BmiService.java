public class BmiService {
    public long calculate(long massKG, long heightCM) {
        long BMI = massKG * 10000 / heightCM / heightCM;
        return BMI;
    }
}