
package interface_virus;

class interface_virus implements virus,virus2 {

    @Override
    public void namaVirus(){
        
        System.out.println("Nama      : HIV (Human Immonudefiency Virus)");
        
    }

    @Override
    public void referensiWebsite() {
        System.out.println("Referensi : https://health.kompas.com/read/2020/03/17/120100868/16-penyakit-pada-manusia-yang-disebabkan-oleh-virus?page=all\n");
        
        
    }

    @Override
    public void targetPenyerangan() {
        
        System.out.println("\nTarget yang diserang : Sel darah putih (Sel T)\n");
        
    }

    @Override
    public void caraPenyebaran() {
        System.out.println("Cara Penularan : ");
        System.out.println("Penularan HIV dapat terjadi melalui hubungan seksual tanpa kondom, baik itu melalui vagina, anal, maupun seks oral.");
        System.out.println("Selain itu seseorang yang suka berganti-ganti pasangan seksual juga lebih berisiko untuk terkena HIV.");
        
        
    }

   
    
}
