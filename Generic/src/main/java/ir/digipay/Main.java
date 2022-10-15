package ir.digipay;

public class Main {

    public static void main(String[] args) {

        Repository<Person> personRepository = new Repository<Person>();

        Person person1 = new Person(1l,"Ali");
        Person person2 = new Person(2l,"Mohammad");
        Person person3 = new Person(3l,"Amir");
        Person person4 = new Person(4l,"Reza");
        Person person5 = new Person(5l,"Sara");
        Person person6 = new Person(6l,"Erfan");

        personRepository.save(person1);
        personRepository.save(person2);
        personRepository.save(person3);
        personRepository.save(person4);
        personRepository.save(person5);
        personRepository.save(person6);


        System.out.println(personRepository.findById(3l));
        System.out.println(personRepository.getAll());
        personRepository.remove(new Person(6l,"Erfan"));
        System.out.println(personRepository.getAll());


    }

}
