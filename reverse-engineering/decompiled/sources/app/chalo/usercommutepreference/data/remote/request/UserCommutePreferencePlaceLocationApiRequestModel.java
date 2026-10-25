package app.chalo.usercommutepreference.data.remote.request;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usercommutepreference/data/remote/request/UserCommutePreferencePlaceLocationApiRequestModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserCommutePreferencePlaceLocationApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10262a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final String f;
    public final String g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usercommutepreference/data/remote/request/UserCommutePreferencePlaceLocationApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usercommutepreference/data/remote/request/UserCommutePreferencePlaceLocationApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserCommutePreferencePlaceLocationApiRequestModel> serializer() {
            return UserCommutePreferencePlaceLocationApiRequestModel$$serializer.f10263a;
        }
    }

    public /* synthetic */ UserCommutePreferencePlaceLocationApiRequestModel(int i, String str, String str2, String str3, double d, double d2, String str4, String str5, String str6) {
        if (217 != (i & 217)) {
            PluginExceptionsKt.b(UserCommutePreferencePlaceLocationApiRequestModel$$serializer.f10263a.getDescriptor(), i, 217);
            throw null;
        }
        this.f10262a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = d;
        this.e = d2;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommutePreferencePlaceLocationApiRequestModel)) {
            return false;
        }
        UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel = (UserCommutePreferencePlaceLocationApiRequestModel) obj;
        return Intrinsics.d(this.f10262a, userCommutePreferencePlaceLocationApiRequestModel.f10262a) && Intrinsics.d(this.b, userCommutePreferencePlaceLocationApiRequestModel.b) && Intrinsics.d(this.c, userCommutePreferencePlaceLocationApiRequestModel.c) && Double.compare(this.d, userCommutePreferencePlaceLocationApiRequestModel.d) == 0 && Double.compare(this.e, userCommutePreferencePlaceLocationApiRequestModel.e) == 0 && Intrinsics.d(this.f, userCommutePreferencePlaceLocationApiRequestModel.f) && Intrinsics.d(this.g, userCommutePreferencePlaceLocationApiRequestModel.g) && Intrinsics.d(this.h, userCommutePreferencePlaceLocationApiRequestModel.h);
    }

    public final int hashCode() {
        int iHashCode = this.f10262a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        int i = (iHashCode3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.e);
        int i2 = (i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        String str3 = this.f;
        return this.h.hashCode() + nf1.e((i2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UserCommutePreferencePlaceLocationApiRequestModel(placeId=", this.f10262a, ", description=", this.b, ", stopName=");
        sbE.append(this.c);
        sbE.append(", lat=");
        sbE.append(this.d);
        pk0.z(sbE, ", long=", this.e, ", stopAddress=");
        cb0.t(sbE, this.f, ", resultType=", this.g, ", searchPartner=");
        return vo1.p(sbE, this.h, ")");
    }

    public UserCommutePreferencePlaceLocationApiRequestModel(String placeId, String str, String str2, double d, double d2, String str3, String resultType, String searchPartner) {
        Intrinsics.i(placeId, "placeId");
        Intrinsics.i(resultType, "resultType");
        Intrinsics.i(searchPartner, "searchPartner");
        this.f10262a = placeId;
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = d2;
        this.f = str3;
        this.g = resultType;
        this.h = searchPartner;
    }

    public /* synthetic */ UserCommutePreferencePlaceLocationApiRequestModel(String str, String str2, double d, double d2, String str3) {
        this(str, str2, null, d, d2, null, "PLACE", str3);
    }
}
