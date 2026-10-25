package app.chalo.ridehailing.data.app;

import defpackage.dn1;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ridehailing/data/app/UserFeedbackRatingConfigData;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserFeedbackRatingConfigData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new dn1(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9119a;
    public final String b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridehailing/data/app/UserFeedbackRatingConfigData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ridehailing/data/app/UserFeedbackRatingConfigData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserFeedbackRatingConfigData> serializer() {
            return UserFeedbackRatingConfigData$$serializer.f9120a;
        }
    }

    public UserFeedbackRatingConfigData(int i, String str, List reasonsList) {
        Intrinsics.i(reasonsList, "reasonsList");
        this.f9119a = i;
        this.b = str;
        this.c = reasonsList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserFeedbackRatingConfigData)) {
            return false;
        }
        UserFeedbackRatingConfigData userFeedbackRatingConfigData = (UserFeedbackRatingConfigData) obj;
        return this.f9119a == userFeedbackRatingConfigData.f9119a && Intrinsics.d(this.b, userFeedbackRatingConfigData.b) && Intrinsics.d(this.c, userFeedbackRatingConfigData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f9119a * 31, 31, this.b);
    }

    public final String toString() {
        return xs.l(nf1.p(this.f9119a, "UserFeedbackRatingConfigData(rating=", ", title=", this.b, ", reasonsList="), this.c, ")");
    }

    public /* synthetic */ UserFeedbackRatingConfigData(String str, int i, int i2, List list) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(UserFeedbackRatingConfigData$$serializer.f9120a.getDescriptor(), i, 7);
            throw null;
        }
        this.f9119a = i2;
        this.b = str;
        this.c = list;
    }
}
