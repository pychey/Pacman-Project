class Pacman {
    String name;
    int score;
    int x, y; // Position on the map
    char symbol;

    Pacman(int dx, int dy) {
        name = "Pacman";
        x = dx;
        y = dy;
        score = 0;
        symbol = 'P';
    }

}
