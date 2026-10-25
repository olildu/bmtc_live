package app.chalo.usecase;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/FeedbackDataAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeedbackDataAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10171a;
    public final List b;

    public FeedbackDataAppModel(int i, List feedbackData) {
        Intrinsics.i(feedbackData, "feedbackData");
        this.f10171a = i;
        this.b = feedbackData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackDataAppModel)) {
            return false;
        }
        FeedbackDataAppModel feedbackDataAppModel = (FeedbackDataAppModel) obj;
        return this.f10171a == feedbackDataAppModel.f10171a && Intrinsics.d(this.b, feedbackDataAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10171a * 31);
    }

    public final String toString() {
        return "FeedbackDataAppModel(feedbackPercentage=" + this.f10171a + ", feedbackData=" + this.b + ")";
    }
}
