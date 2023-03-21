package com.gogumac.thenote.createNewNote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.gogumac.thenote.R
import com.gogumac.thenote.classes.base.BaseFragment
import com.gogumac.thenote.databinding.FragmentCreateNewNoteBinding

class CreateNewNoteFragment:BaseFragment() {

    private lateinit var binding:FragmentCreateNewNoteBinding
    private val model:CreateNewNoteViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_create_new_note,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //노트 생성 버튼 클릭
        binding.createNewNoteComplete.setOnClickListener {
            val noteName=binding.createNewNoteNoteName.getText()
            noteName?.let{
                model.createNewNote(noteName.toString())
                findNavController().popBackStack()
            }

        }
    }
}