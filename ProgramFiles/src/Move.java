public class Move {
    public int power;
    public String name;
    public String moveType;
    public String type;
    public String damagingStat;
    public String defenseStat;
    public int accuracy;
    public String[] misc; ///things like is a punch attack, is blocked by protect, is a wind move etc. etc.
    public int priority;
    public int pp;
    public String targets;
    public String explanation; ///what the player sees when they hover over the move
    public double effectRate;
    public double critRatio;
    public String[] possibleEffects; ///a list of possible effects, for example burn, paralysis or sleep
    public String[] statEffects;
    public int statDropAmount;
    public double healthRegen;

    Move(int power, String name, String moveType, String type, String damagingStat, String defenseStat, int accuracy, String[] misc, int priority, int pp, String targets, String explanation, double effectRate, double critRatio, String[] possibleEffects, String[] statEffects, int statDropAmount, double healthRegen) {
        this.power = power;
        this.name = name;
        this.moveType = moveType;
        this.type = type;
        this.damagingStat = damagingStat;
        this.defenseStat = defenseStat;
        this.accuracy = accuracy;
        this.misc = misc;
        this.priority = priority;
        this.pp = pp;
        this.targets = targets;
        this.explanation = explanation;
        this.effectRate = effectRate;
        this.critRatio = critRatio;
        this.possibleEffects = possibleEffects;
        this.statEffects = statEffects;
        this.statDropAmount = statDrops;
        this.healthRegen = healthRegen;
    }
}