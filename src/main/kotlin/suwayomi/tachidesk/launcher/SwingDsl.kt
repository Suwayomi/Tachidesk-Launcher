/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package suwayomi.tachidesk.launcher

import java.awt.FlowLayout
import java.awt.GraphicsConfiguration
import java.awt.LayoutManager
import javax.swing.Icon
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

inline fun jframe(
    title: String? = null,
    graphicsConfiguration: GraphicsConfiguration? = null,
    isVisible: Boolean = true,
    builder: JFrame.() -> Unit
): JFrame {
    return JFrame(title, graphicsConfiguration).apply {
        builder()

        this.isVisible = isVisible
    }
}

inline fun jpanel(
    layoutManager: LayoutManager = FlowLayout(),
    isDoubleBuffered: Boolean = true,
    builder: JPanel.() -> Unit
): JPanel {
    return JPanel(layoutManager, isDoubleBuffered).apply {
        builder()
    }
}
inline fun jbutton(text: String? = null, icon: Icon? = null, builder: JButton.() -> Unit): JButton {
    return JButton(text, icon).apply {
        builder()
    }
}