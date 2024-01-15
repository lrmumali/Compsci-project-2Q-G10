import java.util.ArrayList;

class difficultChallenge extends Challenge {

private int extraCon;
private String extraStat;
private  Item extraItem;

  //getters and setters start here
  public int getExtraCon() {
    return extraCon;
  }
  public void setExtraCon(int extraCon) {
    this.extraCon = extraCon;
  }
  public String getExtraStat() {
    return extraStat;
  }
  public void setExtraStat(String extraStat) {
    this.extraStat = extraStat;
  }
  public Item getExtraItem() {
    return extraItem;
  }
  public void setExtraItem(Item extraItem) {
    this.extraItem = extraItem;
  }
  //getters and setters end here

  public difficultChallenge(String d, String cs, int cn, int sc, Item r, int ec, String es, Item ei){
    super(d, cs, cn, sc, r);
    extraCon = ec;
    extraStat = es;
    extraItem = ei;
  }

  public void addItem(){
    //same as original challenge, no input in parenthesis needed
  }

}