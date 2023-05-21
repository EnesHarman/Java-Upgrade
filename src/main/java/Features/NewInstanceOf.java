package Features;

public class NewInstanceOf {
    public static void main(String[] args) {
        Enemy enemy = new Rat();
        oldWay(enemy);
        newWay(enemy);
    }

    public static void oldWay(Enemy enemy) {
        enemy.attack();
        if(enemy instanceof Skeleton) { // Old Way
            ((Skeleton) enemy).respawn();
        }
        else if(enemy instanceof Rat) {
            ((Rat) enemy).hide(); // Old Way
        }
    }

    public static void newWay(Enemy enemy) {
        enemy.attack();
        if(enemy instanceof Skeleton skeleton) {
            skeleton.respawn();
        } else if (enemy instanceof Rat rat) {
            rat.hide();
        }
    }
}

interface Enemy {
    void attack();
}

class Skeleton implements Enemy {
    @Override
    public void attack() {
        System.out.println("Spear Attack!");
    }

    public void respawn() {
        System.out.println("The skeleton has respawned!");
    }
}

class Rat implements Enemy {
    @Override
    public void attack() {
        System.out.println("Bite attack!");
    }

    public void hide() {
        System.out.println("The rat is invisible now.");
    }
}


