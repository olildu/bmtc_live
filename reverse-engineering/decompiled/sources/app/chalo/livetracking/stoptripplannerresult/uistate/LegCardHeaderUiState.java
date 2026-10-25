package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/LegCardHeaderUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LegCardHeaderUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LegCardHeaderSpecs f4589a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;

    public LegCardHeaderUiState(ImageUIState icon, TextUIState.ChaloTextUIState chaloTextUIState) {
        LegCardHeaderSpecs legCardHeaderSpecs = new LegCardHeaderSpecs();
        Intrinsics.i(icon, "icon");
        this.f4589a = legCardHeaderSpecs;
        this.b = icon;
        this.c = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegCardHeaderUiState)) {
            return false;
        }
        LegCardHeaderUiState legCardHeaderUiState = (LegCardHeaderUiState) obj;
        return Intrinsics.d(this.f4589a, legCardHeaderUiState.f4589a) && Intrinsics.d(this.b, legCardHeaderUiState.b) && Intrinsics.d(this.c, legCardHeaderUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.e(this.b, this.f4589a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegCardHeaderUiState(specs=");
        sb.append(this.f4589a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=");
        return py.f(sb, this.c, ")");
    }
}
