public class Main 
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(600,600);
        Enemy one = new Enemy(250,150,20,"RED",1,1000);

        arena.addBall(one);

        while(true)
        {
            arena.pause();
            one.moveEnemy();
        }
    }
}
