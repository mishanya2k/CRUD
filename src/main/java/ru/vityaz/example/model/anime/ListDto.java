package ru.vityaz.example.model.anime;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import ru.vityaz.example.model.entity.Anime;

//DataTransferObject
@AllArgsConstructor
@ToString
@Getter
@Builder
public class ListDto {

    private Long id;
    private String title;
    private String genre;
    private int fame;

    public static ListDto of(Anime anime){
        return new ListDtoBuilder().title(anime.getTitle()).
                genre(anime.getGenre()).
                fame(anime.getFameOfTen()).
                build();

    }
}
