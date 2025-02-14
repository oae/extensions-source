package eu.kanade.tachiyomi.extension.all.kavitaunofficial

import eu.kanade.tachiyomi.source.Source
import eu.kanade.tachiyomi.source.SourceFactory

class KavitaFactory : SourceFactory {
    override fun createSources(): List<Source> =
        listOf(
            Kavita("1"),
            Kavita("2"),
            Kavita("3"),
        )
}
