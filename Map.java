class Map {
    int width, height;
    char[][] grid;

    Map(int width, int height) {
        this.width = width;
        this.height = height;
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
