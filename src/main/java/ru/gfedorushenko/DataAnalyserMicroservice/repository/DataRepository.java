package ru.gfedorushenko.DataAnalyserMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gfedorushenko.DataAnalyserMicroservice.model.Data;

public interface DataRepository extends JpaRepository<Data, Long> {
}