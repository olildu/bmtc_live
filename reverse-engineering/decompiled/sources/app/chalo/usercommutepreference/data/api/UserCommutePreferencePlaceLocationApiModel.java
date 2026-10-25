package app.chalo.usercommutepreference.data.api;

import defpackage.cb0;
import defpackage.dd;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usercommutepreference/data/api/UserCommutePreferencePlaceLocationApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserCommutePreferencePlaceLocationApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10232a;
    public final String b;
    public final String c;
    public final String d;
    public final Double e;
    public final Double f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usercommutepreference/data/api/UserCommutePreferencePlaceLocationApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usercommutepreference/data/api/UserCommutePreferencePlaceLocationApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserCommutePreferencePlaceLocationApiModel> serializer() {
            return UserCommutePreferencePlaceLocationApiModel$$serializer.f10233a;
        }
    }

    public /* synthetic */ UserCommutePreferencePlaceLocationApiModel(int i, String str, String str2, String str3, String str4, Double d, Double d2, String str5, String str6, String str7, String str8) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(UserCommutePreferencePlaceLocationApiModel$$serializer.f10233a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f10232a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = d;
        this.f = d2;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommutePreferencePlaceLocationApiModel)) {
            return false;
        }
        UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel = (UserCommutePreferencePlaceLocationApiModel) obj;
        return Intrinsics.d(this.f10232a, userCommutePreferencePlaceLocationApiModel.f10232a) && Intrinsics.d(this.b, userCommutePreferencePlaceLocationApiModel.b) && Intrinsics.d(this.c, userCommutePreferencePlaceLocationApiModel.c) && Intrinsics.d(this.d, userCommutePreferencePlaceLocationApiModel.d) && Intrinsics.d(this.e, userCommutePreferencePlaceLocationApiModel.e) && Intrinsics.d(this.f, userCommutePreferencePlaceLocationApiModel.f) && Intrinsics.d(this.g, userCommutePreferencePlaceLocationApiModel.g) && Intrinsics.d(this.h, userCommutePreferencePlaceLocationApiModel.h) && Intrinsics.d(this.i, userCommutePreferencePlaceLocationApiModel.i) && Intrinsics.d(this.j, userCommutePreferencePlaceLocationApiModel.j);
    }

    public final int hashCode() {
        String str = this.f10232a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.e;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f;
        int iHashCode6 = (iHashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UserCommutePreferencePlaceLocationApiModel(placeId=", this.f10232a, ", description=", this.b, ", stopName=");
        cb0.t(sbE, this.c, ", stopId=", this.d, ", lat=");
        sbE.append(this.e);
        sbE.append(", long=");
        sbE.append(this.f);
        sbE.append(", stopAddress=");
        cb0.t(sbE, this.g, ", resultType=", this.h, ", stationType=");
        return r30.i(sbE, this.i, ", searchPartner=", this.j, ")");
    }
}
