import spock.lang.Specification

class MainSpec extends Specification {
    def "testing email assignment using metaclass"() {
        given:
        def person = new Person(name: "John")

        when:
        person.metaClass.email = "test@example.com"

        then:
        person.email == "test@example.com"
    }
}
