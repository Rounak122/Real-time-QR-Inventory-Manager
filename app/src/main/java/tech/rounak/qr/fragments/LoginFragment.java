package tech.rounak.qr.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import tech.rounak.qr.R;

public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        NavController navController = NavHostFragment.findNavController(this);

        View v =  inflater.inflate(R.layout.fragment_login, container, false);


//
//
//        binding.textInputLayout.getEditText().addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
////            Do Nothing
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
////            Do Nothing
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//                binding.textInputLayout.setError(null);
//
//            }
//        });
//
//        binding.btnReg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                FragmentNavigator.Extras extras = new FragmentNavigator.Extras.Builder()
//                        .addSharedElement(binding.gradientDrawable, binding.gradientDrawable.getTransitionName())
//                        .build();
//
//
//                Navigation.findNavController(binding.getRoot()).navigate(R.id.registrationNavigation,null,null,extras);
//
//            }
//        });



        return v;

    }

}