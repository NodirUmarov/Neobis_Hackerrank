class Turtle {

    final static char TURTLE_CELL = 'T';
    static int turtleX, turtleY;
    static boolean isPenDown;
    static int dx, dy;

    Turtle(){

        turtleX = 0;
        turtleY = 0;
        dx = 1;
        dy = 0;

        isPenDown = true;
    }

    public void putPenUp(){
        isPenDown = false;
    }
    public void putPenDown(){
        isPenDown = true;
    }

    public void turnLeft(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dx = - dx;
    }

    public void turnRight(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dy = -dy;
    }

    public void move(int steps, Field field){
        for(int i = 0; i < steps; ++i) {
            int nextX = turtleX + dx;
            int nextY = turtleY + dy;
            if (nextX < 0 || nextX > 19 || nextY < 0 || nextX > 19) {
                break;
            }
            if(isPenDown){
                field.field[turtleY][turtleX] = field.MARKED_CELL;
            }

            turtleY = nextY;
            turtleX = nextX;
        }
    }

}
