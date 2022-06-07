package org.gfk.exception;

import javax.sound.midi.Soundbank;
import java.security.Permission;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkPermission(Permission perm) {
                /* Allow everything else. */
            }

            @Override
            public void checkExit(int status) {
                /* Don't allow exit with any status code. */
                throw new SecurityException();
            }

        });

        try {
            //System.out.println(1/0);
            System.exit(0);
        } catch (Exception e) {

        } finally {
            System.out.println("finally");
        }
    }
}
