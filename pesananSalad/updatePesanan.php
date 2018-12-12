<?php

if($_SERVER['REQUEST_METHOD']=='POST'){
		$id = $_POST['id'];
		$nama = $_POST['nama'];
		$Jumlah = $_POST['Jumlah'];

		require_once('koneksi.php');

		$sql = "UPDATE listpesanan SET nama = '$nama', Jumlah = '$Jumlah' WHERE id = $id;";
		
		if(mysqli_query($conn,$sql)){
			echo 'Berhasil Update Data Pesanan';
		}else{
			echo 'Gagal Update Data Pesanan';
		}

		mysqli_close($conn);
	}
?>
