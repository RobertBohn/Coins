package com.springapp.mvc.data;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.springapp.mvc.model.Coin;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class CoinDao {

    AmazonDynamoDBClient dynamoDBClient;

    public CoinDao() {
        AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider().getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException("Cannot load the credentials from the credential profiles file. Please make sure that your credentials file is at the correct location (~/.aws/credentials), and is in valid format.", e);
        }
        dynamoDBClient = new AmazonDynamoDBClient(credentials);
        dynamoDBClient.setRegion(Region.getRegion(Regions.US_EAST_1));
    }

    public List<Coin> getCoins() {
        List list = new ArrayList();
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
