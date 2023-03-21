package com.gogumac.thenote.fileManage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.gogumac.thenote.R
import com.gogumac.thenote.classes.base.BaseFragment
import com.gogumac.thenote.databinding.FragmentFileManageHomeBinding
import io.reactivex.rxjava3.core.Observable

class FileManageHomeFragment : BaseFragment() {

    private lateinit var binding:FragmentFileManageHomeBinding
    private val model:FileManageHomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
//        val fileObserver= Observer<List<String>>{fileList->
//
//        } model.fileList.observe

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_file_manage_home,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter=FileManageHomeRecyclerViewAdapter()

        binding.testButton.setOnClickListener {
            model.getFile()
            Toast.makeText(requireContext(),"DOne!",Toast.LENGTH_SHORT).show()
        }

        //TODO 이거 위치 다시 공부
        model.fileList.observe(viewLifecycleOwner, Observer {
            val ex=listOf("ex" to it)
            adapter.setList(ex)
            adapter.notifyDataSetChanged()
        })

        binding.fileManageHomeContentsContainer.apply {
            setAdapter(adapter)
            setLayoutManager(LinearLayoutManager(requireContext()))
        }

        binding.testButton2.setOnClickListener {
            findNavController().navigate(FileManageHomeFragmentDirections.actionFileManageHomeFragmentToCreateNewNoteFragment())
        }
    }
}