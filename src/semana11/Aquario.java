package semana11;
public class Aquario{
   public double AlturaAq, ComprimentoAq, LarguraAq, TempAmb, TempAq, MinFilt, MaxFilt, VolumeAq;

    public double Volume (){
      double VolumeAq = (AlturaAq * ComprimentoAq * AlturaAq)/1000;  
      return VolumeAq;
    }
    public double Termostato (){
        return VolumeAq * 0.05 * (TempAq - TempAmb);
    }
    public double FiltragemMin (){
       MinFilt = VolumeAq * 2;
      return MinFilt;
    }
    public double FiltragemMax (){
       MaxFilt = VolumeAq * 3;
        return MaxFilt;
    }
}