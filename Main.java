public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(8000);
        System.out.println("Ваши бонусные мили: " + miles);
    }
}