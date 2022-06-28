package br.edu.utfpr.confeitaria.model;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Cliente extends Model{

    @Id @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;
}
