package de.leetgeeks.kirkwoodblaster.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String playernick;
    private Integer score;

    public Score() {
    }

    public Score(String playernick, Integer score) {
        this.playernick = playernick;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayernick() {
        return playernick;
    }

    public int getScore() {
        return score;
    }

    public void setPlayernick(String playernick) {
        this.playernick = playernick;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Score{");
        sb.append("id=").append(id);
        sb.append(", playernick='").append(playernick).append('\'');
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }
}
