package com.springapp.mvc.data;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.springapp.mvc.model.Coin;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

@Component
public class CoinDao {

    private AmazonDynamoDBClient dynamoDBClient;

    private static Logger logger = Logger.getLogger(CoinDao.class);

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
            Coin coin = new Coin();
            HashMap<String, AttributeValue> item = (HashMap<String, AttributeValue>) scanResult.getItems().get(i);
            coin.setMenu(item.get("menu").getS());
            list.add(coin);
        }
        return list;
    }
}
