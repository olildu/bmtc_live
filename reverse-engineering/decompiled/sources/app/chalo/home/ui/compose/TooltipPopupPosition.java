package app.chalo.home.ui.compose;

import androidx.compose.ui.unit.IntOffset;
import defpackage.vo1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/compose/TooltipPopupPosition;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TooltipPopupPosition {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TooltipPopupPosition) && IntOffset.m7401equalsimpl0(0L, 0L) && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + (IntOffset.m7404hashCodeimpl(0L) * 31);
    }

    public final String toString() {
        return vo1.B("TooltipPopupPosition(offset=", IntOffset.m7409toStringimpl(0L), ", centerPositionX=0.0)");
    }
}
