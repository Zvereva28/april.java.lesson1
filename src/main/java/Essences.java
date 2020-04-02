public interface Essences {
    String  name = null;
    int maxjump = 0;
    int maxrun = 0;

    void moving(Track trak);
    void moving (Wall wall);
}
