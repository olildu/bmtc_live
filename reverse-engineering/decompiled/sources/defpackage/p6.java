package defpackage;

import androidx.compose.material3.AppBarScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p6 {
    public static /* synthetic */ void a(AppBarScope appBarScope, Function0 function0, Function2 function2, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clickableItem");
        }
        if ((i & 8) != 0) {
            z = true;
        }
        appBarScope.clickableItem(function0, function2, str, z);
    }

    public static /* synthetic */ void b(AppBarScope appBarScope, boolean z, Function1 function1, Function2 function2, String str, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleableItem");
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        appBarScope.toggleableItem(z, function1, function2, str, z2);
    }
}
