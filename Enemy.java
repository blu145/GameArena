public class Enemy extends Ball{
    public int speed;
    public int stepCounter;
    public int xDirection;
    public int yDirection;

    
    //CONSTRUCTOR
    public Enemy (double x, double y, double diameter, String col, int layer, int speed){
        super(x,  y,  diameter, col);
        this.speed=speed;
        this.stepCounter = 0;
        this.xDirection = 0;
        this.yDirection = 0;
    }

    public void changeDirection() {
        this.xDirection = ((int)(Math.random() * 2) - 1);
        this.yDirection = ((int)(Math.random() * 2) - 1);
        this.stepCounter = 0;
    }

    public void moveEnemy() {
        while ((this.xDirection*this.speed + (int)this.getXPosition()) >= 600 || (this.xDirection*this.speed + (int)this.getXPosition()) <= 0 || (this.yDirection*this.speed + (int)this.getYPosition()) >= 600 || (this.yDirection*this.speed + (int)this.getYPosition()) <= 0) { 
            this.changeDirection();
            System.out.println("DEBUG: new xDir: " + this.xDirection + "\nDEBUG: new yDir: " + this.yDirection);
            System.out.println("DEBUG: new coords: " + (this.xDirection*this.speed + (int)this.getXPosition()) + ", " + (this.yDirection*this.speed + (int)this.getYPosition()));
            System.out.println("DEBUG: out of bounds, changed direction. ");
        }
        
        if (this.stepCounter==10) {
            this.changeDirection();
        }
        
        System.out.println("DEBUG: moved ball");
        this.move(this.xDirection*this.speed, this.yDirection*this.speed);
        this.stepCounter += 1;
    }


    //ACCESSORS AND MUTATORS
    public void setSpeed(int newspeed){
        this.speed=newspeed;
    }

    public int getSpeed(){
        return this.speed;
    }
}
