package prac3;


public class Cuenta_Banca //Nombre de la clase
{
  private int Codigo_Cuenta;      //Codigo Cuenta Cliente
  private static double  Saldo_Cuenta;   //Saldo Actual

  public Cuenta_Banca (){} //constructor nulo
  public Cuenta_Banca (int id, double disponible) //constructor  
  { Codigo_Cuenta=id;
    Saldo_Cuenta=disponible;
  }
  
  public double  Saldo() //observador
  {return (Saldo_Cuenta);}

  public void Deposito (double Cantidad) //modificador
  {if (Saldo_Cuenta>0)
      Saldo_Cuenta=Saldo_Cuenta+Cantidad;
  }
  
  public boolean Reintegro (double Cantidad) //modificador
  {if((Cantidad <=0)||(Cantidad>Saldo_Cuenta))
    return (false);
   else {Saldo_Cuenta=Saldo_Cuenta-Cantidad;
         return (true);          
        }
  }
  
  public int Codigo () //observador
  {return (Codigo_Cuenta);}
}


