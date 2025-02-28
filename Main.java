public class Main 
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(600,600);
        Enemy one = new Enemy(250,150,20,"RED",1,5);

        arena.addBall(one);

        while(true)
        {
            one.moveEnemy();
        }
    }
}
