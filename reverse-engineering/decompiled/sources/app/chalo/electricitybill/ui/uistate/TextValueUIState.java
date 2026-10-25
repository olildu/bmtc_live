package app.chalo.electricitybill.ui.uistate;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/uistate/TextValueUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TextValueUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f2611a;
    public final TextUIState.ChaloTextUIState b;

    public TextValueUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this.f2611a = chaloTextUIState;
        this.b = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextValueUIState)) {
            return false;
        }
        TextValueUIState textValueUIState = (TextValueUIState) obj;
        return Intrinsics.d(this.f2611a, textValueUIState.f2611a) && Intrinsics.d(this.b, textValueUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2611a.hashCode() * 31);
    }

    public final String toString() {
        return "TextValueUIState(title=" + this.f2611a + ", value=" + this.b + ")";
    }
}
