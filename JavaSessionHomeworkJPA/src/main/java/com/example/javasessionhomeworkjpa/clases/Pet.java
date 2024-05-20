package com.example.javasessionhomeworkjpa.clases;

import com.example.javasessionhomeworkjpa.enums.Breed;
import com.example.javasessionhomeworkjpa.enums.PetType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id", nullable = false)
    private int id;
    private LocalDate adoption_date;

    @Enumerated(EnumType.STRING)
    private PetType pet_type;
    private String name;
    @Enumerated(EnumType.STRING)
    private Breed breed_type;

    @ManyToOne
    @JoinColumn(name = "adopter_id")
    private Adopter adopter;

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {

    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public LocalDate getAdoptionDate() {
//        return adoption_date;
//    }
//
//    public void setAdoptionDate(LocalDate adoption_date) {
//        this.adoption_date = adoption_date;
//    }
//
//    public PetType getPetType() {
//        return pet_type;
//    }
//
//    public void setPetType(PetType petType) {
//        this.pet_type = petType;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Breed getBreedType() {
//        return breed_type;
//    }
//
//    public void setBreedType(Breed breedType) {
//        this.breed_type = breedType;
//    }
}
