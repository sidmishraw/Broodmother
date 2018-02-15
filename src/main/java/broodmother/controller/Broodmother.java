/**
 * Broodmother.java
 * 
 * @author Sidharth Mishra <sidmishraw@gmail.com>
 * @description The main driver for the Broodmother application.
 * @created Feb 6, 2018 12:45:04 PM
 * @last-modified Feb 6, 2018 12:45:04 PM
 * @copyright 2018 Sidharth Mishra
 */

package broodmother.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import broodmother.configurator.BroodmotherConfiguration;

/**
 * 
 * @author sidmishraw
 *
 *         Qualified Name: broodmother.controller.Broodmother
 *
 */
@RestController
public class Broodmother {
    
    @RequestMapping(
            path = "/start",
            method = RequestMethod.POST,
            consumes = { "application/json" })
    public String start(@RequestParam(
            name = "config",
            required = true) BroodmotherConfiguration broodConfig) {
        return "Broodmother has started.";
    }
    
    @RequestMapping(
            path = "/shutdown",
            method = RequestMethod.GET)
    public String shutdown() {
        return "Broodmother has shutdown.";
    }
}
