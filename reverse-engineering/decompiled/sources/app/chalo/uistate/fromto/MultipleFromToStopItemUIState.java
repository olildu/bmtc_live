package app.chalo.uistate.fromto;

import app.chalo.compose.theme.ShapedContentUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/fromto/MultipleFromToStopItemUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultipleFromToStopItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f10028a;
    public final ShapedContentUIState b;
    public final MultipleFromToStopConnectorUIState c;
    public final MultipleFromToStopConnectorUIState d;
    public final MultipleFromToStopItemUISpecs e;

    public MultipleFromToStopItemUIState(TextUIState.ChaloTextUIState stopTextUIState, ShapedContentUIState shapedContentUIState, MultipleFromToStopConnectorUIState multipleFromToStopConnectorUIState, MultipleFromToStopConnectorUIState multipleFromToStopConnectorUIState2) {
        MultipleFromToStopItemUISpecs multipleFromToStopItemUISpecs = new MultipleFromToStopItemUISpecs();
        Intrinsics.i(stopTextUIState, "stopTextUIState");
        this.f10028a = stopTextUIState;
        this.b = shapedContentUIState;
        this.c = multipleFromToStopConnectorUIState;
        this.d = multipleFromToStopConnectorUIState2;
        this.e = multipleFromToStopItemUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultipleFromToStopItemUIState)) {
            return false;
        }
        MultipleFromToStopItemUIState multipleFromToStopItemUIState = (MultipleFromToStopItemUIState) obj;
        return Intrinsics.d(this.f10028a, multipleFromToStopItemUIState.f10028a) && Intrinsics.d(this.b, multipleFromToStopItemUIState.b) && Intrinsics.d(this.c, multipleFromToStopItemUIState.c) && Intrinsics.d(this.d, multipleFromToStopItemUIState.d) && Intrinsics.d(this.e, multipleFromToStopItemUIState.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f10028a.hashCode() * 31)) * 31;
        MultipleFromToStopConnectorUIState multipleFromToStopConnectorUIState = this.c;
        int iHashCode2 = (iHashCode + (multipleFromToStopConnectorUIState == null ? 0 : multipleFromToStopConnectorUIState.hashCode())) * 31;
        MultipleFromToStopConnectorUIState multipleFromToStopConnectorUIState2 = this.d;
        return this.e.hashCode() + ((iHashCode2 + (multipleFromToStopConnectorUIState2 != null ? multipleFromToStopConnectorUIState2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MultipleFromToStopItemUIState(stopTextUIState=" + this.f10028a + ", indicator=" + this.b + ", topConnector=" + this.c + ", bottomConnector=" + this.d + ", specs=" + this.e + ")";
    }
}
