package extends1.ex;

public class Album extends item{
    public String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("아티스트: " + artist);
    }
}
