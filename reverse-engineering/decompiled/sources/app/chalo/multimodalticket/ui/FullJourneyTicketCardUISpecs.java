package app.chalo.multimodalticket.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.gf;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/FullJourneyTicketCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FullJourneyTicketCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5925a;
    public final ChaloColorToken b;
    public final BorderUISpec c;
    public final UIShape d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final ChaloPadding g;
    public final ChaloPadding h;
    public final UiAlignment.Vertical i;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public FullJourneyTicketCardUISpecs(ChaloPadding chaloPadding, ChaloColorToken chaloColorToken, BorderUISpec borderUISpec, ChaloPadding chaloPadding2, ChaloPadding chaloPadding3, ChaloPadding chaloPadding4, ChaloPadding chaloPadding5, int i) {
        if ((i & 1) != 0) {
            float f = ChaloThemeHelper.a().h;
            chaloPadding = new ChaloPadding(f, f, f, f);
        }
        UIShape.Rectangle cardShape = UIShape.e;
        ChaloPadding chaloPadding6 = (i & 16) != 0 ? new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 2) : chaloPadding2;
        ChaloPadding chaloPadding7 = (i & 32) != 0 ? new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, ChaloThemeHelper.a().d, 6) : chaloPadding3;
        ChaloPadding chaloPadding8 = (i & 64) != 0 ? new ChaloPadding(0.0f, ChaloThemeHelper.a().d, 0.0f, 0.0f, 13) : chaloPadding4;
        ChaloPadding chaloPadding9 = (i & 128) != 0 ? new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, 0.0f, 14) : chaloPadding5;
        Intrinsics.i(cardShape, "cardShape");
        this.f5925a = chaloPadding;
        this.b = chaloColorToken;
        this.c = borderUISpec;
        this.d = cardShape;
        this.e = chaloPadding6;
        this.f = chaloPadding7;
        this.g = chaloPadding8;
        this.h = chaloPadding9;
        this.i = UiAlignment.Vertical.Center.f9888a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullJourneyTicketCardUISpecs)) {
            return false;
        }
        FullJourneyTicketCardUISpecs fullJourneyTicketCardUISpecs = (FullJourneyTicketCardUISpecs) obj;
        return Intrinsics.d(this.f5925a, fullJourneyTicketCardUISpecs.f5925a) && Intrinsics.d(this.b, fullJourneyTicketCardUISpecs.b) && Intrinsics.d(this.c, fullJourneyTicketCardUISpecs.c) && Intrinsics.d(this.d, fullJourneyTicketCardUISpecs.d) && Intrinsics.d(this.e, fullJourneyTicketCardUISpecs.e) && Intrinsics.d(this.f, fullJourneyTicketCardUISpecs.f) && Intrinsics.d(this.g, fullJourneyTicketCardUISpecs.g) && Intrinsics.d(this.h, fullJourneyTicketCardUISpecs.h) && Intrinsics.d(this.i, fullJourneyTicketCardUISpecs.i);
    }

    public final int hashCode() {
        int iB = z40.b(this.b, this.f5925a.hashCode() * 31, 31);
        BorderUISpec borderUISpec = this.c;
        return this.i.hashCode() + r30.c(this.h, r30.c(this.g, r30.c(this.f, r30.c(this.e, pk0.b(this.d, (iB + (borderUISpec == null ? 0 : borderUISpec.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = gf.l(this.f5925a, this.b, "FullJourneyTicketCardUISpecs(cardContentPaddingValue=", ", backgroundColor=", ", borderUISpec=");
        sbL.append(this.c);
        sbL.append(", cardShape=");
        sbL.append(this.d);
        sbL.append(", switchIconPadding=");
        r30.o(sbL, this.e, ", modeIconRowPadding=", this.f, ", radioButtonPadding=");
        r30.o(sbL, this.g, ", rowPadding=", this.h, ", rowVerticalAlignment=");
        sbL.append(this.i);
        sbL.append(")");
        return sbL.toString();
    }
}
