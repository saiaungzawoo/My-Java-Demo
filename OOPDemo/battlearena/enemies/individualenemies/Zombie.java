package battlearena.enemies.individualenemies;

import battlearena.enemies.Enemy;

//Inheritance
public class Zombie extends Enemy implements IZombie{

    //create a constructor
    public Zombie(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage); //super will call the parent class constructor
    }

    @Override
    public void talk() {
        System.out.println("I'm a Zombie!");
    }

    @Override
    public void attack(){
        System.out.println("Zombie attacks for " + getAttackDamage());
    }

    @Override
    public void specialAttack() {
       boolean didSpecialAttack = Math.random() < .20;
       if(didSpecialAttack){
           setHealthPointsRemaining(getHealthPointsRemaining() + 2);
           System.out.println("Zombie regenerated 2 HP!");
       }
    }

    @Override
    public void battleStance() {
        System.out.println("Zombie cracks neck.");
    }
}