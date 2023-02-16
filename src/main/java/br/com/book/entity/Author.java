package br.com.book.entity;

import jakarta.persistence.*;

@Table(name = "author")
@Entity(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "nome")
    private String nome;

    public Author(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
