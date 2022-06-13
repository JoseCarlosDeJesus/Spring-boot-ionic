package com.josecarlos.cursomc.services;

import org.springframework.mail.SimpleMailMessage;
import javax.mail.internet.MimeMessage;
import com.josecarlos.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);

	void sendHtmlEmail(MimeMessage msg);
}
