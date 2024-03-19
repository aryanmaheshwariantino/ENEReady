import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aryan.eneready.R
import com.aryan.eneready.models.CardItem

class CardAdapter(private val dataList: List<CardItem>) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.search_station_card, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val data = dataList[position]

        holder.openvalleytext.text = data.openValleyText
        holder.availabletext.text = data.availableText
        holder.imageView.setImageResource(data.imageResource)
        holder.singaporetext.text = data.singaporeText
        holder.starticon.setImageResource(data.startIconResource)
        holder.textView4.text = data.textView4Text
        holder.standicon.setImageResource(data.standIconResource)
        holder.gasstationid.setImageResource(data.gasStationIdResource)
        holder.textView5.text = data.textView5Text
        holder.standicon2.setImageResource(data.standIcon2Resource)
        holder.routingicon.setImageResource(data.routingIconResource)
        holder.textView6.text = data.textView6Text
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var openvalleytext: TextView = itemView.findViewById(R.id.openvalleytext)
        var availabletext: TextView = itemView.findViewById(R.id.availabletext)
        var imageView: ImageView = itemView.findViewById(R.id.imageView)
        var singaporetext: TextView = itemView.findViewById(R.id.singaporetext)
        var starticon: ImageView = itemView.findViewById(R.id.starticon)
        var textView4: TextView = itemView.findViewById(R.id.textView4)
        var standicon: ImageView = itemView.findViewById(R.id.standicon)
        var gasstationid: ImageView = itemView.findViewById(R.id.gasstationid)
        var textView5: TextView = itemView.findViewById(R.id.textView5)
        var standicon2: ImageView = itemView.findViewById(R.id.standicon2)
        var routingicon: ImageView = itemView.findViewById(R.id.routingicon)
        var textView6: TextView = itemView.findViewById(R.id.textView6)
    }
}
