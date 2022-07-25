package com.ezequiel.aulas.aula17;

public interface EmailService {

	boolean enviarEmail(String assunto, String emailDestinatario, String conteudo, byte anexo);
	
	String checarEmailEnviado(String assunto);
}
