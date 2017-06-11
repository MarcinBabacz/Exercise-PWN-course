package gatunki;

public class Chromosom {
	int dlugoscRamion;
	int nrChromosomu;
	boolean pluciowy;
	
	Chromosom(int dlugoscRamion, int nrChromosomu){
		if(dlugoscRamion>=0){
			this.dlugoscRamion = dlugoscRamion;
		}
		if(nrChromosomu>0){
			this.nrChromosomu = nrChromosomu;
		}
		this.pluciowy = false;
	}
	Chromosom(int dlugoscRamion, int nrChromosomu, boolean pluciowy){
		this(dlugoscRamion, nrChromosomu);
		this.pluciowy = pluciowy;
	}
	
	void printInfo(){
		System.out.println("Numer chromosomu: "+ nrChromosomu + " d³ugoœæ ramion: " + dlugoscRamion );
	}


}
