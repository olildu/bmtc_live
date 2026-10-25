package app.chalo.chalobususerprofile.ui.compose;

import app.chalo.premiumbus.ui.slotselection.BorderUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.z40;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/TimingVariabilityChipUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimingVariabilityChipUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f1238a;
    public final BorderUIState b;
    public final ChaloColorToken c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public TimingVariabilityChipUIState(TextUIState.ChaloTextUIState chaloTextUIState, BorderUIState borderUIState, ChaloColorToken chaloColorToken, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f1238a = chaloTextUIState;
        this.b = borderUIState;
        this.c = chaloColorToken;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimingVariabilityChipUIState)) {
            return false;
        }
        TimingVariabilityChipUIState timingVariabilityChipUIState = (TimingVariabilityChipUIState) obj;
        return this.f1238a.equals(timingVariabilityChipUIState.f1238a) && this.b.equals(timingVariabilityChipUIState.b) && this.c.equals(timingVariabilityChipUIState.c) && this.d.equals(timingVariabilityChipUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z40.b(this.c, (this.b.hashCode() + (this.f1238a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "TimingVariabilityChipUIState(text=" + this.f1238a + ", borderUIState=" + this.b + ", backgroundColor=" + this.c + ", clickHandler=" + this.d + ")";
    }
}
