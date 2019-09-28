package com.sda.team.greta_exceptions.custom;

public class CatAteTooMuchException extends RuntimeException {

    public CatAteTooMuchException(Cat cat) {
        super("Cat " + cat + " ate too much!");
    }
}
