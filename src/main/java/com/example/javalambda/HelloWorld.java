package com.example.javalambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorld implements RequestHandler<Request, String> {

    /**
     * @param request Any class the event json can serialize into. In this case {@link com.example.javalambda.Request}
     */
    @Override
    public String handleRequest(Request request, Context context) {

        String name;
        String country;

        if (request.getName() != null) {
            name = request.getName();
        } else {
            name = "Unknown visitor";
        }

        if (request.getAddress() != null && request.getAddress().getCountry() != null) {
            country = request.getAddress().getCountry();
        } else {
            country = "unknown";
        }

        return String.format("Hello World from Lambda, %s from %s.", name, country);
    }
}
