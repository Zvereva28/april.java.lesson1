public class Man implements Essences {
    String  name;
    int maxjump;
    int maxrun;

    public Man (String name, int maxrun, int maxjump){
        this.name = name;
        this.maxjump = maxjump;
        this.maxrun = maxrun;
        System.out.println(name +"  jamp   " + maxjump + "   run  " + maxrun);
    }

    public void moving(Track tr) {
        if (tr.lenght < maxrun) {
            System.out.println(name + "     пробежал " + tr.lenght);
        }else {System.out.println(name + "    не может пробежать " + tr.lenght);}

    }

    public void moving(Wall wall) {
        if (wall.hight < maxjump){
            System.out.println(name + "    прыгнул " + wall.hight);
        }else {
        System.out.println(name + "  не может  прыгнуть " + wall.hight);}

    }
}
