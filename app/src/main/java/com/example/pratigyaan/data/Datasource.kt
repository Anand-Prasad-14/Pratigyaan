package com.example.pratigyaan.data

import com.example.pratigyaan.R
import com.example.pratigyaan.model.Affirmation


class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1,R.drawable.strong),
            Affirmation(R.string.affirmation2,R.drawable.villiars),
            Affirmation(R.string.affirmation3,R.drawable.surya),
            Affirmation(R.string.affirmation4,R.drawable.malinga),
            Affirmation(R.string.affirmation5,R.drawable.kane),
            Affirmation(R.string.affirmation6,R.drawable.jasprit),
            Affirmation(R.string.affirmation7,R.drawable.dhoni),
            Affirmation(R.string.affirmation8,R.drawable.chris),
            Affirmation(R.string.affirmation9,R.drawable.buttler),
            Affirmation(R.string.affirmation10,R.drawable.rohit)
        )
    }
}