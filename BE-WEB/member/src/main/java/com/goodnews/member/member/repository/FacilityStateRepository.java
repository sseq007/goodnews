package com.goodnews.member.member.repository;

import com.goodnews.member.member.domain.FacilityState;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public interface FacilityStateRepository extends JpaRepository<FacilityState,Integer> {
    Optional<FacilityState> findByLatAndLon(Double lat, Double lon);

    // 특정 날짜 이후의 데이터 조회
    default List<FacilityState> findByLastModifiedDateAfter(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime targetDate = LocalDateTime.parse(dateString, formatter);
        return findByLastModifiedDateAfter(targetDate);
    }
    List<FacilityState> findByLastModifiedDateAfter(LocalDateTime lastModifiedDate);

}
