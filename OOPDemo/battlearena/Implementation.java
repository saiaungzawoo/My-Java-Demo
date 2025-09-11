package battlearena;

import battlearena.enemies.Enemy;
import battlearena.enemies.individualenemies.Ogre;
import battlearena.enemies.individualenemies.Zombie;
import battlearena.hero.Hero;
import battlearena.hero.weapon.Weapon;

import static battlearena.enemies.Enemy.getNumberOfEnemies; //static method

public  class Implementation {
    public static void main(String[] args) {

        //create objects (instance of the class)
//        Enemy enemy = new Enemy(10,2);

        Zombie zombie = new Zombie( 5, 2); //save a new reference of enemy in memory
        Ogre ogre = new Ogre(10,2);

        System.out.println("There are " + getNumberOfEnemies() + " enemies ready to fight!");
//        zombie.battleStance();
//        ogre.stareDown();
        System.out.println();
//        battle(zombie, ogre);

        Weapon weapon = new Weapon("Sword", 3); //create composition
        Hero hero = new Hero(6, 2); //create hero obj
        hero.setWeapon(weapon); //set the weapon composition
        hero.equipWeapon(); //method that increase hero attack damage
        //method for starting battle
        heroBattle(hero,ogre);


        //access the object
        //call the setter method to update the private variables

        //constructors - create and init objects with or without starting values


        //call the methods

//        zombie.walk();
//        zombie.attack();
//        zombie.specialAttack();
//
//        enemy.talk();
//        zombie.talk();
//        ogre.talk();
//
//        System.out.println();



//        //call the getter method instead of calling the variables directly from external files
//        System.out.println("Enemy has " + zombie.getHealthPoints() + " health points and has "
//                + zombie.getAttackDamage() + " attack damage.");
//
//        System.out.println("Number of Enemies: " + ogre.getNumberOfEnemies());
//        System.out.println("Zombie ID: " + zombie.getId());
//
//        System.out.println();


    }

    //polymorphism
//    public static void battle(Enemy zombie, Enemy ogre){
//        //introduce before fighting
//       zombie.talk();
//       ogre.talk();
//
//       //battle start while two enemies are still full health
//        while(zombie.getHealthPointsRemaining() > 0 && ogre.getHealthPointsRemaining() > 0){
//            System.out.println("----------");
//            //special attack (hit not guaranteed)
//            zombie.specialAttack();
//            ogre.specialAttack();
//
//            //health points remaining after special attack
//            System.out.println("Zombie has " + zombie.getHealthPointsRemaining() + " HP left.");
//            System.out.println("Ogre has " + ogre.getHealthPointsRemaining() + " HP left.");
//
//            //attack again (hit guaranteed)
//            zombie.attack(); //if zombie attacks,
//            ogre.setHealthPointsRemaining(ogre.getHealthPointsRemaining() - zombie.getAttackDamage()); //check ogre's HP
//            ogre.attack(); //if ogre attacks,
//            zombie.setHealthPointsRemaining(zombie.getHealthPointsRemaining() - ogre.getAttackDamage()); //check zombie's HP
//
//        }
//        System.out.println();
//        System.out.println("-----Final Result-----");
//
//        if(zombie.getHealthPointsRemaining() > 0){
//            System.out.println("Zombie is the champion!");
//        }
//        else{
//            System.out.println("Ogre is the champion!");
//
//        }
//    }

    //hero battle
    public static void heroBattle(Hero hero, Enemy enemy){

        System.out.println("Battle begins!");
        //while both HP haven't hit O, the fight will loop
        while(hero.getHealthPointsRemaining() > 0 && enemy.getHealthPointsRemaining() > 0){
            System.out.println("-----------");

            System.out.println();

            enemy.specialAttack(); //enemy attack
            hero.specialAttack(); //hit not guranteed
            System.out.println("Hero has " + hero.getHealthPointsRemaining() + " HP left."); //check hero health
            System.out.println("Enemy has " + enemy.getHealthPointsRemaining() + " HP left."); //check enemy health

            //enemy attack
            enemy.attack();
            //since enemy attacks, reduce hero's HP
            hero.setHealthPointsRemaining(hero.getHealthPointsRemaining() - enemy.getAttackDamage());
            //hero attack
            hero.attack();
            //since hero attacks, reduce enemy's HP
            enemy.setHealthPointsRemaining(enemy.getHealthPointsRemaining() - hero.getAttackDamage());
        }

        System.out.println("----Final Result-----");

        if(hero.getHealthPointsRemaining() > 0){
            System.out.println("The champion is the Hero!");
        }
        else {
            System.out.println("The champion is the Enemy.");
        }
    }

}




