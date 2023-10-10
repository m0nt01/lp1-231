package semana22;
    public class Produto {
        public String Nome;
        private static double Preco;
    
        public Produto(String nome, double preco) {
            Nome = nome;
            Preco = preco;
        }
    
        public double getPreco() {
            return Preco;
        }
    
        public static void setPreco(double preco) {
            Preco = preco;
        }
    
        @Override
        public String toString() {
            return "Produto{" +
                    "Nome='" + Nome + '\'' +
                    ", Preco=" + Preco +
                    '}';
        }

        public static void setId(int int1) {
        }

        public static void setNome(String string) {
        }

        public static void setPreco(String string) {
        }

        public static void add(Produto p1) {
        }

        public String getNome() {
            return null;
        }

        public int getId() {
            return 0;
        }
    }
    