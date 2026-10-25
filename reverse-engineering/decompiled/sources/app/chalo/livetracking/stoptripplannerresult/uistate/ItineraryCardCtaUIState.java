package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/ItineraryCardCtaUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ItineraryCardCtaUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ItineraryCardCtaSpecs f4583a = new ItineraryCardCtaSpecs();
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public ItineraryCardCtaUIState(UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        this.b = chaloTextUIState;
        this.c = imageUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItineraryCardCtaUIState)) {
            return false;
        }
        ItineraryCardCtaUIState itineraryCardCtaUIState = (ItineraryCardCtaUIState) obj;
        return Intrinsics.d(this.f4583a, itineraryCardCtaUIState.f4583a) && Intrinsics.d(this.b, itineraryCardCtaUIState.b) && Intrinsics.d(this.c, itineraryCardCtaUIState.c) && Intrinsics.d(this.d, itineraryCardCtaUIState.d);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, Dp.m7284hashCodeimpl(this.f4583a.f4582a) * 31, 31);
        ImageUIState imageUIState = this.c;
        return this.d.hashCode() + ((iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "ItineraryCardCtaUIState(specs=" + this.f4583a + ", ctaText=" + this.b + ", ctaIcon=" + this.c + ", clickHandler=" + this.d + ")";
    }
}
