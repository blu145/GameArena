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
