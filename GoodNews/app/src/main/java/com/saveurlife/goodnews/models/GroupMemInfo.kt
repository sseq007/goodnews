package com.saveurlife.goodnews.models

import io.realm.kotlin.types.RealmInstant
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

class GroupMemInfo():RealmObject {
    @PrimaryKey
    var id: Int=0
    var groupId: Long = 0 // 위치 좌표와 전화번호 현재시각 조합하여 활용
    var name: String = ""
    var lastConnection: RealmInstant = RealmInstant.from(0,0)
    var state: Char = '0'
    var location: Location? = null

    constructor(id: Int, name:String, groupId: Long, lastConnection:RealmInstant, state:Char, location: Location): this(){
        this.id = id
        this.name = name
        this.groupId = groupId
        this.lastConnection = lastConnection
        this.state = state
        this.location = location
    }
}