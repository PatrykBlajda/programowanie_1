package sda.JVM;
import java.lang. *;
import java.util.Properties;
public class JvmTest {
            public static void main(String[] args) {

                System.out.println("java.vm.name: " + System.getProperty("java.vm.name"));
                System.out.println("------------------------------");

                System.out.println("home: " + System.getProperty("java.home"));
                System.out.println("------------------------------");


                System.out.println("java version: " + System.getProperty("java.version"));
                System.out.println("------------------------------");

                System.out.println("vendor: " + System.getProperty("java.vendor"));
                System.out.println("------------------------------");

                System.out.println("java specyfication: " + System.getProperty("java.specification.vendor"));

            }
        }
