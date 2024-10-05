public class Pokemon {
    public String name;
    public String type1;
    public String type2;
    public String teraType;
    public int BST;
    public int atk;
    public int def;
    public int spA;
    public int spD;
    public int spe;
    public int hp;
    public String[] abilities;
    public String img; ///link to base image
    public String shinyImg; ///link to shiny image
    public String[] movePool;

    Pokemon(String name, String type1, String type2, String teraType, int BST, int atk, int def, int spA, int spD, int spe, int hp, String[] abilities, String img, String shinyImg, String[] movePool) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.teraType = teraType;
        this.BST = BST;
        this.atk = atk;
        this.def = def;
        this.spA = spA;
        this.spD = spD;
        this.spe = spe;
        this.hp = hp;
        this.abilities = abilities;
        this.img = img;
        this.shinyImg = shinyImg;
        this.movePool = movePool;
    }
}