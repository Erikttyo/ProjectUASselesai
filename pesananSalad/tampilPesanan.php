<?php

	$id = $_GET['id'];

	require_once('koneksi.php');

	$sql = "SELECT * FROM listpesanan WHERE id=$id";

	$r = mysqli_query($conn,$sql);

	$result = array();
	$row = mysqli_fetch_array($r);
	array_push($result,array(
			"id"=>$row['id'],
			"nama"=>$row['nama'],
			"Jumlah"=>$row['Jumlah']
		));

	echo json_encode(array('result'=>$result));

	mysqli_close($conn);
?>
