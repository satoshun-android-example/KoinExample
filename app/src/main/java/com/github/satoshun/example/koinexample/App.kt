package com.github.satoshun.example.koinexample

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.module

class App : Application() {
  override fun onCreate() {
    super.onCreate()

    val mymodule = module {
      single { BusinessService() }

//      single { BusinessServiceWrapper(get()) }
      factory { create<BusinessServiceWrapper>() }
    }

    startKoin(this, listOf(mymodule))
  }
}

class BusinessService
class BusinessServiceWrapper(val service: BusinessService)

class BusinessService2
