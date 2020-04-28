public abstract class Pokemon{
    
    protected String name;
    protected String name2 = "Fushigidane";
    protected int hp = 0; // up other 
    protected int damagepikachu = 50;
    protected int damageFushigidane = 40;
    protected String abilitypikachu = "electricity";
    protected String abilityFushigidane = "Solarbeam";

    public Pokemon(String name){
        this.name = name;
        this.hp = 0;
    }


    public Pokemon(String name,int Hpstart){
        this.name = name;
        Hpstart = 0;
        //this.hp = (int)(Math.random() * maxHp);
        this.hp = 100 + Hpstart;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public String getName2(){
        return name2;
    }

    public int getHp2(){
        return hp;
    }

    public int getDamage1(){
        return damagepikachu;
    }

    public String getAbility1(){
        return abilitypikachu;
    }

    public int getDamage2(){
        return damageFushigidane;
    }

    public String getAbility2(){
        return abilityFushigidane;
    }
    
    public boolean damage(int value){
        if(hp == 0){
            return false;
        }
        int currentHP = hp - value;
        if(currentHP >= 0){
            this.hp  = currentHP;
        }else{
            this.hp = 0;
        }
        return true;
    }
    

    public abstract void attack(Pokemon enemy);

    public String toString(){
        return name;
    }

}