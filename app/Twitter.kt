import com.twitter.sdk.android.core.Twitter
import kotlinx.android.synthetic.main.fragment_twitter.*

class TwitterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Twitter.initialize(requireContext())
        return inflater.inflate(R.layout.fragment_twitter, container, false)
    }
}