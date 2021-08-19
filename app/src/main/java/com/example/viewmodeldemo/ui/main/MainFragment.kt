package com.example.viewmodeldemo.ui.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo.R
import com.example.viewmodeldemo.databinding.MainFragmentBinding

class MainFragment : Fragment() {




    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
      binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false) //
    // присоединяем вью через дата биндинг
        binding.lifecycleOwner = this //установка владельца жизненного пути приложения
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java) // связь с вьюмодель
        // TODO: Use the ViewModel

        binding.setVariable(myViewModel, viewModel) // сохраняем переменные для связи с вью модел


    }


}