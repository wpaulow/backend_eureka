package br.org.eureka.Eureka.security;

import javax.xml.bind.DatatypeConverter;

import br.org.eureka.Eureka.model.CadastroUsuario;

public class Autenticator {
	
private static final String PREFIXO="*GeNeRaTiOn|;";
	
	public static String generateToken(CadastroUsuario usuario) {
		String str = PREFIXO + usuario.toString();
		String token = DatatypeConverter.printHexBinary(str.getBytes());
		return token;
	}
	
	public static boolean isValid(String token) {
	    byte[] vetor = DatatypeConverter.parseHexBinary(token);
	    String novaString = new String(vetor);
	    System.out.println("DEBUG = "+ novaString);
	    if (novaString.startsWith(PREFIXO)) {
	    	return true;
	    }
	    return false;
	}
	
	public static CadastroUsuario getUserFromToken(String token) {
		String decode = new String(DatatypeConverter.parseHexBinary(token));
		
		System.out.println("Recebido = " + decode);
		String partes[] = decode.split(";");
		CadastroUsuario u = new CadastroUsuario();
		u.setIdusuario(Integer.parseInt(partes[1]));
		u.setNome(partes[2]);
		u.setEmail(partes[3]);
		return u;
	}


}
