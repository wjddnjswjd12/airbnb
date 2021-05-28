package com.example.airbnb.domain;

public class Accommodation {

    private Long id;
    private String title;
    private Double reviewRating;
    private Integer reviewCount;
    private Integer charge;
    private String badge;
    private String image;
    private Boolean isLike;
    private Double latitude;
    private Double longitude;

    //지도정보 필요

    public Accommodation() {
        this.id = id;
        this.title = title;
        this.reviewRating = reviewRating;
        this.reviewCount = reviewCount;
        this.charge = charge;
        this.badge = badge;
        this.image = image;
        this.isLike = isLike;
    }

    public Accommodation(Long id, String title, Double reviewRating,
                         Integer reviewCount, Integer charge, String badge,
                         String image, Boolean isLike) {
        this.id = id;
        this.title = title;
        this.reviewRating = reviewRating;
        this.reviewCount = reviewCount;
        this.charge = charge;
        this.badge = badge;
        this.image = image;
        this.isLike = isLike;
    }

    public Long getId() {
        return id;
    }

    public Accommodation setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Accommodation setTitle(String title) {
        this.title = title;
        return this;
    }

    //Integer reviewRating;
    public Double getReviewRating() {
        return this.reviewRating;
    }

    public Accommodation setReviewRating(Double reviewRating) {
        this.reviewRating = reviewRating;
        return this;
    }

    //Integer reviewCount;
    public Integer getReviewCount() {
        return this.reviewCount;
    }

    public Accommodation setReviewCount(Double reviewRating) {
        this.reviewRating = reviewRating;
        return this;
    }

    //Integer charge;
    public Integer getCharge() {
        return this.charge;
    }

    public Accommodation setCharge(Integer charge) {
        this.charge = charge;
        return this;
    }

    //String badge;
    public String getBadge() {
        return this.badge;
    }

    public Accommodation setBadge(String badge) {
        this.badge = badge;
        return this;
    }

    //Boolean isLike;
    public Boolean getIsLike() {
        return this.isLike;
    }

    public Accommodation setIsLike(Boolean isLike) {
        this.isLike = isLike;
        return this;
    }

    //String image;
    public String getImage() {
        return this.image;
    }

    public Accommodation setImage(String image) {
        this.image = image;
        return this;
    }


}
