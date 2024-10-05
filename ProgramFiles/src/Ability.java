public class Ability {
    String name = "";
    String explanation = "";
    String effect = "";

    String activationCondition = "";

    String[] statBoost = {};
    int statBoostAmount = 0;

    String[] statDrop = {};
    int statDropAmount = 0;
    String statDropTarget = "";

    boolean heals = false;
    int healAmount = 0;
    String healTarget = "";
}
