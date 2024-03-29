package com.example.collegecookbbookapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager


class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)


        val breakfastRecyclerView
        // Initialize RecyclerViews
        val breakfastAdapter = RecipeAdapter(getDummyBreakfastRecipes())
        breakfastRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@HomepageActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = breakfastAdapter
        }

        // Initialize RecyclerViews for lunch, dinner, and snack/dessert similarly
    }

    // Dummy data for breakfast recipes
    private fun getDummyBreakfastRecipes(): List<Recipe> {
        val breakfastRecipes = generateDummyBreakfastRecipes()
        val breakfastAdapter = RecipeAdapter(breakfastRecipes)
        breakfastRecyclerView.adapter = breakfastAdapter

    }
}

