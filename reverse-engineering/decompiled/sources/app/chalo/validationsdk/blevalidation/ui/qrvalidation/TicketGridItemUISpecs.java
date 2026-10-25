package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.t10;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/TicketGridItemUISpecs;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketGridItemUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10657a;
    public final float b;
    public final UiAlignment.BiasAlignment c;
    public final float d;
    public final ChaloColorToken e;
    public final ChaloColorToken f;
    public final UIShape g;
    public final UIShape h;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public TicketGridItemUISpecs(ChaloColorToken chaloColorToken, ChaloColorToken chaloColorToken2) {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().n;
        float f3 = ChaloThemeHelper.a().b;
        UIShape backgroundShape = ChaloThemeHelper.d.c;
        Intrinsics.i(backgroundShape, "borderShape");
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f10657a = chaloPadding;
        this.b = f2;
        this.c = UiAlignment.BiasAlignment.Center.f9878a;
        this.d = f3;
        this.e = chaloColorToken;
        this.f = chaloColorToken2;
        this.g = backgroundShape;
        this.h = backgroundShape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketGridItemUISpecs)) {
            return false;
        }
        TicketGridItemUISpecs ticketGridItemUISpecs = (TicketGridItemUISpecs) obj;
        return Intrinsics.d(this.f10657a, ticketGridItemUISpecs.f10657a) && Dp.m7283equalsimpl0(this.b, ticketGridItemUISpecs.b) && Intrinsics.d(this.c, ticketGridItemUISpecs.c) && Dp.m7283equalsimpl0(this.d, ticketGridItemUISpecs.d) && Intrinsics.d(this.e, ticketGridItemUISpecs.e) && Intrinsics.d(this.f, ticketGridItemUISpecs.f) && Intrinsics.d(this.g, ticketGridItemUISpecs.g) && Intrinsics.d(this.h, ticketGridItemUISpecs.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + pk0.b(this.g, z40.b(this.f, z40.b(this.e, uf0.a(this.d, (this.c.hashCode() + uf0.a(this.b, this.f10657a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        StringBuilder sbN = t10.n("TicketGridItemUISpecs(paddingAroundItem=", this.f10657a, ", minHeight=", strM7289toStringimpl, ", itemContentAlignment=");
        sbN.append(this.c);
        sbN.append(", borderThickness=");
        sbN.append(strM7289toStringimpl2);
        sbN.append(", borderColor=");
        sbN.append(this.e);
        sbN.append(", backgroundColor=");
        sbN.append(this.f);
        sbN.append(", borderShape=");
        sbN.append(this.g);
        sbN.append(", backgroundShape=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
