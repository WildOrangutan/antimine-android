package dev.lucasnlm.antimine.core.themes.repository

import dev.lucasnlm.antimine.common.R
import dev.lucasnlm.antimine.core.themes.model.AreaPalette
import dev.lucasnlm.antimine.core.themes.model.AppTheme
import dev.lucasnlm.antimine.core.themes.model.Assets

object Themes {
    val LightTheme = AppTheme(
        id = 1L,
        theme = R.style.CustomLightTheme,
        themeNoActionBar = R.style.CustomLightTheme_NoActionBar,
        palette = AreaPalette(
            border = 0x424242,
            background = 0xFFFFFF,
            covered = 0x424242,
            coveredOdd = 0x424242,
            uncovered = 0xd5d2cc,
            uncoveredOdd = 0xd5d2cc,
            minesAround1 = 0x527F8D,
            minesAround2 = 0x2B8D43,
            minesAround3 = 0xE65100,
            minesAround4 = 0x20A5f7,
            minesAround5 = 0xED1C24,
            minesAround6 = 0xFFC107,
            minesAround7 = 0x66126B,
            minesAround8 = 0x000000,
            highlight = 0x212121,
            focus = 0xD32F2F
        ),
        assets = Assets(
            wrongFlag = R.drawable.red_flag,
            flag = R.drawable.flag,
            questionMark = R.drawable.question,
            toolbarMine = R.drawable.mine,
            mine = R.drawable.mine,
            mineExploded = R.drawable.mine_exploded_red,
            mineLow = R.drawable.mine_low
        )
    )

