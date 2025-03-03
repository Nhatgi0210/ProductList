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
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
                    ProductList();
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
fun ProductDetail(productName: String) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Chi tiết sản phẩm", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = productName, fontSize = 18.sp)
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProductTheme {
        ProductDetail("nhat")
    }
}