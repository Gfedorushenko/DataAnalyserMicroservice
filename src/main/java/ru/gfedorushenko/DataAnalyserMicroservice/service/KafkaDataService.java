package ru.gfedorushenko.DataAnalyserMicroservice.service;

import ru.gfedorushenko.DataAnalyserMicroservice.model.Data;

public interface KafkaDataService {
    void handle(Data data);
}
