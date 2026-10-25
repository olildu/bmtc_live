package defpackage;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.TextToolbar;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class si1 {
    public static void a(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4) {
        textToolbar.showMenu(rect, function0, function1, function2, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            function2 = null;
        }
        if ((i & 16) != 0) {
            function3 = null;
        }
        textToolbar.showMenu(rect, function0, function1, function2, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            function2 = null;
        }
        if ((i & 16) != 0) {
            function3 = null;
        }
        if ((i & 32) != 0) {
            function4 = null;
        }
        textToolbar.showMenu(rect, function0, function1, function2, function3, function4);
    }
}
