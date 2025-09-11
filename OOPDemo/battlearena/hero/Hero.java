package battlearena.hero;

import battlearena.hero.weapon.Weapon;

public class Hero implements IHero{

    private int healthPoints;
    private int healthPointsRemaining;
    private int attackDamage;
    private boolean isWeaponEquipped = false;



    //composition
    private Weapon weapon;

    //constructor
    public Hero(int healthPoints, int attackDamage){
        this.healthPoints = healthPoints;
        this.healthPointsRemaining = healthPoints;
        this.attackDamage = attackDamage;
    }

    @Override
    public int getHealthPoints(){
        return healthPoints;

    }

    @Override
    public int getHealthPointsRemaining() {
        return healthPointsRemaining;
    }

    @Override
    public void setHealthPointsRemaining(int healthPointsRemaining) { //why set
        this.healthPointsRemaining = healthPointsRemaining;

    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }


    @Override
    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void equipWeapon() {
        if(getWeapon() !=null && !isWeaponEquipped){  //if hero has equipped weapon
            setAttackDamage(getAttackDamage() + weapon.getAttackIncreased());
            setWeaponEquipped(true);
        }
    }

    @Override
    public boolean isWeaponEquipped() {
        return isWeaponEquipped;
    }

    @Override
    public void setWeaponEquipped(boolean isWeaponEquipped) {
        this.isWeaponEquipped = isWeaponEquipped;
    }

    @Override
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    @Override
    public void attack() {
        System.out.println("Hero attacks for " + attackDamage);

    }

    public void specialAttack(){
        boolean didSpecialAttack = Math.random() < .20;


        if(didSpecialAttack){
            setHealthPointsRemaining(getHealthPointsRemaining() +3); //life steal
            System.out.println("Hero has life steal for 3 HP this turn!"); //not permanent
        }
    }
}
