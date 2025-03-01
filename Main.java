public class Main 
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(600,600);
        //Enemy one = new Enemy(250,150,20,"RED",1,1000,20);
        Player player = new Player(10,10,25,"GREEN",100,50);

        //arena.addBall(one);
        arena.addBall(player);

        arena.addKeyListener(arena);


        

        while(true)
        {
            arena.pause();
            //one.moveEnemy();

            if (arena.letterPressed('a')){
                player.moveLeft();
            }
            else if(arena.letterPressed('d')){
                player.moveRight();
            }
            else if(arena.letterPressed('w')){
                player.moveUp();
            }
            else if(arena.letterPressed('s')){
                player.moveDown();
            }
        }
    }
}