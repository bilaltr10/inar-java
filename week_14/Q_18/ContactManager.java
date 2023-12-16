package week_14.Q_18;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ContactManager {
    private Map<String, String> contacts;

    public Map<String, String> getContacts() {
        return contacts;
    }

      public ContactManager() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public String searchByName(String name) {
        return name.toUpperCase() +"'s phone number : "+contacts.get(name);

    }
    public String searchByPhoneNumber(String phoneNumber) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return phoneNumber+ " is phone number of "+ entry.getKey().toUpperCase();
            }
        }
        // Eğer değer bulunamazsa null veya başka bir değer döndürebilirsiniz.
        return null;
    }
}
