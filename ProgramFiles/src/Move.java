public class Move {
    int power = 0;
    String name = "Name";
    String moveType = "Special";
    String type = "Fire";
    String damagingStat = "Attack";
    String defenseStat = "Defense";
    int accuracy = 0;
    String[] pokemon = {};
    String[] misc = {}; ///things like is a punch attack, is blocked by protect, is a wind move etc. etc.
    int priority = 0;
    int pp = 0;
    String targets = "Double";
    String explanation = "Text"; ///what the player sees when they hover over the move
    float effectRate = 0;
    float critRatio = 0;
    String[] possibleEffects = {}; ///a list of possible effects, for example burn, paralysis or sleep
}