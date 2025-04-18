package com.example.job_service.entity;


import jakarta.persistence.*;

@Entity
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Lob
    private String jsonData;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }
}