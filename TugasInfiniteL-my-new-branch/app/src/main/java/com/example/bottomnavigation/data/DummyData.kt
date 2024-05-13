package com.example.bottomnavigation.data

import com.example.bottomnavigation.model.Mentor
import com.example.bottomnavigation.R
import com.example.bottomnavigation.model.Biodata
import com.example.bottomnavigation.model.Gallery
import com.example.bottomnavigation.model.Mentee

object DummyData {
    val mobileMentors = listOf(
        Mentor(
            id = 1,
            name = "Moch Jalu Erdiansyah",
            nickname = "Jaloo",
            role = "Mobile Development",
            photo = R.drawable.founder
        ),
        Mentor(
            id = 2,
            name = "Moch Jalu Erdiansyah",
            nickname = "Jaloo",
            role = "Mobile Development",
            photo = R.drawable.founder
        ),
        Mentor(
            id = 3,
            name = "Moch Jalu Erdiansyah",
            nickname = "Jaloo",
            role = "Mobile Development",
            photo = R.drawable.founder
        )

    )

    val mobileMentees = listOf(
        Mentee(
            id = 1,
            name = "Nama Mentee",
            photo = R.drawable.no_profile,
            batch = "Batch 6",
            role = "Mentee Mobile",
        ),
        Mentee(
            id = 2,
            name = "Nama Mentee",
            photo = R.drawable.no_profile,
            batch = "Batch 6",
            role = "Mentee Mobile",
        ),
        Mentee(
            id = 3,
            name = "Nama Mentee",
            photo = R.drawable.no_profile,
            batch = "Batch 6",
            role = "Mentee Mobile",
        ),
    )
    val PhotoGalleries = listOf(
        Gallery(
            id = 1,
            name = "Loki",
            photo = R.drawable.loki
        ),
        Gallery(
            id = 2,
            name = "Thor",
            photo = R.drawable.thor
        ),
        Gallery(
            id = 3,
            name = "Legends",
            photo = R.drawable.legends
        ),
        Gallery(
            id = 4,
            name = "Spiderman",
            photo = R.drawable.spiderman
        ),
        Gallery(
            id = 5,
            name = "Ken",
            photo = R.drawable.ken
        ),
        Gallery(
            id = 6,
            name = "Barbie",
            photo = R.drawable.barbie
        )

    )
    val BiodataMentee = listOf(
        Biodata(
            id = 1,
            photo = R.drawable.founder,
            name = "Moch Jalu Erdiansyah",
            email = "erdi123ansyah@gmail.com",
            instansi = "Telkom University",
            prodi = "Digital Creative Multimedia"
        )
    )

}