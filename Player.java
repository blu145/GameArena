public class Player extends Ball {
    public int score;
    public int speed;
    private final movementMechanics moveMech = new movementMechanics();

    public Player(double x, double y, double diameter, String col, int layer, int score, int speed){
        super(x, y, diameter, col, layer);
        this.score = 0;
        this.speed = speed;
        
    }

    //movement
    public void moveDown(){
        int currX = (int)this.getXPosition();
        int currY = (int)this.getYPosition();
        if (moveMech.offScreen(currX + this.speed, currY + this.speed)) {
            moveMech.transitionMovement(this, currX, currY, currX + this.speed, currY + this.speed);
        } else {
            this.move(0,this.speed);
        }
    }

    public void moveUp(){
        int currX = (int)this.getXPosition();
        int currY = (int)this.getYPosition();
        if (moveMech.offScreen(currX + this.speed, currY + this.speed)) {
            moveMech.transitionMovement(this, currX, currY, currX + this.speed, currY + this.speed);
        } else {
            this.move(0,-this.speed);
        }
    }

    public void moveLeft(){
        int currX = (int)this.getXPosition();
        int currY = (int)this.getYPosition();
        if (moveMech.offScreen(currX + this.speed, currY + this.speed)) {
            moveMech.transitionMovement(this, currX, currY, currX + this.speed, currY + this.speed);
        } else {
            this.move(-this.speed,0);
        }
    }

    public void moveRight(){
        int currX = (int)this.getXPosition();
        int currY = (int)this.getYPosition();
        if (moveMech.offScreen(currX + this.speed, currY + this.speed)) {
            moveMech.transitionMovement(this, currX, currY, currX + this.speed, currY + this.speed);
        } else {
            this.move(this.speed,0);
        }
    }

    // Setters
    public void setScore(int score){
        this.score += score;
    }

    public void setSpeed(int speed){
        this.speed += speed;
    }

    // Getters
    public int getScore(){
        return this.score;
    }

    public int getSpeed(){
        return this.speed;
    }
}
