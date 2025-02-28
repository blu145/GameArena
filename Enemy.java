public class Enemy extends Ball{
    private int speed;
    
    //CONSTRUCTOR
    public Enemy (double x, double y, double diameter, String col, int layer, int speed){
        super(x,  y,  diameter, col);
        this.speed=speed;
    }


    //ACCESSORS AND MUTATORS
    public void setSpeed(int newspeed){
        this.speed=newspeed;
    }

    public int getSpeed(){
        return this.speed;
    }
}
