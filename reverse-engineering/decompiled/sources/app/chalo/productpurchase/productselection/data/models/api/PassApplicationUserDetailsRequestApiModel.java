package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationUserDetailsRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassApplicationUserDetailsRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8591a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationUserDetailsRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationUserDetailsRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassApplicationUserDetailsRequestApiModel> serializer() {
            return PassApplicationUserDetailsRequestApiModel$$serializer.f8592a;
        }
    }

    public /* synthetic */ PassApplicationUserDetailsRequestApiModel(int i, long j, String str, String str2, String str3, String str4, String str5, String str6) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(PassApplicationUserDetailsRequestApiModel$$serializer.f8592a.getDescriptor(), i, 127);
            throw null;
        }
        this.f8591a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassApplicationUserDetailsRequestApiModel)) {
            return false;
        }
        PassApplicationUserDetailsRequestApiModel passApplicationUserDetailsRequestApiModel = (PassApplicationUserDetailsRequestApiModel) obj;
        return Intrinsics.d(this.f8591a, passApplicationUserDetailsRequestApiModel.f8591a) && Intrinsics.d(this.b, passApplicationUserDetailsRequestApiModel.b) && Intrinsics.d(this.c, passApplicationUserDetailsRequestApiModel.c) && Intrinsics.d(this.d, passApplicationUserDetailsRequestApiModel.d) && Intrinsics.d(this.e, passApplicationUserDetailsRequestApiModel.e) && this.f == passApplicationUserDetailsRequestApiModel.f && Intrinsics.d(this.g, passApplicationUserDetailsRequestApiModel.g);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.f8591a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        long j = this.f;
        return this.g.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PassApplicationUserDetailsRequestApiModel(mailId=", this.f8591a, ", mobileNumber=", this.b, ", userName=");
        cb0.t(sbE, this.c, ", gender=", this.d, ", dateOfBirth=");
        n21.p(this.f, this.e, ", dobInMillis=", sbE);
        return z40.h(sbE, ", userId=", this.g, ")");
    }

    public PassApplicationUserDetailsRequestApiModel(long j, String mailId, String mobileNumber, String userName, String gender, String dateOfBirth, String userId) {
        Intrinsics.i(mailId, "mailId");
        Intrinsics.i(mobileNumber, "mobileNumber");
        Intrinsics.i(userName, "userName");
        Intrinsics.i(gender, "gender");
        Intrinsics.i(dateOfBirth, "dateOfBirth");
        Intrinsics.i(userId, "userId");
        this.f8591a = mailId;
        this.b = mobileNumber;
        this.c = userName;
        this.d = gender;
        this.e = dateOfBirth;
        this.f = j;
        this.g = userId;
    }
}
