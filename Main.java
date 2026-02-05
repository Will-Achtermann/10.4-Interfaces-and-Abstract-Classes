public class Main {
    public static void main(String[] args) {
        Trombone trombone = new Trombone("A", "slider");
        Drums drums = new Drums("E", "Basher");
        Person person = new Person("F");

        trombone.playNote();
        trombone.getNote();
        trombone.playNoise();

        drums.playNote();
        drums.getNote();
        drums.playNoise();

        person.playNote();
        person.getNote();
    }
}
