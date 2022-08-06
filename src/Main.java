public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double index = service.calculate(47, 1.6);
        System.out.println(index);
    }
}
