package app.chalo.premiumbus.data;

import app.chalo.userprofile.Gender;
import defpackage.cb0;
import defpackage.dd;
import defpackage.jg1;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/SuperPassUserDetailsAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassUserDetailsAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jg1(16)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6975a;
    public final String b;
    public final String c;
    public final Gender d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/SuperPassUserDetailsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/SuperPassUserDetailsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassUserDetailsAppModel> serializer() {
            return SuperPassUserDetailsAppModel$$serializer.f6976a;
        }
    }

    public /* synthetic */ SuperPassUserDetailsAppModel(int i2, String str, String str2, String str3, Gender gender, String str4, String str5, String str6, long j) {
        if (127 != (i2 & 127)) {
            PluginExceptionsKt.b(SuperPassUserDetailsAppModel$$serializer.f6976a.getDescriptor(), i2, 127);
            throw null;
        }
        this.f6975a = str;
        this.b = str2;
        this.c = str3;
        this.d = gender;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        if ((i2 & 128) == 0) {
            this.h = -1L;
        } else {
            this.h = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassUserDetailsAppModel)) {
            return false;
        }
        SuperPassUserDetailsAppModel superPassUserDetailsAppModel = (SuperPassUserDetailsAppModel) obj;
        return Intrinsics.d(this.f6975a, superPassUserDetailsAppModel.f6975a) && Intrinsics.d(this.b, superPassUserDetailsAppModel.b) && Intrinsics.d(this.c, superPassUserDetailsAppModel.c) && this.d == superPassUserDetailsAppModel.d && Intrinsics.d(this.e, superPassUserDetailsAppModel.e) && Intrinsics.d(this.f, superPassUserDetailsAppModel.f) && Intrinsics.d(this.g, superPassUserDetailsAppModel.g) && this.h == superPassUserDetailsAppModel.h;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e((this.d.hashCode() + nf1.e(nf1.e(this.f6975a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
        long j = this.h;
        return iE + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassUserDetailsAppModel(userId=", this.f6975a, ", mobileNumber=", this.b, ", fullName=");
        sbE.append(this.c);
        sbE.append(", gender=");
        sbE.append(this.d);
        sbE.append(", dateOfBirth=");
        cb0.t(sbE, this.e, ", emailId=", this.f, ", profilePhoto=");
        n21.p(this.h, this.g, ", dobInMillis=", sbE);
        sbE.append(")");
        return sbE.toString();
    }

    public SuperPassUserDetailsAppModel(String userId, String mobileNumber, String fullName, Gender gender, String dateOfBirth, String emailId, String profilePhoto, long j) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(mobileNumber, "mobileNumber");
        Intrinsics.i(fullName, "fullName");
        Intrinsics.i(gender, "gender");
        Intrinsics.i(dateOfBirth, "dateOfBirth");
        Intrinsics.i(emailId, "emailId");
        Intrinsics.i(profilePhoto, "profilePhoto");
        this.f6975a = userId;
        this.b = mobileNumber;
        this.c = fullName;
        this.d = gender;
        this.e = dateOfBirth;
        this.f = emailId;
        this.g = profilePhoto;
        this.h = j;
    }
}
