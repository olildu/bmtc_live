package app.chalo.ridehailing.feedback;

import app.chalo.uistate.text.TextUIState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackUserRatingCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackUserRatingCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackUserRatingCardUISpecs f9158a = new RideFeedbackUserRatingCardUISpecs();
    public final TextUIState.ChaloTextUIState b;
    public final ArrayList c;

    public RideFeedbackUserRatingCardUIState(TextUIState.ChaloTextUIState chaloTextUIState, ArrayList arrayList) {
        this.b = chaloTextUIState;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackUserRatingCardUIState)) {
            return false;
        }
        RideFeedbackUserRatingCardUIState rideFeedbackUserRatingCardUIState = (RideFeedbackUserRatingCardUIState) obj;
        return Intrinsics.d(this.f9158a, rideFeedbackUserRatingCardUIState.f9158a) && Intrinsics.d(this.b, rideFeedbackUserRatingCardUIState.b) && Intrinsics.d(this.c, rideFeedbackUserRatingCardUIState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f9158a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        return this.c.hashCode() + ((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "RideFeedbackUserRatingCardUIState(specs=" + this.f9158a + ", header=" + this.b + ", ratingIconList=" + this.c + ")";
    }
}
