package com.dharmpal.student.demo.entities;

/**
 * @Prashant
 * This class will provide the rating
 *
 */

public enum Rating {

    ONE("POOR"),
    TWO("GOOD"),
    THREE("VERYGOOD"),
    FOUR("EXCELLENT"),
    FIVE("OUTSTANDING");

    private String ratingType;

    Rating(String ratingType) {
        this.ratingType = ratingType;
    }

    public String getRatingType() {
        return ratingType;
    }
}
