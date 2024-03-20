import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aryan.eneready.databinding.SearchStationCardBinding
import com.aryan.eneready.models.CardItem
import com.aryan.eneready.models.CardItem2

class CardAdapter(private val dataList: List<CardItem>) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = SearchStationCardBinding.inflate(inflater, parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val data = dataList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class CardViewHolder(private val binding: SearchStationCardBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: CardItem) {
            binding.apply {
                openvalleytext.text = data.openValleyText
                availabletext.text = data.availableText
                imageView.setImageResource(data.imageResource)
                singaporetext.text = data.singaporeText
                starticon.setImageResource(data.startIconResource)
                textView4.text = data.textView4Text
                standicon.setImageResource(data.standIconResource)
                gasstationid.setImageResource(data.gasStationIdResource)
                textView5.text = data.textView5Text
                standicon2.setImageResource(data.standIcon2Resource)
                routingicon.setImageResource(data.routingIconResource)
                textView6.text = data.textView6Text
            }
        }
    }
}
