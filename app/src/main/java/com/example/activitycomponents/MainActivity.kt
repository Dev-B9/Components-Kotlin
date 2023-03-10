package com.example.activitycomponents

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Switch
import android.widget.Toast
import android.widget.ImageButton
import android.widget.ToggleButton


class MainActivity : AppCompatActivity() {
    var nameData: EditText? = null
    var ageData: EditText? = null
    var radioData1: RadioButton? = null
    var radioData2: RadioButton? = null
    var checkBoxData1: CheckBox? = null
    var checkBoxData2: CheckBox? = null
    var toogleData: ToggleButton? = null
    var switchData: Switch? = null
    var imageBtnInfo = ""



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val getData: Button = findViewById(R.id.getData)
        val imageBtnData: ImageButton = findViewById(R.id.imageBtn)
        nameData= findViewById(R.id.editTextName)
        ageData= findViewById(R.id.editTextTEdad)
        radioData1 = findViewById(R.id.radioButton1)
        radioData2 = findViewById(R.id.radioButton2)
        checkBoxData1 = findViewById(R.id.checkBox1)
        checkBoxData2 = findViewById(R.id.checkBox2)
        toogleData = findViewById(R.id.toggleButton)
        switchData=findViewById(R.id.switch1)



        getData.setOnClickListener{data()}
        imageBtnData.setOnClickListener{ imageBtnInfo = "Image: ON" }

        }



    private fun data(){
        var radioBtns = " "
        var checkBox = ""
        var toogleInfo = ""
        var switchInfo = ""




        val dataName = nameData?.text.toString()
        val dataAge = ageData?.text.toString()



        if(radioData1?.isChecked==true){
            radioBtns = "Seleccionado: RadioBtn1"
        }
        if(radioData2?.isChecked==true){
            radioBtns = "Seleccionado: RadioBtn2"
        }
        if(checkBoxData1?.isChecked==true){
            checkBox += " Check Box 1,"
        }
        if(checkBoxData2?.isChecked==true){
            checkBox += "Check Box 2,"
        }

        if(toogleData?.isChecked==true){
            toogleInfo = "Toogle: ON"
        }else{
            toogleInfo = "Toogle: OFF"
        }
        if(switchData?.isChecked==true){
            switchInfo = "Switch: ON"
        }else{
            switchInfo = "Switch: OFF"
        }

        Toast.makeText(
            this, "Wenas !! \n Nombre: $dataName \n Edad: $dataAge \n $radioBtns \n Seleccionado: $checkBox \n $toogleInfo \n $switchInfo \n $imageBtnInfo",
            Toast.LENGTH_LONG
        ).show()
    }
}