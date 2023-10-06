/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package farm;

/**
 * @author marco.mangan@pucrs.br
 */
interface Talker {
    String talk();
}

abstract class Animal implements Talker {
    protected String name;

    public Animal(String name)  {
        // -ea assert name != null;
        if (name == null) {
            IllegalArgumentException e = new IllegalArgumentException(
                    "O animal precisa de um nome! Não pode ser null!!");
            throw e;
        }
        if (name.isBlank()) {
            IllegalArgumentException e = new IllegalArgumentException(
                    "O animal precisa de um nome! Não pode ser vazio!!");
            throw e;
        }        
        this.name = name;
    }

    public abstract String talk();
}

/// NOSSA EQUIPE

class Radio implements Talker {
    @Override
    public String talk() {
        return " ***toca música*** ";
    }
}

class Parrot extends Animal {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return this.name + " diz croc.";
    }

}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String talk() {
        return this.name + " diz au au.";
    }
}

///

public class App {
    public static void main(String[] args) {
        try {

            System.out.println("Farm!");
            Talker farm[] = {
                    new Cat("Felix"),
                    new Cat("Jefferson"),
                    new Dog("Bilu"),
                    new Parrot("José"),
                    new Radio()
            };
            for (Talker a : farm) {
                System.out.println(a.talk());
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ocorreu um erro na execução. Contacte o suporte!");
        } catch (IllegalArgumentException e) {
            System.err.println("Ocorreu um erro na execução. Contacte o suporte!");
        } finally {
            System.out.println("Obrigado por usar nossos sistemas!");
        }
    }
}
