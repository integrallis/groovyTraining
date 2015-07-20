
list = [1,2,3,4]

assert list.size == list.size()
assert list.class == ArrayList.class
// creating a list

list = new LinkedList()

assert list.class == LinkedList.class

// or

list = []

assert list.class == LinkedList.class

// Adding to a list

list << 1
list.add(2)

assert list == [1,2]

assert list.size == 2

def map = [:]

// note its getclass for maps
assert map.getClass() == LinkedHashMap.class

map.put("name", "joe")
assert map.get("name") == "joe"

map["name"] = "john"
assert map["name"] == "john"

map."name" = "jim"
assert map."name" == "jim"

map.name = "julie"
assert map.name == "julie"


// Need the  () this time
assert 1 == map.size()