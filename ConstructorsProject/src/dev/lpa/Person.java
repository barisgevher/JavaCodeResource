package dev.lpa;

public record Person(String name, String dob) {

    // all the parameters in records are final and must be initialized from canonical constructor
    // Non-canonical record constructor must delegate to another constructor

//    public Person(String name, String dob) {
//        this.name = name;
//        this.dob = dob.replace('-', '/');
//    }

    public Person(Person p){
        this(p.name, p.dob);
    }

    public Person {
        if (dob == null) throw new IllegalArgumentException("Bad data");
        dob = dob.replace('-', '/');
    }
}
