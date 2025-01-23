class Map {
    int width, height;
    char[][] grid;

    Map(int mapWidth, int mapHeight) {
        width = mapWidth;
        height = mapHeight;
        grid = new char[height][width];
        initialize();
    }

    // Initialize the grid with empty spaces and dots
    void initialize() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = '.';
            }
        }
    }
    void placePacman(int x, int y) {
        if (isWithinBounds(x, y)) {
            grid[y][x] = 'P'; // 'P' represents Pacman
        }
    }

    void placeGhost(int x, int y, char symbol) {
        if (isWithinBounds(x, y)) {
            grid[y][x] = symbol; // Each ghost has a unique symbol
        }
    }
    
    //Check if within map
    boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    // Print the map
    void printMap() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
