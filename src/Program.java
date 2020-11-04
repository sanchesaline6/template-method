public class Program {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        TeaWithHook teaHook = new TeaWithHook();
        CoffeWithHook coffeeHook = new CoffeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
