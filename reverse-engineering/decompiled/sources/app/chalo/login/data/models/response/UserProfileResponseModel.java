package app.chalo.login.data.models.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/login/data/models/response/UserProfileResponseModel;", "", "Companion", "$serializer", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserProfileResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5225a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final String h;
    public final String i;
    public final Integer j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/data/models/response/UserProfileResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/login/data/models/response/UserProfileResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserProfileResponseModel> serializer() {
            return UserProfileResponseModel$$serializer.f5226a;
        }
    }

    public /* synthetic */ UserProfileResponseModel(int i, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, Integer num) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(UserProfileResponseModel$$serializer.f5226a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f5225a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = l;
        this.h = str7;
        this.i = str8;
        this.j = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileResponseModel)) {
            return false;
        }
        UserProfileResponseModel userProfileResponseModel = (UserProfileResponseModel) obj;
        return Intrinsics.d(this.f5225a, userProfileResponseModel.f5225a) && Intrinsics.d(this.b, userProfileResponseModel.b) && Intrinsics.d(this.c, userProfileResponseModel.c) && Intrinsics.d(this.d, userProfileResponseModel.d) && Intrinsics.d(this.e, userProfileResponseModel.e) && Intrinsics.d(this.f, userProfileResponseModel.f) && Intrinsics.d(this.g, userProfileResponseModel.g) && Intrinsics.d(this.h, userProfileResponseModel.h) && Intrinsics.d(this.i, userProfileResponseModel.i) && Intrinsics.d(this.j, userProfileResponseModel.j);
    }

    public final int hashCode() {
        String str = this.f5225a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.g;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.j;
        return iHashCode9 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UserProfileResponseModel(firstName=", this.f5225a, ", lastName=", this.b, ", profilePhoto=");
        cb0.t(sbE, this.c, ", gender=", this.d, ", mobileNumber=");
        cb0.t(sbE, this.e, ", countryCode=", this.f, ", dateOfBirth=");
        py.t(this.g, ", emailId=", this.h, ", userId=", sbE);
        sbE.append(this.i);
        sbE.append(", yob=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }
}
