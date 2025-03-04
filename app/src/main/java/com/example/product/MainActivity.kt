package com.example.product

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.product.ui.theme.ProductTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProductTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color =MaterialTheme.colorScheme.background
                ){
                    ProductDetail("Miền Bắc sắp đón hai đợt không khí lạnh","bao1","Miền Bắc sắp đón hai đợt không khí lạnh, trong đó đợt đầu tiên ngày 4-5/3 có cường độ yếu","Gia Chính","3/2/2025");
                }

            }
        }
    }
}

@Composable
fun ProductList(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .height(65.dp)
                .padding( bottom = 5.dp)
                .background(Color(android.graphics.Color.parseColor( "#2b92e4")))
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                tint = Color.White,
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "Báo mới hôm nay",
                color = Color.White,
                fontSize = 16.sp,
                modifier = modifier
                    .fillMaxWidth()
            )
        }

        ProductItem("Miền Bắc sắp đón hai đợt không khí lạnh","bao1","Miền Bắc sắp đón hai đợt không khí lạnh, trong đó đợt đầu tiên ngày 4-5/3 có cường độ yếu","Gia Chính","3/2/2025");
        ProductItem("Miền Bắc sắp đón hai đợt không khí lạnh","bao1","Miền Bắc sắp đón hai đợt không khí lạnh, trong đó đợt đầu tiên ngày 4-5/3 có cường độ yếu","Gia Chính","3/2/2025");
        ProductItem("Miền Bắc sắp đón hai đợt không khí lạnh","bao1","Miền Bắc sắp đón hai đợt không khí lạnh, trong đó đợt đầu tiên ngày 4-5/3 có cường độ yếu","Gia Chính","3/2/2025");
        ProductItem("Miền Bắc sắp đón hai đợt không khí lạnh","bao1","Miền Bắc sắp đón hai đợt không khí lạnh, trong đó đợt đầu tiên ngày 4-5/3 có cường độ yếu","Gia Chính","3/2/2025");
        ProductItem("Miền Bắc sắp đón hai đợt không khí lạnh","bao1","Miền Bắc sắp đón hai đợt không khí lạnh, trong đó đợt đầu tiên ngày 4-5/3 có cường độ yếu","Gia Chính","3/2/2025");
        ProductItem("Miền Bắc sắp đón hai đợt không khí lạnh","bao1","Miền Bắc sắp đón hai đợt không khí lạnh, trong đó đợt đầu tiên ngày 4-5/3 có cường độ yếu","Gia Chính","3/2/2025");
        ProductItem("Miền Bắc sắp đón hai đợt không khí lạnh","bao1","Miền Bắc sắp đón hai đợt không khí lạnh, trong đó đợt đầu tiên ngày 4-5/3 có cường độ yếu","Gia Chính","3/2/2025");
        ProductItem("Miền Bắc sắp đón hai đợt không khí lạnh","bao1","Miền Bắc sắp đón hai đợt không khí lạnh, trong đó đợt đầu tiên ngày 4-5/3 có cường độ yếu","Gia Chính","3/2/2025");

    }
}

