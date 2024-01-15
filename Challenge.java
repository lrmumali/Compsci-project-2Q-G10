class Challenge{
 private int challengeNumber, survivalCon;
 private String description, challengedStat;
 Item reward;

//getters and setters start here
 public int getChallengeNumber() {
	return challengeNumber;
}
public void setChallengeNumber(int challengeNumber) {
	this.challengeNumber = challengeNumber;
}
public int getSurvivalCon() {
	return survivalCon;
}
public void setSurvivalCon(int survivalCon) {
	this.survivalCon = survivalCon;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getChallengedStat() {
	return challengedStat;
}
public void setChallengedStat(String challengedStat) {
	this.challengedStat = challengedStat;
}
//getters and setters end here


public Challenge (String d, String cs, int cn, int sc, Item r){
    description = d;
    challengedStat = cs;
    challengeNumber = cn;
    survivalCon = sc;
    reward = r;
  }


  public void addItem(){
    //no need for field inside the parenthesis
    //since by default the reward variable will be added to inventory
  }
}
  
  
