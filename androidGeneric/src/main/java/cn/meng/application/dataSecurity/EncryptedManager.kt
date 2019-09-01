package cn.meng.application.dataSecurity

import java.lang.StringBuilder
import java.security.MessageDigest
import kotlin.experimental.and


class EncryptedManager {


    /**
     * The basic idea is to map data sets of variable length to data sets of fixed length
     * The result is 128-bit hash value, typically a 32-digit hexadecimal number
     *
     */
    fun md5Hash(info: String): String{
        val generateHash: String
        val md = MessageDigest.getInstance("MD5")
        md.update(info.toByte())

        val bytes = md.digest()
        var sb = StringBuilder()
//        for (item in bytes) {
//
//        }
        return ""
    }


//    private fun getSalt(): Byte {
//
//    }


    fun generateReliablePassword(originPassword: String): String{

        return ""
    }






}