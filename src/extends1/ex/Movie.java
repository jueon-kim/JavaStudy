package extends1.ex;

import javax.swing.*;

public class Movie extends item{

    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("감독: " + director + " 배우: " + actor);
    }
}
