package app.chalo.userprofile.ui.minprofileupdate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/AgeInputFieldUISpec;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AgeInputFieldUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10376a;
    public final float b;

    public AgeInputFieldUISpec() {
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().d;
        this.f10376a = chaloPadding;
        this.b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeInputFieldUISpec)) {
            return false;
        }
        AgeInputFieldUISpec ageInputFieldUISpec = (AgeInputFieldUISpec) obj;
        return Intrinsics.d(this.f10376a, ageInputFieldUISpec.f10376a) && Dp.m7283equalsimpl0(this.b, ageInputFieldUISpec.b);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.b) + (this.f10376a.hashCode() * 31);
    }

    public final String toString() {
        return t8.h("AgeInputFieldUISpec(contentPadding=", this.f10376a, ", textFieldToSupportingTextSpacing=", Dp.m7289toStringimpl(this.b), ")");
    }
}
