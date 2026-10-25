package app.chalo.onboarding.citydiscontinued;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citydiscontinued/DiscontinuedTextViewsUIState;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DiscontinuedTextViewsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DiscontinuedTextViewsUISpecs f6561a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;

    public DiscontinuedTextViewsUIState(TextUIState.ChaloTextUIState discontinuedTitleUIState, TextUIState.ChaloTextUIState discontinuedDescriptionUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        DiscontinuedTextViewsUISpecs discontinuedTextViewsUISpecs = new DiscontinuedTextViewsUISpecs();
        Intrinsics.i(discontinuedTitleUIState, "discontinuedTitleUIState");
        Intrinsics.i(discontinuedDescriptionUIState, "discontinuedDescriptionUIState");
        this.f6561a = discontinuedTextViewsUISpecs;
        this.b = discontinuedTitleUIState;
        this.c = discontinuedDescriptionUIState;
        this.d = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscontinuedTextViewsUIState)) {
            return false;
        }
        DiscontinuedTextViewsUIState discontinuedTextViewsUIState = (DiscontinuedTextViewsUIState) obj;
        return Intrinsics.d(this.f6561a, discontinuedTextViewsUIState.f6561a) && Intrinsics.d(this.b, discontinuedTextViewsUIState.b) && Intrinsics.d(this.c, discontinuedTextViewsUIState.c) && Intrinsics.d(this.d, discontinuedTextViewsUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, r30.f(this.b, this.f6561a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DiscontinuedTextViewsUIState(specs=" + this.f6561a + ", discontinuedTitleUIState=" + this.b + ", discontinuedDescriptionUIState=" + this.c + ", supportingText=" + this.d + ")";
    }
}
