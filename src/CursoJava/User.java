package CursoJava;

import java.util.Scanner;

public class User {


        int id;
        String nome;
        float salario;
        Scanner s2;

        public User(Scanner s1){
            s2 = s1;
        }
        public void setUsuario(){
            System.out.println("Entre com seu ID:-");
            id=s2.nextInt();

            System.out.println("Digite seu nome:-");
            nome=s2.nextLine();

            System.out.println("Digite seu salario:-");
            salario=s2.nextFloat();
        }
        public void  display(){
            System.out.println("ID= " +id);
            System.out.println("Nome= " +nome);
            System.out.println("Salario= " +salario);

        }
        class MainClass{
            public static void main(String[] args) {
                Scanner s1=new Scanner(System.in);

                User obj=new User(s1);
                obj.setUsuario();
                obj.display();
            }
        }
    }

