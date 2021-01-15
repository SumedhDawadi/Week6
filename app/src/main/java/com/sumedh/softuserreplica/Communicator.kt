package com.sumedh.softuserreplica

import com.sumedh.softuserreplica.model.Student

interface Communicator {
    fun passData(lstStd: ArrayList<Student>)
}