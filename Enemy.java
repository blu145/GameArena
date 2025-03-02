public class Enemy extends Ball{
    public int steps;
    public int speed;
    public int stepCounter;
    public int xDir;
    public int yDir;
    private final movementMechanics moveMech = new movementMechanics();

    
    //CONSTRUCTOR
    public Enemy (double x, double y, double diameter, String col, int layer, int steps, int speed){
        super(x,  y,  diameter, col);
        this.steps=steps;
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
        if (this.stepCounter<this.steps){
            // Enemy hasn't moved [speed] steps yet
            if (moveMech.checkEnemy(this)) {} 
            else {
                this.move(this.xDir*this.speed,this.yDir*this.speed);
            }
            
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