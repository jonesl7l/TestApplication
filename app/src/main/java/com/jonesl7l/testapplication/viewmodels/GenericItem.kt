package com.jonesl7l.testapplication.viewmodels

import com.jonesl7l.testapplication.adapter.GenericAdapter

data class GenericItem(val title: String, val subtitle: String? = null, var defaultValue: Any? = null, val tag: String? = null, val type: GenericAdapter.GenericItemType)