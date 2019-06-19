class Field {

    final static int WIDTH = 20, HEIGHT = 20;
    static char[][] field;
    final static char EMTY_CELL = '.';
    final static char MARKED_CELL = '*';

    Field(){
        field = new char[HEIGHT][WIDTH];
        for(int y = 0; y < HEIGHT; ++y){
            for(int x = 0; x < WIDTH; ++x){
                field[y][x] = EMTY_CELL;
            }
        }
    }

    public void print(Turtle turtle){
        for(int y = 0; y < HEIGHT; ++y){
            for(int x = 0; x < WIDTH; ++x){
                if(x == turtle.turtleX && y == turtle.turtleY){
                    System.out.print(turtle.TURTLE_CELL);
                }
                else{
                    System.out.print(field[y][x]);
                }
            }
            System.out.println();
        }
    }
}
