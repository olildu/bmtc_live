package app.chalo.metro.ui.confirmbooking.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/uistate/StopDetailUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopDetailUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopDetailUiSpec f5483a = new StopDetailUiSpec();
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;

    public StopDetailUiState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        this.b = imageUIState;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopDetailUiState)) {
            return false;
        }
        StopDetailUiState stopDetailUiState = (StopDetailUiState) obj;
        return Intrinsics.d(this.f5483a, stopDetailUiState.f5483a) && Intrinsics.d(this.b, stopDetailUiState.b) && Intrinsics.d(this.c, stopDetailUiState.c) && Intrinsics.d(this.d, stopDetailUiState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, r30.e(this.b, Dp.m7284hashCodeimpl(this.f5483a.f5482a) * 31, 31), 31);
    }

    public final String toString() {
        return "StopDetailUiState(uiSpec=" + this.f5483a + ", icon=" + this.b + ", label=" + this.c + ", value=" + this.d + ")";
    }
}
