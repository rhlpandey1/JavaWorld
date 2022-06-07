package org.googleAuth;

import de.taimos.totp.TOTP;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;

public class GoogleAuthenticator {

    public static String generateTotp(String secretKey){
        //String secretKey= PropertiesFileReader.getInstance().getProperty("secretKey");
        Base32 base32 = new Base32();
        byte[] bytes = base32.decode(secretKey);
        String hexKey = Hex.encodeHexString(bytes);
        return TOTP.getOTP(hexKey);
    }

    public static void main(String[] args) {
        //this secret key can be generated from MFA method by replacing push with google auth
        String secretKey = "ABCDEFGHY1232453";// this is a dummy secret key
        String lastCode = null;
        while (true) {
            String code = generateTotp(secretKey);
            if (!code.equals(lastCode)) {
                System.out.println(code);
            }
            lastCode = code;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
    }
}
