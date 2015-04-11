package com.springapp.mvc.data;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.model.*;
import com.springapp.mvc.model.Coin;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class CoinDao {

    private AmazonDynamoDBClient dynamoDBClient;

    @Autowired
    private Properties properties;

    @PostConstruct
    private void initialize() {
        BasicAWSCredentials credentials = new BasicAWSCredentials(properties.getProperty("aws.access.key"), properties.getProperty("aws.secret.key"));
        dynamoDBClient = new AmazonDynamoDBClient(credentials);
        dynamoDBClient.setRegion(Region.getRegion(Regions.US_EAST_1));
    }

    public List<Coin> getCoins() {
        List<Coin> list = new ArrayList<Coin>();
        ScanRequest scanRequest = new ScanRequest("coins");
        ScanResult scanResult = dynamoDBClient.scan(scanRequest);
        for (int i = 0; i < scanResult.getCount(); i++) {
            list.add(Coin.getInstance((HashMap<String, AttributeValue>) scanResult.getItems().get(i)));
        }
        Collections.sort(list);
        return list;
    }

    public Coin get(String id) {
        GetItemRequest request = new GetItemRequest().withTableName("coins").addKeyEntry("id", new AttributeValue(id) );
        GetItemResult result = dynamoDBClient.getItem(request);
        return Coin.getInstance((HashMap<String, AttributeValue>) result.getItem());
    }
}
