package app.chalo.home.ui.compose;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/compose/TooltipAlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TooltipAlignmentOffsetPositionProvider implements PopupPositionProvider {
    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public final long mo373calculatePositionllwVHH4(IntRect anchorBounds, long j, LayoutDirection layoutDirection, long j2) {
        Intrinsics.i(anchorBounds, "anchorBounds");
        Intrinsics.i(layoutDirection, "layoutDirection");
        long j3 = 0;
        IntOffset.m7396constructorimpl((j3 & BodyPartID.bodyIdMax) | (j3 << 32));
        IntSize.INSTANCE.m7450getZeroYbymL2g();
        IntSize.m7440constructorimpl((((long) anchorBounds.getWidth()) << 32) | (((long) anchorBounds.getHeight()) & BodyPartID.bodyIdMax));
        throw null;
    }
}