@Composable
fun ProductItem(name: String,image:String,detail:String,author:String,time: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current;
    val imageId = remember(image) {
        context.resources.getIdentifier(image, "drawable", context.packageName)
    }
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp)

    ){
        if (imageId != 0) { // Kiểm tra nếu tìm thấy resource
            Image(
                painter = painterResource(imageId),
                contentDescription = image,
                modifier = Modifier
                    .padding(end = 10.dp)
                    .fillMaxWidth(1f / 3f)
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(8.dp))


            )
        }
        Column {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ){

                Text(
                    text = "$time",
                    color = Color.LightGray,
                    modifier = Modifier
                        .padding(end = 15.dp)
                )
                var isLiked by remember { mutableStateOf(false) }

                IconButton(
                    onClick = {isLiked = !isLiked },
                ) {
                    Icon(
                        imageVector = if (isLiked) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                        contentDescription = null,
                    )
                }
            }
            Text(
                text = "$name",
                fontWeight = FontWeight.Bold,

            )
            Text(
                text = "$detail...",
                fontSize = 13.sp,
                color = Color.DarkGray

            )

            Text(
                text = "$author",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
            )



        }
    }

}
@Composable
fun ProductDetail(name: String,image:String,detail:String,author:String,time: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(top = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .background(Color(android.graphics.Color.parseColor("#27a4f2")))
                .height(40.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Báo hay",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .background(Color(android.graphics.Color.parseColor("#27a4f2")))
                    .padding(start = 10.dp)
            )
            Icon(
                imageVector = Icons.Outlined.Menu,
                contentDescription = null,
                tint = Color.White,
            )
        }
        Column (
            modifier = Modifier.padding(10.dp)
        ){


            Text(
                text = "$time",
                color = Color.LightGray,
                textAlign = TextAlign.Start,

            )
            Text(
                text = "$name",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(

                text = "Miền Bắc sắp đón hai đợt không khí lạnh, trong đó đợt đầu tiên ngày 4-5/3 cường độ yếu, đợt thứ hai vào ngày 6/3 mạnh hơn, gây rét.\n" +
                        "\n" +
                        "Trung tâm Dự báo Khí tượng Thủy văn quốc gia cho biết đầu tuần tới miền Bắc tiếp tục chịu ảnh hưởng của rìa tây nam lưỡi áp cao suy yếu biến tính, kết hợp với rìa phía nam rãnh áp thấp nối với vùng áp thấp phía tây nên Đông Bắc Bộ mưa nhỏ, sương mù về đêm và sáng, trưa chiều trời hửng nắng.\n" +
                        "\n" +
                        "Tây Bắc Bộ đêm mưa nhỏ, ngày trời nắng, một số nơi nắng nóng, nhiệt độ dao động 29-32 độ, có nơi cao hơn 33-34 độ C.\n" +
                        "\n" +
                        "Ngày 4-5/3, không khí lạnh cường độ yếu sẽ ảnh hưởng miền Bắc; đến ngày 6/3 tăng cường mạnh hơn khiến miền Bắc chuyển rét, mưa lan từ đông sang tây.",
                modifier = Modifier
                    .padding(top = 10.dp)
            )
            Image(
               painter = painterResource(R.drawable.bao1full),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            )
            Text(
                text = "Trang Accuweather của Mỹ dự báo nhiệt độ Hà Nội tuần sau giảm dần mỗi ngày 2-4 độ C, nếu như đầu tuần 21-26 độ thì cuối tuần còn 12-15 độ C. Điểm cao trên 1.500 m như Sa Pa (Lào Cai) nền nhiệt giảm từ 13-24 xuống 7-12 độ C.\n" +
                        "\n" +
                        "Ở miền Trung, các tỉnh từ Thanh Hóa đến Bình Thuận ba ngày đầu tuần ít mưa, ban ngày nắng, nhiệt độ phổ biến 28-32 độ C, có nơi cao hơn. Ngày 5-6/3, do ảnh hưởng của khối khí lạnh dồn xuống, các tỉnh Thanh Hóa đến Hà Tĩnh có mưa, chuyển rét. Từ 7/3, các tỉnh thành Quảng Bình - Huế cũng sẽ chuyển lạnh.\n" +
                        "\n" +
                        "Nam Bộ và Tây Nguyên đang trong cao điểm của mùa khô nên ít mưa. Nhiệt độ cao nhất trong ngày ở Tây Nguyên phổ biến 31-34 độ, có nơi trên 35 độ C. Nam Bộ dao động 32-35 độ, có nơi nắng nóng trên 35 độ C.",

            )
            Text(
                text = "Gia Chính",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
            )

            Text(
                text = "Bình luận",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Row {
                var text by remember { mutableStateOf("") }
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Bình luận") },
                    trailingIcon =  { Icon(Icons.Filled.Send, contentDescription = null) },
                    modifier = Modifier
                        .fillMaxWidth()
                )

            }
            Text(

            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProductTheme {
        ProductDetail("Miền Bắc sắp đón hai đợt không khí lạnh","bao1","Miền Bắc sắp đón hai đợt không khí lạnh, trong đó đợt đầu tiên ngày 4-5/3 có cường độ yếu","Gia Chính","8:34 3/2/2025");
    }
}