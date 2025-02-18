package com.SpringPro.Spring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Alumini")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Alumini {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String year;
    private String department;
    private String phone;
    private String linkedin;
    private String git;
    private String company;
    private String salary;
    private String exp;
}
