package com.example.myproject.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.myproject.ui.theme.colorRedDark

@Composable
fun RowScope.StandardBottomNavItem(
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    contentDescription: String? = null,
    selected: Boolean = false,
    alertCount: Int? = null,
    selectedColor: Color = colorRedDark,
    unselectedColor: Color = Color.Gray,
    enabled: Boolean = true,
    onClick: () -> Unit
) {

    if (alertCount != null && alertCount < 0) {
        throw IllegalArgumentException("Alert count can't be negative")
    }

    val lineLength = animateFloatAsState(
        targetValue = if (selected) 1f else 0f,
        animationSpec = tween(
            durationMillis = 300
        )
    )

}