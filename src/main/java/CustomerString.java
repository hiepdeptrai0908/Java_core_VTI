public class CustomerString {
    public String capitalize(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        String[] words = string.split(" ");
        String result = "";


        for (String word : words) {
            if (!word.isEmpty()) {
                result = result.concat(Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ");
            }
        }

        return result.trim();
    }
}
