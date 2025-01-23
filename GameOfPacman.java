 class GameOfPacman{
    Pacman pacman;
    Ghost[] ghosts;
    Map map;

    GameOfPacman() {
        pacman = new Pacman(10, 4);
        ghosts = new Ghost[] {
            new Ghost('O', 4, 1, "Orange"),
            new Ghost('B', 5, 2, "Blue")
        };
        map = new Map(15, 10);
    }

    void start() {
        System.out.println("\nWelcome to CLI Pacman!");
        map.placePacman(pacman.x, pacman.y);
        for(int i = 0; i < ghosts.length ; i++){
            map.placeGhost(ghosts[i].x, ghosts[i].y, ghosts[i].name);
        }
        map.printMap();
    }

    public static void main(String[] args) {
        GameOfPacman game = new GameOfPacman();

        game.start();
    }
}
