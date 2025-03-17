import java.sql.*;
import java.util.Scanner;

public class OPO {
    private static final String URL = "jdbc:sqlite:students.db";

    public static void main(String[] args) {
        try (Connection conn = connect()) {
            createTable(conn);
            Scanner Scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nМәзір:");
                System.out.println("1. Жаңа студент қосу");
                System.out.println("2. Барлық студенттерді көру");
                System.out.println("3. Белгілі бір студентті өшіру");
                System.out.println("4. Шығу");
                System.out.print("Таңдауыңызды енгізіңіз: ");
                int choice = Scanner.nextInt();
                Scanner.nextLine(); // Enter-ді тазалау

                switch (choice) {
                    case 1:
                        System.out.print("Жаңа студенттің атын енгізіңіз: ");
                        String name = Scanner.nextLine();
                        addStudent(conn, name);
                        break;
                    case 2:
                        getAllStudents(conn);
                        break;
                    case 3:
                        System.out.print("Өшіргіңіз келетін студенттің ID-ін енгізіңіз: ");
                        int id = Scanner.nextInt();
                        deleteStudent(conn, id);
                        break;
                    case 4:
                        System.out.println("Бағдарлама аяқталды.");
                        return;
                    default:
                        System.out.println("Қате таңдау! Қайта енгізіңіз.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Қате: " + e.getMessage());
        }
    }

    // Дерекқорға қосылу
    private static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    // Кестені құру
    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL)";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }

    // Жаңа студент қосу
    private static void addStudent(Connection conn, String name) {
        String sql = "INSERT INTO students (name) VALUES (?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            System.out.println("Студент сәтті қосылды!");
        } catch (SQLException e) {
            System.out.println("Қате: " + e.getMessage());
        }
    }

    // Барлық студенттерді шығару
    private static void getAllStudents(Connection conn) {
        String sql = "SELECT * FROM students";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\nСтуденттер тізімі:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ". " + rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println("Қате: " + e.getMessage());
        }
    }

    // Белгілі бір студентті өшіру
    private static void deleteStudent(Connection conn, int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Студент өшірілді!");
            } else {
                System.out.println("Берілген ID бар студент табылмады.");
            }
        } catch (SQLException e) {
            System.out.println("Қате: " + e.getMessage());
        }
    }
}