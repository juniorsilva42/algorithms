// Jr Silva 22/12/2018
// Implementação simples do algoritmo criptográfico assimétrico RSA

package ciphers;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {

    private BigInteger pubkey, privKey, n;

    /**
    *
    * Implementação simples do algoritmo criptográfico assimétrico RSA
    *
    * @param bits número de bits que será gerado nas chaves pública e privada
    *
    * @references
     * https://pt.wikipedia.org/wiki/Fun%C3%A7%C3%A3o_de_Carmichael
     * https://medium.com/@tarcisiomarinho/algoritmo-de-criptografia-assim%C3%A9trica-rsa-c6254a3c7042
     * https://pt.wikipedia.org/wiki/Fun%C3%A7%C3%A3o_totiente_de_Euler
     * https://pt.khanacademy.org/computing/computer-science/cryptography/modern-crypt/v/euler-s-totient-function-phi-function
     *
    * */
    public RSA (int bits) {
        this.generatekeys(bits);
    }

    /**
     *
     * Método para gerar uma nova chave públca e privada
     *
     * @param bits número de bits das chaves
     *
     * @return void
     * */
    public synchronized void generatekeys (int bits) {
        SecureRandom random = new SecureRandom();

        // Geração de dois números primos aleatórios grandes p e q, da ordem de 10^100
        BigInteger p = new BigInteger(bits / 2, 100, random);
        BigInteger q = new BigInteger(bits / 2, 100, random);

        // Calculando n pq
        this.n = p.multiply(q);

        // Calcula o totiente de N, phi(N)
        // phi(N) = (Q-1)*(P-1)
        BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

        // Calculando a função de Carmichael
        // O menor inteiro m onde a^m = 1 (mod n), onde n = GCD(p-1, q-1)
        // GCD(phi(N), E) == 1, se não satisfazer a isso, terá que ser gerado outro número aleatório E
        this.pubkey = new BigInteger("3");
        while (m.gcd(this.pubkey).intValue() > 1)
            this.pubkey = this.pubkey.add(new BigInteger("2"));

        // chave privada inversa multiplicativa do seu módulo
        this.privKey = this.pubkey.modInverse(m);
    }

    /**
     *
     * Método para encriptar uma dada string
     *
     * @param string texto de entrada que será criptografado
     *
     * @return string
     * */
    public synchronized String encrypt (String string) {
        return (new BigInteger(string.getBytes())).modPow(this.pubkey, this.n).toString();
    }

    /**
     *
     * Método para encriptar uma string como um grande inteior primo
     *
     * @param string texto de entrada que será criptografado como um grande inteiro primo
     *
     * @return BigInteger number
     * */
    private synchronized BigInteger encrypt (BigInteger string) {
        return string.modPow(this.pubkey, this.n);
    }

    /**
     *
     * Método para desencriptar uma string encriptada
     *
     * @param encryptedMessage string encriptada que será desencriptada
     *
     * @return string
     * */
    public synchronized String decrypt (String encryptedMessage) {
        return new String((new BigInteger(encryptedMessage)).modPow(this.privKey, this.n).toByteArray());
    }

    public BigInteger getPubkey () {
        return this.pubkey;
    }

    public BigInteger getPrivKey () {
        return this.privKey;
    }

    /**
     *
     * Testes simples da classe
     *
     * */
    public static void main (String... args) {

        RSA rsa = new RSA(1024);
        String string = "https://firebase.google.com/docs/web/setup?hl=pt-br";

        String encryptedString = rsa.encrypt(string);

        System.out.println("Mensagem original: " + string + "\nMensagem encriptada: " + encryptedString);
    }

}
