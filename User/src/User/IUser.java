package User;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

/**
 * Created by Alex on 3/3/2016.
 */
public interface IUser
{
    //Alex Additions/Modifications Start
    void PopulateCurrentUser(String userName) throws SQLException; //XX
    List<String> getAchievements(); //This needs to return a list of achievements not names
    //Alex Additions/Modifications End

    boolean userExists(String username) throws SQLException; //XX
    boolean createNewUser(String username, String password, Boolean isAdmin) throws SQLException; //XX
    String getUsername(); //XX
    public int getUserId(); //XX
    boolean isCorrectLogin(String username, String password) throws SQLException;
    boolean isAdmin() throws SQLException; //XX
    void addFriend(int friendUserId) throws SQLException;
    void removesFriend(int friendUserId);
    void addAchievement(UserAchievements.Achievements achievement);
    Integer getNumberOfUsers() throws SQLException; //XX
    boolean FriendsupExists(int userId) throws SQLException;

    //AdminTasks
    void promoteToAdmin(String userToPromote);
    void DeleteUser(String userName) throws SQLException; //XX
    Set<String> getAllUsers();

    //QuizTasks
    void addQuizScore(String quizId, Double grade);
    void removeQuiz(String username, String quizId);
    Double getQuizScore(String quizId); //TO DELETE, you can have multiple attempts on same quiz, method doesnt make sense
    Integer getNumberOfQuizzesTaken();
    void addCreatedQuiz(String quizId);
    Integer getNumberOfQuizzesCreated();
    List<String> getRecentlyCreatedQuizzes();

}
