import com.instagram.android.graphapi.GraphApi
import kotlinx.android.synthetic.main.fragment_instagram.*

class InstagramFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        GraphApi.initialize(requireContext())
        return inflater.inflate(R.layout.fragment_instagram, container, false)
    }
}

