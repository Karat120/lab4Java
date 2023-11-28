public class Brain {

    private int iq;
    private int size;

    public static int Chromosome;
    public   Brain() {
            this.iq = 0;
            this.size = 0;
        }
    public  Brain(int iq, int size) {
            this.iq = iq;
            this.size = size;
        }
     public static int GetChromosome() {
            return Chromosome;
        }
      public  static void SetChromosome(int value) {
            Chromosome = value;
        }
       void display(){
           System.out.println ("IQ= " + this.iq+"\n");
           System.out.println ("Size= "+ this.size+"\n" ) ;
           System.out.println("Chromosome= " + Chromosome+"\n") ;
       }

}
