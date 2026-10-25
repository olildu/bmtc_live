package app.chalo.appUpdate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appUpdate/ForceAppUpdateSpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ForceAppUpdateSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiAlignment.Horizontal f952a;
    public final UiArrangement.HorizontalOrVertical b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final float g;
    public final ChaloPadding h;

    public ForceAppUpdateSpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().l, 0.0f, 2);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding5 = new ChaloPadding(f2, f2, f2, f2);
        this.f952a = UiAlignment.Horizontal.Center.f9884a;
        this.b = UiArrangement.HorizontalOrVertical.Center.f9890a;
        this.c = chaloPadding;
        this.d = chaloPadding2;
        this.e = chaloPadding3;
        this.f = chaloPadding4;
        this.g = f;
        this.h = chaloPadding5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForceAppUpdateSpecs)) {
            return false;
        }
        ForceAppUpdateSpecs forceAppUpdateSpecs = (ForceAppUpdateSpecs) obj;
        return Intrinsics.d(this.f952a, forceAppUpdateSpecs.f952a) && Intrinsics.d(this.b, forceAppUpdateSpecs.b) && Intrinsics.d(this.c, forceAppUpdateSpecs.c) && Intrinsics.d(this.d, forceAppUpdateSpecs.d) && Intrinsics.d(this.e, forceAppUpdateSpecs.e) && Intrinsics.d(this.f, forceAppUpdateSpecs.f) && Dp.m7283equalsimpl0(this.g, forceAppUpdateSpecs.g) && Intrinsics.d(this.h, forceAppUpdateSpecs.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + uf0.a(this.g, r30.c(this.f, r30.c(this.e, r30.c(this.d, r30.c(this.c, (this.b.hashCode() + (this.f952a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.g);
        StringBuilder sb = new StringBuilder("ForceAppUpdateSpecs(horizontalAlignment=");
        sb.append(this.f952a);
        sb.append(", verticalArrangement=");
        sb.append(this.b);
        sb.append(", horizontalPadding=");
        r30.o(sb, this.c, ", paddingAboveTitle=", this.d, ", paddingAboveSubTitle=");
        r30.o(sb, this.e, ", paddingAboveUpdateBtn=", this.f, ", paddingAboveRemindLater=");
        sb.append(strM7289toStringimpl);
        sb.append(", paddingInsideRemindLater=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
