
// Make these all pass
def list = __

assert list.class == LinkedList.class
/// add 1,2,3 to the list
assert list.contains(1)
assert list.contains(2)
assert list.contains(3)

def map = __

assert map.'apple' == 4
assert map.size() == 5

list = [1,2,3,[4,5,6, [7]]]

assert list.flatten() == __

list = [1,2,3,4,5,5,6,7] as Set
assert list.size() == __

// ABOVE HERE ARE WORKING
// BELOW ARE GROOVY TRUTHS and Null Safe Check
def x
// make true
assert x.george() == null

// Make it return true
x = __
if (x) assert true
else assert false

// make it return false
List y
if (y) assert false
else assert true
