package sk.janobono.smartbar.service;

import jakarta.enterprise.context.ApplicationScoped;
import sk.janobono.smartbar.api.model.Article;

@ApplicationScoped
public class ArticlesService {

    public Article get() {
        return new Article().name("cola");
    }
}
