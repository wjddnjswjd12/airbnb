package com.example.airbnb.controller;


import com.example.airbnb.domain.SearchConditions;
import com.example.airbnb.dto.AccommodationListDTO;
import com.example.airbnb.service.AccommodationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airbnb")
public class AccommodationController {

    private AccommodationService accommodationService;

    public AccommodationController(AccommodationService accommodationService) {
        this.accommodationService = accommodationService;
    }

    @GetMapping
    public AccommodationListDTO getSample(@RequestParam(required = false) String location,
                                          @RequestParam(required = false) String checkin,
                                          @RequestParam(required = false) String checkout,
                                          @RequestParam(required = false) Integer adults,
                                          @RequestParam(required = false) Integer children,
                                          @RequestParam(required = false) Integer infants) {
        SearchConditions conditions = new SearchConditions(location, checkin, checkout, adults, children, infants);
        return accommodationService.availableAccommodationsList(conditions);
    }

    @GetMapping("/like")
    public AccommodationListDTO likeMarkredList() {
        return accommodationService.likeMarkredList();
    }
}




