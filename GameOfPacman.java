 class GameOfPacman{
    Pacman pacman;
    Ghost[] ghosts;
    Map map;

    GameOfPacman() {
        pacman = new Pacman(10, 4);
        ghosts = new Ghost[] {
            new Ghost("OrangeGhost", 4, 1, "Orange",'O'),
            new Ghost("BlueGhost", 5, 2, "Blue",'B')
        };
        map = new Map(15, 10);
    }

    void start() {
        System.out.println("\nWelcome to CLI Pacman!");
        map.placePacman(pacman.x, pacman.y);
        for(Ghost ghost : ghosts) {
            map.placeGhost(ghost.x, ghost.y, ghost.symbol);
        }
        map.printMap();
    }

    
}
