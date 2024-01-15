import java.util.ArrayList;
import java.lang.Math;

class Character {
 private int atk, def, spd, hp;
 private String name;
 Location loc;
 public int survived = 1;
 ArrayList<Item> items;
 public int counter = 0, finalValue;





  //getters and setters start here
  public int getAtk() {
    return atk;
  }
  public void setAtk(int atk) {
    this.atk = atk;
  }
  public int getDef() {
    return def;
  }
  public void setDef(int def) {
    this.def = def;
  }
  public int getSpd() {
    return spd;
  }
  public void setSpd(int spd) {
    this.spd = spd;
  }
  public int getHp() {
    return hp;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  //getters and setters end here


  

  public Character(String n, int a, int d, int s, int h, Location l) {
    name = n;
    atk = a;
    def = d;
    spd = s;
    hp = h;
    loc = l;
    items = new ArrayList<Item>();
    survived = 1;
  }

  public void checkStatus(){
    this.counter = 0;
    System.out.println("");
    System.out.println("Our hero " + getName() + " has decided to check his status. Here it is below:");
    System.out.println("Name: " + getName());
    System.out.println("HP: " + getHp());
    System.out.println("ATK: " + getAtk());
    System.out.println("DEF: " + getDef());
    System.out.println("SPD: " + getSpd());
    System.out.println("Items: ");
    while (counter < items.size()){
    System.out.println(items.get(counter).getName());
    counter++;
    }
  };

   public void changeLocation(Location loc){
     System.out.println("");
     this.loc = loc;
     System.out.println("Your character has moved to: " + loc.getName());
   }

   public void useItem(Item x){
     this.counter = 0;
     System.out.println("");
     System.out.println("Your character has used " + x.getName());
     System.out.println("Their stats have increased");
     if (x.getAffectedStat() == "atk"){
       this.atk = atk + x.getEffect();
     }
     if (x.getAffectedStat() == "def"){
       this.def = def +  x.getEffect();
     }
     if (x.getAffectedStat() == "spd"){
       this.spd = spd +  x.getEffect();
     }
     if (x.getAffectedStat() == "hp"){
       this.hp = hp +  x.getEffect();
     }
     this.items.remove(x);
   }

  public void takeChallenge(){
    Challenge x;
    this.loc.challengeCounter = 0;
    while (finalValue > loc.challenges.size()){
    this.loc.challengeCounter = Math.random();
    finalValue = (int)(this.loc.challengeCounter * 10);
  }

    x = loc.challenges.get(finalValue);;
//end of finding a randomized challenge


//start of running the chosen challenge
System.out.println("");
System.out.println("You have started a challenge!");
System.out.println(x.getDescription());
System.out.println("");

//evaluation of survival
 if (x.getChallengedStat() == "atk"){
    if (x.getSurvivalCon() < atk){
     System.out.println("you have survived and completed the challenge");
    ;}
    else{
     System.out.println("Stats insufficient.You have died and failed the challenge");
      this.survived = 0;
    }
 }

   if (x.getChallengedStat() == "def"){
        if (x.getSurvivalCon() < def){
         System.out.println("you have survived and completed the challenge");
        }
        else{
         System.out.println("Stats insufficient.You have died and failed the challenge");
          this.survived = 0;
        }
     }

    if (x.getChallengedStat() == "spd"){
       if (x.getSurvivalCon() < spd){
         System.out.println("you have survived and completed the challenge");
       }
        else {
         System.out.println("Stats insufficient.You have died and failed the challenge");
          this.survived = 0;
        }
     }

     if (x.getChallengedStat() == "hp"){
       if (x.getSurvivalCon() < hp){
         System.out.println("you have survived and completed the challenge");
       }
       else {
         System.out.println("Stats insufficient.You have died and failed the challenge");
          this.survived = 0;
        }
     }

  //giving of rewards if survived
  if (this.survived == 1){
    System.out.println("");
    System.out.println("You have received a reward for completing the challenge! " + x.reward.getName() + " was added to your inventory");
  }
  else {
    System.exit(0);
  }


  
  } 
}



