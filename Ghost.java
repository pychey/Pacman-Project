class Ghost {
    String name;
    String color;
    int x, y; // Position on the map
    char symbol;

    Ghost(String ghostName, int dx, int dy, String ghostColor,char ghostSymbol) {
        name = ghostName;
        x = dx;
        y = dy;
        color = ghostColor;
        symbol = ghostSymbol;
    }
}
