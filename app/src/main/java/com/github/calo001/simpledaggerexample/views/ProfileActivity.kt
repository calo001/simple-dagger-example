package com.github.calo001.simpledaggerexample.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.github.calo001.simpledaggerexample.R
import com.github.calo001.simpledaggerexample.models.Profile
import com.github.calo001.simpledaggerexample.utils.injector
import kotlinx.android.synthetic.main.activity_profile.*
import javax.inject.Inject

class ProfileActivity : AppCompatActivity() {
    @Inject
    lateinit var profile: Profile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        profile = injector.profile
        initUI()
    }

    private fun initUI() {
        txtNombre.text = profile.nombre
        txtCompania.text = profile.compania
        txtProfesion.text = profile.profesion
        txtCorreo.text = profile.correo
    }

    fun saludar(view: View) {
        Toast.makeText(this, profile.saludo(), Toast.LENGTH_SHORT).show()
    }
}