    fun getAllCustom() = listOf(
        AppTheme(
            id = 2L,
            theme = R.style.CustomAmoledTheme,
            themeNoActionBar = R.style.CustomAmoledTheme_NoActionBar,
            palette = AreaPalette(
                border = 0xFFFFFF,
                background = 0x000000,
                covered = 0x212121,
                coveredOdd = 0x212121,
                uncovered = 0x000000,
                uncoveredOdd = 0x050505,
                minesAround1 = 0xCCCCCC,
                minesAround2 = 0xFFFFFF,
                minesAround3 = 0xDDDDDD,
                minesAround4 = 0xCCCCCC,
                minesAround5 = 0xDDDDDD,
                minesAround6 = 0xFFFFFF,
                minesAround7 = 0xCCCCCC,
                minesAround8 = 0xCCCCCC,
                highlight = 0x212121,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag,
                flag = R.drawable.flag,
                questionMark = R.drawable.question,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine_low,
                mineExploded = R.drawable.mine_low,
                mineLow = R.drawable.mine_low
            )
        ),
        LightTheme,
        AppTheme(
            id = 3L,
            theme = R.style.CustomDarkTheme,
            themeNoActionBar = R.style.CustomDarkTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x171717,
                background = 0x212121,
                covered = 0x171717,
                coveredOdd = 0x171717,
                uncovered = 0x424242,
                uncoveredOdd = 0x424242,
                minesAround1 = 0xd5d2cc,
                minesAround2 = 0xd5d2cc,
                minesAround3 = 0xd5d2cc,
                minesAround4 = 0xd5d2cc,
                minesAround5 = 0xd5d2cc,
                minesAround6 = 0xd5d2cc,
                minesAround7 = 0xd5d2cc,
                minesAround8 = 0xd5d2cc,
                highlight = 0xFFFFFF,
                focus = 0xFFFFFF
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag,
                flag = R.drawable.flag,
                questionMark = R.drawable.question,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine,
                mineExploded = R.drawable.mine_exploded_white,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 4L,
            theme = R.style.CustomGardenTheme,
            themeNoActionBar = R.style.CustomGardenTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x171717,
                background = 0xefebe9,
                covered = 0x689f38,
                coveredOdd = 0x558b2f,
                uncovered = 0xefebe9,
                uncoveredOdd = 0xd7ccc8,
                minesAround1 = 0x527F8D,
                minesAround2 = 0x2B8D43,
                minesAround3 = 0xE65100,
                minesAround4 = 0x20A5f7,
                minesAround5 = 0xED1C24,
                minesAround6 = 0xFFC107,
                minesAround7 = 0x66126B,
                minesAround8 = 0x000000,
                highlight = 0xFFFFFF,
                focus = 0xFFFFFF
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag,
                flag = R.drawable.flag,
                questionMark = R.drawable.question,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine,
                mineExploded = R.drawable.mine_exploded_white,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 5L,
            theme = R.style.CustomLightTheme,
            themeNoActionBar = R.style.CustomLightTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x424242,
                background = 0xFFFFFF,
                covered = 0x4a4a4a,
                coveredOdd = 0x383838,
                uncovered = 0xe2e1da,
                uncoveredOdd = 0xd5d2cc,
                minesAround1 = 0x527F8D,
                minesAround2 = 0x2B8D43,
                minesAround3 = 0xE65100,
                minesAround4 = 0x20A5f7,
                minesAround5 = 0xED1C24,
                minesAround6 = 0xFFC107,
                minesAround7 = 0x66126B,
                minesAround8 = 0x000000,
                highlight = 0x212121,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.red_flag,
                flag = R.drawable.flag,
                questionMark = R.drawable.question,
                toolbarMine = R.drawable.mine,
                mine = R.drawable.mine,
                mineExploded = R.drawable.mine_exploded_red,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 6L,
            theme = R.style.CustomMarineTheme,
            themeNoActionBar = R.style.CustomMarineTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x424242,
                background = 0xFFFFFF,
                covered = 0x0277bd,
                coveredOdd = 0x006aa8,
                uncovered = 0xc0d2d9,
                uncoveredOdd = 0xc0d2d9,
                minesAround1 = 0x527F8D,
                minesAround2 = 0x2B8D43,
                minesAround3 = 0xE65100,
                minesAround4 = 0x20A5f7,
                minesAround5 = 0xED1C24,
                minesAround6 = 0xFFC107,
                minesAround7 = 0x66126B,
                minesAround8 = 0x000000,
                highlight = 0x212121,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.red_flag,
                flag = R.drawable.flag,
                questionMark = R.drawable.question,
                toolbarMine = R.drawable.mine,
                mine = R.drawable.mine,
                mineExploded = R.drawable.mine_exploded_red,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 7L,
            theme = R.style.CustomBlueGreyTheme,
            themeNoActionBar = R.style.CustomBlueGreyTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x424242,
                background = 0xFFFFFF,
                covered = 0x37474f,
                coveredOdd = 0x37474f,
                uncovered = 0xcfd8dc,
                uncoveredOdd = 0xcfd8dc,
                minesAround1 = 0x527F8D,
                minesAround2 = 0x2B8D43,
                minesAround3 = 0x546e7a,
                minesAround4 = 0x20A5f7,
                minesAround5 = 0xED1C24,
                minesAround6 = 0xFFC107,
                minesAround7 = 0x66126B,
                minesAround8 = 0x000000,
                highlight = 0x212121,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.red_flag,
                flag = R.drawable.flag,
                questionMark = R.drawable.question,
                toolbarMine = R.drawable.mine,
                mine = R.drawable.mine,
                mineExploded = R.drawable.mine_exploded_red,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 8L,
            theme = R.style.CustomOrangeTheme,
            themeNoActionBar = R.style.CustomOrangeTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x000000,
                background = 0x212121,
                covered = 0xfb8c00,
                coveredOdd = 0xfb8c00,
                uncovered = 0x303030,
                uncoveredOdd = 0x252525,
                minesAround1 = 0xDDDDDD,
                minesAround2 = 0xEEEEEE,
                minesAround3 = 0xCCCCCC,
                minesAround4 = 0xBBBBBB,
                minesAround5 = 0xAAAAAA,
                minesAround6 = 0xFFFFFF,
                minesAround7 = 0xBBBBBB,
                minesAround8 = 0xEEEEEE,
                highlight = 0x212121,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag_black,
                flag = R.drawable.flag_black,
                questionMark = R.drawable.question_black,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine_white,
                mineExploded = R.drawable.mine_white,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 9L,
            theme = R.style.CustomPinkTheme,
            themeNoActionBar = R.style.CustomPinkTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x000000,
                background = 0xFFFFFF,
                covered = 0xf48fb1,
                coveredOdd = 0xf48fb1,
                uncovered = 0xfce4ec,
                uncoveredOdd = 0xfce4ec,
                minesAround1 = 0x616161,
                minesAround2 = 0xe64a19,
                minesAround3 = 0x8e24aa,
                minesAround4 = 0x000000,
                minesAround5 = 0x1e88e5,
                minesAround6 = 0x424242,
                minesAround7 = 0x616161,
                minesAround8 = 0x000000,
                highlight = 0x212121,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag,
                flag = R.drawable.flag,
                questionMark = R.drawable.question,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine_pink,
                mineExploded = R.drawable.mine_pink_exploded,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 10L,
            theme = R.style.CustomPurpleTheme,
            themeNoActionBar = R.style.CustomPurpleTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x000000,
                background = 0xFFFFFF,
                covered = 0x6a1b9a,
                coveredOdd = 0x6a1b9a,
                uncovered = 0xd1c4e9,
                uncoveredOdd = 0xd1c4e9,
                minesAround1 = 0x616161,
                minesAround2 = 0xe64a19,
                minesAround3 = 0x8e24aa,
                minesAround4 = 0x000000,
                minesAround5 = 0x1e88e5,
                minesAround6 = 0x424242,
                minesAround7 = 0x616161,
                minesAround8 = 0x000000,
                highlight = 0xd1c4e9,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag,
                flag = R.drawable.flag,
                questionMark = R.drawable.question,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine_pink,
                mineExploded = R.drawable.mine_pink_exploded,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 11L,
            theme = R.style.CustomLightTheme,
            themeNoActionBar = R.style.CustomLightTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x000000,
                background = 0xFFFFFF,
                covered = 0x3e2723,
                coveredOdd = 0x4e342e,
                uncovered = 0xd7ccc8,
                uncoveredOdd = 0xefebe9,
                minesAround1 = 0x616161,
                minesAround2 = 0xe64a19,
                minesAround3 = 0x8e24aa,
                minesAround4 = 0x000000,
                minesAround5 = 0x1e88e5,
                minesAround6 = 0x424242,
                minesAround7 = 0x616161,
                minesAround8 = 0x000000,
                highlight = 0xd1c4e9,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag,
                flag = R.drawable.flag,
                questionMark = R.drawable.question,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine,
                mineExploded = R.drawable.mine_pink_exploded,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 12L,
            theme = R.style.CustomLightTheme,
            themeNoActionBar = R.style.CustomLightTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x000000,
                background = 0xFFFFFF,
                covered = 0xc62828,
                coveredOdd = 0xb71c1c,
                uncovered = 0xd7ccc8,
                uncoveredOdd = 0xefebe9,
                minesAround1 = 0x616161,
                minesAround2 = 0xe64a19,
                minesAround3 = 0x8e24aa,
                minesAround4 = 0x000000,
                minesAround5 = 0x1e88e5,
                minesAround6 = 0x424242,
                minesAround7 = 0x616161,
                minesAround8 = 0x000000,
                highlight = 0xd1c4e9,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag,
                flag = R.drawable.flag,
                questionMark = R.drawable.question,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine,
                mineExploded = R.drawable.mine_pink_exploded,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 13L,
            theme = R.style.CustomLightTheme,
            themeNoActionBar = R.style.CustomLightTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x000000,
                background = 0xFFFFFF,
                covered = 0x880e4f,
                coveredOdd = 0x750b42,
                uncovered = 0xd7ccc8,
                uncoveredOdd = 0xefebe9,
                minesAround1 = 0x616161,
                minesAround2 = 0xe64a19,
                minesAround3 = 0x8e24aa,
                minesAround4 = 0x000000,
                minesAround5 = 0x1e88e5,
                minesAround6 = 0x424242,
                minesAround7 = 0x616161,
                minesAround8 = 0x000000,
                highlight = 0xd1c4e9,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag,
                flag = R.drawable.flag,
                questionMark = R.drawable.question,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine,
                mineExploded = R.drawable.mine_pink_exploded,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 14L,
            theme = R.style.CustomLightTheme,
            themeNoActionBar = R.style.CustomLightTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x000000,
                background = 0xFFFFFF,
                covered = 0x0d47a1,
                coveredOdd = 0x0a3984,
                uncovered = 0xedf1f2,
                uncoveredOdd = 0xdcdee0,
                minesAround1 = 0x616161,
                minesAround2 = 0xe64a19,
                minesAround3 = 0x8e24aa,
                minesAround4 = 0x000000,
                minesAround5 = 0x1e88e5,
                minesAround6 = 0x424242,
                minesAround7 = 0x616161,
                minesAround8 = 0x000000,
                highlight = 0xd1c4e9,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag,
                flag = R.drawable.flag,
                questionMark = R.drawable.question,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine,
                mineExploded = R.drawable.mine_pink_exploded,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 15L,
            theme = R.style.CustomDarkTheme,
            themeNoActionBar = R.style.CustomDarkTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x000000,
                background = 0x212121,
                covered = 0xedf1f2,
                coveredOdd = 0xdcdee0,
                uncovered = 0x212121,
                uncoveredOdd = 0x212121,
                minesAround1 = 0xFFFFFF,
                minesAround2 = 0xCCCCCC,
                minesAround3 = 0xAAAAAA,
                minesAround4 = 0xDDDDDD,
                minesAround5 = 0xFFFFFF,
                minesAround6 = 0xFF0000,
                minesAround7 = 0xFF0000,
                minesAround8 = 0xFF0000,
                highlight = 0xd1c4e9,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag_black,
                flag = R.drawable.flag_black,
                questionMark = R.drawable.question_black,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine_white,
                mineExploded = R.drawable.mine_white,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 16L,
            theme = R.style.CustomLimeTheme,
            themeNoActionBar = R.style.CustomLimeTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x000000,
                background = 0x212121,
                covered = 0xcddc39,
                coveredOdd = 0x99aa00,
                uncovered = 0x212121,
                uncoveredOdd = 0x212121,
                minesAround1 = 0xFFFFFF,
                minesAround2 = 0xCCCCCC,
                minesAround3 = 0xAAAAAA,
                minesAround4 = 0xDDDDDD,
                minesAround5 = 0xFFFFFF,
                minesAround6 = 0xFF0000,
                minesAround7 = 0xFF0000,
                minesAround8 = 0xFF0000,
                highlight = 0xd1c4e9,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag_black,
                flag = R.drawable.flag_black,
                questionMark = R.drawable.question_black,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine_white,
                mineExploded = R.drawable.mine_white,
                mineLow = R.drawable.mine_low
            )
        ),
        AppTheme(
            id = 18L,
            theme = R.style.BananaTheme,
            themeNoActionBar = R.style.BananaTheme_NoActionBar,
            palette = AreaPalette(
                border = 0x000000,
                background = 0x212121,
                covered = 0xffeb3b,
                coveredOdd = 0xe6d335,
                uncovered = 0x212121,
                uncoveredOdd = 0x212121,
                minesAround1 = 0xFFFFFF,
                minesAround2 = 0xCCCCCC,
                minesAround3 = 0xAAAAAA,
                minesAround4 = 0xDDDDDD,
                minesAround5 = 0xFFFFFF,
                minesAround6 = 0xFF0000,
                minesAround7 = 0xFF0000,
                minesAround8 = 0xFF0000,
                highlight = 0xd1c4e9,
                focus = 0xD32F2F
            ),
            assets = Assets(
                wrongFlag = R.drawable.flag_black,
                flag = R.drawable.flag_black,
                questionMark = R.drawable.question_black,
                toolbarMine = R.drawable.mine_low,
                mine = R.drawable.mine_white,
                mineExploded = R.drawable.mine_white,
                mineLow = R.drawable.mine_low
            )
        )
    )
}
