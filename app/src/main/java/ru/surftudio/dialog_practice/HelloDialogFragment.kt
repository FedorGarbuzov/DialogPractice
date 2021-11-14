package ru.surftudio.dialog_practice

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class HelloDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setMessage("Привет!")
            .setPositiveButton("Закрыть") { _, _ ->
                dismiss()
            }
            .create()
    }
}