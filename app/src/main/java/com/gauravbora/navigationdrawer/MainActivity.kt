package com.gauravbora.navigationdrawer

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.gauravbora.navigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            toggle = ActionBarDrawerToggle(
                this@MainActivity,
                drawerLayout,
                R.string.open,
                R.string.close
            )
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.home -> {
                        Toast.makeText(this@MainActivity, "Home Clicked", Toast.LENGTH_SHORT).show()
                    }
                    R.id.massages -> {
                        Toast.makeText(this@MainActivity, "Massages Clicked", Toast.LENGTH_SHORT)
                            .show()
                    }
                    R.id.sync -> {
                        Toast.makeText(this@MainActivity, "Sync Clicked", Toast.LENGTH_SHORT).show()
                    }
                    R.id.trash -> {
                        Toast.makeText(this@MainActivity, "Trash Clicked", Toast.LENGTH_SHORT)
                            .show()
                    }
                    R.id.settings -> {
                        Toast.makeText(this@MainActivity, "Settings Clicked", Toast.LENGTH_SHORT)
                            .show()
                    }
                    R.id.login -> {
                        Toast.makeText(this@MainActivity, "Login Clicked", Toast.LENGTH_SHORT)
                            .show()
                    }
                    R.id.share -> {
                        Toast.makeText(this@MainActivity, "Share Clicked", Toast.LENGTH_SHORT)
                            .show()
                    }
                    R.id.rateUs -> {
                        Toast.makeText(this@MainActivity, "Rate Us Clicked", Toast.LENGTH_SHORT)
                            .show()
                    }


                }
                true
            }

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            true
        }
        return super.onOptionsItemSelected(item)
    }
}