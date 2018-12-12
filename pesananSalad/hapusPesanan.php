<?php

 $id = $_GET['id'];

 require_once('koneksi.php');

 $sql = "DELETE FROM listpesanan WHERE id=$id;";


 if(mysqli_query($conn,$sql)){
 echo 'Berhasil Menghapus Pesanan';
 }else{
 echo 'Gagal Menghapus Pesanan';
 }

 mysqli_close($conn);
 ?>
