package com.example.tugas1_193040037_ppm_renal.screens
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.benasher44.uuid.uuid4
import com.example.tugas1_193040037_ppm_renal.model.DataMotor
import com.example.tugas1_193040037_ppm_renal.persistences.DataMotorDao
import com.example.tugas1_193040037_ppm_renal.ui.theme.Purple700
import com.example.tugas1_193040037_ppm_renal.ui.theme.Teal200
import kotlinx.coroutines.launch

@Composable
fun FormDataMotor(onSimpan: DataMotorDao) {
    val scope = rememberCoroutineScope()
    val nomorkendaraan = remember { mutableStateOf(TextFieldValue("")) }
    val namakendaraan = remember { mutableStateOf(TextFieldValue("")) }
    val ukuranmesin = remember { mutableStateOf(TextFieldValue("")) }
    val tahun = remember { mutableStateOf(TextFieldValue("")) }
    val warnakendaraan = remember { mutableStateOf(TextFieldValue("")) }
    Column(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()) {
        OutlinedTextField(
            label = { Text(text = "Nomor Kendaraan") },
            value = nomorkendaraan.value,
            onValueChange = {
                nomorkendaraan.value = it
            },
            modifier = Modifier.padding(4.dp).fillMaxWidth(),
            placeholder = { Text(text = "X XXXX XXX") }
        )
        OutlinedTextField(
            label = { Text(text = "Nama Kendaraan") },
            value = namakendaraan.value,
            onValueChange = {
                namakendaraan.value = it
            },
            modifier = Modifier.padding(4.dp).fillMaxWidth(),
            keyboardOptions = KeyboardOptions(capitalization =
            KeyboardCapitalization.Characters, keyboardType = KeyboardType.Text),
            placeholder = { Text(text = "XXXXX") }
        )
        OutlinedTextField(
            label = { Text(text = "Ukuran Mesin") },
            value = ukuranmesin.value,
            onValueChange = {
                ukuranmesin.value = it
            },
            modifier = Modifier.padding(4.dp).fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType =
            KeyboardType.Decimal),
            placeholder = { Text(text = "155") }
        )
                OutlinedTextField(
                    label = { Text(text = "Tahun Kendaraan") },
                    value = tahun.value,
                    onValueChange = {
                        tahun.value = it
                    },
                    modifier = Modifier.padding(4.dp).fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(capitalization =
                    KeyboardCapitalization.Characters, keyboardType = KeyboardType.Text),
                    placeholder = { Text(text = "XXXXX") }
                )
                OutlinedTextField(
                    label = { Text(text = "Warna Kendaraan") },
                    value = warnakendaraan.value,
                    onValueChange = {
                        warnakendaraan.value = it
                    },
                    modifier = Modifier.padding(4.dp).fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(capitalization =
                    KeyboardCapitalization.Characters, keyboardType = KeyboardType.Text),
                    placeholder = { Text(text = "XXXXX") }
                )
        val loginButtonColors = ButtonDefaults.buttonColors(
            backgroundColor = Purple700,
            contentColor = Teal200
        )
        val resetButtonColors = ButtonDefaults.buttonColors(
            backgroundColor = Teal200,
            contentColor = Purple700
        )
        Row (modifier = Modifier.padding(4.dp).fillMaxWidth()) {
            Button(modifier = Modifier.weight(5f), onClick = {
val id = uuid4().toString()
                val item = DataMotor(
                    nomorkendaraan.value.text,
                    namakendaraan.value.text,
                    ukuranmesin.value.text,
                    tahun.value.text,
                    warnakendaraan.value.text)


                nomorkendaraan.value = TextFieldValue("")
                namakendaraan.value = TextFieldValue("")
                ukuranmesin.value = TextFieldValue("")
                tahun.value = TextFieldValue("")
                warnakendaraan.value = TextFieldValue("")
            }, colors = loginButtonColors) {
                Text(
                    text = "Simpan",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 18.sp
                    ), modifier = Modifier.padding(8.dp)
                )
            }
            Button(modifier = Modifier.weight(5f), onClick = {
                nomorkendaraan.value = TextFieldValue("")
                namakendaraan.value = TextFieldValue("")
                ukuranmesin.value = TextFieldValue("")
                tahun.value = TextFieldValue("")
                warnakendaraan.value = TextFieldValue("")
            }, colors = resetButtonColors) {
                Text(
                    text = "Reset",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 18.sp
                    ), modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}