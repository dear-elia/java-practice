public class CoffeeMaker {
    private EspressoMachine expressoMachine;

    public CoffeeMaker(){
        this.expressoMachine = new EspressoMachine();
    }

    public void makeCoffee(){
        System.out.println(expressoMachine.brew());
    }
}
