package semana6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void somaDoisNumerosPositivos (){
      ///AAA
      //Arrange
double n1 = 10.0;
double n2 = 2.0;
      
     //Act
     double soma = Calculadora.somar(n1,n2);


      //Assert
     assertEquals(12.0, soma);
      
     }
    


@Test
public void somaUmNumeroPositivoEUmNegativo (){

double n1 = 10.0;
double n2 = -2.0;
  

 double soma = Calculadora.somar(n1,n2);



 assertEquals(8.0, soma);
  
 }

 @Test
 public void somaDoisNumerosNegativos (){
 
double n1 = -10.0;
double n2 = -2.0;
   

  double soma = Calculadora.somar(n1,n2);


 
  assertEquals(-12.0, soma);
   
  }

  @Test
  public void subtrairDoisNumerosPositivos (){
  
double n1 = 10.0;
double n2 = 2.0;
    

   double soma = Calculadora.subtrair(n1,n2);


 
   assertEquals(8.0, soma);
    
   }
   @Test
   public void subtrairDoisNumerosNegativos (){
   
 double n1 = -10.0;
 double n2 = -2.0;
     
 
    double soma = Calculadora.subtrair(n1,n2);
 
 
  
    assertEquals(-8.0, soma);
     
    }
    @Test
    public void subtrairUmNumeroNegativoEUmPositivo (){
    
  double n1 = 10.0;
  double n2 = -2.0;
      
  
     double soma = Calculadora.subtrair(n1,n2);
  
  
   
     assertEquals(12.0, soma);
      
     }
     @Test
     public void multiplicarDoisNumerosPositivos (){
     
   double n1 = 10.0;
   double n2 = 2.0;
       
   
      double soma = Calculadora.multiplicar(n1,n2);
   
   
    
      assertEquals(20.0, soma);
       
      }package semana6;
      @Test
      public void multiplicarDoisNumerosNegativos (){
      
    double n1 = -10.0;
    double n2 = -2.0;
        
    
       double soma = Calculadora.multiplicar(n1,n2);
    
    
     
       assertEquals(20.0, soma);
        
       }
       @Test
       public void multiplicarUmNumeroNegativoEUmPositivo (){
       
     double n1 = 10.0;
     double n2 = -2.0;
         
     
        double soma = Calculadora.multiplicar(n1,n2);
     
     
      
        assertEquals(-20.0, soma);
         
        }

        @Test
        public void dividirDoisNumerosPositivos (){
        
      double n1 = 10.0;
      double n2 = 2.0;
          
      
         double soma = Calculadora.dividir(n1,n2);
      
      
       
         assertEquals(5.0, soma);
          
         }
         @Test
         public void dividirDoisNumerosNegativos (){
         
       double n1 = -10.0;
       double n2 = -2.0;
           
       package semana6;
          @Test
          public void dividirUmNumeroPositivoEUmNegativo (){
          
        double n1 = 10.0;
        double n2 = -2.0;
            
        
           double soma = Calculadora.dividir(n1,n2);
        
        
         
           assertEquals(-5.0, soma);
            
           }

           @Test
           public void dividirComZero (){
           
         double n1 = 10.0;
         double n2 = 0.0;
             
         
            double soma = Calculadora.dividir(n1,n2);
         
         
          
            assertEquals(0.0, soma);
             
            }










}