package app.chalo.validationsdk.blevalidation.ui.common;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.cb0;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/common/PostValidationSuccessBottomSheetUISpecs;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PostValidationSuccessBottomSheetUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiAlignment.Horizontal f10627a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ChaloPadding f;

    public PostValidationSuccessBottomSheetUISpecs() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().f;
        float f3 = ChaloThemeHelper.a().l;
        float f4 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        this.f10627a = UiAlignment.Horizontal.Center.f9884a;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostValidationSuccessBottomSheetUISpecs)) {
            return false;
        }
        PostValidationSuccessBottomSheetUISpecs postValidationSuccessBottomSheetUISpecs = (PostValidationSuccessBottomSheetUISpecs) obj;
        return Intrinsics.d(this.f10627a, postValidationSuccessBottomSheetUISpecs.f10627a) && Dp.m7283equalsimpl0(this.b, postValidationSuccessBottomSheetUISpecs.b) && Dp.m7283equalsimpl0(this.c, postValidationSuccessBottomSheetUISpecs.c) && Dp.m7283equalsimpl0(this.d, postValidationSuccessBottomSheetUISpecs.d) && Dp.m7283equalsimpl0(this.e, postValidationSuccessBottomSheetUISpecs.e) && Intrinsics.d(this.f, postValidationSuccessBottomSheetUISpecs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f10627a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("PostValidationSuccessBottomSheetUISpecs(contentAlignment=");
        sb.append(this.f10627a);
        sb.append(", spaceBetweenIconAndTitle=");
        sb.append(strM7289toStringimpl);
        sb.append(", spaceBetweenTitleAndSubText=");
        cb0.t(sb, strM7289toStringimpl2, ", spaceBetweenTextAndButton=", strM7289toStringimpl3, ", spaceBetweenButtons=");
        sb.append(strM7289toStringimpl4);
        sb.append(", internalPadding=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
