package com.SpringPro.Spring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "List")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Recu  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String rno;
    private String name;
    private String cgpa;
    private String company;

}
