public class Player extends Ball {
    public int health;
    public int speed;
    private final movementMechanics moveMech = new movementMechanics();

    public Player(double x, double y, double diameter, String col, int health, int speed){
        super(x, y, diameter, col);
        this.health = 100;
        this.speed = speed;
        
    }

    //movement
    public void moveDown(){
        if (moveMech.checkPlayer(this,0,1)){
            moveMech.teleportPlayer(this,1);
        }
        else{
            this.move(0,this.speed);
        }
    }

    public void moveUp(){
        if (moveMech.checkPlayer(this,0,-1)){
            moveMech.teleportPlayer(this,-1);
        }
        else{
            this.move(0,-this.speed);
        }
    }

    public void moveLeft(){
        if (moveMech.checkPlayer(this,-1,0)){
            moveMech.teleportPlayer(this,-1);
        }
        else{
            this.move(-this.speed,0);
        }
    }

    public void moveRight(){
        if (moveMech.checkPlayer(this,1,0)){
            moveMech.teleportPlayer(this,1);
        }
        else{
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
