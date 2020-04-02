public class Main {
    public static void main(String[] args) {
        Man man1 = new Man("man vacia", 25,10);
        Man man2 = new Man("man kola", 15,2);

        Track tr1 = new Track(20);
        Wall wall1 = new Wall(5);
        Track tr2 = new Track(50);
        Wall wall2 = new Wall(1);

        Movement[] m1 = {tr1, wall1, tr2, wall2};



        Essences[] a1 = {(Essences)man1, (Essences)man2};
        man1.moving(wall1);
        man1.moving(tr1);
        a1[1].moving(wall1);
        a1[1].moving(tr1);
    }
}
