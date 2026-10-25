package app.chalo.home.ui.history.uistate.regularbusticket;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/regularbusticket/ChaloTicketCtaSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloTicketCtaSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3516a;
    public final UIShape b;
    public final ChaloColorToken c;
    public final float d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ChaloTicketCtaSpec(ChaloPadding chaloPadding, UIShape uIShape, int i) {
        chaloPadding = (i & 1) != 0 ? new ChaloPadding(0.0f, 0.0f, 3) : chaloPadding;
        uIShape = (i & 2) != 0 ? null : uIShape;
        ChaloColorToken.LightGray lightGray = (i & 4) == 0 ? ChaloColorToken.LightGray.f9814a : null;
        float f = ChaloThemeHelper.a().b;
        this.f3516a = chaloPadding;
        this.b = uIShape;
        this.c = lightGray;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloTicketCtaSpec)) {
            return false;
        }
        ChaloTicketCtaSpec chaloTicketCtaSpec = (ChaloTicketCtaSpec) obj;
        return Intrinsics.d(this.f3516a, chaloTicketCtaSpec.f3516a) && Intrinsics.d(this.b, chaloTicketCtaSpec.b) && Intrinsics.d(this.c, chaloTicketCtaSpec.c) && Dp.m7283equalsimpl0(this.d, chaloTicketCtaSpec.d);
    }

    public final int hashCode() {
        int iHashCode = this.f3516a.hashCode() * 31;
        UIShape uIShape = this.b;
        int iHashCode2 = (iHashCode + (uIShape == null ? 0 : uIShape.hashCode())) * 31;
        ChaloColorToken chaloColorToken = this.c;
        return Dp.m7284hashCodeimpl(this.d) + ((iHashCode2 + (chaloColorToken != null ? chaloColorToken.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ChaloTicketCtaSpec(contentSpacing=" + this.f3516a + ", shape=" + this.b + ", borderColor=" + this.c + ", borderThickness=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}
