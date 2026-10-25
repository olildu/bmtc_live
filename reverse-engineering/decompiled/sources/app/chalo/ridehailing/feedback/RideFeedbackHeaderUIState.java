package app.chalo.ridehailing.feedback;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackHeaderUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackHeaderUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackHeaderUISpecs f9146a;
    public final ImageUrlUIState b;
    public final ImageUIState c;
    public final ImageUrlUIState d;
    public final ImageUIState e;
    public final TextWithLeftAndRightIconUIState f;
    public final TextUIState.ChaloTextUIState g;
    public final RideFeedbackHeaderCtaUISState h;

    public RideFeedbackHeaderUIState(ImageUrlUIState imageUrlUIState, ImageUIState vehicleFallbackImg, ImageUrlUIState imageUrlUIState2, ImageUIState imageUIState, TextWithLeftAndRightIconUIState rideSuccessMsgUIState, TextUIState.ChaloTextUIState chaloTextUIState, RideFeedbackHeaderCtaUISState headerCtaUIState) {
        RideFeedbackHeaderUISpecs rideFeedbackHeaderUISpecs = new RideFeedbackHeaderUISpecs();
        Intrinsics.i(vehicleFallbackImg, "vehicleFallbackImg");
        Intrinsics.i(rideSuccessMsgUIState, "rideSuccessMsgUIState");
        Intrinsics.i(headerCtaUIState, "headerCtaUIState");
        this.f9146a = rideFeedbackHeaderUISpecs;
        this.b = imageUrlUIState;
        this.c = vehicleFallbackImg;
        this.d = imageUrlUIState2;
        this.e = imageUIState;
        this.f = rideSuccessMsgUIState;
        this.g = chaloTextUIState;
        this.h = headerCtaUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackHeaderUIState)) {
            return false;
        }
        RideFeedbackHeaderUIState rideFeedbackHeaderUIState = (RideFeedbackHeaderUIState) obj;
        return Intrinsics.d(this.f9146a, rideFeedbackHeaderUIState.f9146a) && Intrinsics.d(this.b, rideFeedbackHeaderUIState.b) && Intrinsics.d(this.c, rideFeedbackHeaderUIState.c) && Intrinsics.d(this.d, rideFeedbackHeaderUIState.d) && Intrinsics.d(this.e, rideFeedbackHeaderUIState.e) && Intrinsics.d(this.f, rideFeedbackHeaderUIState.f) && Intrinsics.d(this.g, rideFeedbackHeaderUIState.g) && Intrinsics.d(this.h, rideFeedbackHeaderUIState.h);
    }

    public final int hashCode() {
        int iHashCode = this.f9146a.hashCode() * 31;
        ImageUrlUIState imageUrlUIState = this.b;
        int iE = r30.e(this.c, (iHashCode + (imageUrlUIState == null ? 0 : imageUrlUIState.hashCode())) * 31, 31);
        ImageUrlUIState imageUrlUIState2 = this.d;
        int iHashCode2 = (iE + (imageUrlUIState2 == null ? 0 : imageUrlUIState2.hashCode())) * 31;
        ImageUIState imageUIState = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.g;
        return this.h.hashCode() + ((iHashCode3 + (chaloTextUIState != null ? chaloTextUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RideFeedbackHeaderUIState(specs=" + this.f9146a + ", vehicleImg=" + this.b + ", vehicleFallbackImg=" + this.c + ", driverImg=" + this.d + ", driverFallbackImg=" + this.e + ", rideSuccessMsgUIState=" + this.f + ", rideAmount=" + this.g + ", headerCtaUIState=" + this.h + ")";
    }
}
