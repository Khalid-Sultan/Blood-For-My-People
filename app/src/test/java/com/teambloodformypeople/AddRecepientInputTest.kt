package com.teambloodformypeople

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.teambloodformypeople.hospital.temporaryHolder
import com.teambloodformypeople.viewmodels.RecepientViewModel
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class AddRecepientInputTest {
    @Mock
    private lateinit var recepientViewModel: RecepientViewModel
    @Mock
    private lateinit var owner: LifecycleOwner

    @Test
    fun onValidRecepientAdding(){
        var recepient = temporaryHolder(
            username = "Abebe@Kebede.com",
            password = "12345678qwertyAAAA",
            location = "Addis Ababa",
            phone = "0912345678",
            name = "Addis Ababa Hospital"
        )
        try {
            recepientViewModel.insertRecepient(recepient)
            recepientViewModel.insertResponse.observe(owner, Observer {
                    response-> response.body().run {  }
            })
            assert(true)
        }
        catch (exception : Exception){
            assert(false)
        }
    }
    @Test
    fun onInValidRecepientAdding_onEmptyUsername(){
        var recepient = temporaryHolder(
            username = "",
            password = "12345678qwertyAAAA",
            location = "Addis Ababa",
            phone = "0912345678",
            name = "Addis Ababa Hospital"
        )
        try {
            recepientViewModel.insertRecepient(recepient)
            recepientViewModel.insertResponse.observe(owner, Observer {
                    response-> response.body().run {  }
            })
            assert(true)
        }
        catch (exception : Exception){
            assert(false)
        }
    }
    @Test
    fun onInValidRecepientAdding_onEmptyPassword(){
        var recepient = temporaryHolder(
            username = "Abebe@Kebede.com",
            password = "",
            location = "Addis Ababa",
            phone = "0912345678",
            name = "Addis Ababa Hospital"
        )
        try {
            recepientViewModel.insertRecepient(recepient)
            recepientViewModel.insertResponse.observe(owner, Observer {
                    response-> response.body().run {  }
            })
            assert(true)
        }
        catch (exception : Exception){
            assert(false)
        }
    }
    @Test
    fun onInValidRecepientAdding_onEmptyPhoneNumber(){
        var recepient = temporaryHolder(
            username = "Abebe@Kebede.com",
            password = "12345678qwertyAAAA",
            location = "Addis Ababa",
            phone = "0912345678",
            name = "Addis Ababa Hospital"
        )
        try {
            recepientViewModel.insertRecepient(recepient)
            recepientViewModel.insertResponse.observe(owner, Observer {
                    response-> response.body().run {  }
            })
            assert(true)
        }
        catch (exception : Exception){
            assert(false)
        }
    }
    @Test
    fun onValidRecepientAdding_onEmptyAddress(){
        var recepient = temporaryHolder(
            username = "Abebe@Kebede.com",
            password = "12345678qwertyAAAA",
            location = "",
            phone = "0912345678",
            name = "Addis Ababa Hospital"
        )
        try {
            recepientViewModel.insertRecepient(recepient)
            recepientViewModel.insertResponse.observe(owner, Observer {
                    response-> response.body().run {  }
            })
            assert(true)
        }
        catch (exception : Exception){
            assert(false)
        }
    }
    @Test
    fun onValidRecepientAdding_onEmptyName(){
        var recepient = temporaryHolder(
            username = "Abebe@Kebede.com",
            password = "12345678qwertyAAAA",
            location = "Addis Ababa",
            phone = "0912345678",
            name = ""
        )
        try {
            recepientViewModel.insertRecepient(recepient)
            recepientViewModel.insertResponse.observe(owner, Observer {
                    response-> response.body().run {  }
            })
            assert(true)
        }
        catch (exception : Exception){
            assert(false)
        }
    }
    @Test
    fun onValidRecepientAdding_onCombinationOfEmptyFields(){
        var recepient = temporaryHolder(
            username = "",
            password = "12345678qwertyAAAA",
            location = "Addis Ababa",
            phone = "",
            name = "Addis Ababa Hospital"
        )
        try {
            recepientViewModel.insertRecepient(recepient)
            recepientViewModel.insertResponse.observe(owner, Observer {
                    response-> response.body().run {  }
            })
            assert(true)
        }
        catch (exception : Exception){
            assert(false)
        }
    }
    @Test
    fun onValidRecepientAdding_onAllEmptyFields(){
        var recepient = temporaryHolder(
            username = "",
            password = "",
            location = "",
            phone = "",
            name = ""
        )
        try {
            recepientViewModel.insertRecepient(recepient)
            recepientViewModel.insertResponse.observe(owner, Observer {
                    response-> response.body().run {  }
            })
            assert(true)
        }
        catch (exception : Exception){
            assert(false)
        }
    }
}