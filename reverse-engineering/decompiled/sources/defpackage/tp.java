package defpackage;

import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.text.AnnotatedString;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class tp {
    public static ClipEntry a(ClipboardManager clipboardManager) {
        return null;
    }

    public static android.content.ClipboardManager b(ClipboardManager clipboardManager) {
        throw new UnsupportedOperationException("This platform does not offer a native Clipboard");
    }

    public static boolean c(ClipboardManager clipboardManager) {
        AnnotatedString text = clipboardManager.getText();
        return text != null && text.length() > 0;
    }

    public static void d(ClipboardManager clipboardManager, ClipEntry clipEntry) {
    }
}
