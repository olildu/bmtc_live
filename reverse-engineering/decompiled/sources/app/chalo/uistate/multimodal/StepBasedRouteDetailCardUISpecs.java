package app.chalo.uistate.multimodal;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/StepBasedRouteDetailCardUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepBasedRouteDetailCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10046a;
    public final ChaloPadding b;
    public final ChaloColorToken c;
    public final UIShape d;
    public final UIShape e;
    public final UiAlignment.Vertical f;

    public StepBasedRouteDetailCardUISpecs() {
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().d, 0.0f, 0.0f, 13);
        UIShape.Rectangle shape = UIShape.e;
        Intrinsics.i(shape, "backgroundShape");
        Intrinsics.i(shape, "shape");
        this.f10046a = chaloPadding;
        this.b = chaloPadding2;
        this.c = ChaloColorToken.LightGrey.f9815a;
        this.d = shape;
        this.e = shape;
        this.f = UiAlignment.Vertical.Bottom.f9887a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepBasedRouteDetailCardUISpecs)) {
            return false;
        }
        StepBasedRouteDetailCardUISpecs stepBasedRouteDetailCardUISpecs = (StepBasedRouteDetailCardUISpecs) obj;
        return Intrinsics.d(this.f10046a, stepBasedRouteDetailCardUISpecs.f10046a) && Intrinsics.d(this.b, stepBasedRouteDetailCardUISpecs.b) && Intrinsics.d(this.c, stepBasedRouteDetailCardUISpecs.c) && Intrinsics.d(this.d, stepBasedRouteDetailCardUISpecs.d) && Intrinsics.d(this.e, stepBasedRouteDetailCardUISpecs.e) && Intrinsics.d(this.f, stepBasedRouteDetailCardUISpecs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + pk0.b(this.e, pk0.b(this.d, z40.b(this.c, r30.c(this.b, this.f10046a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("StepBasedRouteDetailCardUISpecs(contentPadding=", this.f10046a, ", productBrandingPadding=", this.b, ", backgroundColor=");
        sbM.append(this.c);
        sbM.append(", backgroundShape=");
        sbM.append(this.d);
        sbM.append(", shape=");
        sbM.append(this.e);
        sbM.append(", rowVerticalAlignment=");
        sbM.append(this.f);
        sbM.append(")");
        return sbM.toString();
    }
}
