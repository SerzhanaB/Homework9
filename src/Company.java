public class Company<N> implements Printable {
    N name;
    int Tin;

    public Company(N name, int Tin) {
        this.name = name;
        this.Tin=Tin;
    }
    public String PrintInfo(){
        System.out.println("Имя компании "+name+" Номер документа "+Tin);
        return null;
    }

    @Override
    public boolean equals(Object obj){
        Company Comp=(Company) obj;
       if (this.Tin==Comp.Tin) return true;
       else return false;
    }
}
