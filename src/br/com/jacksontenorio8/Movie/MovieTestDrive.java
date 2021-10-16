package br.com.jacksontenorio8.Movie;

public class MovieTestDrive {
    public static void main (String[] args) {

        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Lost in Cublice space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        two.title = "Byte Club";
        two.genre = "Tragic but ultimately uplifting";
        two.rating = 127;

    }
}
