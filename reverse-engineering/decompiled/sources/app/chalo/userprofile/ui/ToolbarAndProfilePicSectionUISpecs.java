package app.chalo.userprofile.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/ToolbarAndProfilePicSectionUISpecs;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ToolbarAndProfilePicSectionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10341a;
    public final List b;
    public final ChaloPadding c;
    public final float d;
    public final float e;
    public final float f;

    public ToolbarAndProfilePicSectionUISpecs() {
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().i;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        ChaloColorToken.UserProfileLinearLight userProfileLinearLight = ChaloColorToken.UserProfileLinearLight.f9867a;
        List gradientBackgroundColorList = CollectionsKt.S(userProfileLinearLight, ChaloColorToken.CardLinearDark.f9775a, userProfileLinearLight);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().d, 7);
        float f3 = ChaloThemeHelper.a().d;
        float f4 = ChaloThemeHelper.a().g;
        float f5 = ChaloThemeHelper.a().q0;
        Intrinsics.i(gradientBackgroundColorList, "gradientBackgroundColorList");
        this.f10341a = chaloPadding;
        this.b = gradientBackgroundColorList;
        this.c = chaloPadding2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolbarAndProfilePicSectionUISpecs)) {
            return false;
        }
        ToolbarAndProfilePicSectionUISpecs toolbarAndProfilePicSectionUISpecs = (ToolbarAndProfilePicSectionUISpecs) obj;
        return Intrinsics.d(this.f10341a, toolbarAndProfilePicSectionUISpecs.f10341a) && Intrinsics.d(this.b, toolbarAndProfilePicSectionUISpecs.b) && Intrinsics.d(this.c, toolbarAndProfilePicSectionUISpecs.c) && Dp.m7283equalsimpl0(this.d, toolbarAndProfilePicSectionUISpecs.d) && Dp.m7283equalsimpl0(this.e, toolbarAndProfilePicSectionUISpecs.e) && Dp.m7283equalsimpl0(this.f, toolbarAndProfilePicSectionUISpecs.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, uf0.a(this.d, r30.c(this.c, r30.b(this.f10341a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        StringBuilder sb = new StringBuilder("ToolbarAndProfilePicSectionUISpecs(profilePicSectionPadding=");
        sb.append(this.f10341a);
        sb.append(", gradientBackgroundColorList=");
        sb.append(this.b);
        sb.append(", profilePicPadding=");
        py.u(sb, this.c, ", spacingBetweenHeadingAndSubheading=", strM7289toStringimpl, ", spacingBetweenProfilePicSectionAndEditFieldSection=");
        return r30.i(sb, strM7289toStringimpl2, ", bottomSpaceDueToOffset=", strM7289toStringimpl3, ")");
    }
}
