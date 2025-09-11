package battlearena.enemies;

public interface IEnemy {

    // methods are already public abstract by default.

    public void  talk ();
    public void attack ();
    public int getHealthPoints();
    public int getAttackDamage();
    public void setAttackDamage(int attackDamage);
    public int getHealthPointsRemaining();
    public void setHealthPointsRemaining(int healthPointsRemaining);
    public void specialAttack();
    public int getId();


}
