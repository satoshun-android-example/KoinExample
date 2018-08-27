package com.github.satoshun.example.koinexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
  private val service: BusinessService by inject()
  private val serviceWrapper: BusinessServiceWrapper by inject()

  private val crash: BusinessService2 by inject()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)

    service
    serviceWrapper

    val w: BusinessServiceWrapper = get()

//    crash
  }
}
