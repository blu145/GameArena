/*public class Enemy extends Ball{
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

*/


//REMADE, needs border correction
public class Enemy extends Ball{
    public int speed;
    public int stepCounter;
    public int xDir;
    public int yDir;

    
    //CONSTRUCTOR
    public Enemy (double x, double y, double diameter, String col, int layer, int speed){
        super(x,  y,  diameter, col);
        this.speed=speed;
        this.stepCounter = 0;
        this.xDir = 0;
        this.yDir = 0;
    }

    //MOVE RANDOMLY
    public int directionRandom(){
        // Returns either -1,0,1
        return (int) (Math.floor(Math.random() * 3) - 1);
    }

    public void moveEnemy(){
        if (this.stepCounter<this.speed){
            // Enemy hasn't moved [speed] steps yet
            this.move(this.xDir*5,this.yDir*5);
            this.stepCounter += 1;
        }
        this.xDir = directionRandom();
        this.yDir = directionRandom();
        this.stepCounter = 0;
    }


    //ACCESSORS AND MUTATORS
    public void setSpeed(int newspeed){
        this.speed=newspeed;
    }

    public int getSpeed(){
        return this.speed;
    }
}