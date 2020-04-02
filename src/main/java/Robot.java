public class Robot implements Essences{
    String  name;
    int maxjump;
    int maxrun;

    public Robot (String name, int maxrun, int maxjump){
        this.name = name;
        this.maxjump = maxjump;
        this.maxrun = maxrun;
    }


    public boolean run(Track tr) {
        if (tr.lenght < maxrun) {
            System.out.println(name + "     пробежал " + tr.lenght);
            return true;
        }else {System.out.println(name + "    не может пробежать " + tr.lenght);
            return false;}

    }

    public boolean jump(Wall wl) {
        if (wl.hight < maxjump){
            System.out.println(name + "    прыгнул " + wl.hight);
            return true;
        }else {
            System.out.println(name + "  не может  прыгнуть " + wl.hight);
            return false;}
    }
}

