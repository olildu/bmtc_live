package app.chalo.uistate.plotline;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/plotline/PlotlineWidgetUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlotlineWidgetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10064a;

    public PlotlineWidgetUIState(String str) {
        this.f10064a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlotlineWidgetUIState) && Intrinsics.d(this.f10064a, ((PlotlineWidgetUIState) obj).f10064a);
    }

    public final int hashCode() {
        return this.f10064a.hashCode();
    }

    public final String toString() {
        return vo1.B("PlotlineWidgetUIState(id=", this.f10064a, ")");
    }
}
