package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/RefreshNudgeUiSpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RefreshNudgeUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f4605a;
    public final UIShape b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final float e;

    public RefreshNudgeUiSpec() {
        UIShape.Rectangle shape = UIShape.c;
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().i;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f4, f3, f3, f4);
        float f5 = ChaloThemeHelper.a().d;
        Intrinsics.i(shape, "shape");
        this.f4605a = ChaloColorToken.ChaloBlueEta.f9777a;
        this.b = shape;
        this.c = chaloPadding;
        this.d = chaloPadding2;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshNudgeUiSpec)) {
            return false;
        }
        RefreshNudgeUiSpec refreshNudgeUiSpec = (RefreshNudgeUiSpec) obj;
        return Intrinsics.d(this.f4605a, refreshNudgeUiSpec.f4605a) && Intrinsics.d(this.b, refreshNudgeUiSpec.b) && Intrinsics.d(this.c, refreshNudgeUiSpec.c) && Intrinsics.d(this.d, refreshNudgeUiSpec.d) && Dp.m7283equalsimpl0(this.e, refreshNudgeUiSpec.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + r30.c(this.d, r30.c(this.c, pk0.b(this.b, this.f4605a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("RefreshNudgeUiSpec(backgroundColor=");
        sb.append(this.f4605a);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", containerOuterPadding=");
        r30.o(sb, this.c, ", contentPadding=", this.d, ", iconAndTextSpacing=");
        return vo1.p(sb, strM7289toStringimpl, ")");
    }
}
