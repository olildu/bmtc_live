package app.chalo.ridehailing.feedback;

import defpackage.nf1;
import defpackage.xs;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/UserFeedbackReasonData;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserFeedbackReasonData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9174a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public UserFeedbackReasonData(int i, String reasonText, List list, boolean z, boolean z2) {
        Intrinsics.i(reasonText, "reasonText");
        this.f9174a = i;
        this.b = reasonText;
        this.c = z;
        this.d = z2;
        this.e = list;
    }

    public static UserFeedbackReasonData a(UserFeedbackReasonData userFeedbackReasonData, boolean z) {
        int i = userFeedbackReasonData.f9174a;
        String reasonText = userFeedbackReasonData.b;
        boolean z2 = userFeedbackReasonData.d;
        List list = userFeedbackReasonData.e;
        userFeedbackReasonData.getClass();
        Intrinsics.i(reasonText, "reasonText");
        return new UserFeedbackReasonData(i, reasonText, list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserFeedbackReasonData)) {
            return false;
        }
        UserFeedbackReasonData userFeedbackReasonData = (UserFeedbackReasonData) obj;
        return this.f9174a == userFeedbackReasonData.f9174a && Intrinsics.d(this.b, userFeedbackReasonData.b) && this.c == userFeedbackReasonData.c && this.d == userFeedbackReasonData.d && Intrinsics.d(this.e, userFeedbackReasonData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((((nf1.e(this.f9174a * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f9174a, "UserFeedbackReasonData(id=", ", reasonText=", this.b, ", isSelected=");
        z40.r(sbP, this.c, ", enableUserInput=", this.d, ", subtags=");
        return xs.l(sbP, this.e, ")");
    }
}
