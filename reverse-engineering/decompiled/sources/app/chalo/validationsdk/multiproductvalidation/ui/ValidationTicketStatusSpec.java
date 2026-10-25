package app.chalo.validationsdk.multiproductvalidation.ui;

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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/ValidationTicketStatusSpec;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ValidationTicketStatusSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10706a;
    public final float b;
    public final ChaloColorToken c;
    public final UIShape d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ValidationTicketStatusSpec(ChaloColorToken chaloColorToken) {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().c;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().c;
        float f4 = ChaloThemeHelper.a().d;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f4, f4, f4, f4);
        this.f10706a = chaloPadding;
        this.b = f3;
        this.c = chaloColorToken;
        this.d = rectangle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationTicketStatusSpec)) {
            return false;
        }
        ValidationTicketStatusSpec validationTicketStatusSpec = (ValidationTicketStatusSpec) obj;
        return Intrinsics.d(this.f10706a, validationTicketStatusSpec.f10706a) && Dp.m7283equalsimpl0(this.b, validationTicketStatusSpec.b) && Intrinsics.d(this.c, validationTicketStatusSpec.c) && Intrinsics.d(this.d, validationTicketStatusSpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z40.b(this.c, uf0.a(this.b, this.f10706a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = t10.n("ValidationTicketStatusSpec(contentSpacing=", this.f10706a, ", iconAndTextSpacing=", Dp.m7289toStringimpl(this.b), ", backgroundColor=");
        sbN.append(this.c);
        sbN.append(", shape=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
