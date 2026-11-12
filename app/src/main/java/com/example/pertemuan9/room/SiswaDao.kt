package com.example.pertemuan9.room

interface SiswaDao {
    1 usage 1 Implementation

    @Insert(onConflict = onConflictStrategy.IGNORE)
    suspend fun insert(siswa : Siswa)

    1 Usage 1 Implementation
    @Query(vaue = "SELECT * from tblSiswa")
}