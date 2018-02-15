/**
 * BroodDriver.java
 * 
 * @author Sidharth Mishra <sidmishraw@gmail.com>
 * @description
 * @created Feb 12, 2018 1:40:19 PM
 * @last-modified Feb 12, 2018 1:40:19 PM
 * @copyright 2018 Sidharth Mishra
 */
package broodmother;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;

/**
 * <p>
 * The application driver.
 * </p>
 * 
 * @author sidmishraw
 *
 *         Qualified Name: broodmother.BroodDriver
 *
 */
@EnableAutoConfiguration(
        exclude = { SolrAutoConfiguration.class })
@SpringBootApplication
public class BroodDriver {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(BroodDriver.class, args);
    }
}
