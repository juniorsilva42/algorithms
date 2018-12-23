package ciphers;

import java.math.BigInteger;

public class RSA {

    private BigInteger pubkey, privKey, modulus;

    public RSA (int bits) { }

    public synchronized String encrypt (String string) {
        return (new BigInteger(string.getBytes())).modPow(pubkey, modulus).toString();
    }

    public synchronized BigInteger encrypt (BigInteger string) {
        return string.modPow(pubkey, modulus);
    }
}
