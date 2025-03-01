public class Main 
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(600,600);
        Enemy one = new Enemy(300,300,20,"RED",1,10000);

        arena.addBall(one);

        while(true)
        {
            arena.pause();
            one.moveEnemy();
        }
    }
}