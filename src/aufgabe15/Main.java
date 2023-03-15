package aufgabe15;

public class Main {

  public static void main(String[] args) {
    Person personOne = new Person("Bert", "Müller", 38);

    System.out.println(ObjectCopier.copyShallow(personOne, 10));
    System.out.println("____________________________________________________________");
    System.out.println(ObjectCopier.genericCopyShallow(personOne, 10));
    System.out.println("____________________________________________________________");
    System.out.println(ObjectCopier.linkedListShallowCopy(personOne, 10));

  }
}
