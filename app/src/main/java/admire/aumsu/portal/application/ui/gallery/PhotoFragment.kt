package admire.aumsu.portal.application.ui.gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_photo.view.*

import admire.aumsu.portal.application.R

class PhotoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_photo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide.with(requireView().photo).load(requireArguments().getString(GALLERY_PHOTO_KEY)).into(requireView().photo)
    }

    companion object {
        const val GALLERY_PHOTO_KEY = "gallery_photo"
    }
}
