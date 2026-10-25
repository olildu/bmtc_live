package app.chalo.usercommutepreference.data.remote.request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usercommutepreference/data/remote/request/SaveRideRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SaveRideRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10258a;
    public final UserCommutePreferencePlaceLocationApiRequestModel b;
    public final UserCommutePreferencePlaceLocationApiRequestModel c;
    public final long d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usercommutepreference/data/remote/request/SaveRideRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usercommutepreference/data/remote/request/SaveRideRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SaveRideRequestApiModel> serializer() {
            return SaveRideRequestApiModel$$serializer.f10259a;
        }
    }

    public /* synthetic */ SaveRideRequestApiModel(int i, String str, UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel, UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel2, long j) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.b(SaveRideRequestApiModel$$serializer.f10259a.getDescriptor(), i, 14);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f10258a = null;
        } else {
            this.f10258a = str;
        }
        this.b = userCommutePreferencePlaceLocationApiRequestModel;
        this.c = userCommutePreferencePlaceLocationApiRequestModel2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveRideRequestApiModel)) {
            return false;
        }
        SaveRideRequestApiModel saveRideRequestApiModel = (SaveRideRequestApiModel) obj;
        return Intrinsics.d(this.f10258a, saveRideRequestApiModel.f10258a) && Intrinsics.d(this.b, saveRideRequestApiModel.b) && Intrinsics.d(this.c, saveRideRequestApiModel.c) && this.d == saveRideRequestApiModel.d;
    }

    public final int hashCode() {
        String str = this.f10258a;
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        long j = this.d;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SaveRideRequestApiModel(id=" + this.f10258a + ", origin=" + this.b + ", destination=" + this.c + ", preferredTime=" + this.d + ")";
    }

    public SaveRideRequestApiModel(String str, UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel, UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel2, long j) {
        this.f10258a = str;
        this.b = userCommutePreferencePlaceLocationApiRequestModel;
        this.c = userCommutePreferencePlaceLocationApiRequestModel2;
        this.d = j;
    }
}
