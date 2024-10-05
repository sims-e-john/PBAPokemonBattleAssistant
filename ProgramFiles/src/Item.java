public class Item {
    String name = "";

    int healthRestoration = 0;
    String healthRestorationCondition = "";

    int damageBoost = 0;
    String damageBoostCondition = "";

    boolean isChoice = false;

    String[] statBoost = {};
    int statBoostAmount = 0;

    int damage = 0;
    String damageTarget = "";

    String[] statusEffects = {};
    String statusEffectTarget = "";

    String explanation = ""; ///what the user sees when selecting/hovering over an item
    String effect = ""; ///a note for me to know how to program it, a more detailed explanation on the functionality of the item
}