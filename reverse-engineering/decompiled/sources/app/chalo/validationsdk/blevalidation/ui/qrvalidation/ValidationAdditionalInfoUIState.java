package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/ValidationAdditionalInfoUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ValidationAdditionalInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f10660a;
    public final TextUIState.ChaloTextUIState b;
    public final ChaloPadding c;
    public final ChaloPadding d;

    public ValidationAdditionalInfoUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().g, ChaloThemeHelper.a().h, 0.0f, ChaloThemeHelper.a().h, 4);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().d, 7);
        this.f10660a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = chaloPadding;
        this.d = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationAdditionalInfoUIState)) {
            return false;
        }
        ValidationAdditionalInfoUIState validationAdditionalInfoUIState = (ValidationAdditionalInfoUIState) obj;
        return Intrinsics.d(this.f10660a, validationAdditionalInfoUIState.f10660a) && Intrinsics.d(this.b, validationAdditionalInfoUIState.b) && Intrinsics.d(this.c, validationAdditionalInfoUIState.c) && Intrinsics.d(this.d, validationAdditionalInfoUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, r30.f(this.b, this.f10660a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("ValidationAdditionalInfoUIState(title=", this.f10660a, ", info=", this.b, ", internalPadding=");
        sbJ.append(this.c);
        sbJ.append(", paddingAroundTitle=");
        sbJ.append(this.d);
        sbJ.append(")");
        return sbJ.toString();
    }
}
