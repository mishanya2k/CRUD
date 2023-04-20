package ru.vityaz.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vityaz.example.model.entity.Anime;

@Repository
public interface AnimeRepository extends JpaRepository<Anime,Long> {

}
