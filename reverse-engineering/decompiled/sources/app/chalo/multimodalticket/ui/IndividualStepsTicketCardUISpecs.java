package app.chalo.multimodalticket.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.gf;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/IndividualStepsTicketCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IndividualStepsTicketCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5952a;
    public final ChaloColorToken b;
    public final BorderUISpec c;
    public final UIShape d;
    public final UiAlignment.Vertical e;
    public final ChaloPadding f;
    public final ChaloPadding g;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public IndividualStepsTicketCardUISpecs(BorderUISpec borderUISpec, ChaloColorToken chaloColorToken) {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle cardShape = UIShape.e;
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().h, 7);
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 1);
        Intrinsics.i(cardShape, "cardShape");
        this.f5952a = chaloPadding;
        this.b = chaloColorToken;
        this.c = borderUISpec;
        this.d = cardShape;
        this.e = UiAlignment.Vertical.Center.f9888a;
        this.f = chaloPadding2;
        this.g = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndividualStepsTicketCardUISpecs)) {
            return false;
        }
        IndividualStepsTicketCardUISpecs individualStepsTicketCardUISpecs = (IndividualStepsTicketCardUISpecs) obj;
        return Intrinsics.d(this.f5952a, individualStepsTicketCardUISpecs.f5952a) && Intrinsics.d(this.b, individualStepsTicketCardUISpecs.b) && Intrinsics.d(this.c, individualStepsTicketCardUISpecs.c) && Intrinsics.d(this.d, individualStepsTicketCardUISpecs.d) && Intrinsics.d(this.e, individualStepsTicketCardUISpecs.e) && Intrinsics.d(this.f, individualStepsTicketCardUISpecs.f) && Intrinsics.d(this.g, individualStepsTicketCardUISpecs.g);
    }

    public final int hashCode() {
        int iB = z40.b(this.b, this.f5952a.hashCode() * 31, 31);
        BorderUISpec borderUISpec = this.c;
        return this.g.hashCode() + r30.c(this.f, uf0.e(this.e, pk0.b(this.d, (iB + (borderUISpec == null ? 0 : borderUISpec.hashCode())) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = gf.l(this.f5952a, this.b, "IndividualStepsTicketCardUISpecs(cardContentPaddingValue=", ", backgroundColor=", ", borderUISpec=");
        sbL.append(this.c);
        sbL.append(", cardShape=");
        sbL.append(this.d);
        sbL.append(", rowVerticalAlignment=");
        sbL.append(this.e);
        sbL.append(", dividerPadding=");
        sbL.append(this.f);
        sbL.append(", internalDividerPadding=");
        return py.e(sbL, this.g, ")");
    }
}
