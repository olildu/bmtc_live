package app.chalo.usercommutepreference.data.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usercommutepreference/data/api/UserCommutePreferenceSavedRideApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserCommutePreferenceSavedRideApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10234a;
    public final UserCommutePreferencePlaceLocationApiModel b;
    public final UserCommutePreferencePlaceLocationApiModel c;
    public final Long d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usercommutepreference/data/api/UserCommutePreferenceSavedRideApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usercommutepreference/data/api/UserCommutePreferenceSavedRideApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserCommutePreferenceSavedRideApiModel> serializer() {
            return UserCommutePreferenceSavedRideApiModel$$serializer.f10235a;
        }
    }

    public /* synthetic */ UserCommutePreferenceSavedRideApiModel(int i, String str, UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel, UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel2, Long l) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(UserCommutePreferenceSavedRideApiModel$$serializer.f10235a.getDescriptor(), i, 15);
            throw null;
        }
        this.f10234a = str;
        this.b = userCommutePreferencePlaceLocationApiModel;
        this.c = userCommutePreferencePlaceLocationApiModel2;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommutePreferenceSavedRideApiModel)) {
            return false;
        }
        UserCommutePreferenceSavedRideApiModel userCommutePreferenceSavedRideApiModel = (UserCommutePreferenceSavedRideApiModel) obj;
        return Intrinsics.d(this.f10234a, userCommutePreferenceSavedRideApiModel.f10234a) && Intrinsics.d(this.b, userCommutePreferenceSavedRideApiModel.b) && Intrinsics.d(this.c, userCommutePreferenceSavedRideApiModel.c) && Intrinsics.d(this.d, userCommutePreferenceSavedRideApiModel.d);
    }

    public final int hashCode() {
        String str = this.f10234a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel = this.b;
        int iHashCode2 = (iHashCode + (userCommutePreferencePlaceLocationApiModel == null ? 0 : userCommutePreferencePlaceLocationApiModel.hashCode())) * 31;
        UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel2 = this.c;
        int iHashCode3 = (iHashCode2 + (userCommutePreferencePlaceLocationApiModel2 == null ? 0 : userCommutePreferencePlaceLocationApiModel2.hashCode())) * 31;
        Long l = this.d;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "UserCommutePreferenceSavedRideApiModel(id=" + this.f10234a + ", origin=" + this.b + ", destination=" + this.c + ", preferredTime=" + this.d + ")";
    }
}
