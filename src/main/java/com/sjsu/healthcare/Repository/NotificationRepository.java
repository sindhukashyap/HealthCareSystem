package com.sjsu.healthcare.Repository;

import com.sjsu.healthcare.Model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface NotificationRepository extends MongoRepository<Notification, String> {
    public ArrayList<Notification> findByPatientId(String patientId);
}
