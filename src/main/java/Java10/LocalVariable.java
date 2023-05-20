package Java10;

import java.util.ArrayList;
import java.util.List;

public class LocalVariable {
    public static void main(String[] args) {

        /*
            When we use var, we don't provide the data type of message. Instead, we mark the message as a var, and the compiler infers the type of message
            from the type of the initializer present on the right-hand side.

            Note that this feature is available only for local variables with the initializer. It cannot be used for member variables, method parameters,
            return types, etc – the initializer is required as without which compiler won't be able to infer the type.

            Another thing to note is that var is not a keyword – this ensures backward compatibility for programs using var say, as a function or variable name.
            var is a reserved type name, just like int.

            Finally, note that there is no runtime overhead in using var nor does it make Java a dynamically typed language. The type of the variable is still
            inferred at compile time and cannot be changed later.
        */
        GameEngine gameEngine = new GameEngine();
        gameEngine.respawn("Murat");

        System.out.println("Items: " + gameEngine.setItems());
    }
}

class GameEngine {
    public void respawn(String name) {
        var location = "38° 53′ 35″";
        var respawnText = "Welcome back champion " + name;

        System.out.println(respawnText);
        System.out.println(location);
    }

    public ArrayList<String> setItems() {
        var items = new ArrayList<String>();
        items.add("Knife");
        items.add("Armor");
        items.add("50 Coins");
        return items;
    }
}
