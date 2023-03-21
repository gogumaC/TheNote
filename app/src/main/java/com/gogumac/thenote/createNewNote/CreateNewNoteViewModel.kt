package com.gogumac.thenote.createNewNote

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.gogumac.thenote.TheNote
import java.util.*

class CreateNewNoteViewModel: ViewModel() {


    fun createNewNote(name:String){
        val fileName=name
        val fileContents="test ${Date()}"
        TheNote.ApplicationContext().openFileOutput(fileName, Context.MODE_PRIVATE).use{
            it.write(fileContents.toByteArray())
        }

        Toast.makeText(TheNote.ApplicationContext(),"DONE!",Toast.LENGTH_SHORT).show()
    }
}