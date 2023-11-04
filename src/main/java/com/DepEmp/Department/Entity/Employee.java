package com.DepEmp.Department.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Hibernate column mapping for 'id'
    private Long id;

    @Column(name = "first_name") // Hibernate column mapping for 'firstName'
    private String firstName;

    @Column(name = "last_name") // Hibernate column mapping for 'lastName'
    private String lastName;

    @Column(name = "email") // Hibernate column mapping for 'email'
    private String email;

    @Column(name = "department_id") // Hibernate column mapping for 'departmentId'
    private String departmentId;
}
