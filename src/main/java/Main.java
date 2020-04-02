public class Main {
    public static void main(String[] args) {
        Man man1 = new Man("man vacia", 25,10);
        Man man2 = new Man("man kola", 15,2);
        Cat cat1 = new Cat("bars", 40,36);
        Robot robot1 = new Robot("Robot N", 5,2);

        Track tr1 = new Track(10);
        Wall wall1 = new Wall(5);
        Track tr2 = new Track(50);
        Wall wall2 = new Wall(1);

        Movement[] m1 = {(Movement) tr1, (Movement) wall1, (Movement) tr2, (Movement) wall2};
        Essences[] a1 = {(Essences)man1, (Essences)man2, (Essences)cat1, (Essences)robot1};

//       m1[0].move(a1[0]);

        for (Essences es : a1){
            for (Movement mov : m1){
               if (mov.move(es)==false){break;}
            } System.out.println("-----------------------");
        }

    }
}
