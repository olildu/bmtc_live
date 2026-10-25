package app.chalo.userprofile;

import app.chalo.extensions.KotlinDateTimeExtensionsKt;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.py;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/UserProfileAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserProfileAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10305a;
    public final String b;
    public final String c;
    public final Gender d;
    public final String e;
    public final String f;
    public final Long g;
    public final String h;
    public final String i;
    public final Integer j;

    public UserProfileAppModel(String str, String str2, String str3, Gender gender, String mobileNumber, String countryCode, Long l, String str4, String userId, Integer num) {
        Intrinsics.i(mobileNumber, "mobileNumber");
        Intrinsics.i(countryCode, "countryCode");
        Intrinsics.i(userId, "userId");
        this.f10305a = str;
        this.b = str2;
        this.c = str3;
        this.d = gender;
        this.e = mobileNumber;
        this.f = countryCode;
        this.g = l;
        this.h = str4;
        this.i = userId;
        this.j = num;
    }

    public final String a() {
        String str = this.b;
        int length = str.length();
        String str2 = this.f10305a;
        if (length == 0) {
            return str2.length() == 0 ? "" : str2;
        }
        if (str2.length() == 0) {
            return str.length() == 0 ? "" : str;
        }
        return vo1.n(str2, " ", str);
    }

    public final Integer b(SystemHelper systemHelper, TimeUtilsContract timeUtilsContract) {
        int iE;
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        Intrinsics.i(systemHelper, "systemHelper");
        Integer num = this.j;
        if (num != null && (iE = timeUtilsContract.E() - num.intValue()) > 0) {
            return Integer.valueOf(iE);
        }
        Long l = this.g;
        if (l != null) {
            if (l.longValue() <= 0) {
                l = null;
            }
            if (l != null) {
                long jLongValue = l.longValue();
                String strB = timeUtilsContract.b();
                LocalDateTime.Companion companion = LocalDateTime.INSTANCE;
                LocalDateTime localDateTimeB = KotlinDateTimeExtensionsKt.b(companion, systemHelper.j(), strB);
                LocalDateTime localDateTimeB2 = KotlinDateTimeExtensionsKt.b(companion, jLongValue, strB);
                int iO = localDateTimeB.o() - localDateTimeB2.o();
                if (localDateTimeB.i().compareTo(localDateTimeB2.i()) <= 0 && (localDateTimeB.i() != localDateTimeB2.i() || localDateTimeB.b() < localDateTimeB2.b())) {
                    iO--;
                }
                Integer numValueOf = Integer.valueOf(iO);
                if (iO > 0) {
                    return numValueOf;
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileAppModel)) {
            return false;
        }
        UserProfileAppModel userProfileAppModel = (UserProfileAppModel) obj;
        return Intrinsics.d(this.f10305a, userProfileAppModel.f10305a) && Intrinsics.d(this.b, userProfileAppModel.b) && Intrinsics.d(this.c, userProfileAppModel.c) && this.d == userProfileAppModel.d && Intrinsics.d(this.e, userProfileAppModel.e) && Intrinsics.d(this.f, userProfileAppModel.f) && Intrinsics.d(this.g, userProfileAppModel.g) && Intrinsics.d(this.h, userProfileAppModel.h) && Intrinsics.d(this.i, userProfileAppModel.i) && Intrinsics.d(this.j, userProfileAppModel.j);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e((this.d.hashCode() + nf1.e(nf1.e(this.f10305a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
        Long l = this.g;
        int iE2 = nf1.e(nf1.e((iE + (l == null ? 0 : l.hashCode())) * 31, 31, this.h), 31, this.i);
        Integer num = this.j;
        return iE2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UserProfileAppModel(firstName=", this.f10305a, ", lastName=", this.b, ", profilePhoto=");
        sbE.append(this.c);
        sbE.append(", gender=");
        sbE.append(this.d);
        sbE.append(", mobileNumber=");
        cb0.t(sbE, this.e, ", countryCode=", this.f, ", dobInMillis=");
        py.t(this.g, ", emailId=", this.h, ", userId=", sbE);
        sbE.append(this.i);
        sbE.append(", yob=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }
}
