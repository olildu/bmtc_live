package app.chalo.premiumbus.ui.bulkbookingsuccess;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PassInfoUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PassInfoUISpecs f7494a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final TextUIState.StyledTextUIState f;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public PassInfoUIState(TextUIState.ChaloTextUIState sectionTitle, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, TextUIState.StyledTextUIState styledTextUIState) {
        PassInfoUISpecs passInfoUISpecs = new PassInfoUISpecs();
        Intrinsics.i(sectionTitle, "sectionTitle");
        this.f7494a = passInfoUISpecs;
        this.b = sectionTitle;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
        this.e = chaloTextUIState3;
        this.f = styledTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassInfoUIState)) {
            return false;
        }
        PassInfoUIState passInfoUIState = (PassInfoUIState) obj;
        return Intrinsics.d(this.f7494a, passInfoUIState.f7494a) && Intrinsics.d(this.b, passInfoUIState.b) && Intrinsics.d(this.c, passInfoUIState.c) && Intrinsics.d(this.d, passInfoUIState.d) && Intrinsics.d(this.e, passInfoUIState.e) && Intrinsics.d(this.f, passInfoUIState.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r30.f(this.e, r30.f(this.d, r30.f(this.c, r30.f(this.b, this.f7494a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassInfoUIState(specs=");
        sb.append(this.f7494a);
        sb.append(", sectionTitle=");
        sb.append(this.b);
        sb.append(", passTitleUIState=");
        r30.p(sb, this.c, ", passNameUIState=", this.d, ", passValidityUIState=");
        sb.append(this.e);
        sb.append(", tripInfoUIState=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
