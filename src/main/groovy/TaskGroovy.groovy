def countElements(list) {
    list.countBy { it }
}

def list = [1, 3, 4, 5, 1, 5, 4]
def result = countElements(list)
println result