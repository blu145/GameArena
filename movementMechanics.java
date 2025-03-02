public class movementMechanics {
    public boolean checkPlayer(Player a, int dirX, int dirY){
        double attemptX = a.getXPosition()+ (a.speed*dirX);
        double attemptY = a.getYPosition()+ (a.speed*dirY);
        return(attemptX>600 || attemptX<0 ||attemptY>600||attemptY<0);
    }
   
    public boolean checkEnemy(Enemy e){
        double attemptX = e.getXPosition()+ (e.speed);
        double attemptY = e.getYPosition()+ (e.speed);
        double attemptX2 = e.getXPosition()- (e.speed);
        double attemptY2 = e.getYPosition()- (e.speed);
        return(attemptX>600 || attemptX2<0 ||attemptY>600||attemptY2<0);
    }

    public void teleportPlayer(Player a,int dir){
        if((a.getXPosition() + (a.speed*dir))>600){
            a.setXPosition(0);
        }
        if((a.getXPosition() + (a.speed*dir))<0){
            a.setXPosition(600);
        }
        if((a.getYPosition()+ (a.speed*dir))>600){
            a.setYPosition(0);
        }
        if((a.getYPosition()+ (a.speed*dir))<0){
            a.setYPosition(600);
        }
    }
}