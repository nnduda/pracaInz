package com.webapplication.website.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "2019rok")
public class Voivodeship {

    @Id
    private String id;
    @Field(name = "-nazwa")
    private String name;
    @Field(name = "-ogolem")
    private long togetherSum;
    @Field(name = "-mezczyzni")
    private long manSum;
    @Field(name = "-kobiety")
    private long womenSum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTogetherSum() {
        return togetherSum;
    }

    public void setTogetherSum(long togetherSum) {
        this.togetherSum = togetherSum;
    }

    public long getManSum() {
        return manSum;
    }

    public void setManSum(long manSum) {
        this.manSum = manSum;
    }

    public long getWomenSum() {
        return womenSum;
    }

    public void setWomenSum(long womenSum) {
        this.womenSum = womenSum;
    }

    @Override
    public String toString() {
        return "Voivodeship{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", togetherSum=" + togetherSum +
                ", manSum=" + manSum +
                ", womenSum=" + womenSum +
                '}';
    }
}
