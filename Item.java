import java.util.ArrayList;

class Item{
 private String name, description, affectedStat;
 private int effect;

  //getters and setters start here
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public String getAffectedStat() {
    return affectedStat;
  }
  public void setAffectedStat(String affectedStat) {
    this.affectedStat = affectedStat;
  }
  public int getEffect() {
    return effect;
  }
  public void setEffect(int effect) {
    this.effect = effect;
  };
  //getters and setters end here

  public Item(String n, String d, String as, int e){
    name = n;
    description = d;
    affectedStat = as;
    effect = e;
  }
  
}