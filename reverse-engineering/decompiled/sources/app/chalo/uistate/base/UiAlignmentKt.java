package app.chalo.uistate.base;

import androidx.compose.ui.Alignment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UiAlignmentKt {
    public static final Alignment.Horizontal a(UiAlignment.Horizontal horizontal) {
        Intrinsics.i(horizontal, "<this>");
        if (horizontal.equals(UiAlignment.Horizontal.Start.f9886a)) {
            return Alignment.INSTANCE.getStart();
        }
        if (horizontal.equals(UiAlignment.Horizontal.Center.f9884a)) {
            return Alignment.INSTANCE.getCenterHorizontally();
        }
        if (horizontal.equals(UiAlignment.Horizontal.End.f9885a)) {
            return Alignment.INSTANCE.getEnd();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Alignment.Vertical b(UiAlignment.Vertical vertical) {
        Intrinsics.i(vertical, "<this>");
        if (vertical.equals(UiAlignment.Vertical.Top.f9889a)) {
            return Alignment.INSTANCE.getTop();
        }
        if (vertical.equals(UiAlignment.Vertical.Center.f9888a)) {
            return Alignment.INSTANCE.getCenterVertically();
        }
        if (vertical.equals(UiAlignment.Vertical.Bottom.f9887a)) {
            return Alignment.INSTANCE.getBottom();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Alignment c(UiAlignment.BiasAlignment biasAlignment) {
        Intrinsics.i(biasAlignment, "<this>");
        if (biasAlignment.equals(UiAlignment.BiasAlignment.TopStart.f9883a)) {
            return Alignment.INSTANCE.getTopStart();
        }
        if (biasAlignment.equals(UiAlignment.BiasAlignment.TopCenter.f9881a)) {
            return Alignment.INSTANCE.getTopCenter();
        }
        if (biasAlignment.equals(UiAlignment.BiasAlignment.TopEnd.f9882a)) {
            return Alignment.INSTANCE.getTopEnd();
        }
        if (biasAlignment.equals(UiAlignment.BiasAlignment.CenterStart.f9880a)) {
            return Alignment.INSTANCE.getCenterStart();
        }
        if (biasAlignment.equals(UiAlignment.BiasAlignment.Center.f9878a)) {
            return Alignment.INSTANCE.getCenter();
        }
        if (biasAlignment.equals(UiAlignment.BiasAlignment.CenterEnd.f9879a)) {
            return Alignment.INSTANCE.getCenterEnd();
        }
        if (biasAlignment.equals(UiAlignment.BiasAlignment.BottomStart.f9877a)) {
            return Alignment.INSTANCE.getBottomStart();
        }
        if (biasAlignment.equals(UiAlignment.BiasAlignment.BottomCenter.f9875a)) {
            return Alignment.INSTANCE.getBottomCenter();
        }
        if (biasAlignment.equals(UiAlignment.BiasAlignment.BottomEnd.f9876a)) {
            return Alignment.INSTANCE.getBottomEnd();
        }
        throw new NoWhenBranchMatchedException();
    }
}
