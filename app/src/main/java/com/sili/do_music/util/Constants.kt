package com.sili.do_music.util
import com.sili.do_music.presentation.main.home.adapter.helpers.InstrumentHelper

class Constants {

    companion object {
        const val SUCCESS_CODE = 200
        const val PAGINATION_PAGE_SIZE = 10
        const val BOOK = "BOOK"
        const val VOCALS = "VOCALS"
        const val NOTES = "NOTES"
        const val FILTER_UZB = "UZB"
        const val FILTER_RUSSIAN = "RUSSIAN"
        const val FILTER_FOREIGN = "FOREIGN"
        const val AUTHORIZATION = "Authorization"
        const val GLIDE_LOGO = "https://domusic.uz/api/doc/logo?uniqueName="
        const val ABOUT_US_POLICY = "http://docs.google.com/viewer?url=https://domusic.uz/static/docs/confidential_ru.pdf"
        const val ABOUT_US_OFFERT = "http://docs.google.com/viewer?url=https://domusic.uz/static/docs/offer_ru.pdf"
        const val ABOUT_US_RIGHTS_OWNER = "http://docs.google.com/viewer?url=https://domusic.uz/static/docs/copyright_ru.pdf"
        const val BASE_URL = "https://domusic.uz/"
        const val DOWNLOAD_FILE_PART_LINK = "api/doc?uniqueName="
        const val CODE = "optCode"
        const val PASSWORD = "password"
        const val LOGIN = "login"
        const val SUCCESS = "Success"
        const val VOCAL_GROUP = "vocal"
        const val INSTRUMENTAL_GROUP = "instrumental"
        const val NOTE_ID = "noteId"
        const val VOCALS_ID = "vocalsId"
        const val BOOK_ID = "bookId"
        const val ITEM_ID = "itemId"
        const val COMPOSITOR_ID = "compositorId"
        const val NAME_OF_COMPOSITOR = "nameOfCompositor"
        const val FIO = "fio"
        const val PHONE = "phone"
        const val EMAIL = "email"
        const val FRAGMENT = "fragment"
        const val DOWNLOAD_LIMIT = "429"
        const val AUTH_ERROR = "HTTP 401 "
        const val INCORRECT_CODE = "HTTP 400 "
        const val INCORRECT_EMAIL = "HTTP 304 "
        const val NO_INTERNET = "Unable to resolve host \"domusic.uz\": No address associated with hostname" //Unable to resolve host "domusic.uz"
        const val ERROR_ADD_TO_FAVOURITES = "Favourite add error"
        const val SELECTED_LANGUAGE = "Locale.Helper.Selected.Language"
        const val CHANNEL_ID = "Progress notification"
        const val LAST_PAGE = "Last page"
        const val PROGRESS_MAX = 100

        val FILTERS_RU = arrayListOf(
            InstrumentHelper(GroupName = "WOODWIND", name = "???????????????????? ??????????????"),
            InstrumentHelper(GroupName = "BRASS", name = "???????????? ??????????????"),
            InstrumentHelper(GroupName = "STRINGED_BOWS", name = "??????????????-??????????????????"),
            InstrumentHelper(GroupName = "PIANOS", name = "????????????????????"),
            InstrumentHelper(GroupName = "UZBEK_FOLK", name = "?????????????????? ????????????????")
        )
        val FILTERS_RU_ENSEMBLE = arrayListOf(
            InstrumentHelper(Ansamble = "ENSEMBLES", name = "????????????????"),
            InstrumentHelper(Ansamble = "INTRODUCTIONS_AND_VARIATIONS", name = "??????????"),
            InstrumentHelper(Ansamble = "CONCERTS_AND_FANTASIES", name = "???????????????? ?? ????????"),
            InstrumentHelper(Ansamble = "PLAYS_AND_SOLOS", name = "?????????? ?? ????????????????"),
            InstrumentHelper(Ansamble = "SONATAS", name = "????????????"),
            InstrumentHelper(Ansamble = "STUDIES_AND_EXERCISES", name = "?????????? ?? ????????????????????")
        )
        val FILTERS_UZ = arrayListOf(
            InstrumentHelper(GroupName = "WOODWIND", name = "Yog`och damli"),
            InstrumentHelper(GroupName = "BRASS", name = "Mis damli"),
            InstrumentHelper(GroupName = "STRINGED_BOWS", name = "Torli va kamonli"),
            InstrumentHelper(GroupName = "PIANOS", name = "Klavishlik"),
            InstrumentHelper(GroupName = "UZBEK_FOLK", name = "O`zbek xalq")
        )
        val FILTERS_UZ_ENSEMBLE = arrayListOf(
            InstrumentHelper(Ansamble = "ENSEMBLES", name = "Ansambllar"),
            InstrumentHelper(Ansamble = "INTRODUCTIONS_AND_VARIATIONS", name = "Rondo, va variatsiyalar"),
            InstrumentHelper(Ansamble = "CONCERTS_AND_FANTASIES", name = "Solo va konsertlar"),
            InstrumentHelper(Ansamble = "PLAYS_AND_SOLOS", name = "Piesa va fantaziyalar"),
            InstrumentHelper(Ansamble = "SONATAS", name = "Sonatalar"),
            InstrumentHelper(Ansamble = "STUDIES_AND_EXERCISES", name = "Etyud va mashqlar")
        )

        val FILTERS_DEFAULT = arrayListOf(
            InstrumentHelper(GroupName = "WOODWIND", name = "???????? ??????????"),
            InstrumentHelper(GroupName = "BRASS", name = "?????? ??????????"),
            InstrumentHelper(GroupName = "STRINGED_BOWS", name = "?????????? ???? ??????????????"),
            InstrumentHelper(GroupName = "PIANOS", name = "??????????????????"),
            InstrumentHelper(GroupName = "UZBEK_FOLK", name = "?????????? ????????")
        )
        val FILTERS_DEFAULT_ENSEMBLE = arrayListOf(
            InstrumentHelper(Ansamble = "ENSEMBLES", name = "????????????????????"),
            InstrumentHelper(Ansamble = "INTRODUCTIONS_AND_VARIATIONS", name = "?????????? ???? ??????????????????????"),
            InstrumentHelper(Ansamble = "CONCERTS_AND_FANTASIES", name = "???????? ???? ????????????????????"),
            InstrumentHelper(Ansamble = "PLAYS_AND_SOLOS", name = "?????????? ???? ??????????????????????"),
            InstrumentHelper(Ansamble = "SONATAS", name = "??????????????????"),
            InstrumentHelper(Ansamble = "STUDIES_AND_EXERCISES", name = "???????? ???? ??????????????")
        )
    }

}