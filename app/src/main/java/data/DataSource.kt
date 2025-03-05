package data

import com.example.listacomida_2025_2.R
import model.Platillo

class DataSource {
    fun LoadPlatillos(): List<Platillo>{
        return listOf<Platillo>(
            Platillo(R.string.desayuno, R.drawable.desayuno),
            Platillo(R.string.hamburgesa, R.drawable.hamburgesa),
            Platillo(R.string.pizza, R.drawable.pizza),
            Platillo(R.string.postre, R.drawable.postre),
            Platillo(R.string.pozole, R.drawable.pozole),
            Platillo(R.string.tacos, R.drawable.tacos),
        )
    }
}