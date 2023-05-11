package semana11;
public class Aquario{
    double AlturaAq, ComprimentoAq, LarguraAq, TempAmb, TempAq, MinFilt, MaxFilt,VolumeAq;

    public double Volume (){
      double VolumeAq = (AlturaAq * ComprimentoAq * LarguraAq)/1000;
        return VolumeAq;
    }
    public double Termostato (){
        return VolumeAq * 0.05 * (TempAq - TempAmb);
    }
    public double FiltragemMin (){
      double MinFilt = VolumeAq * 2;
      return MinFilt;
    }
    public double FiltragemMax (){
        double MaxFilt = VolumeAq * 3;
        return MaxFilt;
    }
}