package sk.janobono.smartbar.service;

import jakarta.enterprise.context.ApplicationScoped;
import sk.janobono.smartbar.api.model.Category;

@ApplicationScoped
public class CategoriesService {

    public Category get() {
        return new Category().name("drinks");
    }
}
