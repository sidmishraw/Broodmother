/**
 * LegionCommander.java
 * 
 * @author Sidharth Mishra <sidmishraw@gmail.com>
 * @description
 * @created Feb 6, 2018 12:52:32 PM
 * @last-modified Feb 6, 2018 12:52:32 PM
 * @copyright 2018 Sidharth Mishra
 */
package broodmother.core.legioncommander;

import akka.actor.AbstractActor;
import akka.actor.Props;

/**
 * @author sidmishraw
 *
 *         Qualified Name: broodmother.core.legioncommander.LegionCommander
 *
 */
public class LegionCommander extends AbstractActor {
    
    /*
     * (non-Javadoc)
     * 
     * @see akka.actor.AbstractActor#createReceive()
     */
    @Override
    public Receive createReceive() {
        return receiveBuilder().match(Command.class, c -> {
            System.out.println("Received");
        }).build();
    }
    
    //
    // Props
    //
    public static Props props() {
        return Props.create(LegionCommander.class, () -> new LegionCommander());
    }
    
    //
    // Messages
    //
    public static class Command {
        
    }
    
}
