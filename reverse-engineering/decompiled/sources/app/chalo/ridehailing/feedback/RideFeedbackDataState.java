package app.chalo.ridehailing.feedback;

import defpackage.r30;
import defpackage.t10;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookingContext f9141a;
    public final List b;
    public final String c;
    public final boolean d;
    public final Set e;
    public final RideFeedbackStep f;

    public RideFeedbackDataState(BookingContext bookingContext, List feedbackData, String str, boolean z, Set selectedSubtagIds, RideFeedbackStep step) {
        Intrinsics.i(feedbackData, "feedbackData");
        Intrinsics.i(selectedSubtagIds, "selectedSubtagIds");
        Intrinsics.i(step, "step");
        this.f9141a = bookingContext;
        this.b = feedbackData;
        this.c = str;
        this.d = z;
        this.e = selectedSubtagIds;
        this.f = step;
    }

    public static RideFeedbackDataState a(RideFeedbackDataState rideFeedbackDataState, ArrayList arrayList, String str, boolean z, Set selectedSubtagIds, RideFeedbackStep rideFeedbackStep, int i) {
        List feedbackData = arrayList;
        BookingContext bookingContext = rideFeedbackDataState.f9141a;
        if ((i & 2) != 0) {
            feedbackData = rideFeedbackDataState.b;
        }
        if ((i & 4) != 0) {
            str = rideFeedbackDataState.c;
        }
        if ((i & 8) != 0) {
            z = rideFeedbackDataState.d;
        }
        if ((i & 16) != 0) {
            selectedSubtagIds = rideFeedbackDataState.e;
        }
        if ((i & 32) != 0) {
            rideFeedbackStep = rideFeedbackDataState.f;
        }
        RideFeedbackStep step = rideFeedbackStep;
        rideFeedbackDataState.getClass();
        Intrinsics.i(feedbackData, "feedbackData");
        Intrinsics.i(selectedSubtagIds, "selectedSubtagIds");
        Intrinsics.i(step, "step");
        Set set = selectedSubtagIds;
        boolean z2 = z;
        return new RideFeedbackDataState(bookingContext, feedbackData, str, z2, set, step);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackDataState)) {
            return false;
        }
        RideFeedbackDataState rideFeedbackDataState = (RideFeedbackDataState) obj;
        return Intrinsics.d(this.f9141a, rideFeedbackDataState.f9141a) && Intrinsics.d(this.b, rideFeedbackDataState.b) && Intrinsics.d(this.c, rideFeedbackDataState.c) && this.d == rideFeedbackDataState.d && Intrinsics.d(this.e, rideFeedbackDataState.e) && this.f == rideFeedbackDataState.f;
    }

    public final int hashCode() {
        BookingContext bookingContext = this.f9141a;
        int iB = r30.b((bookingContext == null ? 0 : bookingContext.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + ((((iB + (str != null ? str.hashCode() : 0)) * 31) + (this.d ? 1231 : 1237)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideFeedbackDataState(bookingContext=");
        sb.append(this.f9141a);
        sb.append(", feedbackData=");
        sb.append(this.b);
        sb.append(", otherFeedbackReasonText=");
        t10.s(this.c, ", isLoading=", ", selectedSubtagIds=", sb, this.d);
        sb.append(this.e);
        sb.append(", step=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public RideFeedbackDataState(BookingContext bookingContext, List list, int i) {
        this((i & 1) != 0 ? null : bookingContext, (i & 2) != 0 ? EmptyList.f17557a : list, null, true, EmptySet.f17559a, RideFeedbackStep.FEEDBACK_FORM);
    }
}
