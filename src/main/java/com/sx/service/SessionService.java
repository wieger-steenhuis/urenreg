package com.sx.service;

import com.sx.models.Session;
import com.sx.models.Subscription;
import com.sx.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public void initSessions(Subscription subscription){
        for (int i = 0; i < subscription.getSubscrType().getSessions(); i++) {
            Session session = new Session();
            session.setSubscription(subscription);
            this.sessionRepository.save(session);
        }
    }
}
