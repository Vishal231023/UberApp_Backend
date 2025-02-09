package com.codingshuttle.project.uber.uberApp.services.impl;

import com.codingshuttle.project.uber.uberApp.services.DistanceService;
import lombok.Data;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    private static final String OSRM_API_BASE_URL = "https://router.project-osrm.org/route/v1/driving/";

    @Override
    public double calculateDistance(Point src, Point dest) {
        try {
            String uri = src.getX()+","+src.getY()+";"+dest.getX()+","+dest.getY();
            OsrmResponseDto osrmResponseDto = RestClient.builder()
                    .baseUrl(OSRM_API_BASE_URL)
                    .build()
                    .get()
                    .uri(uri)
                    .retrieve()
                    .body(OsrmResponseDto.class);
            return osrmResponseDto.getRoutes().get(0).getDistance() / 1000.0;

        } catch (Exception e) {
            throw new RuntimeException("Error getting data from Osrm" + e.getMessage());
        }

    }
}

@Data
class OsrmResponseDto {
    private List<OsrmRoute> routes;

}

@Data
class OsrmRoute {
    private Double distance;
}
