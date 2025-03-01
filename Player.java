public class Player extends Ball {
    public int health;
    public int speed;

    public Player(double x, double y, double diameter, String col, int health, int speed){
        super(x, y, diameter, col);
        this.health = 100;
        this.speed = speed;
    }

    //movement
    public void moveDown(){
        this.move(0,10);
    }

    public void moveUp(){
        this.move(0,-10);
    }

    public void moveLeft(){
        this.move(-10,0);
    }

    public void moveRight(){
        this.move(10,0);
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