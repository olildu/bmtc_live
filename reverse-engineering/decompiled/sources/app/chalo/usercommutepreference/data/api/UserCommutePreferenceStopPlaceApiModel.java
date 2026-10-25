package app.chalo.usercommutepreference.data.api;

import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usercommutepreference/data/api/UserCommutePreferenceStopPlaceApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserCommutePreferenceStopPlaceApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10236a;
    public final String b;
    public final String c;
    public final UserCommutePreferencePlaceLocationApiModel d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usercommutepreference/data/api/UserCommutePreferenceStopPlaceApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usercommutepreference/data/api/UserCommutePreferenceStopPlaceApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserCommutePreferenceStopPlaceApiModel> serializer() {
            return UserCommutePreferenceStopPlaceApiModel$$serializer.f10237a;
        }
    }

    public /* synthetic */ UserCommutePreferenceStopPlaceApiModel(int i, String str, String str2, String str3, UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(UserCommutePreferenceStopPlaceApiModel$$serializer.f10237a.getDescriptor(), i, 15);
            throw null;
        }
        this.f10236a = str;
        this.b = str2;
        this.c = str3;
        this.d = userCommutePreferencePlaceLocationApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommutePreferenceStopPlaceApiModel)) {
            return false;
        }
        UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel = (UserCommutePreferenceStopPlaceApiModel) obj;
        return Intrinsics.d(this.f10236a, userCommutePreferenceStopPlaceApiModel.f10236a) && Intrinsics.d(this.b, userCommutePreferenceStopPlaceApiModel.b) && Intrinsics.d(this.c, userCommutePreferenceStopPlaceApiModel.c) && Intrinsics.d(this.d, userCommutePreferenceStopPlaceApiModel.d);
    }

    public final int hashCode() {
        String str = this.f10236a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel = this.d;
        return iHashCode3 + (userCommutePreferencePlaceLocationApiModel != null ? userCommutePreferencePlaceLocationApiModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UserCommutePreferenceStopPlaceApiModel(id=", this.f10236a, ", tag=", this.b, ", label=");
        sbE.append(this.c);
        sbE.append(", location=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
