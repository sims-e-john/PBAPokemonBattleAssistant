public class Item {
    public String name;

    public int healthRestoration;
    public String healthRestorationCondition;

    public int damageBoost;
    public String damageBoostCondition;

    public boolean isChoice;

    public String[] statBoost;
    public int statBoostAmount;

    public int damage;
    public String damageTarget;

    public String[] statusEffects;
    public String statusEffectTarget;

    public String explanation; ///what the user sees when selecting/hovering over an item
    public String effect; ///a note for me to know how to program it, a more detailed explanation on the functionality of the item

    Item(String name, int healthRestoration, String healthRestorationCondition, int damageBoost, String damageBoostCondition, boolean isChoice, String[] statBoost, int statBoostAmount, int damage, String damageTarget, String[] statusEffects, String statusEffectTarget, String explanation, String effect) {
        this.name = name;
        this.healthRestoration = healthRestoration;
        this.healthRestorationCondition = healthRestorationCondition;
        this.damageBoost = damageBoost;
        this.damageBoostCondition = damageBoostCondition;
        this.isChoice = isChoice;
        this.statBoost = statBoost;
        this.statBoostAmount = statBoostAmount;
        this.damage = damage;
        this.damageTarget = damageTarget;
        this.statusEffects = statusEffects;
        this.statusEffectTarget = statusEffectTarget;
        this.explanation = explanation;
        this.effect = effect;
    }
}