package net.sparkworks;

import net.sparkworks.core.client.SparkworksClient;
import net.sparkworks.core.client.impl.SparkworksClientImpl;
import net.sparkworks.core.dto.ResourceListDTO;

/**
 * Created by kanakisn on 17/10/2016.
 */
public class Client {
    
    public static void main(String... args) {
        SparkworksClient sparkworksClient = new SparkworksClientImpl("spark", "spark", "spark", "spark", "https://api.sparkworks.net");
        ResourceListDTO resourceListDTO = sparkworksClient.listResources();
        System.out.println("Sparkworks resources are: " + resourceListDTO);
    }
}
