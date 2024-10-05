public class Item {
    static String name = "";

    static int healthRestoration = 0;
    static String healthRestorationCondition = "";

    static int damageBoost = 0;
    static String damageBoostCondition = "";

    static boolean isChoice = false;

    static  String[] statBoost = {};
    static int statBoostAmount = 0;

    static int damage = 0;
    static String damageTarget = "";

    static String[] statusEffects = {};
    static String statusEffectTarget = "";

    static String explanation = ""; ///what the user sees when selecting/hovering over an item
    static String effect = ""; ///a note for me to know how to program it, a more detailed explanation on the functionality of the item
}