package app.chalo.productpurchase.productselection.ui;

import app.chalo.uistate.components.FromToStopIconUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/FromToStopViewUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FromToStopViewUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FromToStopIconUIState f8665a = new FromToStopIconUIState();
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;

    public FromToStopViewUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FromToStopViewUIState)) {
            return false;
        }
        FromToStopViewUIState fromToStopViewUIState = (FromToStopViewUIState) obj;
        return Intrinsics.d(this.f8665a, fromToStopViewUIState.f8665a) && Intrinsics.d(this.b, fromToStopViewUIState.b) && Intrinsics.d(this.c, fromToStopViewUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f8665a.f9938a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FromToStopViewUIState(fromToStopIconUIState=");
        sb.append(this.f8665a);
        sb.append(", fromStop=");
        sb.append(this.b);
        sb.append(", toStop=");
        return py.f(sb, this.c, ")");
    }
}
