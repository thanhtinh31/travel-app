package com.example.travelapp.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourServiceRequest {
    Long id_tour;
    Long id_service;
}
