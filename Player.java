public class Player extends Ball {
    public int health;
    public int speed;
    private final movementMechanics moveMech = new movementMechanics();

    public Player(double x, double y, double diameter, String col, int layer, int health, int speed){
        super(x, y, diameter, col, layer);
        this.health = 100;
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
    public void setHealth(int health){
        this.health += health;
    }

    public void setSpeed(int speed){
        this.speed += speed;
    }

    // Getters
    public int gethealth(){
        return this.health;
    }

    public int getSpeed(){
        return this.speed;
    }
}
