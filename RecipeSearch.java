import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String filename = scanner.nextLine();
        
        List<Recipe> recipes;
        try {
            recipes = UserInterface.readRecipesFromFile(filename);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "list":
                    listRecipes(recipes);
                    break;
                case "find name":
                    findByName(recipes, scanner);
                    break;
                case "find cooking time":
                    findByCookingTime(recipes, scanner);
                    break;
                case "find ingredient":
                    findByIngredient(recipes, scanner);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }

    private static void listRecipes(List<Recipe> recipes) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    private static void findByName(List<Recipe> recipes, Scanner scanner) {
        System.out.print("Searched word: ");
        String name = scanner.nextLine();
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(recipe);
            }
        }
    }

    private static void findByCookingTime(List<Recipe> recipes, Scanner scanner) {
        System.out.print("Max cooking time: ");
        int maxTime = Integer.parseInt(scanner.nextLine());
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }

    private static void findByIngredient(List<Recipe> recipes, Scanner scanner) {
        System.out.print("Ingredient: ");
        String ingredient = scanner.nextLine();
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
