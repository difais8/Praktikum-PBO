public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        else{
            System.out.println("Angka "+angka+" bukan angka sial");
        }
    }

    public static void main(String[] args){
        AngkaSial angkasial = new AngkaSial();
        try{
            angkasial.cobaAngka(10);
            angkasial.cobaAngka(13);
            angkasial.cobaAngka(12);
        }
        catch(AngkaSialException sial){
            System.out.println(sial.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }
}
