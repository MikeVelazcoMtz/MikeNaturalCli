/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mikenaturalcli;
import java.util.Date;
import java.util.HashSet;
import org.naturalcli.*;

/**
 *
 * @author usuario
 */
public class MikeNaturalCli{

    /**
     * @param args the command line arguments
     * @throws org.naturalcli.ExecutionException
     * @throws org.naturalcli.InvalidSyntaxException
     */
    public static void main(String[] args) throws ExecutionException, InvalidSyntaxException  {
        // TODO code application logic here
        Command showDateCommand = 
      new Command(
      "show date", 
      "Shows the current date and time", 
      new ICommandExecutor()
    {
      public void execute(ParseResult pr) {
        System.out.println(new Date().toString());
      }
    });
    Command helloWorldCommand = 
      new Command(
      "hello world", 
      "Says hello.", 
      new ICommandExecutor()
    {
      public void execute(ParseResult pr) {
        System.out.println("Hello world!");
      }
    });
    HashSet cs = new HashSet();
    cs.add(showDateCommand);
    cs.add(helloWorldCommand);

    String str = "show date";
    String str2 = "hello world";
    new NaturalCLI(cs).execute(args);
    }
    
}
