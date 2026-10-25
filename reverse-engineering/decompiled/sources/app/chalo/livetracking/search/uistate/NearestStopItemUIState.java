package app.chalo.livetracking.search.uistate;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/NearestStopItemUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearestStopItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NearbyStopItemSpec f4507a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.StyledTextUIState d;
    public final ImageUIState e;
    public final DividerUIState f;
    public final UiEventHandler g;

    public NearestStopItemUIState(NearbyStopItemSpec spec, ImageUIState img, TextUIState.ChaloTextUIState stopName, TextUIState.StyledTextUIState styledTextUIState, ImageUIState imageUIState, DividerUIState dividerUIState, UiEventHandler uiEventHandler) {
        Intrinsics.i(spec, "spec");
        Intrinsics.i(img, "img");
        Intrinsics.i(stopName, "stopName");
        this.f4507a = spec;
        this.b = img;
        this.c = stopName;
        this.d = styledTextUIState;
        this.e = imageUIState;
        this.f = dividerUIState;
        this.g = uiEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearestStopItemUIState)) {
            return false;
        }
        NearestStopItemUIState nearestStopItemUIState = (NearestStopItemUIState) obj;
        return Intrinsics.d(this.f4507a, nearestStopItemUIState.f4507a) && Intrinsics.d(this.b, nearestStopItemUIState.b) && Intrinsics.d(this.c, nearestStopItemUIState.c) && Intrinsics.d(this.d, nearestStopItemUIState.d) && Intrinsics.d(this.e, nearestStopItemUIState.e) && Intrinsics.d(this.f, nearestStopItemUIState.f) && Intrinsics.d(this.g, nearestStopItemUIState.g);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, r30.e(this.b, this.f4507a.hashCode() * 31, 31), 31);
        TextUIState.StyledTextUIState styledTextUIState = this.d;
        int iHashCode = (iF + (styledTextUIState == null ? 0 : styledTextUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.e;
        int iHashCode2 = (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        DividerUIState dividerUIState = this.f;
        return this.g.hashCode() + ((iHashCode2 + (dividerUIState != null ? dividerUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "NearestStopItemUIState(spec=" + this.f4507a + ", img=" + this.b + ", stopName=" + this.c + ", stopDescription=" + this.d + ", trailingIcon=" + this.e + ", dividerUiState=" + this.f + ", eventHandler=" + this.g + ")";
    }

    public /* synthetic */ NearestStopItemUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.StyledTextUIState styledTextUIState, ImageUIState imageUIState2, DividerUIState dividerUIState, UiEventHandler uiEventHandler) {
        this(new NearbyStopItemSpec(null, 127), imageUIState, chaloTextUIState, styledTextUIState, imageUIState2, dividerUIState, uiEventHandler);
    }
}
