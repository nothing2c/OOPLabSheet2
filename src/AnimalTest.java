public class AnimalTest {
    public static void main(String[] args) {

        String continents[] = {"Asia","Africa"};

        //Animal lion = new Animal();
        Animal bear = new Animal("Bear",continents,45,45);
        Animal monkey = new Animal();

        /*lion.setType("Lion");
        lion.setContinents(continents);
        lion.setWeight(333.43);
        lion.setAge(43);*/

        System.out.println(bear.toString()+monkey.toString());

    }
}
