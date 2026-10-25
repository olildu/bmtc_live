package app.chalo.home.ui.history.uistate.chalobusticket;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.t10;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/BusTicketStatusSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusTicketStatusSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3494a;
    public final float b;
    public final ChaloColorToken c;
    public final UIShape d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public BusTicketStatusSpec(ChaloColorToken backgroundColor, int i) {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().c;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().c;
        backgroundColor = (i & 4) != 0 ? ChaloColorToken.RedBase.f9846a : backgroundColor;
        float f4 = ChaloThemeHelper.a().d;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f4, f4, f4, f4);
        Intrinsics.i(backgroundColor, "backgroundColor");
        this.f3494a = chaloPadding;
        this.b = f3;
        this.c = backgroundColor;
        this.d = rectangle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusTicketStatusSpec)) {
            return false;
        }
        BusTicketStatusSpec busTicketStatusSpec = (BusTicketStatusSpec) obj;
        return Intrinsics.d(this.f3494a, busTicketStatusSpec.f3494a) && Dp.m7283equalsimpl0(this.b, busTicketStatusSpec.b) && Intrinsics.d(this.c, busTicketStatusSpec.c) && Intrinsics.d(this.d, busTicketStatusSpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z40.b(this.c, uf0.a(this.b, this.f3494a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = t10.n("BusTicketStatusSpec(contentSpacing=", this.f3494a, ", iconAndTextSpacing=", Dp.m7289toStringimpl(this.b), ", backgroundColor=");
        sbN.append(this.c);
        sbN.append(", shape=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
