package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PassInfoCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassInfoCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PassInfoCardUISpecs f7650a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;

    public PassInfoCardUIState(TextUIState.ChaloTextUIState chaloTextUIState, List passInfoUIStateList) {
        PassInfoCardUISpecs passInfoCardUISpecs = new PassInfoCardUISpecs();
        Intrinsics.i(passInfoUIStateList, "passInfoUIStateList");
        this.f7650a = passInfoCardUISpecs;
        this.b = chaloTextUIState;
        this.c = passInfoUIStateList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassInfoCardUIState)) {
            return false;
        }
        PassInfoCardUIState passInfoCardUIState = (PassInfoCardUIState) obj;
        return Intrinsics.d(this.f7650a, passInfoCardUIState.f7650a) && Intrinsics.d(this.b, passInfoCardUIState.b) && Intrinsics.d(this.c, passInfoCardUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f7650a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassInfoCardUIState(spec=");
        sb.append(this.f7650a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", passInfoUIStateList=");
        return xs.l(sb, this.c, ")");
    }
}
