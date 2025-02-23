package com.example.doraonlineshopping.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.example.doraonlineshopping.Adapter.PopularAdapter;
import com.example.doraonlineshopping.R;
import com.example.doraonlineshopping.databinding.ActivityMainBinding;
import com.example.doraonlineshopping.domain.PopularDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        statusBarColor();


        initRecyclerView();
        initRecyclerView1();
        initRecyclerView2();
        initRecyclerView3();
        initRecyclerView4();

        bottomNavigation();

    }

    private void bottomNavigation() {
        binding.cartBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, CartActivity.class)));
    }

    private void statusBarColor() {
        Window window = MainActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.pink_dark));
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Moose Black T-Shirt", "tshirt", 4, 1500,
                "Buy Moose Dark Sapphire T-Shirt | Buy Online T-Shirts for the Lowest Price in Sri Lanka from Dora ." +
                        " Crew Neck Comfort Fit"));

        /*items.add(new PopularDomain("Moose Black T-Shirt", "tshirt", 4, 1500,
                "Buy Moose Dark Sapphire T-Shirt | Buy Online T-Shirts for the Lowest Price in Sri Lanka from Dora ." +
                       " Crew Neck Comfort Fit"));*/


        items.add(new PopularDomain("T900 Ultra Smart Watch", "item_2", 3, 2800,
                "The above ready-to-use watch smart smartwatch man hand clock PNG image with transparent background can perfectly improve your work efficiency. " +
                        "No more background removal tools are needed and you can use the transparent PNG image directly. " +
                        "Pngtree also provides free download of woman, heart," +
                        " using vector art (EPS or AI) images which are easy to modify in Illustrator and finish your design work within minutes."));


        items.add(new PopularDomain("iPhone 13 Pro 512GB", "item_3", 5, 230000,
                "Unlocked, SIM-Free, Model A26381\n" +
                        "\n" +
                        "6.1-inch Super Retina XDR display with ProMotion and OLED\n" +
                        "\n" +
                        "A15 Bionic chip with 16-core Neural Engine\n" +
                        "\n" +
                        "Bluetooth 5.0 wireless technology\n" +
                        "\n" +
                        "Pro 12MP: Telephoto, Wide and Ultra Wide cameras\n" +
                        "\n" +
                        "Digital zoom up to 15x\n" +
                        "Face ID\n" +
                        "\n" +
                        "Siri\n" +
                        "\n" +
                        "Apple Pay"));

        items.add(new PopularDomain("iMac", "item_4", 5, 330000,
                "2024 Apple iMac 24 All-in-One with Nano-texture Glass, " +
                        "M4 Processor, " +
                        "16GB RAM, 256GB SSD, " +
                        "10‑Core GPU, 23.5” 4.5K, Silver"));


        binding.PopularView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.PopularView.setAdapter(new PopularAdapter(items));
    }


    private void initRecyclerView1() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Corduroy Cap", "f2", 4, 1200,
                "Cap in cotton corduroy. Motif at front, adjustable tab at back with metal buckle, and a sweatband in woven fabric.\n" +
                        "\n" +
                        "Art. No.:1249899001\n" +
                        "Accessory type:\n" +
                        "Baseball Cap\n" +
                        "Description:\n" +
                        "Dark beige/light beige, Boston, Masachusetts\n" +
                        "Imported:\n" +
                        "Yes"));

        items.add(new PopularDomain("Windproof Bubble Umbrella", "f1", 3, 2000,
                "Sufficient Quantity to Use: you will receive 4 pieces of clear umbrellas, the sufficient quantity can satisfy your various daily needs and replacement, \n" +
                        "you can also share them with your friends or family\n" +
                        "Reliable Material: the kids clear umbrella is mainly made of quality POE material and glass fiber, durable and sturdy, not easy to break or deform, \n" +
                        "light in weight and will serve you for a long time\n" +
                        "Proper Dimension: the length of our transparent umbrella is about 26 inches/ 66 cm, and the spread diameter measures about 27.56 inches/ 70 cm, suitable for children aged 3-7, \n" +
                        "lightweight and easy to open and close, will bring you a convenient using experience"));

        items.add(new PopularDomain("Coated crossbody bag", "f3", 5, 2500,
                "Crossbody bag in coated fabric with a zip at the top and an adjustable shoulder strap. \n" +
                        "It features a strap with a decorative buckle and a concealed magnetic fastener at the front. \n" +
                        "Taffeta lining. Depth 10 cm. Height 28 cm. Width 36 cm.\n" +
                        "\n" +
                        "Article number:1239935001\n" +
                        "Weight: 360 g\n" +
                        "Accessory Style: Cross body bag\n" +
                        "Description: Black, Solid colour\n" +
                        "Concept: DIVIDED"));

        items.add(new PopularDomain(" Crossbody Bag ", "f4", 5, 2300,
                "High Quality Material: Our women quilted purses is made of high-quality leather. timeless classic leather design style allows you to look fashion and elegant,\n" +
                        "Adjustable chain shoulder strap can be crossbody carry or shoulder carry, " + "Meet individual needs.\n" +
                        "Size: Fashion women flap crossbody bag has one main pocket, one ID card pocket, one zipper pocket. Inside is high quality polyester material.\n " +
                        "The space is spacious and can accommodate all your daily necessities. Size(L*W*H): 20 x 4 x 12 CM/ 7.8 x 1.6 x 4.7 inch.\n"
        ));

        items.add(new PopularDomain("Blue light glasses", "f5", 5, 1650,
                "Square glasses with bold frames and transparent lenses in plastic. \n" +
                        "Sidepieces with a gold-coloured detail that adds an extra spark. \n" +
                        "The lenses have a special coating to filter out harmful blue light from digital screens."));


        binding.ClothingView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.ClothingView.setAdapter(new PopularAdapter(items));
    }

    private void initRecyclerView2() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Apple iPhone 15 Pro", "d2", 4, 225500,
                "Brand\tApple\n" +
                        "Operating system - iOS 16\n" +
                        "Memory storage capacity - 128 GB\n" +
                        "Screen size - 6.1 Inches\n" +
                        "Model name - iPhone 15 Pro\n" +
                        "Wireless carrier - Unlocked for All Carriers\n" +
                        "Cellular technology - 5G\n" +
                        "Connectivity technology - USB\n" +
                        "Colour - Blue Titanium\n" +
                        "Wireless network technology - Wi-Fi"));


        items.add(new PopularDomain("Apple Watch Ultra 2", "d4", 3, 85000,
                "Operating system - Ios\n" +
                        "Special feature\tFall Detection\n" +
                        "Connectivity technology\tWi-Fi 4 (802.11n);Bluetooth 5.3\n" +
                        "Battery cell composition - Lithium Ion\n" +
                        "GPS - Built-in GPS\n" +
                        "Brand - Apple\n" +
                        "Model name - Watch Ultra 2\n" +
                        "Style - Alpine Loop\n" +
                        "Colour - blue"));


        items.add(new PopularDomain("Google Pixel 9 Pro", "d1", 5, 235000,
                "50 mp\n" +
                        "6.8\" display\n" +
                        "24 hours\n" +
                        "Ready for 5G\n" +
                        "The Google Pixel 9 Pro XL combines sleek design with a powerful triple camera and 30x Super Res Zoom. \n" +
                        "Enjoy high-res video, fast 30-minute charging to 70%, \n" +
                        "and Gemini for enhanced productivity and creativity.\n" +
                        "Plus, it excels in low-light conditions."));


        items.add(new PopularDomain("OPPO Find N2 Flip", "d3", 5, 120000,
                "OPPO Find N2 Flip 5G Smartphone, \n" +
                        "MediaTek Dimensity 9000+, 6.8“ AMOLED 120Hz,\n" +
                        "3.26” Cover Screen,\n" +
                        "50MP+8MP rear camera, \n" +
                        "32MP front camera, 8GB+256GB,\n" +
                        "4300mAh, Astral Black."));


        items.add(new PopularDomain("HUAWEI WATCH FIT 3", "d5", 5, 9000,
                "Operating system - Android\n" +
                        "Memory storage capacity - 1MB\n" +
                        "Special feature - GPS\n" +
                        "Connectivity technology - Bluetooth\n" +
                        "Wireless communication standard - Bluetooth\n" +
                        "Battery cell composition - Lithium Polymer\n" +
                        "GPS - Built-in GPS\n" +
                        "Shape - Square\n" +
                        "Screen size - 1.82 Inches\n" +
                        "Brand - HUAWEI"));


        binding.DigitalView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.DigitalView.setAdapter(new PopularAdapter(items));
    }


    private void initRecyclerView3() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Hugo Boss Eau de Parfume", "p1", 4, 5500,
                "Brand - BOSS\n" +
                        "Item form - Liquid\n" +
                        "Item volume - 100 Millilitres\n" +
                        "Scent - Fruity\n" +
                        "Special features - Scented\n" +
                        "Age range (description)\tAdult\n" +
                        "Item weight - 85 Grams\n" +
                        "Number of items - 1\n" +
                        "Is autographed - No"));


        items.add(new PopularDomain("Burberry Weekend Perfume", "p22", 3, 6800,
                "Fragrance Type: Fruity, Floral\n" +
                        "Top notes: Mignonette, Mandarin Orange, Sage\n" +
                        "Middle notes: Blue Hyacinth, Iris, Nectarine, \n" +
                        "-Peach Flower, Red Cyclamen, Wild Rose\n" +
                        "Base notes: Sandalwood, Cedar, Musk"));


        items.add(new PopularDomain("Kenzo", "p3", 5, 5300,
                "Fragrance from the designer house of Kenzo\n" +
                        "An Eau De Parfum For Her\n" +
                        "floral, powdery, woody, vanilla, rose, musky\n" +
                        "Eau De Parfum\n" +
                        "100ml"));


        items.add(new PopularDomain("Davidoff Cool Water perfume", "p4", 5, 7300,
                "Fragrance notes\n" +
                        "Top notes - Coriander and mint\n" +
                        "Heart notes - Lavender\n" +
                        "Base notes - Amber\n" +
                        "The Fragrance\n"));


        items.add(new PopularDomain("BURBERRY Brit perfume", "p5", 5, 4300,
                "Brand - BURBERRY\n" +
                        "Item form - Spray\n" +
                        "Item volume - 50 Millilitres\n" +
                        "Scent - Floral\n" +
                        "Special feature\tTravel Size"));


        binding.FashionView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.FashionView.setAdapter(new PopularAdapter(items));
    }

    private void initRecyclerView4() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Philips Air Purifier", "c1", 4, 10500,
                "Philips Air Purifier 600 Series has been designed with compactness, \n" +
                        "performance and affordability in mind. The design is different from its competitors, \n" +
                        "as it has a unique soft triangular form factor with distinctive design details, \n" +
                        "such as the soft dished in top air outlet area and expressive air inlet design, \n" +
                        "to convey elegance and performance in a more discreet manner. "));


        items.add(new PopularDomain("Stand Fan", "c2", 3, 18000,
                "18” OSC. High Velocity Stand Fan\n" +
                        "With Thermostat in Motor for Long-Life-Use\n" +
                        "Large Angle Metal Blades (N.W. ≥340g)\n" +
                        "Ultra High Solid Body (MAX High ≥161cm)\n" +
                        "Super Solid ABS Control Panel (N.W. ≥9000g)"));


        items.add(new PopularDomain("Steam Cleaner", "c3", 5, 22500,
                "Features：\n" +
                        "4.2bar strongest steam pressure\n" +
                        "Detachable water tank for continuously refillable and non-stop cleaning\n" +
                        "VapoHydro function adds hot water to steam, more easily to remove dirt\n" +
                        "The high temperature of the steam remove 99.99% of all household bacteria.\n" +
                        "Chemical free steam cleaning, environmentally friendly and allergy free\n" +
                        "New floor cleaning set EasyFix provide contactless cloth changing\n" +
                        "Refresh carpets by EasyFix floor nozzle with carpet glider."));


        items.add(new PopularDomain("Blender in Black, 9 Speeds", "c4", 5, 23000,
                "Contemporary aesthetics with minimalist lines and trendy finishes\n" +
                        "High-performance blender with 1400-Watt motor\n" +
                        "Compact body and brushed aluminum front panel\n" +
                        "Automatic functions and Pulse function\n" +
                        "5 dedicated automatic programs including automatic cleaning\n" +
                        "Single Serve or Family Serve modes"));



        binding.ToolsView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.ToolsView.setAdapter(new PopularAdapter(items));
    }



}

