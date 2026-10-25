package app.chalo.superpass.data.models.entities;

import app.chalo.network.config.ChaloJson;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.timeutil.TimeUtilsContract;
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
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassUserDetails;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassUserDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jg1(15)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9580a;
    public final String b;
    public final String c;
    public final Gender d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassUserDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/entities/SuperPassUserDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static String a(SuperPassUserDetails lSuperPassUserDetails) {
            Intrinsics.i(lSuperPassUserDetails, "lSuperPassUserDetails");
            Json json = ChaloJson.b;
            json.getClass();
            return json.a(SuperPassUserDetails.INSTANCE.serializer(), lSuperPassUserDetails);
        }

        public static SuperPassUserDetails b(String lSuperPassUserDetailsString) {
            Intrinsics.i(lSuperPassUserDetailsString, "lSuperPassUserDetailsString");
            Json json = ChaloJson.b;
            json.getClass();
            return (SuperPassUserDetails) json.b(lSuperPassUserDetailsString, SuperPassUserDetails.INSTANCE.serializer());
        }

        public static SuperPassUserDetails c(UserProfileAppModel userProfileAppModel, SuperPassUserDetails lSuperPassUserDetails, TimeUtilsContract timeUtilsContract) {
            String str;
            long j;
            String str2;
            String str3;
            Long l = userProfileAppModel.g;
            String str4 = userProfileAppModel.h;
            Intrinsics.i(lSuperPassUserDetails, "lSuperPassUserDetails");
            String str5 = lSuperPassUserDetails.g;
            String str6 = lSuperPassUserDetails.f;
            String strQ = lSuperPassUserDetails.e;
            Intrinsics.i(timeUtilsContract, "timeUtilsContract");
            String strA = lSuperPassUserDetails.c;
            if (strA.length() > 0) {
                str = strA;
            } else if (userProfileAppModel.a().length() > 0) {
                strA = userProfileAppModel.a();
                str = strA;
            } else {
                str = "";
            }
            long jLongValue = lSuperPassUserDetails.h;
            if (jLongValue != -1) {
                j = jLongValue;
            } else if (l != null) {
                jLongValue = l.longValue();
                j = jLongValue;
            } else {
                j = -1;
            }
            if (j != -1) {
                if (strQ.length() <= 0) {
                    if ((l != null ? timeUtilsContract.Q(l.longValue()) : null) != null) {
                        strQ = l != null ? timeUtilsContract.Q(l.longValue()) : null;
                        if (strQ == null) {
                        }
                    }
                    str2 = "";
                }
                str2 = strQ;
            } else {
                str2 = "";
            }
            if (str6.length() > 0) {
                str3 = str6;
            } else {
                str3 = str4.length() > 0 ? str4 : "";
            }
            if (str5.length() <= 0) {
                str5 = userProfileAppModel.c;
            }
            String str7 = str5;
            Gender gender = userProfileAppModel.d;
            if (gender == Gender.NULL) {
                gender = lSuperPassUserDetails.d;
            }
            return new SuperPassUserDetails(userProfileAppModel.i, userProfileAppModel.e, str, gender, str2, str3, str7, j);
        }

        public final KSerializer<SuperPassUserDetails> serializer() {
            return SuperPassUserDetails$$serializer.f9581a;
        }
    }

    public /* synthetic */ SuperPassUserDetails(int i2, String str, String str2, String str3, Gender gender, String str4, String str5, String str6, long j) {
        if (8 != (i2 & 8)) {
            PluginExceptionsKt.b(SuperPassUserDetails$$serializer.f9581a.getDescriptor(), i2, 8);
            throw null;
        }
        if ((i2 & 1) == 0) {
            this.f9580a = "";
        } else {
            this.f9580a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        this.d = gender;
        if ((i2 & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i2 & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i2 & 128) == 0) {
            this.h = -1L;
        } else {
            this.h = j;
        }
    }

    public static SuperPassUserDetails b(SuperPassUserDetails superPassUserDetails, String fullName, Gender gender, String str, long j, int i2) {
        String userId = superPassUserDetails.f9580a;
        String mobileNumber = superPassUserDetails.b;
        if ((i2 & 8) != 0) {
            gender = superPassUserDetails.d;
        }
        Gender gender2 = gender;
        if ((i2 & 16) != 0) {
            str = superPassUserDetails.e;
        }
        String dateOfBirth = str;
        String emailId = superPassUserDetails.f;
        String profilePhoto = superPassUserDetails.g;
        if ((i2 & 128) != 0) {
            j = superPassUserDetails.h;
        }
        superPassUserDetails.getClass();
        Intrinsics.i(userId, "userId");
        Intrinsics.i(mobileNumber, "mobileNumber");
        Intrinsics.i(fullName, "fullName");
        Intrinsics.i(gender2, "gender");
        Intrinsics.i(dateOfBirth, "dateOfBirth");
        Intrinsics.i(emailId, "emailId");
        Intrinsics.i(profilePhoto, "profilePhoto");
        return new SuperPassUserDetails(userId, mobileNumber, fullName, gender2, dateOfBirth, emailId, profilePhoto, j);
    }

    public final long a(TimeUtilsContract timeUtilsContract) {
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        long j = this.h;
        if (j != -1) {
            return j;
        }
        String str = this.e;
        if (str.length() > 0) {
            try {
                return timeUtilsContract.p(str);
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassUserDetails)) {
            return false;
        }
        SuperPassUserDetails superPassUserDetails = (SuperPassUserDetails) obj;
        return Intrinsics.d(this.f9580a, superPassUserDetails.f9580a) && Intrinsics.d(this.b, superPassUserDetails.b) && Intrinsics.d(this.c, superPassUserDetails.c) && this.d == superPassUserDetails.d && Intrinsics.d(this.e, superPassUserDetails.e) && Intrinsics.d(this.f, superPassUserDetails.f) && Intrinsics.d(this.g, superPassUserDetails.g) && this.h == superPassUserDetails.h;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e((this.d.hashCode() + nf1.e(nf1.e(this.f9580a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
        long j = this.h;
        return iE + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassUserDetails(userId=", this.f9580a, ", mobileNumber=", this.b, ", fullName=");
        sbE.append(this.c);
        sbE.append(", gender=");
        sbE.append(this.d);
        sbE.append(", dateOfBirth=");
        cb0.t(sbE, this.e, ", emailId=", this.f, ", profilePhoto=");
        n21.p(this.h, this.g, ", dobInMillis=", sbE);
        sbE.append(")");
        return sbE.toString();
    }

    public SuperPassUserDetails(String userId, String mobileNumber, String fullName, Gender gender, String dateOfBirth, String emailId, String profilePhoto, long j) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(mobileNumber, "mobileNumber");
        Intrinsics.i(fullName, "fullName");
        Intrinsics.i(gender, "gender");
        Intrinsics.i(dateOfBirth, "dateOfBirth");
        Intrinsics.i(emailId, "emailId");
        Intrinsics.i(profilePhoto, "profilePhoto");
        this.f9580a = userId;
        this.b = mobileNumber;
        this.c = fullName;
        this.d = gender;
        this.e = dateOfBirth;
        this.f = emailId;
        this.g = profilePhoto;
        this.h = j;
    }

    public /* synthetic */ SuperPassUserDetails(String str, String str2, String str3, Gender gender, String str4, String str5, String str6, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, gender, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, -1L);
    }
}
