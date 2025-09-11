package battlearena.enemies;

public abstract class Enemy implements IEnemy {
    //define the behaviour and state

    //using encapsulation -

    private int id;
    private int healthPoints;
    private int healthPointsRemaining;
    private int attackDamage;
    //can be shared across classes
    private static int numberOfEnemies; //static - belongs to a class but not an object of a class

    //constructor - instead of using setters
    public Enemy( int healthPoints, int attackDamage){

       this.healthPoints = healthPoints;
       this.attackDamage = attackDamage;
       this.healthPointsRemaining = healthPoints; //store remaining health points in the private variable
       numberOfEnemies++;
       this.id = numberOfEnemies;
    }

    //getter method to retrieve the value of the private variables
//    public String getTypeOfEnemy(){ //when calling to this method, we are gonna get typeofenemy variables back
//        return typeOfEnemy;
//    }

    //setter method to update that private variables
//    public void setTypeOfEnemy(String typeOfEnemy){
//        this.typeOfEnemy = typeOfEnemy;
//    }

    @Override
    public int getHealthPoints(){
        return healthPoints;
    }

    @Override
    public int getHealthPointsRemaining(){
        return healthPointsRemaining;
    }

    //setter method to update that private variables
    public void setHealthPoints (int healthPoints){
        this.healthPoints = healthPoints;
    }

    @Override
    public void setHealthPointsRemaining(int healthPointsRemaining){
        this.healthPointsRemaining = healthPointsRemaining;
    }


    @Override
    public int getAttackDamage(){
        return attackDamage;
    }

    @Override
    public int getId(){
        return id;
    }

    //need method body to add it in interface..?
    public static int getNumberOfEnemies(){
        return numberOfEnemies;
    }


    //setter method to update that private variables
    @Override
    public void setAttackDamage(int attackDamage){
        this.attackDamage = attackDamage;
    }



    //abstraction
    //methods for doing each thing
    @Override
    public void  talk (){
        System.out.println("I'm a Enemy be prepared to fight!");
    }

    public void walk (){
        System.out.println("Enemy moves closer to you.");
    }

    @Override
    public void attack (){
        System.out.println("Enemy  attacks for " + attackDamage);
    }

    @Override
    public void specialAttack(){
        System.out.println("This is a special Attack.");
    }
}

