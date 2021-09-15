package com.example.spring_boot_api.entity;


import lombok.*;

import javax.persistence.*;

@Table(name = "Student")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;


}
