package com.example.mospolytechgid.model

class CampusModel(_name: String, _floors: Pair<Int, Int>) {
    var name: String = "Undefine"
    var floors: Pair<Int, Int> = Pair(0,0)
    init {
        name = _name
        floors = _floors
    }
}
