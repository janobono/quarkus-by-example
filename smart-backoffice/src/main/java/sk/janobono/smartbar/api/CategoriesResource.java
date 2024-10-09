package sk.janobono.smartbar.api;

import io.smallrye.common.annotation.NonBlocking;
import jakarta.ws.rs.core.Response;
import sk.janobono.smartbar.api.model.Category;

import java.util.List;

@NonBlocking
public class CategoriesResource implements CategoriesApi {

    @Override
    public Response categoriesCategoryIdDelete(String categoryId) {
        return null;
    }

    @Override
    public Response categoriesCategoryIdGet(String categoryId) {
        return null;
    }

    @Override
    public Response categoriesCategoryIdPut(String categoryId, Category category) {
        return null;
    }

    @Override
    public Response categoriesGet() {
        return Response.ok()
                .entity(List.of(new Category().name("drinks")))
                .build();
    }

    @Override
    public Response categoriesPost(Category category) {
        return null;
    }
}
