//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("   University \n");
        University university1 = new University("Manas", 1995, 5);
        University university2 = new University("OSCE", 1975, 1);
        University university3 = new University("CH.AITMATUVA", 2008, 6);
        University[] universities = {university1, university2, university3};
        for (University university : universities) {
            System.out.println("Name: " + university.getName() + "\n" +
                    "Jyly: " + university.getInWhatYearWasTheUniversityBuilt() + "\n" +
                    "Kabaty: " + university.getNumberOfFloors());
            System.out.println("~~~~~~~~~~~~~~~~~~~ \n");
        }
        System.out.println("   Person \n");
        Person person1 = new Person("Almaz", "Kanatbecov", 25);
        Person person2 = new Person("Gulnara", "Mamatova", 23);
        Person person3 = new Person("Elgiz", "Jumanazarov", 43);
        Person[] people = {person1, person2, person3};
        for (Person person : people) {
            System.out.println("Name: " + person.getName() + "\n" +
                    "Sur name: " + person.getSurName() + "\n" +
                    "Age: " + person.getAge());
            System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ \n");
        }
        System.out.println("    School \n");
        Schoot schoot1 = new Schoot("N.Mambetov", 1876, 2);
        Schoot schoot2 = new Schoot("T.Umetaliev", 1865, 3);
        Schoot schoot3 = new Schoot("Tachtobo", 1850, 3);
        Schoot[] schoots = {schoot1, schoot2, schoot3};
        for (Schoot schoot : schoots){
            System.out.println("Name: " + schoot.getName() + "\n" +
                    "Kurulgan jyly: " + schoot.getYearOfContruction() + "\n" +
                    "Kabaty: " + schoot.getNamberOfloors());
            System.out.println("**************** \n");
        }
        System.out.println("    Car \n");
        Car car1 = new Car("MERSEDEZ", "E55", 2006, (float)5.4);
        Car car2 = new Car("BMW", "M5", 1995, (float)4.4);
        Car car3 = new Car("TOYOTA", "SUPRA A80", 1993, (float)3.0);
        Car[] cars = {car1, car2, car3};
        for (Car car : cars){
            System.out.println("Name: " + car.getName() + "\n" +
                    "Stamp: " + car.getStamp() + "\n" +
                    "Chygarylgan jyly: " + car.getYearOfRelease() + "\n" +
                    "Volume: " + car.getVoIume());
            System.out.println("^^^^^^^^^^^^^^^^ \n");
        }

    }
}
