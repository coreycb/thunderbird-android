package net.thunderbird.ui.catalog.ui.page.atom.items

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.ui.Modifier
import app.k9mail.core.ui.compose.designsystem.atom.button.ButtonElevated
import app.k9mail.core.ui.compose.designsystem.atom.button.ButtonFilled
import app.k9mail.core.ui.compose.designsystem.atom.button.ButtonFilledTonal
import app.k9mail.core.ui.compose.designsystem.atom.button.ButtonIcon
import app.k9mail.core.ui.compose.designsystem.atom.button.ButtonOutlined
import app.k9mail.core.ui.compose.designsystem.atom.button.ButtonText
import app.k9mail.core.ui.compose.designsystem.atom.icon.Icons
import net.thunderbird.ui.catalog.ui.page.common.list.defaultItem
import net.thunderbird.ui.catalog.ui.page.common.list.defaultItemPadding
import net.thunderbird.ui.catalog.ui.page.common.list.sectionHeaderItem

@Suppress("LongMethod")
fun LazyGridScope.buttonItems() {
    sectionHeaderItem(text = "Button - Filled")
    defaultItem {
        ButtonFilled(
            text = "Enabled",
            onClick = { },
            modifier = Modifier.padding(defaultItemPadding()),
        )
    }
    defaultItem {
        ButtonFilled(
            text = "Disabled",
            onClick = { },
            enabled = false,
            modifier = Modifier.padding(defaultItemPadding()),
        )
    }

    sectionHeaderItem(text = "Button - Filled Tonal")
    defaultItem {
        ButtonFilledTonal(
            text = "Enabled",
            onClick = { },
            modifier = Modifier.padding(defaultItemPadding()),
        )
    }
    defaultItem {
        ButtonFilledTonal(
            text = "Disabled",
            onClick = { },
            enabled = false,
            modifier = Modifier.padding(defaultItemPadding()),
        )
    }

    sectionHeaderItem(text = "Button - Elevated")
    defaultItem {
        ButtonElevated(
            text = "Enabled",
            onClick = { },
            modifier = Modifier.padding(defaultItemPadding()),
        )
    }
    defaultItem {
        ButtonElevated(
            text = "Disabled",
            onClick = { },
            enabled = false,
            modifier = Modifier.padding(defaultItemPadding()),
        )
    }

    sectionHeaderItem(text = "Button - Outlined")
    defaultItem {
        ButtonOutlined(
            text = "Enabled",
            onClick = { },
            modifier = Modifier.padding(defaultItemPadding()),
        )
    }
    defaultItem {
        ButtonOutlined(
            text = "Disabled",
            onClick = { },
            enabled = false,
            modifier = Modifier.padding(defaultItemPadding()),
        )
    }

    sectionHeaderItem(text = "Button - Text")
    defaultItem {
        ButtonText(
            text = "Enabled",
            onClick = { },
            modifier = Modifier.padding(defaultItemPadding()),
        )
    }
    defaultItem {
        ButtonText(
            text = "Disabled",
            onClick = { },
            enabled = false,
            modifier = Modifier.padding(defaultItemPadding()),
        )
    }

    sectionHeaderItem(text = "Button - Icon")
    defaultItem {
        ButtonIcon(
            imageVector = Icons.Outlined.AccountCircle,
            onClick = { },
            modifier = Modifier.padding(defaultItemPadding()),
        )
    }
    defaultItem {
        ButtonIcon(
            imageVector = Icons.Outlined.AccountCircle,
            onClick = { },
            enabled = false,
            modifier = Modifier.padding(defaultItemPadding()),
        )
    }
}
