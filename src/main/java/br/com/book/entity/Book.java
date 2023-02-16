package br.com.book.entity;


import jakarta.persistence.*;

@Table(name = "book")
@Entity(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Author author;

    public Book(long id, String nome, Author author) {
        this.id = id;
        this.nome = nome;
        this.author = author;
    }

}
