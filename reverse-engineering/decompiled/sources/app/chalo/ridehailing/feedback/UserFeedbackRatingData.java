package app.chalo.ridehailing.feedback;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/UserFeedbackRatingData;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserFeedbackRatingData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9173a;
    public final RatingReaction b;
    public final boolean c;
    public final List d;

    public UserFeedbackRatingData(String title, RatingReaction rating, boolean z, List list) {
        Intrinsics.i(title, "title");
        Intrinsics.i(rating, "rating");
        this.f9173a = title;
        this.b = rating;
        this.c = z;
        this.d = list;
    }

    public static UserFeedbackRatingData a(UserFeedbackRatingData userFeedbackRatingData, boolean z, ArrayList arrayList, int i) {
        String title = userFeedbackRatingData.f9173a;
        RatingReaction rating = userFeedbackRatingData.b;
        if ((i & 4) != 0) {
            z = userFeedbackRatingData.c;
        }
        List list = arrayList;
        if ((i & 8) != 0) {
            list = userFeedbackRatingData.d;
        }
        Intrinsics.i(title, "title");
        Intrinsics.i(rating, "rating");
        return new UserFeedbackRatingData(title, rating, z, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserFeedbackRatingData)) {
            return false;
        }
        UserFeedbackRatingData userFeedbackRatingData = (UserFeedbackRatingData) obj;
        return Intrinsics.d(this.f9173a, userFeedbackRatingData.f9173a) && this.b == userFeedbackRatingData.b && this.c == userFeedbackRatingData.c && Intrinsics.d(this.d, userFeedbackRatingData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.b.hashCode() + (this.f9173a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "UserFeedbackRatingData(title=" + this.f9173a + ", rating=" + this.b + ", isSelected=" + this.c + ", reasons=" + this.d + ")";
    }
}
