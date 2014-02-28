package org.wordpress.android.networking;

import com.android.volley.RequestQueue;
import com.wordpress.rest.RestClient;

public interface RestClientFactoryAbstract {
    public RestClient make(RequestQueue queue);
}