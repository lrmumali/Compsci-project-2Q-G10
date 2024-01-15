import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    Location beginner = new Location("Beginner's Village", "A friendly place for beginners");
    Location demon = new Location ("Demon King's castle", "A place only for expert adventurers");

    Character Hero = new Character("Arthur", 100, 100, 100, 100, demon);
    
    Item Potion = new Item("Potion", "gives plus 2 hp, created by a beginner alchemist", "hp", 2);
    Item Book = new Item("Book", "gives plus 50 atk, a mysterious book on swordsmanship", "atk", 50);
    
    Challenge one = new Challenge("rocks fall from overhead, can you survive?", "def", 1, 50, Book);

    difficultChallenge first = new difficultChallenge("a lesser demon attacks, can you defeat it?", "atk", 1, 150, Potion, 150, "def", Book);

      Hero.items.add(Potion);
      Hero.items.add(Book);

      beginner.challenges.add(one);
      demon.challenges.add(first);
    //for now only two challenges were created that being said, the code is set in a way that it can randomize challenges if there are more than one per location

    //start of scenario simulations

    //Scenario 1
    Hero.checkStatus();
    Hero.useItem(Potion);
    Hero.checkStatus();

    //Scenario 2
    Hero.changeLocation(beginner);
    Hero.takeChallenge();

    //Scenario 3
    Hero.changeLocation(demon);
    Hero.takeChallenge();

      
    
  }

}