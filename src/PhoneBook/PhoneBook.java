package PhoneBook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> abonents = new HashMap<>();

    public void addAbonent(String name, String phone) {
        abonents.put(name, phone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> abonent : abonents.entrySet()) {
            sb.append(abonent.getKey());
            sb.append(" ");
            sb.append(abonent.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

    public Map<String, String> getAbonents() {
        return abonents;
    }
}