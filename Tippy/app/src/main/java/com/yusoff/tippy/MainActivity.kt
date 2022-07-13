package com.yusoff.tippy

import android.animation.ArgbEvaluator
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import androidx.core.content.ContextCompat


//  Track SeekBar Value
private const val TAG = "MainActivity"

//  Initial TipPercent
private const val INITIAL_TIP_PERCENT = 15

class MainActivity : AppCompatActivity() {

    //  Declare each component we use
    private lateinit var etBaseAmount: EditText
    private lateinit var seekBarTip: SeekBar
    private lateinit var tvTipPercentLabel: TextView
    private lateinit var tvTipAmount: TextView
    private lateinit var tvTotalAmount: TextView
    private lateinit var tvTipDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      Connect each component we declared
        etBaseAmount = findViewById(R.id.etBaseAmount)
        seekBarTip = findViewById(R.id.seekBarTip)
        tvTipPercentLabel = findViewById(R.id.tvTipPercentLabel)
        tvTipAmount = findViewById(R.id.tvTipAmount)
        tvTotalAmount = findViewById(R.id.tvTotalAmount)
        tvTipDesc = findViewById(R.id.tvTipDesc)

//      Set Initial SeekBar TipPercent and TipPercentLabel
        seekBarTip.progress = INITIAL_TIP_PERCENT
        tvTipPercentLabel.text = "$INITIAL_TIP_PERCENT%"
        updateTipDesc(INITIAL_TIP_PERCENT)

//      Notify SeekBar Changes
        seekBarTip.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                Log.i(TAG, "onProgressChanged $p1")
                tvTipPercentLabel.text = "$p1%"

//                Call UpdateTipDesc and Calculation
                computeTipAndTotal()
                updateTipDesc(p1)
            }
        })

//        Track Any Text Changes on Logcat
        etBaseAmount.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {
                Log.i(TAG, "After Text Change $p0")

//              Call computeTipAndTotal function
                computeTipAndTotal()
            }
        })
    }

    //    Update Tip Description
    private fun updateTipDesc(tipPercent: Int) {
//    This equivalent to switch in Java
        val tipDesc = when (tipPercent) {
            in 0..9 -> "Maybe a little higher sir?"
            in 10..14 -> "Thanks sir"
            in 15..19 -> "We can be there sir..."
            in 20..24 -> "Hodl up sir"
            else -> "TO THE MOON!"
        }
        tvTipDesc.text = tipDesc

//        Update Text color based on the text output
        val color = ArgbEvaluator().evaluate(
            tipPercent.toFloat() / seekBarTip.max,
            ContextCompat.getColor(this, R.color.color_worst_tip),
            ContextCompat.getColor(this,R.color.color_best_tip)
        ) as Int
        tvTipDesc.setTextColor(color)

    }

    //    Calculate totoal Amount to Pay
    private fun computeTipAndTotal() {
//    Check if the Input is 0 and place an Empty String
        if (etBaseAmount.text.isEmpty()) {
            tvTipAmount.text = ""
            tvTotalAmount.text = ""
            return
        }

//        1. Get the value of the base and tip percent
//        Get the base amount and tip percent from UI, change it from text to double (as currency)
        var baseAmount = etBaseAmount.text.toString().toDouble()
        val tipPercent = seekBarTip.progress

//        2. Compute the tip and total
        var tipAmount = baseAmount * tipPercent / 100
        var totalAmount = baseAmount + tipAmount

//        3. Update/Display the Total, format it to 2 decimal places
        tvTipAmount.text = "%.2f".format(tipAmount)
        tvTotalAmount.text = "%.2f".format(totalAmount)

    }
}