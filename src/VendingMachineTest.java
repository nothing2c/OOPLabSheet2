public class VendingMachineTest {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.fillUp(50);

        System.out.println(vendingMachine.toString());

        vendingMachine.buyCan();

        System.out.println(vendingMachine.toString());

        int x=vendingMachine.getNumCans();

        for(int i=0; i<x;i++)
        {
            vendingMachine.buyCan();
        }

        System.out.println(vendingMachine.toString());

        vendingMachine.buyCan();

        System.out.println(vendingMachine.toString());

        vendingMachine.fillUp(3);

        vendingMachine.buyCan();

        System.out.println(vendingMachine.toString());
    }
}
