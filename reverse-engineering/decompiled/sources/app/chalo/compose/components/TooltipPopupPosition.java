package app.chalo.compose.components;

import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/TooltipPopupPosition;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TooltipPopupPosition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1851a;
    public final float b;

    public TooltipPopupPosition(long j, float f) {
        this.f1851a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TooltipPopupPosition)) {
            return false;
        }
        TooltipPopupPosition tooltipPopupPosition = (TooltipPopupPosition) obj;
        return IntOffset.m7401equalsimpl0(this.f1851a, tooltipPopupPosition.f1851a) && Float.compare(this.b, tooltipPopupPosition.b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (IntOffset.m7404hashCodeimpl(this.f1851a) * 31);
    }

    public final String toString() {
        return "TooltipPopupPosition(offset=" + IntOffset.m7409toStringimpl(this.f1851a) + ", centerPositionX=" + this.b + ")";
    }
}
