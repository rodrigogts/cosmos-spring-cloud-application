package com.avanade.cosmos.cloud.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("Customer")
public class CustomerModel {
    @Id
    private String id;
    private String name;
    private String document;
    private String address;
}
