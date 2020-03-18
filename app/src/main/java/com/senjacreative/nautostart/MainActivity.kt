package com.senjacreative.nautostart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.senjacreative.autostart.NAutoStartPermissionHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val success = NAutoStartPermissionHelper.getInstance().getAutoStartPermission(this@MainActivity)
        var message = "Failed"
        if (success) message = "Successfull"
        Toast.makeText(this@MainActivity, "Action $message", Toast.LENGTH_SHORT).show()
    }
}
