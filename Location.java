import java.util.ArrayList;

class Location {
  private String name, description;
  double challengeCounter;
  ArrayList<Challenge> challenges;
  //the arraylist for characters found in the CRC cards were found to be unnecessary

  //getters start here
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
  //getters end here
  
  public Location(String n, String d) {
    name = n;
    description = d;
    challengeCounter = 0;
    challenges = new ArrayList<Challenge>();
  }

}