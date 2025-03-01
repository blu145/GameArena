public class movementMechanics {
    public boolean offScreen(int x, int y) {
        return (x > 605 || x < -5 || y > 605 || y < -5);
    }

    public void transitionMovement(Ball character, int currX, int currY, int newX, int newY) {
        int moveX = currX;
        int moveY = currY;

        if (newX > 600) {
            moveX = 5;
        } else if (newX < 0) {
            moveX = 595;
        } 

        if (newY > 600) {
            moveY = 5;
        } else if (newY < 0) {
            moveY = 595;
        }

        System.out.println("\nDEBUG: off screen (" + newX + ", " + newY + "), transitioning to other side");
        System.out.println("DUBUG: moved to: " + moveX + ", " + moveY);
        character.setXPosition(moveX);
        character.setYPosition(moveY);
    }
}