package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.gf;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/StepCardSpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepCardSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4611a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final UiAlignment.BiasAlignment d;

    public StepCardSpecs() {
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        UIShape.Rectangle shape = UIShape.o;
        Intrinsics.i(shape, "shape");
        this.f4611a = chaloPadding;
        this.b = ChaloColorToken.LightOrangeSpf.f9817a;
        this.c = shape;
        this.d = UiAlignment.BiasAlignment.Center.f9878a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepCardSpecs)) {
            return false;
        }
        StepCardSpecs stepCardSpecs = (StepCardSpecs) obj;
        return Intrinsics.d(this.f4611a, stepCardSpecs.f4611a) && Intrinsics.d(this.b, stepCardSpecs.b) && Intrinsics.d(this.c, stepCardSpecs.c) && Intrinsics.d(this.d, stepCardSpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + pk0.b(this.c, z40.b(this.b, this.f4611a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = gf.l(this.f4611a, this.b, "StepCardSpecs(padding=", ", backgroundColor=", ", shape=");
        sbL.append(this.c);
        sbL.append(", contentAlignment=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }
}
