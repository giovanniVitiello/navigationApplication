package com.example.navigationapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    //    val view = inflater.inflate(R.layout.fragment_blank, container, false)
    //
    //    view.findViewById<Button>(R.id.button).setOnClickListener {
    //        findNavController().navigate(R.id.fragment2)
    //    }
    //
    //    return view
    //}

    // O si fa come sotto nel metodo onViewCreated, oppure si dichiara la view come sopra, in modo che
    // l'inflate del fragment venga fatto, e poi alla view dalla view del fragment
    // si chiama il findViewById per il button. Altrimenti se si chiama direttamente il
    // button tramite view.find... nell'onCreateView non funziona, appunto perchè la view non è stata ancora ritornata
    // dal metodo, e quindi non è inizializzata con l'inflate del fragment.
    // Il secondo metodo appunto serve per utilizzare le variabili già dichiarate nell'onCreateView
    // dove abbiamo dichiarato la view e la usiamo per trovare il button!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button)
        button?.setOnClickListener {
            findNavController().navigate(R.id.fragment2)
        }

        val buttonToActivity2 = view.findViewById<Button>(R.id.go_to_activity)
        buttonToActivity2.setOnClickListener {
            findNavController().navigate(R.id.mainActivity2)
        }

    }

}
