package org.example.demo.ticket.business.contract.manager;

import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.springframework.stereotype.Component;

import java.util.List;


public interface ITicketManager {

    public Ticket getTicket(Long pNumero) throws NotFoundException;
    List<Ticket> getListTicket(RechercheTicket pRechercheTicket);
    int getCountTicket(RechercheTicket pRechercheTicket);
}
