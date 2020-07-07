package com.example.springredditclone.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class SpringRedditException extends RuntimeException {

    public SpringRedditException(String exMessage) {

        super(exMessage);


    }
}
