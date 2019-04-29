/*
 * Copyright 2018 Arthur Ivanets, arthur.ivanets.l@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.arthurivanets.sample.di.modules.fragments

import androidx.lifecycle.ViewModelProviders
import com.arthurivanets.mvvm.ViewModelProviderFactory
import com.arthurivanets.sample.ui.dashboard.DashboardFragment
import com.arthurivanets.sample.ui.dashboard.DashboardViewModel
import com.arthurivanets.sample.ui.dashboard.DashboardViewModelImpl
import dagger.Module
import dagger.Provides

@Module
class DashboardModule {


    @Provides
    fun provideDashboardViewModel(fragment : DashboardFragment) : DashboardViewModel {
        val viewModelFactory = ViewModelProviderFactory(DashboardViewModelImpl())
        return ViewModelProviders.of(fragment, viewModelFactory).get(DashboardViewModelImpl::class.java)
    }


}