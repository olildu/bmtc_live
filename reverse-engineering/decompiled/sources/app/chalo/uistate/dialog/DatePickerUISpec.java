package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DatePickerUISpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DatePickerUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f9978a;
    public final ChaloPadding b;
    public final ChaloPadding c;

    public DatePickerUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().f, ChaloThemeHelper.a().f, Dp.m7278constructorimpl(ChaloThemeHelper.a().f + ChaloThemeHelper.a().g), ChaloThemeHelper.a().f);
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding2 = new ChaloPadding(f, f, f, f);
        this.f9978a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatePickerUISpec)) {
            return false;
        }
        DatePickerUISpec datePickerUISpec = (DatePickerUISpec) obj;
        return Intrinsics.d(this.f9978a, datePickerUISpec.f9978a) && Intrinsics.d(this.b, datePickerUISpec.b) && Intrinsics.d(this.c, datePickerUISpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f9978a.hashCode() * 31, 31);
    }

    public final String toString() {
        return py.e(py.i(this.b, this.f9978a, "DatePickerUISpec(containerColor=", ", paddingAroundConfirmBtn=", ", paddingAroundDismissBtn="), this.c, ")");
    }
}
