package app.chalo.compose.components;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.xq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/TooltipAlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TooltipAlignmentOffsetPositionProvider implements PopupPositionProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alignment f1849a;
    public final long b;
    public final float c;
    public final float d;
    public final TooltipPopupPlacement e;
    public final xq0 f;

    public TooltipAlignmentOffsetPositionProvider(Alignment alignment, long j, float f, float f2, TooltipPopupPlacement placement, xq0 xq0Var) {
        Intrinsics.i(alignment, "alignment");
        Intrinsics.i(placement, "placement");
        this.f1849a = alignment;
        this.b = j;
        this.c = f;
        this.d = f2;
        this.e = placement;
        this.f = xq0Var;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public final long mo373calculatePositionllwVHH4(IntRect anchorBounds, long j, LayoutDirection layoutDirection, long j2) {
        boolean z;
        Intrinsics.i(anchorBounds, "anchorBounds");
        Intrinsics.i(layoutDirection, "layoutDirection");
        long j3 = 0;
        long j4 = j3 << 32;
        long jM7396constructorimpl = IntOffset.m7396constructorimpl((j3 & BodyPartID.bodyIdMax) | j4);
        IntSize.Companion companion = IntSize.INSTANCE;
        long jMo4116alignKFBX0sM = this.f1849a.mo4116alignKFBX0sM(companion.m7450getZeroYbymL2g(), IntSize.m7440constructorimpl((((long) anchorBounds.getHeight()) & BodyPartID.bodyIdMax) | (((long) anchorBounds.getWidth()) << 32)), layoutDirection);
        long jM7450getZeroYbymL2g = companion.m7450getZeroYbymL2g();
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & BodyPartID.bodyIdMax);
        long jMo4116alignKFBX0sM2 = this.f1849a.mo4116alignKFBX0sM(jM7450getZeroYbymL2g, IntSize.m7440constructorimpl((((long) i) << 32) | (((long) i2) & BodyPartID.bodyIdMax)), layoutDirection);
        long jM7405minusqkQi6aY = IntOffset.m7405minusqkQi6aY(IntOffset.m7406plusqkQi6aY(IntOffset.m7406plusqkQi6aY(jM7396constructorimpl, IntOffset.m7396constructorimpl((((long) anchorBounds.getTop()) & BodyPartID.bodyIdMax) | (((long) anchorBounds.getLeft()) << 32))), jMo4116alignKFBX0sM), IntOffset.m7396constructorimpl((((long) IntOffset.m7403getYimpl(jMo4116alignKFBX0sM2)) & BodyPartID.bodyIdMax) | (((long) IntOffset.m7402getXimpl(jMo4116alignKFBX0sM2)) << 32)));
        long j5 = this.b;
        long jM7396constructorimpl2 = IntOffset.m7396constructorimpl((((long) IntOffset.m7403getYimpl(j5)) & BodyPartID.bodyIdMax) | (((long) (IntOffset.m7402getXimpl(j5) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1))) << 32));
        long jM7406plusqkQi6aY = IntOffset.m7406plusqkQi6aY(jM7405minusqkQi6aY, jM7396constructorimpl2);
        if (this.e == TooltipPopupPlacement.AboveAnchor) {
            z = false;
            jM7406plusqkQi6aY = IntOffset.m7398copyiSbpLlY$default(jM7406plusqkQi6aY, 0, Math.max(0, (anchorBounds.getTop() - i2) - IntOffset.m7403getYimpl(jM7396constructorimpl2)), 1, null);
        } else {
            z = false;
        }
        float f = this.c;
        float f2 = this.d;
        float f3 = f - f2;
        float f4 = (int) (j >> 32);
        float f5 = (f4 - f) - f2;
        int iM7402getXimpl = IntOffset.m7402getXimpl(IntSizeKt.m7451getCenterozmzZPI(j2));
        float f6 = 2 * f2;
        float f7 = f4 - f6;
        float f8 = iM7402getXimpl;
        boolean z2 = (f8 > f3 || f8 > f5) ? z : true;
        xq0 xq0Var = this.f;
        if (z2) {
            String message = "isCentralPositionTooltip: " + z2;
            Intrinsics.i(message, "message");
            long jM7396constructorimpl3 = IntOffset.m7396constructorimpl((((long) (((int) f) - iM7402getXimpl)) << 32) | (((long) IntOffset.m7403getYimpl(jM7406plusqkQi6aY)) & BodyPartID.bodyIdMax));
            xq0Var.invoke(Float.valueOf(f8 - f2));
            return jM7396constructorimpl3;
        }
        if (i >= f7) {
            String message2 = "tooltipWidth >= maxTooltipSize: " + i + " >= " + f7;
            Intrinsics.i(message2, "message");
            long jM7396constructorimpl4 = IntOffset.m7396constructorimpl((((long) IntOffset.m7403getYimpl(jM7406plusqkQi6aY)) & BodyPartID.bodyIdMax) | (((long) (IntOffset.m7402getXimpl(IntSizeKt.m7451getCenterozmzZPI(j)) - iM7402getXimpl)) << 32));
            xq0Var.invoke(Float.valueOf((f - IntOffset.m7402getXimpl(jM7396constructorimpl4)) - f2));
            return jM7396constructorimpl4;
        }
        if (f8 > f5) {
            String message3 = "halfPopupContentSize > rightSpace: " + iM7402getXimpl + " > " + f5;
            Intrinsics.i(message3, "message");
            long jM7396constructorimpl5 = IntOffset.m7396constructorimpl((((long) IntOffset.m7403getYimpl(jM7406plusqkQi6aY)) & BodyPartID.bodyIdMax) | (((long) ((int) f)) << 32));
            xq0Var.invoke(Float.valueOf(((f8 - f5) + f8) - f6));
            return jM7396constructorimpl5;
        }
        if (f8 <= f3) {
            xq0Var.invoke(Float.valueOf(f));
            return jM7406plusqkQi6aY;
        }
        String message4 = "halfPopupContentSize > leftSpace: " + iM7402getXimpl + " > " + f3;
        Intrinsics.i(message4, "message");
        long jM7396constructorimpl6 = IntOffset.m7396constructorimpl(j4 | (((long) IntOffset.m7403getYimpl(jM7406plusqkQi6aY)) & BodyPartID.bodyIdMax));
        xq0Var.invoke(Float.valueOf(f3));
        return jM7396constructorimpl6;
    }
}
