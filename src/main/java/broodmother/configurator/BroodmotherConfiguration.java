/**
 * BroodmotherConfiguration.java
 * 
 * @author Sidharth Mishra <sidmishraw@gmail.com>
 * @description
 * @created Feb 12, 2018 8:26:06 PM
 * @last-modified Feb 12, 2018 8:26:06 PM
 * @copyright 2018 Sidharth Mishra
 */
package broodmother.configurator;

import lombok.Data;
import lombok.NonNull;

/**
 * @author sidmishraw
 *
 *         Qualified Name: broodmother.configurator.BroodmotherConfiguration
 *
 */
@Data
public class BroodmotherConfiguration {
    
    /**
     * The number of spiderlings that Broodmother should spawn for crawling.
     * Defaults to 10.
     */
    @NonNull
    private Integer spiders;
    
    /**
     * The list of seed URLs from where to start crawling.
     */
    @NonNull
    private String[] seedUrls;
}
