import java.util.Dictionary;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();

        Dictionary<String, Move> moveDatabase = db.moveDatabase();
    }
}