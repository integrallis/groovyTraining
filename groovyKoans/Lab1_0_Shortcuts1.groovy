class User {
    String name
    def email
    Country country
}

class Country {
  String name
}
// create a user called user with name "Jim"

// create an if expression and test it that if name == "Jim" 
// you print out "Hello Jim"


// make this pass:
def user = new User()
if (user.country.name == "USA") {
  println "USA"
}

// create 2 new users
// one with country having a name USA other with a country UK
// print a list of the countries names (Hint :Spread operator)

