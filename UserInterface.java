
/**
 *
 * @author Lavinia
 */


import java.io.*;
import java.util.*;

public class UserInterface {
    public static ArrayList<Recipe> readRecipesFromFile(String filename) throws IOException {
        ArrayList<Recipe> recipes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String name = line;
                int cookingTime = Integer.parseInt(reader.readLine().trim());
                List<String> ingredients = new ArrayList<>();
                while ((line = reader.readLine()) != null && !line.trim().isEmpty()) {
                    ingredients.add(line);
                }
                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        }
        return recipes;
    }
}
