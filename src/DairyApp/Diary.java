package DairyApp;
import java.util.ArrayList;
import java.util.Objects;

public class Diary {
    private String userName;
    private String passWord;
    private int id;
    private boolean isLocked = true;
    private ArrayList<Entry> entry = new ArrayList<Entry>();

    public Diary(String name, String Password) {
        this.userName = name;
        this.passWord = Password;
    }

    public boolean locked() {
        return isLocked;
    }

    public int generateId() {
        id = id + 1;
        return id;
    }

    public String validatePassWord(String passWord) {
        if (Objects.equals(this.passWord,passWord)) {
            return passWord;
        }
        throw new IllegalArgumentException("Incorrect Password");
    }

    public boolean unlock(String password) {
        try {
            if (Objects.equals(validatePassWord(password),password)) {
                isLocked = false;
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Incorrect Password");
        }
        return isLocked;
    }


    public void creatEntry(String title, String body) {
        try {
            Entry entry1 = new Entry();
            entry1.entry(generateId(), title, body);
            entry.add(entry1);
            System.out.print("Id is: ");
            System.out.println(entry1.id);
        } catch (NullPointerException ex) {
            System.out.println("Gist was not Created...");
        }
    }

    public void generateTime() {
        Entry entry1 = new Entry();
        entry1.currentDateAndTime();
    }

    public int getEntrySize() {
        return entry.size();
    }

    public String getUserName() {
        return userName;
    }

    public Entry findEntryByTitle(String title) {
        for (Entry findEntry : entry) {
            if (Objects.equals(findEntry.title, title)) {
                return findEntry;

            }
        }

        throw new NullPointerException("Entry does not Exist");
    }

    public String viewDiaryByTitle(String title) {
        try {
            Entry gist = findEntryByTitle(title);
            System.out.println(findEntryByTitle(title));
            return "" + findEntryByTitle(title.toString());
        } catch (NullPointerException ex) {
            System.out.println("Gist Not Found");
        }
     return  "";
    }

    public void deleteEntry(String title) {
        try {
            Entry findEntry = findEntryByTitle(title);
            if (Objects.equals(findEntry.title, title)) {
                entry.remove(findEntry);
                System.out.println("Gist was deleted successfully");
            }
        } catch (NullPointerException ex) {
            System.out.println("Gist does not Exist");
        }

    }

    public Entry findEntryById(int id) {
        for (Entry findEntry : entry) {
            if (Objects.equals(findEntry.id, id)) {
                return findEntry;
            }
        }
        throw new NullPointerException("Gist not found");
    }

    public void updateEntry(int id, String newTitle, String newBody) {
        try {
            Entry gist = findEntryById(id);
            if (Objects.equals(findEntryById(id),id)) {
                gist.entry(id, newTitle, newBody);
                System.out.println("Gist updated successfully...");
            }
        } catch (NullPointerException ex) {
            System.out.println("Incorrect ID");
            System.out.println("Gist not found");
        }
    }

    public int findEntryIdByTitle(String title) {
        for (Entry entry1 :entry){
            if (entry1.getTitle().equalsIgnoreCase(title)){
                return entry1.getId();
            }
        }
        throw new NullPointerException("Gist Not found");
    }
}


