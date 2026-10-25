package app.chalo.usercommutepreference.data.api;

import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usercommutepreference/data/api/UserCommutePreferenceApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserCommutePreferenceApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCommutePreferenceStopPlaceApiModel f10228a;
    public final UserCommutePreferenceStopPlaceApiModel b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usercommutepreference/data/api/UserCommutePreferenceApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usercommutepreference/data/api/UserCommutePreferenceApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserCommutePreferenceApiModel> serializer() {
            return UserCommutePreferenceApiModel$$serializer.f10229a;
        }
    }

    public /* synthetic */ UserCommutePreferenceApiModel(int i, UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel, UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel2, Long l, Long l2, Long l3, Long l4, String str) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(UserCommutePreferenceApiModel$$serializer.f10229a.getDescriptor(), i, 127);
            throw null;
        }
        this.f10228a = userCommutePreferenceStopPlaceApiModel;
        this.b = userCommutePreferenceStopPlaceApiModel2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommutePreferenceApiModel)) {
            return false;
        }
        UserCommutePreferenceApiModel userCommutePreferenceApiModel = (UserCommutePreferenceApiModel) obj;
        return Intrinsics.d(this.f10228a, userCommutePreferenceApiModel.f10228a) && Intrinsics.d(this.b, userCommutePreferenceApiModel.b) && Intrinsics.d(this.c, userCommutePreferenceApiModel.c) && Intrinsics.d(this.d, userCommutePreferenceApiModel.d) && Intrinsics.d(this.e, userCommutePreferenceApiModel.e) && Intrinsics.d(this.f, userCommutePreferenceApiModel.f) && Intrinsics.d(this.g, userCommutePreferenceApiModel.g);
    }

    public final int hashCode() {
        UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel = this.f10228a;
        int iHashCode = (userCommutePreferenceStopPlaceApiModel == null ? 0 : userCommutePreferenceStopPlaceApiModel.hashCode()) * 31;
        UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel2 = this.b;
        int iHashCode2 = (iHashCode + (userCommutePreferenceStopPlaceApiModel2 == null ? 0 : userCommutePreferenceStopPlaceApiModel2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.g;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserCommutePreferenceApiModel(origin=");
        sb.append(this.f10228a);
        sb.append(", destination=");
        sb.append(this.b);
        sb.append(", leaveByTime=");
        nf1.w(sb, this.c, ", leaveByVarianceMin=", this.d, ", reachByTime=");
        nf1.w(sb, this.e, ", reachByVarianceMin=", this.f, ", commuteFrequency=");
        return vo1.p(sb, this.g, ")");
    }
}
