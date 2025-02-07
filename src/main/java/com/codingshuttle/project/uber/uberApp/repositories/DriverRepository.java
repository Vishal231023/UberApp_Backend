package com.codingshuttle.project.uber.uberApp.repositories;

import com.codingshuttle.project.uber.uberApp.entities.Driver;
import org.locationtech.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// in geo-spatial we have query that is optimised, to get the distance
//like ST_Distance(point1, point2)
// like ST_DWithin(point1, 10000)
@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    @Query(value = "SELECT d.*,ST_Distance(d.current_location, :pickupLocation) AS distance " +
            " FROM drivers  d " +
            "WHERE d.available = true AND ST_DWithin(d.current_location, :pickupLocation, 10000)" +
            "ORDER BY distance" +
            "LIMIT 10",nativeQuery = true)
  List<Driver> findTenNearestDrivers(Point pickupLocation);

//    @Query(value = """
//        SELECT d.*, ST_Distance(d.current_location, :pickupLocation) AS distance
//        FROM driver d
//        WHERE d.available = true
//        AND ST_DWithin(d.current_location, :pickupLocation, 5000)
//        ORDER BY d.rating DESC, distance ASC
//        LIMIT 10
//        """, nativeQuery = true)
  //List<Driver> findTenHighestRatedDrivers(Point pickupLocation);
}
