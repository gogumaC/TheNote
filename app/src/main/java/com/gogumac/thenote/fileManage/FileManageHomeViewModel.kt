package com.gogumac.thenote.fileManage

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gogumac.thenote.TheNote
import java.io.File

class FileManageHomeViewModel: ViewModel() {
//파비콘fovicon

    val fileList: MutableLiveData<List<String>> by lazy{ MutableLiveData<List<String>>() }
    init{
        val files:Array<String> =TheNote.ApplicationContext().fileList()
        Log.d("FILE","${files.toList()}")
    }

    fun getFile(){
        val files:Array<String> =TheNote.ApplicationContext().fileList()
        fileList.setValue(files.toList())
        Log.d("FILEDODODO","${files.toList()}")
    }

    fun makeFile(){
        val fileName="test1"
        val fileContents="test1!"
        TheNote.ApplicationContext().openFileOutput(fileName, Context.MODE_PRIVATE).use{
            it.write(fileContents.toByteArray())
        }
    }
}

