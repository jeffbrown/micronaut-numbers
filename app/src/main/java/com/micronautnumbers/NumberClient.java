package com.micronautnumbers;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("http://numbersapi.com/")
public interface NumberClient {

    @Get("/{number}?json")
    NumberInfo researchNumber(String number);
}
