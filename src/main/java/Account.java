import org.apache.commons.lang3.StringUtils;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        return (name.length()>=3 && name.length()<19 && StringUtils.containsWhitespace(name) && !name.startsWith(" ") && !name.endsWith(" ") && (StringUtils.countMatches(name, " "))<2);
    }
}
