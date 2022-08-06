public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double weight = 47;
        double height = 1.6;
        double index = service.calculate(weight, height);
        System.out.println(index);
    }
}
