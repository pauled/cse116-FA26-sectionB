
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import week2.Player;

public class PlayerTests{
    @Test
    public void testPlayer(){
        Player p1=new Player(4);
        Player p2=new Player(4);
        //assertTrue("These should be equal",p1==p2);
        //in java && is and
        // || is or
        // ! is not
        //assertTrue("These values should be equal",p1.getHP()==p2.getHP() && p1.getMaxHP()==p2.getMaxHP() &&
        assertEquals("Should have equal health",p1.getHP(), p2.getHP());
        //p1.getDamageDealt()==p2.getDamageDealt());
        double x=5.5;
        double y=5.500000001;
        assertEquals("i want this to be true", x,y,.001);
        String str1="this example";
        String str2="this ";
        String str3="example";
        String str4=str2+str3;
        System.out.println(str1==str4);
        System.out.println("out: "+str1.equals(str4));
    }

}