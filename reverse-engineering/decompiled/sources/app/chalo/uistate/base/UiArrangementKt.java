package app.chalo.uistate.base;

import androidx.compose.foundation.layout.Arrangement;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UiArrangementKt {
    public static final Arrangement.HorizontalOrVertical a(UiArrangement.HorizontalOrVertical horizontalOrVertical) {
        Intrinsics.i(horizontalOrVertical, "<this>");
        if (horizontalOrVertical.equals(UiArrangement.HorizontalOrVertical.Center.f9890a)) {
            return Arrangement.INSTANCE.getCenter();
        }
        if (horizontalOrVertical.equals(UiArrangement.HorizontalOrVertical.SpaceEvenly.f9893a)) {
            return Arrangement.INSTANCE.getSpaceEvenly();
        }
        if (horizontalOrVertical.equals(UiArrangement.HorizontalOrVertical.SpaceBetween.f9892a)) {
            return Arrangement.INSTANCE.getSpaceBetween();
        }
        if (horizontalOrVertical.equals(UiArrangement.HorizontalOrVertical.SpaceAround.f9891a)) {
            return Arrangement.INSTANCE.getSpaceAround();
        }
        if (horizontalOrVertical instanceof UiArrangement.HorizontalOrVertical.SpacedBy) {
            return Arrangement.INSTANCE.m672spacedBy0680j_4(((UiArrangement.HorizontalOrVertical.SpacedBy) horizontalOrVertical).f9894a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
