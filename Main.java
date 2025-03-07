public class Main 
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(600,600);
        Player player = new Player(10,10,25,"GREEN",2,100,30);
        Enemy enemys[] = new Enemy[10];
        for (int i = 0; i < 10; i++) {
            enemys[i] = new Enemy(100,100,50,"RED",1,50,15);
        }
        enemys[0].setVis(true);
        Text score = new Text("Score: "+player.getScore(),50,15,550,"WHITE");
        
        arena.addBall(player);
        arena.addBall(enemys[0]);
        arena.addText(score);


        arena.addKeyListener(arena);


        
        int timer = 0;
        while(true)
        {
            arena.pause();
            for (int i = 0; i < 10; i++) {
                if (enemys[i].getVis()) {
                    enemys[i].moveEnemy();
                }
            }

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
                for (int i = 0; i < 10; i++) {
                    if ((enemys[i].collides(player)) && (enemys[i].getVis())) {
                        enemys[i].enemyDeath(player, arena, score);
                        arena.removeBall(enemys[i]);
                        enemys[i].setVis(false);
                        break;
                    }
                }
            }

            if (timer == 50) {
                for (int i = 0; i < 10; i++) {
                    if (!(enemys[i].getVis())) {
                        enemys[i].moveToSpawn();
                        arena.addBall(enemys[i]);
                        enemys[i].setVis(true);
                        break;
                    }
                }
                timer = 0;
            }
            timer++;
        }
    }
}