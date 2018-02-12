/**
 * Broodmother.java
 * 
 * @author Sidharth Mishra <sidmishraw@gmail.com>
 * @description The main driver for the Broodmother application.
 * @created Feb 6, 2018 12:45:04 PM
 * @last-modified Feb 6, 2018 12:45:04 PM
 * @copyright 2018 Sidharth Mishra
 */

package broodmother;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import broodmother.core.legioncommander.LegionCommander;

/**
 * <p>
 * Broodmother is the main driver of the application. Also, it is here where the actor system is initiated.
 * </p>
 * 
 * @author sidmishraw
 *
 *         Qualified Name: broodmother.Broodmother
 *
 */
public class Broodmother {
    
    private static final ActorSystem broodmother = ActorSystem.create("Broodmother");
    
    /**
     * <p>
     * Initiates the Broodmother actor system.
     * </p>
     */
    public static void init() {
        //
        // The actor system
        //
        final ActorRef legionCommander = broodmother.actorOf(LegionCommander.props(), "LegionCommander");
        legionCommander.tell(new LegionCommander.Command(), ActorRef.noSender());
    }
    
    public static void main(String[] args) {
        init();
        terminate();
    }
    
    public static final void terminate() {
        broodmother.terminate();
    }
}
