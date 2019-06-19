import java.util.Scanner;

public class Main {

    static int turtleX, turtleY;
    static int dx, dy;
    final static char TURTLE = 'T';
    static boolean isPenDown;
    static char[][] field;
    final static int WIDTH = 20;
    final static int HEIGHT = 20;
    final static char EMPTY_CELL = '.';
    final static char MARKED_CELL = '*';



    public static void initTurtle() {
        turtleX = 0;
        turtleY = 0;
        dx = 1;
        dy = 0;
        isPenDown = false;
    }

        public static void initField(){
            field = new char[HEIGHT][WIDTH];
            for(int i = 0; i < HEIGHT; ++i){
                for(int j = 0; j < WIDTH; ++j){
                    field[i][j] = EMPTY_CELL;
                }
            }
        }

    public static void printField(){
        for(int y = 0; y < HEIGHT; ++y){
            for(int x = 0; x < WIDTH; ++x) {
                if (x == turtleX && y == turtleY) {
                    System.out.print(TURTLE);
                } else {
                    System.out.print(field[y][x]);
                }
            }
            System.out.println();
        }
    }


    public static void putPenUp(){
        isPenDown = false;
    }

    public static void putPenDown(){
        isPenDown = true;
    }

    public static void move(int steps){
        for(int i = 0; i < steps; ++i){
            int nextX = turtleX + dx;
            int nextY = turtleY + dy;
            if(nextX < 0 || nextX > 19 || nextY < 0 || nextY > 19){
                break;
            }

            if(isPenDown){
                field[turtleY][turtleX] = MARKED_CELL;
            }

            turtleY = nextY;
            turtleX = nextX;
        }
    }

    public static void turnRight(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dx = -dx;
    }

    public static void turnLeft(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dy = -dy;
    }


    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        String line;
        initField();
        initTurtle();
        boolean working = true;
	    do{
            line = scan.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0].toLowerCase();
            switch (command){
                case "penup":
                    putPenUp();
                    break;
                case "pendown":
                    putPenDown();
                    break;
                case "turnleft":
                    turnLeft();
                    break;
                case "turnright":
                    turnRight();
                    break;
                case "move":
                    if(parts.length >= 2) {
                        int steps = Integer.parseInt(parts[1]);
                        move(steps);
                    }
                    else{
                        System.err.println("Please, specify the number of steps");
                    }
                    break;
                case "print":
                    printField();
                    break;
                case "exit":
                    working = false;
                default:
                    System.err.println("Invalid command, please try again");

            }
        }while(working);
    }
}
