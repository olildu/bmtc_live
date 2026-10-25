package app.chalo.uistate.bottomsheet;

import androidx.core.app.FrameMetricsAggregator;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/bottomsheet/BottomSheetStandardContentUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BottomSheetStandardContentUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetUiState f9904a;
    public final BottomSheetContentUiSpecs b;
    public final DrawType c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final ButtonUIState f;
    public final ButtonUIState g;
    public final ImageUIState h;

    public BottomSheetStandardContentUiState(BottomSheetUiState bottomSheetState, BottomSheetContentUiSpecs specs, DrawType drawType, TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState chaloTextUIState, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, ImageUIState imageUIState) {
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        Intrinsics.i(specs, "specs");
        Intrinsics.i(title, "title");
        this.f9904a = bottomSheetState;
        this.b = specs;
        this.c = drawType;
        this.d = title;
        this.e = chaloTextUIState;
        this.f = buttonUIState;
        this.g = buttonUIState2;
        this.h = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetStandardContentUiState)) {
            return false;
        }
        BottomSheetStandardContentUiState bottomSheetStandardContentUiState = (BottomSheetStandardContentUiState) obj;
        return Intrinsics.d(this.f9904a, bottomSheetStandardContentUiState.f9904a) && Intrinsics.d(this.b, bottomSheetStandardContentUiState.b) && Intrinsics.d(this.c, bottomSheetStandardContentUiState.c) && Intrinsics.d(this.d, bottomSheetStandardContentUiState.d) && Intrinsics.d(this.e, bottomSheetStandardContentUiState.e) && Intrinsics.d(this.f, bottomSheetStandardContentUiState.f) && Intrinsics.d(this.g, bottomSheetStandardContentUiState.g) && Intrinsics.d(this.h, bottomSheetStandardContentUiState.h);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f9904a.hashCode() * 31)) * 31;
        DrawType drawType = this.c;
        int iF = r30.f(this.d, (iHashCode + (drawType == null ? 0 : drawType.hashCode())) * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.e;
        int iHashCode2 = (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        ButtonUIState buttonUIState = this.f;
        int iHashCode3 = (iHashCode2 + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
        ButtonUIState buttonUIState2 = this.g;
        int iHashCode4 = (iHashCode3 + (buttonUIState2 == null ? 0 : buttonUIState2.hashCode())) * 31;
        ImageUIState imageUIState = this.h;
        return iHashCode4 + (imageUIState != null ? imageUIState.hashCode() : 0);
    }

    public final String toString() {
        return "BottomSheetStandardContentUiState(bottomSheetState=" + this.f9904a + ", specs=" + this.b + ", icon=" + this.c + ", title=" + this.d + ", subTitle=" + this.e + ", positiveBtn=" + this.f + ", negativeBtn=" + this.g + ", closeIcon=" + this.h + ")";
    }

    public /* synthetic */ BottomSheetStandardContentUiState(BottomSheetUiState bottomSheetUiState, BottomSheetContentUiSpecs bottomSheetContentUiSpecs, DrawType drawType, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, ImageUIState imageUIState, int i) {
        this((i & 1) != 0 ? new BottomSheetUiState((BottomSheetEventHandler) null, 3) : bottomSheetUiState, (i & 2) != 0 ? new BottomSheetContentUiSpecs(null, null, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION) : bottomSheetContentUiSpecs, drawType, chaloTextUIState, chaloTextUIState2, buttonUIState, (i & 64) != 0 ? null : buttonUIState2, (i & 128) != 0 ? null : imageUIState);
    }
}
