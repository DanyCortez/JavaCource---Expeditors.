package com.example.javasessionhomeworkjpa.domain;

import com.example.javasessionhomeworkjpa.clases.Adopter;
import com.example.javasessionhomeworkjpa.repositories.AdopterRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JPAAdopter implements IJPAAdopter{

    private AdopterRepository adopterRepository;

    @Override
    public List<Adopter> getAll() {

        return (List<Adopter>) adopterRepository.findAll();
    }


}
