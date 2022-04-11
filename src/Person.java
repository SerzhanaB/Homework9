public class Person<N> implements Printable {
    N name;
    int doc;

    public Person(N name, int doc) {
        this.name = name;
        this.doc=doc;
    }
    public String PrintInfo(){
        System.out.println("Имя человека "+name+" Номер документа "+doc);

        return null;
    }
    @Override
    public String toString(){
        return "Имя персоны "+name;

    };
}
