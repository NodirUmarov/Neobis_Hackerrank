import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Turtle turtle = new Turtle();
        Field field = new Field();

        Scanner scan = new Scanner(System.in);
        String line;

        boolean exitStatus = true;

        do{
            line = scan.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0].toLowerCase();
            switch (command){
                case "pendown":
                    turtle.putPenDown();
                    break;
                case "penup":
                    turtle.putPenUp();
                    break;
                case "turnleft":
                    turtle.turnLeft();
                    break;
                case "turnright":
                    turtle.turnRight();
                    break;
                case "move":
                    if(parts.length >= 2){
                        int steps = Integer.parseInt(parts[1]);
                        turtle.move(steps, field);
                    }else{
                        System.err.println("Please, specify the number of steps and try again.");
                    }
                    break;
                case "print":
                    field.print(turtle);
                    break;
                case "exit":
                    exitStatus = false;
                    break;
                default:
                    System.err.println("Incorrect command, please try again.");
                    break;

            }
        }while(exitStatus);
    }
}
