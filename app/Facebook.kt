import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsLogger
import kotlinx.android.synthetic.main.fragment_facebook.*

class FacebookFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        FacebookSdk.sdkInitialize(requireContext())
        AppEventsLogger.activateApp(requireContext())
        return inflater.inflate(R.layout.fragment_facebook, container, false)
    }
}
