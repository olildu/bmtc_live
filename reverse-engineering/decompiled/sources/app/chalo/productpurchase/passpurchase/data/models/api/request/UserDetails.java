package app.chalo.productpurchase.passpurchase.data.models.api.request;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/data/models/api/request/UserDetails;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8326a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/data/models/api/request/UserDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/passpurchase/data/models/api/request/UserDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserDetails> serializer() {
            return UserDetails$$serializer.f8327a;
        }
    }

    public /* synthetic */ UserDetails(int i, long j, String str, String str2, String str3, String str4, String str5, String str6) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(UserDetails$$serializer.f8327a.getDescriptor(), i, 127);
            throw null;
        }
        this.f8326a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDetails)) {
            return false;
        }
        UserDetails userDetails = (UserDetails) obj;
        return Intrinsics.d(this.f8326a, userDetails.f8326a) && this.b == userDetails.b && Intrinsics.d(this.c, userDetails.c) && Intrinsics.d(this.d, userDetails.d) && Intrinsics.d(this.e, userDetails.e) && Intrinsics.d(this.f, userDetails.f) && Intrinsics.d(this.g, userDetails.g);
    }

    public final int hashCode() {
        int iHashCode = this.f8326a.hashCode() * 31;
        long j = this.b;
        return this.g.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "UserDetails(dateOfBirth=", this.f8326a, ", dobInMillis=");
        cb0.t(sbM, ", gender=", this.c, ", mailId=", this.d);
        cb0.t(sbM, ", mobileNumber=", this.e, ", userId=", this.f);
        return z40.h(sbM, ", userName=", this.g, ")");
    }

    public UserDetails(long j, String dateOfBirth, String gender, String mailId, String mobileNumber, String userId, String userName) {
        Intrinsics.i(dateOfBirth, "dateOfBirth");
        Intrinsics.i(gender, "gender");
        Intrinsics.i(mailId, "mailId");
        Intrinsics.i(mobileNumber, "mobileNumber");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(userName, "userName");
        this.f8326a = dateOfBirth;
        this.b = j;
        this.c = gender;
        this.d = mailId;
        this.e = mobileNumber;
        this.f = userId;
        this.g = userName;
    }
}
