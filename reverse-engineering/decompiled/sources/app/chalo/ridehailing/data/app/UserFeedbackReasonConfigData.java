package app.chalo.ridehailing.data.app;

import defpackage.dn1;
import defpackage.hq0;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ridehailing/data/app/UserFeedbackReasonConfigData;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserFeedbackReasonConfigData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new dn1(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9121a;
    public final boolean b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridehailing/data/app/UserFeedbackReasonConfigData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ridehailing/data/app/UserFeedbackReasonConfigData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserFeedbackReasonConfigData> serializer() {
            return UserFeedbackReasonConfigData$$serializer.f9122a;
        }
    }

    public UserFeedbackReasonConfigData(String str, boolean z) {
        this(str, z, EmptyList.f17557a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserFeedbackReasonConfigData)) {
            return false;
        }
        UserFeedbackReasonConfigData userFeedbackReasonConfigData = (UserFeedbackReasonConfigData) obj;
        return Intrinsics.d(this.f9121a, userFeedbackReasonConfigData.f9121a) && this.b == userFeedbackReasonConfigData.b && Intrinsics.d(this.c, userFeedbackReasonConfigData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f9121a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return xs.l(hq0.m("UserFeedbackReasonConfigData(reasonText=", this.f9121a, ", enableUserInput=", ", subtags=", this.b), this.c, ")");
    }

    public UserFeedbackReasonConfigData(int i, String str, boolean z, List list) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(UserFeedbackReasonConfigData$$serializer.f9122a.getDescriptor(), i, 3);
            throw null;
        }
        this.f9121a = str;
        this.b = z;
        if ((i & 4) == 0) {
            this.c = EmptyList.f17557a;
        } else {
            this.c = list;
        }
    }

    public UserFeedbackReasonConfigData(String str, boolean z, List subtags) {
        Intrinsics.i(subtags, "subtags");
        this.f9121a = str;
        this.b = z;
        this.c = subtags;
    }
}
