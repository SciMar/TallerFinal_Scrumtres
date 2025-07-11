class ListaEntradasFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("CICLO_VIDA", "ListaEntradasFragment - onCreateView")
        return inflater.inflate(R.layout.fragment_lista_entradas, container, false)
    }
}