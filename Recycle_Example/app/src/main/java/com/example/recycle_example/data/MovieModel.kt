package com.example.recycle_example.data


import android.os.Parcelable
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieModel(
        val id:String ,
        val movieName:String,
        val movieGenre:String,
        val description:String,
        val myRating:String,
) : Parcelable {
    fun toJson (): String {
        return Gson().toJson(this)
    }

    companion object {
        fun fromJson (jsonValue: String): MovieModel {
            return Gson().fromJson(jsonValue, MovieModel::class.java)
        }
    }
}

val mockMovieData = listOf<MovieModel>(MovieModel(
    "1",
    " Eternal Sunshine of the Spotless Mind",
    "Komedi / Dram",
    "Sil Baştan, ayrıldığı sevgilisinden kalan hatırlarını sildiren bir adamın hikayesini anlatıyor. İki yıl boyunca beraber olduğu sevgilisinden oldukça şaşırtıcı bir haber alan Joel Barish, bir teknolojik deneye katılan sevgilisine ilişkilerini tamamen hafızasından silinmeden hatırlatmaya çalışmaktadır. Yani Barish’in kim olduğunu bile hatırlamamaktadır. Bu gelişme üzerine küplere binen adam, aynı prosedürü kendi üzerinde de gerçekleştirmek ister.\n" +
            "Film, adamın hafızaları silinirken, yaşanılan ilişkiyi gözler önüne serer. Adam da bir kez daha oldukça iyi başlayan ve sonradan tadı kaçan ilişkiyi izler. Fakat zaman geçtikçe ve sıra yaşanılan güzel şeylere gelince, üzerindeki müdaheleyi durdurmak ister. Pişman olmuştur!" ,
    "MY Rating:8.9" ) ,
    MovieModel(
        "2",
        "Wall-e",
        "Animasyon / Macera ",
        "Vol.i, günümüzden çok uzak bir gelecekte geçmektedir. Filmde, insanoğlu aşırı kirlenme sebebiyle Dünya’yı terk edip başka bir gezegende yaşamaya başlamıştır. Çöplerle çevrili dünyayı temizleme görevi sevimli bir robota, Vol.i’ye verilir. İnsanoğlunun bıraktığı çöplerden kendine yeni bir dünya yaratan yalnız Vol.i’nin yalnızlığı, başka bir robot olan Eve’nın gelmesiyle son bulur. İki sevimli robotun arasında filizlenen dokunaklı ilişki türlü zorluklara rağmen direnmeye ve ayakta kalmaya çalışır.\n" +
                "Film tüketim çılgınlığına ve insan türünün kendi yaşadığı doğal çevreye verdiği zararlara dair önemli yorumlar yaparken geleceğin insanlığını teknolojinin esiri olmuş, tembellikten tükenmiş bir profilde çizer. Pixar stüdyolarından çıkan Oscar ödüllü Vol.i sinema tarihinin en önemli animasyonlarından biri olmanın yanısıra önemli bir bilimkurgu filmi olarak kabul ediliyor.",
        "MY Rating:9.1"),
    MovieModel(
        "3",
        "Inception",
        "Aksiyon / Bilimkurgu",
        "Leonardo DiCaprio bu yapımda, çok yetenekli bir hırsız olan \"Dom Cobb \" ile karşımızda. Uzmanlık alanı, zihnin en karanlık ve savunmasız olduğu rüya görme anında, bilinçaltının derinliklerindeki değerli sırları çekip çıkarmak ve onları çalmaktır. Cobb'un bu nadir insanlarda görülebilecek yeteneği, bu ender rastgelinebilecek mahareti, onu kurumsal casusluğun tehlikeli yeni dünyasında aranan bir oyuncu yapmıştır. \n" + "Aynı zamanda bu durum onu uluslararası bir kaçak yapmış ve sevdiği herşeye malolmuştur. Cobb'a içinde bulunduğu durumdan kurtulmasını sağlayacak bir fırsat sunulur. Ona hayatını geri verebilecek son bir iş; tabi eğer imkansız 'başlangıç'ı tamamlayabilirse. Mükemmel soygun yerine, Cobb ve takımındaki profesyoneller bu sefer tam tersini yapmak zorundadır; görevleri bir fikri çalmak değil onu yerleştirmektir. Eğer başarırlarsa, mükemmel suç bu olacaktır.",
        "MY Rating:8.8"),
    MovieModel(
        "4",
        "The Butterfly Effect",
        "Gerilim ,Bilimkurgu",
        "Yıl 2002... Evan Treborn, özellikle yoğun strese yaşadığı anlarda baygınlık geçirmektedir. Bunun nedeni ise karanlık geçmişidir... Treborn çocukluğunda cinsel tacizlere maruz kalmış ve kuvvetli psikolojik travmalar yaşamıştır. Treborn tesadüf eseri zamanda yolculuk yapıp geçmişe dönebildiğini fark eder ve geçmişinin bu bölümlerini silmek için uğraşmaya başlar. Çocukluğuna geri dönmeyi başaran genç adam geçmişini yeniden kurgulamaya başlar.\n" +
                "'Kelebek Etkisi' iki genç yönetmen Eric Bress ve J. Mackye Gruber'ın imzasını taşıyor. Bilim kurgu ve gerilim öğelerini birbirine harmanlayan yapıt gösterime girdiği dönem büyük bir ilgiyle karşılanmıştı.",
        "MY Rating:8.2" )

)





