package battlearena.enemies.individualenemies;

import battlearena.enemies.Enemy;

public class Ogre extends Enemy implements IOgre {

    int damage = getAttackDamage(); // original damage

    public Ogre(int healthPoints, int attackDamage){
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk(){
        System.out.println("I'm an Ogre.");
    }

    @Override
    public void attack(){
        System.out.println("Ogre attacks for " + getAttackDamage());
        setAttackDamage(damage); //set back to original damage after getting power up
    }

    @Override
    public void specialAttack(){
        boolean didSpecialAttack = Math.random() < .20;
        int damage = getAttackDamage(); //if ogre get 20% damage boost only for this turns, then it reset back to original damage

        if(didSpecialAttack){

            setAttackDamage(damage + 4);
            System.out.println("Ogre attack damage is increased by 4 this turn!"); //not permanent

        }
    }


    @Override
    public void stareDown() {
        System.out.println("Ogre slams his chest.");
    }
}
