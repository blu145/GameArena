public class Enemy extends Ball{
    public int speed;
    public int stepCounter;
    public double xDirection;
    public double yDirection;

    
    //CONSTRUCTOR
    public Enemy (double x, double y, double diameter, String col, int layer, int speed){
        super(x,  y,  diameter, col);
        this.speed=speed;
        this.stepCounter = 0;
        this.xDirection = 0;
        this.yDirection = 0;
    }

    public void moveEnemy() {
        if (this.stepCounter==10) {
            this.xDirection = ((Math.random() * 2) - 1);
            this.yDirection = ((Math.random() * 2) - 1);
            this.stepCounter = 0;
        }
        
        this.move(this.xDirection*this.speed, this.yDirection*this.speed);
        this.stepCounter += 1;
        System.out.println("DEBUG: Moved ball");
    }


    //ACCESSORS AND MUTATORS
    public void setSpeed(int newspeed){
        this.speed=newspeed;
    }

    public int getSpeed(){
        return this.speed;
    }
}
