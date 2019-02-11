package techConnect;
public interface UserDB {
    int getUserID(String username);
    String getPasswordHash(int id);
}