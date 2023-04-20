package ru.vityaz.example.model.entity;

import jakarta.persistence.*;
import jdk.jfr.Registered;
import lombok.*;

@Table(name = "anime")
@Getter
@Setter
@Registered
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String genre;
    private int fameOfTen;
    private String title1;
}
