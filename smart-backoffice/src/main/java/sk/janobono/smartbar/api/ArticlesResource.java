package sk.janobono.smartbar.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import sk.janobono.smartbar.api.model.Article;
import sk.janobono.smartbar.service.ArticlesService;

import java.util.List;

public class ArticlesResource implements ArticlesApi {

    private final ArticlesService articlesService;

    @Inject
    public ArticlesResource(final ArticlesService articlesService) {
        this.articlesService = articlesService;
    }

    @Override
    public Response articlesArticleIdDelete(final String articleId) {
        return null;
    }

    @Override
    public Response articlesArticleIdGet(final String articleId) {
        return Response.ok(articlesService.get()).build();
    }

    @Override
    public Response articlesArticleIdPut(final String articleId, final Article article) {
        return null;
    }

    @Override
    public Response articlesGet() {
        return Response.ok(List.of(articlesService.get())).build();
    }

    @Override
    public Response articlesPost(final Article article) {
        return null;
    }
}
