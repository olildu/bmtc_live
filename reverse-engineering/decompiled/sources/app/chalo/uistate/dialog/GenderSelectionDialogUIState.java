package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/GenderSelectionDialogUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GenderSelectionDialogUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogUIEventHandler f10000a;
    public final TextUIState b;
    public final List c;
    public final ChaloColorToken d;
    public final ChaloPadding e;
    public final float f;

    public GenderSelectionDialogUIState(DialogUIEventHandler dialogUIEventHandler, TextUIState title, List genderOptions) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().i, ChaloThemeHelper.a().i, ChaloThemeHelper.a().f);
        float f = ChaloThemeHelper.a().g;
        Intrinsics.i(dialogUIEventHandler, "dialogUIEventHandler");
        Intrinsics.i(title, "title");
        Intrinsics.i(genderOptions, "genderOptions");
        this.f10000a = dialogUIEventHandler;
        this.b = title;
        this.c = genderOptions;
        this.d = ChaloColorToken.White.f9870a;
        this.e = chaloPadding;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenderSelectionDialogUIState)) {
            return false;
        }
        GenderSelectionDialogUIState genderSelectionDialogUIState = (GenderSelectionDialogUIState) obj;
        return Intrinsics.d(this.f10000a, genderSelectionDialogUIState.f10000a) && Intrinsics.d(this.b, genderSelectionDialogUIState.b) && Intrinsics.d(this.c, genderSelectionDialogUIState.c) && Intrinsics.d(this.d, genderSelectionDialogUIState.d) && Intrinsics.d(this.e, genderSelectionDialogUIState.e) && Dp.m7283equalsimpl0(this.f, genderSelectionDialogUIState.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + r30.c(this.e, z40.b(this.d, r30.b(pk0.c(this.b, this.f10000a.hashCode() * 31, 31), 31, this.c), 31), 31);
    }

    public final String toString() {
        return "GenderSelectionDialogUIState(dialogUIEventHandler=" + this.f10000a + ", title=" + this.b + ", genderOptions=" + this.c + ", background=" + this.d + ", padding=" + this.e + ", spaceBetween=" + Dp.m7289toStringimpl(this.f) + ")";
    }
}
