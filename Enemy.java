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
    }

    //MOVE RANDOMLY
    public double directionRandom(){
        // Generates 0 or 1 or 2, used to decide negative or positive in move
        // or no move in case of 2
        if (this.stepCounter < 5){
            return 2;
        }
        else{
            double rand = (Math.random() * 1);
            this.stepCounter = 0;
            return rand;
        }
    }

    public void moveEnemy(double direction, String axis){
        if (axis=="x"){
            // Moving in X axis
            if (direction==0){
                this.move(-5,0);
            }
            else if(direction==1){
                this.move(5,0);
            }
        }
        else{
            // Moving in the Y axis yara
            if (direction==0){
                this.move(0,-5);
            }
            else if(direction==1){
                this.move(0,5);
            }

        }
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
