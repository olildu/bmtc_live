package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/ConfirmationDialogUISpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmationDialogUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f9973a;
    public final ChaloPadding b;
    public final float c;
    public final float d;

    public ConfirmationDialogUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().h;
        this.f9973a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmationDialogUISpec)) {
            return false;
        }
        ConfirmationDialogUISpec confirmationDialogUISpec = (ConfirmationDialogUISpec) obj;
        return Intrinsics.d(this.f9973a, confirmationDialogUISpec.f9973a) && Intrinsics.d(this.b, confirmationDialogUISpec.b) && Dp.m7283equalsimpl0(this.c, confirmationDialogUISpec.c) && Dp.m7283equalsimpl0(this.d, confirmationDialogUISpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, r30.c(this.b, this.f9973a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return r30.i(py.i(this.b, this.f9973a, "ConfirmationDialogUISpec(backgroundColor=", ", contentPadding=", ", titleAndDescriptionSpacing="), Dp.m7289toStringimpl(this.c), ", descriptionAndCtaSpacing=", Dp.m7289toStringimpl(this.d), ")");
    }
}
