package app.chalo.uistate.components;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/ChaloTicketDetailsContainerSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloTicketDetailsContainerSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9934a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final float d;
    public final float e;

    public ChaloTicketDetailsContainerSpec() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().i;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        UIShape.Rectangle shape = UIShape.d;
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().h;
        Intrinsics.i(shape, "shape");
        this.f9934a = chaloPadding;
        this.b = ChaloColorToken.SectionDividerColor.f9849a;
        this.c = shape;
        this.d = f3;
        this.e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloTicketDetailsContainerSpec)) {
            return false;
        }
        ChaloTicketDetailsContainerSpec chaloTicketDetailsContainerSpec = (ChaloTicketDetailsContainerSpec) obj;
        return Intrinsics.d(this.f9934a, chaloTicketDetailsContainerSpec.f9934a) && Intrinsics.d(this.b, chaloTicketDetailsContainerSpec.b) && Intrinsics.d(this.c, chaloTicketDetailsContainerSpec.c) && Dp.m7283equalsimpl0(this.d, chaloTicketDetailsContainerSpec.d) && Dp.m7283equalsimpl0(this.e, chaloTicketDetailsContainerSpec.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + uf0.a(this.d, pk0.b(this.c, z40.b(this.b, this.f9934a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        StringBuilder sbL = gf.l(this.f9934a, this.b, "ChaloTicketDetailsContainerSpec(contentSpacing=", ", backgroundColor=", ", shape=");
        sbL.append(this.c);
        sbL.append(", ticketScheduleAndDividerSpacing=");
        sbL.append(strM7289toStringimpl);
        sbL.append(", dividerAndTicketTripDetailsSpacing=");
        return vo1.p(sbL, strM7289toStringimpl2, ")");
    }
}
