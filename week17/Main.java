package a_review.week17;

interface Season {
    void start();
}

class Summer implements Season {
    @Override
    public void start() {

    }
}

class Winter implements Season {
    @Override
    public void start() {

    }
}

public class Main {
    public static void main(String[] args) {
        Season season = new Summer();
        season.start();
        season = new Winter();
        season.start();
    }
}
