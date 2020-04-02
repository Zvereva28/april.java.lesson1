public class Track implements Movement {
    int lenght;
    public Track(int lenght){
        this.lenght = lenght;
    }

    public boolean move(Essences es) {
        return es.run(this);//зызываем метод бега


    }
}
