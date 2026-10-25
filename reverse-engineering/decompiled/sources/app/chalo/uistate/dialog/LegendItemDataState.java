package app.chalo.uistate.dialog;

import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/LegendItemDataState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LegendItemDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f10003a;
    public final String b;

    public LegendItemDataState(ChaloColorToken color, String description) {
        Intrinsics.i(color, "color");
        Intrinsics.i(description, "description");
        this.f10003a = color;
        this.b = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegendItemDataState)) {
            return false;
        }
        LegendItemDataState legendItemDataState = (LegendItemDataState) obj;
        return Intrinsics.d(this.f10003a, legendItemDataState.f10003a) && Intrinsics.d(this.b, legendItemDataState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10003a.hashCode() * 31);
    }

    public final String toString() {
        return "LegendItemDataState(color=" + this.f10003a + ", description=" + this.b + ")";
    }
}
