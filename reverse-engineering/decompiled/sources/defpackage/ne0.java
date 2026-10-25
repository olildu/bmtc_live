package defpackage;

import androidx.compose.foundation.lazy.LazyListPrefetchScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ne0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LazyLayoutPrefetchState.PrefetchHandle a(LazyListPrefetchScope lazyListPrefetchScope, int i, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedulePrefetch");
        }
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        return lazyListPrefetchScope.schedulePrefetch(i, function1);
    }
}
