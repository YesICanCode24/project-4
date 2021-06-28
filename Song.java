public class Song {
    String title;
    Musician musician;
    String playlist;
    String url;

    public Song(String title, Musician musician, String playlist, String url) {
        this.title = title;
        this.musician = musician;
        this.playlist = playlist;
        this.url = url;
    }

    public String toString() {
        return title + "#" + musician.toString() + "#" + playlist + "#" + url;
    }
}

