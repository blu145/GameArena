public class Enemy extends Ball{
    private int speed;
    
    //CONSTRUCTOR
    public Enemy (double x, double y, double diameter, String col, int layer, int speed){
        super(x,  y,  diameter, col);
        this.speed=speed;
    }

    //MOVE RANDOMLY
    public double randomX(){
        double randomX = (double)(Math.random() * 250)-100;
        if (this.getXPosition()+randomX>600){
            randomX-=(double)(Math.random() *50)-200;
        }
        return randomX;
    }

    public double randomY(){
        double randomY = (double)(Math.random() * 250)-100;
        if (this.getYPosition()+randomY>600){
            randomY-=(double)(Math.random() *50)-200;
        }
        return randomY;
    }


    //ACCESSORS AND MUTATORS
    public void setSpeed(int newspeed){
        this.speed=newspeed;
    }

    public int getSpeed(){
        return this.speed;
    }
}

