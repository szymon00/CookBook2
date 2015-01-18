package com.example.student7.cookbook;

import com.example.student7.cookbook.data.CookBook;
import com.example.student7.cookbook.data.EmailAndPassword;
import com.example.student7.cookbook.data.User;
import com.example.student7.cookbook.data.Przepis;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Post;
import org.androidannotations.annotations.rest.RequiresHeader;
import org.androidannotations.annotations.rest.Rest;
import org.androidannotations.api.rest.RestClientHeaders;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Rest(rootUrl = "http://pegaz.wzr.ug.edu.pl:8080/rest",
        converters = { MappingJackson2HttpMessageConverter.class })
@RequiresHeader({"X-Dreamfactory-Application-Name"})
public interface CookBookRestClient extends RestClientHeaders {


    @Get("/db/recipes")
    CookBook getCookBook();
    @Post("/db/recipes")
    User email (EmailAndPassword emailAndPassword);


}