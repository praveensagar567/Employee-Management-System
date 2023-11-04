package com.DepEmp.Department.Entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "departments")
public class Department {
    @Id
    private String departmentId;

    private String departmentName;

    @Field(name = "created_at")
    private Timestamp createdAt;

    @Field(name = "updated_at")
    private Timestamp updatedAt;

    // Getters and setters, constructors
}
