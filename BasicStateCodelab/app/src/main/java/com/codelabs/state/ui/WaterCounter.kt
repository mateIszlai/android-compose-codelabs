package com.codelabs.state.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.codelabs.state.R

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier.padding(16.dp)) {
        var count by rememberSaveable { mutableStateOf(0) }

        if (count > 0) {
            Text(
                text = String.format(stringResource(id = R.string.water_counter_text), count),
                modifier = modifier.padding(16.dp)
            )
        }

        Button(
            onClick = { count++ },
            enabled = count < 10,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(text = stringResource(id = R.string.counter_btn_text))
        }
    }
}
