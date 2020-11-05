package com.e.utssoal2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createFakData()
        rv_part.layoutManager = LinearLayoutManager(this)
        rv_part.setHasFixedSize(true)
        rv_part.adapter = FakAdapter(testData, { fakItem: FakData -> resepItemClicked(fakItem)})
    }
    private fun resepItemClicked(fakItem: FakData) {
        val showDetailActivityIntent = Intent(this, FakDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, fakItem.namaFak.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, fakItem.descFak.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, fakItem.fotoFak.toString())
        showDetailActivityIntent.putExtra(Intent.ACTION_PICK, fakItem.web.toString())
        showDetailActivityIntent.putExtra(Intent.ACTION_CALL, fakItem.email.toString())
        startActivity(showDetailActivityIntent)
    }
    private fun createFakData() : List<FakData> {
        val partList = ArrayList<FakData>()
        partList.add(FakData("Fakultas Ilmu Komputer",
            "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                    "\t1. Prodi S1 Teknik Informatika\n" +
                    "\t2. Prodi S1 Sistem Informasi", R.drawable.fik,
                "https://fik.upnjatim.ac.id/", "fik@upnjatim.ac.id"))
        partList.add(FakData("Fakultas Teknik",
            "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                    "\t1. Prodi S1 Teknik Kimia\n" +
                    "\t2. Prodi S1 Teknik Industri\n" +
                    "\t3. Prodi S1 Teknik Sipil\n" +
                    "\t4. Prodi S1 Teknik Lingkungan\n" +
                    "\t5. Prodi S1 Teknologi Pangan", R.drawable.ft,
            "https://ft.upnjatim.ac.id/", "ft@upnjatim.ac.id"))
        partList.add(FakData("Fakultas Ekonomi Dan Bisnis",
            "Fakultas Ekonomi Dan Bisnis merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                    " \t1. Prodi S1 Ekonomi Pembangunan\n" +
                    "\t2. Prodi S1 Akuntansi\n" +
                    "\t3. Prodi S1 Manajemen", R.drawable.feb,
            "https://febis.upnjatim.ac.id/", "feb@upnjatim.ac.id"))
        partList.add(FakData("Fakultas Pertanian",
            "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                    "\t1. Prodi S1 Agroteknologi\n" +
                    "\t2. Prodi S1 Agribisnis", R.drawable.fp,
            "https://faperta.upnjatim.ac.id/", "fp@upnjatim.ac.id"))
        partList.add(FakData("Fakultas Arsitektur Dan Desain",
            "Fakultas Arsitektur Dan Desain merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                    "\t1. Prodi S1 Arsitektur\n" +
                    "\t2. Prodi S1 Desain Komunikasi Visual", R.drawable.fad,
            "https://fad.upnjatim.ac.id/", "fad@upnjatim.ac.id"))
        partList.add(FakData("Fakultas Ilmu Sosial Dan Ilmu Politik",
            "Fakultas Ilmu Sosial Dan Ilmu Politik merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                    "\t1. Prodi S1 Ilmu Komunikasi\n" +
                    "\t2. Prodi S1 Ilmu Administrasi Negara\n" +
                    "\t3. Prodi S1 Ilmu Administrasi Bisnis\n" +
                    "\t4. Prodi S1 Hubungan Internasional", R.drawable.fisip,
            "https://fisip.upnjatim.ac.id/", ""))
        partList.add(FakData("Fakultas Hukum",
            "Fakultas Hukum merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" +
                "\t1. Prodi S1 Ilmu Hukum", R.drawable.fh,
            "https://fhukum.upnjatim.ac.id/", ""))
        partList.add(FakData("Pratama Puji Ariyanto",
            "TTL : Sidoarjo, 26 Agustus 2000\n" +
                    "Alamat : Jl. Tropodod 1 Barat No. 319B\n" +
                    "No Telp : +62838-3069-4069\n\n" +
                    "Riwayat Pendidikan :\n"+
                    "\t1. SDN Tropodo 1\n" +
                    "\t2. SMP Buana Waru\n" +
                    "\t3. SMKS Senopati Sedati", R.drawable.profile,
            "https://github.com/pratamapujia/",
            "18082010016@student.upnjatim.ac.id"))
        return partList
    }
}