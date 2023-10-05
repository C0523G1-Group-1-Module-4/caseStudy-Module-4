package com.example.cs4.booking.repository;


import com.example.cs4.booking.model.Booking;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookingRepository extends JpaRepository<Booking, Integer> {
//    @Query(value = "select * from booking where is_delete = 0",
//            nativeQuery = true)
//    Page<Booking> findAllByDeleteIs(Pageable pageable, String phoneNumber);
    @Query(value = "SELECT booking.id,booking.booking_date,booking.deposit,booking.is_deleted,booking.customer_id,booking.employee_id,booking.time_id,booking.yard_id FROM booking " +
            "JOIN customer ON booking.customer_id = customer.id " +
            "WHERE customer.phone_number LIKE :phoneNumber  order by booking.booking_date",
            nativeQuery = true)
    Page<Booking> findAllByPhone(Pageable pageable,@Param("phoneNumber") String phoneNumber);
    @Query(value = "select * from booking where is_deleted = 0",
            nativeQuery = true)
    List<Booking> findAllBooking();

}
