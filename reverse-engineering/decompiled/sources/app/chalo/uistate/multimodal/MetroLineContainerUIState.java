package app.chalo.uistate.multimodal;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/MetroLineContainerUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroLineContainerUIState {
    public final ChaloColorToken b;
    public final LineIndicatorUIState d;
    public final TextUIState.ChaloTextUIState e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetroLineContainerUISpecs f10044a = new MetroLineContainerUISpecs();
    public final float c = 0.15f;

    public MetroLineContainerUIState(ChaloColorToken chaloColorToken, LineIndicatorUIState lineIndicatorUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        this.b = chaloColorToken;
        this.d = lineIndicatorUIState;
        this.e = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroLineContainerUIState)) {
            return false;
        }
        MetroLineContainerUIState metroLineContainerUIState = (MetroLineContainerUIState) obj;
        return Intrinsics.d(this.f10044a, metroLineContainerUIState.f10044a) && Intrinsics.d(this.b, metroLineContainerUIState.b) && Float.compare(this.c, metroLineContainerUIState.c) == 0 && Intrinsics.d(this.d, metroLineContainerUIState.d) && Intrinsics.d(this.e, metroLineContainerUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + r30.a(this.c, z40.b(this.b, this.f10044a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetroLineContainerUIState(specs=");
        sb.append(this.f10044a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", backgroundOpacity=");
        sb.append(this.c);
        sb.append(", lineIndicatorUIState=");
        sb.append(this.d);
        sb.append(", lineTextUIState=");
        return py.f(sb, this.e, ")");
    }
}
