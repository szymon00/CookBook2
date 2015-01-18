package com.example.student7.cookbook;

import com.example.student7.cookbook.data.CookBook;
import com.example.student7.cookbook.data.Przepis;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.rest.RestService;

@EBean
public class RestBackgroundTask {
    @RootContext
    PrzepisyActivity activity;

    @RestService
    CookBookRestClient restClient;

    @Background
    void getCookBook() {
        try {
            restClient.setHeader("X-Dreamfactory-Application-Name", "cookbook");
            CookBook cookBook = restClient.getCookBook();
            publishResults (cookBook);
        }
        catch (Exception e) {
            publishError (e);
        }
    }

    @UiThread
    void publishResults ( CookBook cookBook) {
        activity.updateCookbook(cookBook);
    }

    @UiThread
    void publishError (Exception e) {
        activity.showError(e);
    }

}
