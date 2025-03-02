public class Main 
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(600,600);
        //Enemy one = new Enemy(250,150,20,"RED",1,1000,20);
        Player player = new Player(10,10,25,"GREEN",2,100,30);
        Enemy enemy = new Enemy(100,100,50,"RED",1,50,15);
        Text score = new Text("Score: "+player.getScore(),50,15,550,"WHITE");

        //arena.addBall(one);
        arena.addBall(player);
        arena.addBall(enemy);
        arena.addText(score);


        arena.addKeyListener(arena);


        

        while(true)
        {
            arena.pause();
            enemy.moveEnemy();

            if (arena.letterPressed('a')){
                player.moveLeft();
            }
            if(arena.letterPressed('d')){
                player.moveRight();
            }
            if(arena.letterPressed('w')){
                player.moveUp();
            }
            if(arena.letterPressed('s')){
                player.moveDown();
            }
            if(arena.letterPressed('v')){
                one.enemyDeath(player, arena, score);
            }
        }
    }
}