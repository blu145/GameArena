

public class Enemy extends Ball{
    public int steps;
    public int speed;
    public int stepCounter;
    public int xDir;
    public int yDir;
    public int health;
    public boolean visible;
    private final movementMechanics moveMech = new movementMechanics();

    
    //CONSTRUCTOR
    public Enemy (double x, double y, double diameter, String col, int layer, int steps, int speed){
        super(x,  y,  diameter, col);
        this.steps=steps;
        this.speed=speed;
        this.stepCounter = 0;
        this.xDir = 0;
        this.yDir = 0;
        this.health = 10;
        this.visible = false;
    }

    //MOVE RANDOMLY
    public int directionRandom(){
        // Returns either -1,0,1
        return (int) (Math.floor(Math.random() * 3) - 1);
    }

    public void moveEnemy(){
        if (this.stepCounter<this.steps){
            // Enemy hasn't moved [speed] steps yet
            if (moveMech.checkEnemy(this)) {
                // HERE WE NEED TO ADD A WAY FOR THE ENEMY TO "TURN AROUND"} 
                moveMech.teleportEnemy(this, this.xDir, this.yDir);
            } else {
                this.move(this.xDir*this.speed,this.yDir*this.speed);
            }
            
            this.stepCounter += 1;
        }
        this.xDir = directionRandom();
        this.yDir = directionRandom();
        this.stepCounter = 0;
    }

    public void enemyDeath(Player player, GameArena arena, Text score){
        //if (this.collides(player)){
            this.health-=10;
            if (this.health<=0){
                arena.removeBall(this);
                Text death = new Text("X",50,this.getXPosition(),this.getYPosition(),"RED");
                arena.addText(death);
                try { Thread.sleep(1000); }
		        catch (Exception e) {};
                arena.removeText(death);
                player.incrementScore();
                score.setText("Score: "+player.getScore());
            }

        //}
    }


    //ACCESSORS AND MUTATORS
    public void setSpeed(int newspeed){
        this.speed=newspeed;
    }
    public int getSpeed(){
        return this.speed;
    }

    public void setSteps(int newSteps) {
        this.steps = newSteps;
    }

    public void setXDir(int newXDir) {
        this.xDir = newXDir;
    }
    public void setYDir(int newYDir) {
        this.yDir = newYDir;
    }

    public void setVis(boolean newVis) {
        this.visible = newVis;
    }
    public boolean getVis() {
        return this.visible;
    }
}
