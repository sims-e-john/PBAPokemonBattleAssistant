public class Ability {
    public String name;
    public String explanation;
    public String effect;

    public String activationCondition;

    public String[] statBoost;
    public int statBoostAmount;

    public String[] statDrop;
    public int statDropAmount;
    public String statDropTarget;

    public boolean heals;
    public int healAmount;
    public String healTarget;

    Ability(String name, String explanation, String effect, String activationCondition, String[] statBoost, int statBoostAmount, String[] statDrop, int statDropAmount, String statDropTarget, boolean heals, int healAmount, String healTarget) {
        this.name = name;
        this.explanation = explanation;
        this.effect = effect;
        this.activationCondition = activationCondition;
        this.statBoost = statBoost;
        this.statBoostAmount = statBoostAmount;
        this.statDrop = statDrop;
        this.statDropAmount = statDropAmount;
        this.statDropTarget = statDropTarget;
        this.heals = heals;
        this.healAmount = healAmount;
        this.healTarget = healTarget;
    }
}
