package TestePG;

import java.lang.*;

public class Pimentao implements Comparable
        private String tipo;
        private String color;
        private double tamanho;
        private double peso;

            public Pimentao() {
            public int compareTo{(Object obj){


                Pimentao p2 = (Pimentao) obj;
                int resposta = 0;

                if (this.getPeso() > p2.getPeso())
                    resposta = 1;

                if (this.getPeso() < p2.getPeso())
                    resposta = -1;

                return resposta;
            }
        }