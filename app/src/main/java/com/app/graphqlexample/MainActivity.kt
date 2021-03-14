package com.app.graphqlexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.apollographql.apollo.ApolloClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apolloClient = ApolloClient.builder()
            .serverUrl("https://countries.trevorblades.com")
            .build()
        val response = apolloClient.query(LaunchListQuery()).await()
        Log.d("LaunchList", "Success ${response?.data}")
    }
}