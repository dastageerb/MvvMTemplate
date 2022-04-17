package com.example.mvvmtemplate.ui.fragments

import BaseFragment
import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import com.example.mvvmtemplate.R
import com.example.mvvmtemplate.databinding.FragmentHomeBinding
import com.example.mvvmtemplate.ui.viewModels.MainViewModel
import com.example.mvvmtemplate.utils.Constants
import com.example.mvvmtemplate.utils.extensionFunctions.ContextExtension.showToast


class HomeFragment : BaseFragment<FragmentHomeBinding>()
{

    val viewModel:MainViewModel by viewModels()


    override fun createView(inflater: LayoutInflater, container: ViewGroup?, root: Boolean): FragmentHomeBinding
    {
        return FragmentHomeBinding.inflate(inflater,container,false)
    }



    private val multiPermissionCallback =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions())
        {
                map ->
            //handle individual results if desired
            map.entries.forEach()
            { entry ->
                when (entry.key)
                {
                    Manifest.permission.READ_EXTERNAL_STORAGE-> if(entry.value)
                    {
                        getImageFromGallery()
                    }else
                    {
                        permissionDenied("App Needs Permission to Pick Image")
                    }
                    Manifest.permission.CAMERA -> if(entry.value)
                    {
                        //captureImage()
                    }else
                    {
                        permissionDenied("App Needs Permission to Capture Image")
                    }
                } // when closed

            } // forEach closed
        } // ActivityResult Contract closed


    private fun permissionDenied(msg:String)
    {
        requireContext().showToast(msg)
        startActivity(
            Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply ()
            {
                data = Uri.fromParts("package", Constants.APP_PACKAGE_NAME, null)
            })
    }// permissionDenied



    private fun getImageFromGallery()
    {
        selectImageFromGalleryResult.launch("image/*")
    } // getImageFromGallery closed



    private val selectImageFromGalleryResult = registerForActivityResult(ActivityResultContracts.GetContent())
    { uri: Uri? ->
        uri?.let()
        {
            // pass the uri to  image cropper
        }
    } //




} // HomeFragment closed
