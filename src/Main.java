import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Apartment apartment = new Apartment("alamedin 1");
        Person person = new Person("Manas", 11, apartment);
        Person person1 = new Person("Muras", 8, apartment);
        Person[] people = {person1, person};

        Dormitory dormitory = new Dormitory("Kyzyl asker");
        Person person2 = new Person("Asyl", 19, dormitory);
        Person person3 = new Person("Michael", 17, dormitory);
        Person person6 = new Person("Aalym", 11, dormitory);
        Person[] people1 = {person2, person3, person6};

        Hotel hotel = new Hotel("Kylych");
        Person person4 = new Person("Jyldyz", 18, hotel);
        Person person5 = new Person("Aysha", 16, hotel);
        Person person7 = new Person("Nurperi", 10, hotel);
        Person person8 = new Person("Ayzada", 10, hotel);
        Person[] people2 = {person4, person5, person7, person8};

        System.out.println("number of peoples apartment " + numberOfPeople(people));
        System.out.println("number of peoples dormitory " + numberOfPeople(people1));
        System.out.println("number of peoples hotel " + numberOfPeople(people2));

        Person[] peoples = {person, person1, person2, person3, person4, person5, person6, person7, person8};
        System.out.println("write name of person: ");
        findByName(scanner.next(), peoples);
    }
    public static int numberOfPeople(Person[] people){
        int i = 0;
        for (Person person:people) {
            i++;
        }
        return i;
    }
    public static void findByName(String name , Person[] people){
        for (Person persons:people) {
            if (persons.getName().equals(name)){
                System.out.println(persons.getAddress());
            }
        }
    }

}
