
import static org.junit.Assert.assertTrue;
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
        assertTrue("These values should be equal",p1.getHP()==p2.getHP() && p1.getMaxHP()==p2.getMaxHP() &&
        p1.getDamageDealt()==p2.getDamageDealt());
    }

}