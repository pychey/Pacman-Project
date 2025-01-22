 class GameOfPacman{
    Pacman pacman;
    Ghost[] ghosts;
    Map map;

    GameOfPacman() {
        pacman = new Pacman(10, 4);
        ghosts = new Ghost[] {
            new Ghost("OrangeGhost", 4, 1, "Orange"),
            new Ghost("BlueGhost", 5, 2, "Blue")
        };
        map = new Map(15, 10);
    }

    void start() {
        System.out.println("\nWelcome to CLI Pacman!");
        map.printMap();
    }   

    public static void main(String[] args) {
        GameOfPacman game = new GameOfPacman();
        game.start();
    }
}
