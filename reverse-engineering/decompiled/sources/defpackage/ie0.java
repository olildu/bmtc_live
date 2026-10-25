package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ie0 {
    public static /* synthetic */ int a(LazyLayoutScrollScope lazyLayoutScrollScope, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateDistanceTo");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyLayoutScrollScope.calculateDistanceTo(i, i2);
    }

    public static /* synthetic */ void b(LazyLayoutScrollScope lazyLayoutScrollScope, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapToItem");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyLayoutScrollScope.snapToItem(i, i2);
    }
}
