package exercise05.question01;

public class HandleName {
    public String CapitalizeName(String name) {
        String[] names = name.split(" ");
        String result = "";
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > 0) {
                result += names[i].substring(0, 1).toUpperCase() + names[i].substring(1) + " ";
            }
        }
        return result.trim();
    }
}
