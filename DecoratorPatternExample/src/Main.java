//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        System.out.println();

        Coffee coffee = new SimpleCoffee();
        System.out.println("Drinking coffee : " + coffee.getDescription() + " , Costed me : " + coffee.getCost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Drinking coffee : " + milkCoffee.getDescription() + " , Costed me : " + milkCoffee.getCost());

        Coffee whippedPlusMilkCoffee = new WhippedCreamDecorator(milkCoffee);
        System.out.println("Drinking coffee : " + whippedPlusMilkCoffee.getDescription() + " , Costed me : " + whippedPlusMilkCoffee.getCost());
    }
}