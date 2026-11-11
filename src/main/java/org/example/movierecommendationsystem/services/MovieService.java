package org.example.movierecommendationsystem.services;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private EmbeddingModel embeddingModel;

    public MovieService(EmbeddingModel embeddingModel){
        this.embeddingModel = embeddingModel;
    }

    public void search(String query){
        embeddingModel.embed(query);
    }

}
