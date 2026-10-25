package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/LiveTrackingNotSupportedBottomSheet;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveTrackingNotSupportedBottomSheet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetUiState f4592a;
    public final LiveTrackingNotSupportedBottomSheetUISpec b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;
    public final ImageUIState e;
    public final TitleSubtitleUiState f;
    public final BusInfoCardUiState g;
    public final DividerUIState h;
    public final LiveTrackingNotSupportedBottomSheetCtaContainer i;

    public LiveTrackingNotSupportedBottomSheet(BottomSheetUiState bottomSheetUiState, TextUIState.ChaloTextUIState title, ImageUIState imageUIState, ImageUIState imageUIState2, TitleSubtitleUiState boardingStop, BusInfoCardUiState boardingBusInfo, LiveTrackingNotSupportedBottomSheetCtaContainer liveTrackingNotSupportedBottomSheetCtaContainer) {
        LiveTrackingNotSupportedBottomSheetUISpec liveTrackingNotSupportedBottomSheetUISpec = new LiveTrackingNotSupportedBottomSheetUISpec();
        DividerUIState dividerUIState = new DividerUIState(0.0f, null, null, 7);
        Intrinsics.i(bottomSheetUiState, "bottomSheetUiState");
        Intrinsics.i(title, "title");
        Intrinsics.i(boardingStop, "boardingStop");
        Intrinsics.i(boardingBusInfo, "boardingBusInfo");
        this.f4592a = bottomSheetUiState;
        this.b = liveTrackingNotSupportedBottomSheetUISpec;
        this.c = title;
        this.d = imageUIState;
        this.e = imageUIState2;
        this.f = boardingStop;
        this.g = boardingBusInfo;
        this.h = dividerUIState;
        this.i = liveTrackingNotSupportedBottomSheetCtaContainer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveTrackingNotSupportedBottomSheet)) {
            return false;
        }
        LiveTrackingNotSupportedBottomSheet liveTrackingNotSupportedBottomSheet = (LiveTrackingNotSupportedBottomSheet) obj;
        return Intrinsics.d(this.f4592a, liveTrackingNotSupportedBottomSheet.f4592a) && Intrinsics.d(this.b, liveTrackingNotSupportedBottomSheet.b) && Intrinsics.d(this.c, liveTrackingNotSupportedBottomSheet.c) && Intrinsics.d(this.d, liveTrackingNotSupportedBottomSheet.d) && Intrinsics.d(this.e, liveTrackingNotSupportedBottomSheet.e) && Intrinsics.d(this.f, liveTrackingNotSupportedBottomSheet.f) && Intrinsics.d(this.g, liveTrackingNotSupportedBottomSheet.g) && Intrinsics.d(this.h, liveTrackingNotSupportedBottomSheet.h) && Intrinsics.d(this.i, liveTrackingNotSupportedBottomSheet.i);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, (this.b.hashCode() + (this.f4592a.hashCode() * 31)) * 31, 31);
        ImageUIState imageUIState = this.d;
        int iHashCode = (iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        ImageUIState imageUIState2 = this.e;
        return this.i.hashCode() + py.c(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (imageUIState2 != null ? imageUIState2.hashCode() : 0)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "LiveTrackingNotSupportedBottomSheet(bottomSheetUiState=" + this.f4592a + ", specs=" + this.b + ", title=" + this.c + ", closeIcon=" + this.d + ", boardingStopIcon=" + this.e + ", boardingStop=" + this.f + ", boardingBusInfo=" + this.g + ", dividerUIState=" + this.h + ", ctaContainer=" + this.i + ")";
    }
}
