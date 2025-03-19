package com.assignment.assignment.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "modules")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long passmark;
    private Boolean option;
    private Double ffLabel;
    private Boolean agLabel;
}