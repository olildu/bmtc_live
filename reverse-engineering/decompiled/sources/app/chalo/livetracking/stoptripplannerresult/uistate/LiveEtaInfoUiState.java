package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/LiveEtaInfoUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveEtaInfoUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LiveEtaInfoUiSpecs f4591a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final GifImageUIState d;
    public final ImageUIState e;
    public final ImageUIState f;

    public LiveEtaInfoUiState(TextUIState.ChaloTextUIState header, TextUIState.ChaloTextUIState chaloTextUIState, GifImageUIState gifImageUIState, ImageUIState imageUIState, ImageUIState imageUIState2, int i) {
        LiveEtaInfoUiSpecs liveEtaInfoUiSpecs = new LiveEtaInfoUiSpecs();
        imageUIState = (i & 16) != 0 ? null : imageUIState;
        Intrinsics.i(header, "header");
        this.f4591a = liveEtaInfoUiSpecs;
        this.b = header;
        this.c = chaloTextUIState;
        this.d = gifImageUIState;
        this.e = imageUIState;
        this.f = imageUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveEtaInfoUiState)) {
            return false;
        }
        LiveEtaInfoUiState liveEtaInfoUiState = (LiveEtaInfoUiState) obj;
        return Intrinsics.d(this.f4591a, liveEtaInfoUiState.f4591a) && Intrinsics.d(this.b, liveEtaInfoUiState.b) && Intrinsics.d(this.c, liveEtaInfoUiState.c) && Intrinsics.d(this.d, liveEtaInfoUiState.d) && Intrinsics.d(this.e, liveEtaInfoUiState.e) && Intrinsics.d(this.f, liveEtaInfoUiState.f);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, r30.f(this.b, this.f4591a.hashCode() * 31, 31), 31);
        GifImageUIState gifImageUIState = this.d;
        int iHashCode = (iF + (gifImageUIState == null ? 0 : gifImageUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.e;
        int iHashCode2 = (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        ImageUIState imageUIState2 = this.f;
        return iHashCode2 + (imageUIState2 != null ? imageUIState2.hashCode() : 0);
    }

    public final String toString() {
        return "LiveEtaInfoUiState(specs=" + this.f4591a + ", header=" + this.b + ", eta=" + this.c + ", liveIcon=" + this.d + ", staticScheduleIcon=" + this.e + ", seatOccupancyIcon=" + this.f + ")";
    }
}
