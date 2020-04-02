public class Wall implements Movement {
    int hight;

    public Wall(int hight){
        this.hight = hight;
    }


    public boolean move(Essences ess) {
        return ess.jump(this); // вызываем метод run  у this существа(человет, робот...)
    }
}
