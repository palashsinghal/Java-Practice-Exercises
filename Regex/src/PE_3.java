import java.io.FileNotFoundException;
 
public class PE_3 {
    void FirstException(String msg) {
        msg = "This is bound to execute.";
        System.out.println(msg);
    }
 
    public static void main(String[] args) throws Exception {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I was here.");
        }
 
    }
}