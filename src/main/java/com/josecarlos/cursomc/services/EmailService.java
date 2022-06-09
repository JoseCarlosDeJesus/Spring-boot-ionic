package com.josecarlos.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.josecarlos.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
