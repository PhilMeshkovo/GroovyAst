class Main {
    static void main(String[] args) {
        def person = new Person(name: "Phil")
        person.metaClass.email = "meshkovo1977@mail.ru"

        println "Name: ${person.name}"
        println "Email: ${person.email}"
    }
}
