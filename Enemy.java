public class Main 
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(600,600);
        Enemy one = new Enemy(250,150,20,"RED",1,5);
        Enemy two = new Enemy(200,150,20,"RED",1,5);
        Enemy three = new Enemy(0,0,20,"RED",1,5);

        arena.addBall(one);
        arena.addBall(two);
        arena.addBall(three);

        while(true)
        {
            int run = 1;
            while(run==1){
                one.move(one.randomX(), one.randomY());
                arena.pause();
                two.move(two.randomX(), two.randomY());
                arena.pause();
                three.move(three.randomX(), three.randomY());
                arena.pause();
            }
            
            
        }
    }
}

