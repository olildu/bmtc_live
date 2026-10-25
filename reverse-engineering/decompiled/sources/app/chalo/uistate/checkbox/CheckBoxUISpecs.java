package app.chalo.uistate.checkbox;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/checkbox/CheckBoxUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckBoxUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9928a = new ChaloPadding(0.0f, 0.0f, 3);
    public final ChaloColorToken b = ChaloColorToken.OrangePrimary.f9835a;
    public final ChaloColorToken c = ChaloColorToken.Black_40.f9764a;
    public final ChaloColorToken d = ChaloColorToken.White.f9870a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckBoxUISpecs)) {
            return false;
        }
        CheckBoxUISpecs checkBoxUISpecs = (CheckBoxUISpecs) obj;
        return Intrinsics.d(this.f9928a, checkBoxUISpecs.f9928a) && Intrinsics.d(this.b, checkBoxUISpecs.b) && Intrinsics.d(this.c, checkBoxUISpecs.c) && Intrinsics.d(this.d, checkBoxUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z40.b(this.c, z40.b(this.b, this.f9928a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = gf.l(this.f9928a, this.b, "CheckBoxUISpecs(internalPadding=", ", checkedCheckboxColor=", ", uncheckedCheckboxColor=");
        sbL.append(this.c);
        sbL.append(", checkboxCheckmarkColor=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }
}
