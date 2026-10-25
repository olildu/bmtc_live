package defpackage;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.LookaheadScopeKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class gg0 {
    public static long a(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z) {
        return LookaheadScopeKt.m5964localLookaheadPositionOfFgt4K4Q(lookaheadScope, layoutCoordinates, layoutCoordinates2, j, z);
    }

    public static /* synthetic */ long b(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
        }
        if ((i & 2) != 0) {
            j = Offset.INSTANCE.m4381getZeroF1C5BW0();
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = true;
        }
        return lookaheadScope.mo128localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j2, z);
    }
}
