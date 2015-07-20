// Build a class called Deal with 3 properties
// Strings of name, url, 
// integer(int) of price
// when one sets the value on name, url is also set to the lower case version of name (.toLowerCase()


// instantiate the class
// setting the variable name to "deal"

// set name equal to "Daily Deal"
// set price = 5


// These must pass
assert deal.name == "Daily Deal"
assert deal.price == 5
assert deal.url == "daily deal"
deal.name = "Hello"
assert deal.url == "hello"