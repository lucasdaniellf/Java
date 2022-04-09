/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prontuarioConfig;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author lucas
 */
public class Criptografia {
    
    public static String CriptografiaMD5(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException  {
     
        String SenhaCriptografada;
        //Criando uma instância de um algoritmo de criptografia Message Digest utilizando MD5
        MessageDigest algoritmo = MessageDigest.getInstance("MD5");  //objeto pronto para criptografar utilizando MD5

       //Atualizando a senha em uma mensagem do tipo MessageDigest
       algoritmo.update(senha.getBytes(), 0, senha.length());

       //Convertendo em uma  mensagem em base Hex - base 16 (String)
       SenhaCriptografada = new BigInteger(1, algoritmo.digest()).toString(16);
       return SenhaCriptografada;
    }   
}
