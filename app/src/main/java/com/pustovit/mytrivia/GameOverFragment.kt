package com.pustovit.mytrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.pustovit.mytrivia.databinding.FragmentGameBinding
import com.pustovit.mytrivia.databinding.FragmentGameOverBinding

/**
 * A simple [Fragment] subclass.
 */
class GameOverFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentGameOverBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_game_over, container, false);
            binding.tryAgainButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_gameOverFragment2_to_gameFragment2))
        return binding.root;

    }
}


