package battlearena.hero;

import battlearena.hero.weapon.Weapon;

public interface IHero {

    int getHealthPoints();
    int getHealthPointsRemaining();
    void setHealthPointsRemaining(int getHealthPointsRemaining);
    int getAttackDamage();
    Weapon getWeapon(); //composition
    void setWeapon(Weapon weapon);
    void equipWeapon();
    boolean isWeaponEquipped();
    void setWeaponEquipped(boolean isWeaponEquipped);
    void setAttackDamage(int attackDamage);
    void attack();
}
