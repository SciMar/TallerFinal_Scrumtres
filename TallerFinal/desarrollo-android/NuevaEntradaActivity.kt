class NuevaEntradaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_entrada)
        Log.d("CICLO_VIDA", "NuevaEntradaActivity - onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CICLO_VIDA", "NuevaEntradaActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CICLO_VIDA", "NuevaEntradaActivity - onPause")
    }
}
