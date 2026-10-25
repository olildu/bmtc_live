package defpackage;

import androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class xd0 {
    public static List a(LazyGridPrefetchScope lazyGridPrefetchScope, int i, Function1 function1) {
        return lazyGridPrefetchScope.scheduleLinePrefetch(i);
    }
}
