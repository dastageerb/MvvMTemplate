import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

//import com.example.mvvmtemplate.adapters.databinding.LayoutTemplate
//
//
//class MyAdapterTemplate(private val context: Context, private val onClicked: () -> Unit) :
//    ListAdapter<Adapter, MyAdapterTemplate.ViewHolder>
//        (object : DiffUtil.ItemCallback<Adapter>()
//    {
//        override fun areItemsTheSame(oldItem: Adapter, newItem: Adapter): Boolean
//        {
//            return oldItem == newItem
//        }
//
//
//        override fun areContentsTheSame(oldItem: Adapter, newItem: Adapter): Boolean
//        {
//            return oldItem.toString() == newItem.toString()
//        }
//    })
//{
//
//
//    inner class ViewHolder(private val binding: LayoutTemplate) :
//        RecyclerView.ViewHolder(binding.root)
//    {
//
//        fun bind(item: Adapter?, position: Int)
//        {
//
//
//        } // bind closed
//
//    }
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
//    {
//        val view =
//            LayoutTemplate.inflate(LayoutInflater.from(parent.context), parent, false)
//        return ViewHolder(view)
//    }
//
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int)
//    {
//        holder.bind(getItem(position), position)
//
//        holder.itemView.setOnClickListener()
//        {
//            onClicked(getItem(position))
//        }
//    } // onBindViewHolder closed
//
//}