public class WhippedCreamDecorator extends CoffeeDecorator{
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return coffee.getDescription() + " with Whipped Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 15.0;
    }
}
