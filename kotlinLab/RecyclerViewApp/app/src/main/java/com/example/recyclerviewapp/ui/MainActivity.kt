package com.example.recyclerviewapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewapp.R
import com.example.recyclerviewapp.adapter.NewListAdapter
import com.example.recyclerviewapp.dto.DataDTO
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newList = ArrayList<DataDTO>()

        newList.add(DataDTO("Kahramankazan’da sokak hayvanlarına ev", "ANKARA, (DHA) -" +
                " KAHRAMANKAZAN Belediyesi Sokak Hayvanları Bakım ve Rehabilitasyon Merkezi, sokakta yaşayan hayvanlara " +
                "barınma olanağı sağlıyor.\n" +
                "Kahramankazan Belediyesi Sokak Hayvanları Bakım ve Rehabilitasyon ", R.drawable.animal))
        newList.add(DataDTO("İzmir Doğal Yaşam Parkı ailesi genişledi", "İzmir Büyükşehir Belediyesi, " +
                "kentin cazibe merkezlerinden Doğal Yaşam Parkı'ndaki hayvan sayısı ve tür çeşitliliğini yurt dışından " +
                "getirilen yeni hayvanlarla artırıyor. ", R.drawable.animal))
        newList.add(DataDTO("Kocaeli'deki 'Uzuntarla Tabiat Parkı Ormanya' hayvan popülasyonuna katkı sağlayacak",
                "Kocaeli'de dört bin dönüm alana kurulan ve 57 türden 655 hayvanın bulunduğu Uzuntarla Tabiat " +
                        "Parkı Ormanya'daki hayvanların çoğalmaları sağlanıp çevre ormanlara da salınacak.",
                R.drawable.animal))

        newList.add(DataDTO("İşte biz o gün tükeneceğiz", "Dünya Doğayı Koruma Vakfı (WWF) ve Londra Zooloji Derneği’nin hazırladığı " +
                "‘Yaşayan Gezegen 2018 Raporu’na göre gezegenimizde canlı popülasyonunun yüzde 60’ı yok oldu. " +
                "Dünya Doğayı Koruma Birliği’nin (IUCN) verilerine göre her 13 dakikada 1 canlı türü yok oluyor. " +
                "Türkiye’de de durum hiç iç açıcı değil. ", R.drawable.animal))


        recyclerView.apply {
            this.layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = NewListAdapter(newList)
        }
    }
}
