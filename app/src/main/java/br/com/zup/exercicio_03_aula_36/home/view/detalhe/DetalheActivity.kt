package br.com.zup.exercicio_03_aula_36.home.view.detalhe

import androidx.appcompat.app.AppCompatActivity

class DetalheActivity: AppCompatActivity() {
//    private lateinit var binding: ActivityDetalheBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityDetalheBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        supportActionBar?.setTitle("Detalhe do álbum")
//
//        recuperarMusical()
//    }
//
//    private fun recuperarMusical(){
//        val musicaShow = intent.getParcelableExtra<Musica>(MUSICA_KEY)
//
//        if (musicaShow != null){
//            exibirInformacoes(musicaShow)
//        }
//    }
//
//    private fun exibirInformacoes(musica: Musica){
//          binding.ivMusicaImagem.setImageResource(musica.getImagem())
//          binding.tvNomeMusicaDetalhe.text = musica.getNome()
//          binding.tvMusicaDescricao.text = musica.getDetalhe()
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (item.itemId == android.R.id.home) {
//            this.finish()
//            return true
//        }
//        return super.onOptionsItemSelected(item)
//    }
}