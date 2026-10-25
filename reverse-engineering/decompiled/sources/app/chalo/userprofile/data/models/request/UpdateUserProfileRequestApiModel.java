package app.chalo.userprofile.data.models.request;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/userprofile/data/models/request/UpdateUserProfileRequestApiModel;", "", "Companion", "$serializer", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UpdateUserProfileRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10311a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final String g;
    public final Integer h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/userprofile/data/models/request/UpdateUserProfileRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/userprofile/data/models/request/UpdateUserProfileRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UpdateUserProfileRequestApiModel> serializer() {
            return UpdateUserProfileRequestApiModel$$serializer.f10312a;
        }
    }

    public /* synthetic */ UpdateUserProfileRequestApiModel(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, Integer num) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.b(UpdateUserProfileRequestApiModel$$serializer.f10312a.getDescriptor(), i, 255);
            throw null;
        }
        this.f10311a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = l;
        this.g = str6;
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateUserProfileRequestApiModel)) {
            return false;
        }
        UpdateUserProfileRequestApiModel updateUserProfileRequestApiModel = (UpdateUserProfileRequestApiModel) obj;
        return Intrinsics.d(this.f10311a, updateUserProfileRequestApiModel.f10311a) && Intrinsics.d(this.b, updateUserProfileRequestApiModel.b) && Intrinsics.d(this.c, updateUserProfileRequestApiModel.c) && Intrinsics.d(this.d, updateUserProfileRequestApiModel.d) && Intrinsics.d(this.e, updateUserProfileRequestApiModel.e) && Intrinsics.d(this.f, updateUserProfileRequestApiModel.f) && Intrinsics.d(this.g, updateUserProfileRequestApiModel.g) && Intrinsics.d(this.h, updateUserProfileRequestApiModel.h);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f10311a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iE2 = nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        Long l = this.f;
        int iHashCode = (iE2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.h;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UpdateUserProfileRequestApiModel(userId=", this.f10311a, ", firstName=", this.b, ", lastName=");
        cb0.t(sbE, this.c, ", profilePhoto=", this.d, ", gender=");
        cb0.r(this.f, this.e, ", dateOfBirth=", ", emailId=", sbE);
        sbE.append(this.g);
        sbE.append(", yob=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }

    public UpdateUserProfileRequestApiModel(String userId, String firstName, String lastName, String str, String gender, Long l, String str2, Integer num) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(firstName, "firstName");
        Intrinsics.i(lastName, "lastName");
        Intrinsics.i(gender, "gender");
        this.f10311a = userId;
        this.b = firstName;
        this.c = lastName;
        this.d = str;
        this.e = gender;
        this.f = l;
        this.g = str2;
        this.h = num;
    }
}
