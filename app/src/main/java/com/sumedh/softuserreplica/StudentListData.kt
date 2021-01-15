package com.sumedh.softuserreplica

import com.sumedh.softuserreplica.model.Student

class StudentListData private constructor(){
    var mylist =ArrayList<Student>()

    fun list(): ArrayList<Student>{
        return mylist
    }

    companion object {
        private val data = StudentListData()
        fun get(): StudentListData {
            return data
        }
    }
}