package battlearena.hero.weapon;

public class Weapon  implements IWeapon{

    private String weaponType;
    private int attackIncreased;


    //constructor
    public Weapon(String weaponType, int attackIncreased){
        this.weaponType = weaponType;
        this.attackIncreased = attackIncreased;
    }

    //getters
    @Override
    public String getWeaponType(){
        return weaponType;
    }

    @Override
    public int getAttackIncreased(){
        return attackIncreased;
    }




}
