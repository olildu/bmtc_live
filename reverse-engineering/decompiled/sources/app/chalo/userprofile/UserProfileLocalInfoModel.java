package app.chalo.userprofile;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/userprofile/UserProfileLocalInfoModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserProfileLocalInfoModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10306a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Long j;
    public final Integer k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/userprofile/UserProfileLocalInfoModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/userprofile/UserProfileLocalInfoModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserProfileLocalInfoModel> serializer() {
            return UserProfileLocalInfoModel$$serializer.f10307a;
        }
    }

    public /* synthetic */ UserProfileLocalInfoModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Integer num) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.b(UserProfileLocalInfoModel$$serializer.f10307a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f10306a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = l;
        this.k = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileLocalInfoModel)) {
            return false;
        }
        UserProfileLocalInfoModel userProfileLocalInfoModel = (UserProfileLocalInfoModel) obj;
        return Intrinsics.d(this.f10306a, userProfileLocalInfoModel.f10306a) && Intrinsics.d(this.b, userProfileLocalInfoModel.b) && Intrinsics.d(this.c, userProfileLocalInfoModel.c) && Intrinsics.d(this.d, userProfileLocalInfoModel.d) && Intrinsics.d(this.e, userProfileLocalInfoModel.e) && Intrinsics.d(this.f, userProfileLocalInfoModel.f) && Intrinsics.d(this.g, userProfileLocalInfoModel.g) && Intrinsics.d(this.h, userProfileLocalInfoModel.h) && Intrinsics.d(this.i, userProfileLocalInfoModel.i) && Intrinsics.d(this.j, userProfileLocalInfoModel.j) && Intrinsics.d(this.k, userProfileLocalInfoModel.k);
    }

    public final int hashCode() {
        int iHashCode = this.f10306a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iE = nf1.e((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
        String str4 = this.f;
        int iE2 = nf1.e((iE + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.g);
        String str5 = this.h;
        int iHashCode4 = (iE2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.j;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.k;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UserProfileLocalInfoModel(userId=", this.f10306a, ", firstName=", this.b, ", lastName=");
        cb0.t(sbE, this.c, ", gender=", this.d, ", dateOfBirth=");
        cb0.t(sbE, this.e, ", mailId=", this.f, ", mobileNumber=");
        cb0.t(sbE, this.g, ", profilePhoto=", this.h, ", countryCallingCode=");
        cb0.r(this.j, this.i, ", dobInMillis=", ", yob=", sbE);
        return pk0.k(sbE, this.k, ")");
    }

    public UserProfileLocalInfoModel(String userId, String str, String str2, String str3, String str4, String str5, String mobileNumber, String str6, String str7, Long l, Integer num) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(mobileNumber, "mobileNumber");
        this.f10306a = userId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = mobileNumber;
        this.h = str6;
        this.i = str7;
        this.j = l;
        this.k = num;
    }
}
