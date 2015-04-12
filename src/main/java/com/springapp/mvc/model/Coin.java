package com.springapp.mvc.model;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.HashMap;

public class Coin implements Comparable<Coin> {
    private String id;
    private String type;
    private String menu;
    private String title;
    private String description;
    private String notes;
    private String certified;
    private String obverse;
    private String reverse;
    private String slab_obverse;
    private String slab_reverse;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCertified() {
        return certified;
    }

    public void setCertified(String certified) {
        this.certified = certified;
    }

    public String getObverse() {
        return obverse;
    }

    public void setObverse(String obverse) {
        this.obverse = obverse;
    }

    public String getReverse() {
        return reverse;
    }

    public void setReverse(String reverse) {
        this.reverse = reverse;
    }

    public String getSlab_obverse() {
        return slab_obverse;
    }

    public void setSlab_obverse(String slab_obverse) {
        this.slab_obverse = slab_obverse;
    }

    public String getSlab_reverse() {
        return slab_reverse;
    }

    public void setSlab_reverse(String slab_reverse) {
        this.slab_reverse = slab_reverse;
    }

    public static Coin getInstance(HashMap<String, AttributeValue> item) {
        Coin coin = new Coin();

        coin.setId(item.get("id").getS());
        coin.setType(item.get("type").getS());
        coin.setMenu(item.get("menu").getS());
        coin.setTitle(item.get("title").getS());
        coin.setDescription(item.get("description").getS());
        coin.setObverse(item.get("obverse").getS());
        coin.setReverse(item.get("reverse").getS());

        coin.setSlab_obverse(item.get("slab_obverse") == null ? null : item.get("slab_obverse").getS());
        coin.setSlab_reverse(item.get("slab_reverse") == null ? null : item.get("slab_reverse").getS());
        coin.setNotes(item.get("notes") == null ? null : item.get("notes").getS());
        coin.setCertified(item.get("certified") == null ? null : item.get("certified").getS());

        return coin;
    }

    @Override
    public int compareTo(Coin o) {
        if (this.getType().equals(o.getType())) {
            return this.getMenu().compareTo(o.getMenu());
        } else {
            return o.getType().compareTo(this.getType());
        }
    }
}
