package com.SpringPro.Spring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "drive")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Drive {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String image;
    private String job;
    private String salary;
    private String description;
    private String location;
    private String round;

}
