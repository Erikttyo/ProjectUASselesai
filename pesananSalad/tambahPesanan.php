<?php


	if($_SERVER['REQUEST_METHOD']=='POST'){

		$nama = $_POST['nama'];
		$Jumlah = $_POST['Jumlah'];

		$sql = "INSERT INTO listpesanan (nama,Jumlah) VALUES ('$nama','$Jumlah')";

		require_once('koneksi.php');

		if(mysqli_query($conn,$sql)){
			echo 'Berhasil Menambahkan Pesanan';
		}else{
			echo 'Gagal Menambahkan Pesanan';
		}

		mysqli_close($conn);
	}
?>
