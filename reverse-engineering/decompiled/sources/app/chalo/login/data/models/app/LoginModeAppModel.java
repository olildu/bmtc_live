package app.chalo.login.data.models.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/data/models/app/LoginModeAppModel;", "", "TruecallerLoginModel", "PhoneAuthLoginModel", "Lapp/chalo/login/data/models/app/LoginModeAppModel$PhoneAuthLoginModel;", "Lapp/chalo/login/data/models/app/LoginModeAppModel$TruecallerLoginModel;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LoginModeAppModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/data/models/app/LoginModeAppModel$PhoneAuthLoginModel;", "Lapp/chalo/login/data/models/app/LoginModeAppModel;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhoneAuthLoginModel extends LoginModeAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5195a;
        public final String b;
        public final String c;
        public final String d;

        public PhoneAuthLoginModel(String phoneNumber, String countryCode, String str, String refNo) {
            Intrinsics.i(phoneNumber, "phoneNumber");
            Intrinsics.i(countryCode, "countryCode");
            Intrinsics.i(refNo, "refNo");
            this.f5195a = phoneNumber;
            this.b = countryCode;
            this.c = str;
            this.d = refNo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneAuthLoginModel)) {
                return false;
            }
            PhoneAuthLoginModel phoneAuthLoginModel = (PhoneAuthLoginModel) obj;
            return Intrinsics.d(this.f5195a, phoneAuthLoginModel.f5195a) && Intrinsics.d(this.b, phoneAuthLoginModel.b) && this.c.equals(phoneAuthLoginModel.c) && Intrinsics.d(this.d, phoneAuthLoginModel.d);
        }

        public final int hashCode() {
            return ((this.d.hashCode() + nf1.e(nf1.e(this.f5195a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) + 1231;
        }

        public final String toString() {
            return r30.i(dd.e("PhoneAuthLoginModel(phoneNumber=", this.f5195a, ", countryCode=", this.b, ", otp="), this.c, ", refNo=", this.d, ", refreshToken=true)");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/data/models/app/LoginModeAppModel$TruecallerLoginModel;", "Lapp/chalo/login/data/models/app/LoginModeAppModel;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TruecallerLoginModel extends LoginModeAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5196a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public TruecallerLoginModel(String str, String str2, String str3, String str4, String str5, String countryCode, String str6, String str7, String str8) {
            Intrinsics.i(countryCode, "countryCode");
            this.f5196a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = countryCode;
            this.g = str6;
            this.h = str7;
            this.i = str8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TruecallerLoginModel)) {
                return false;
            }
            TruecallerLoginModel truecallerLoginModel = (TruecallerLoginModel) obj;
            return Intrinsics.d(this.f5196a, truecallerLoginModel.f5196a) && Intrinsics.d(this.b, truecallerLoginModel.b) && Intrinsics.d(this.c, truecallerLoginModel.c) && Intrinsics.d(this.d, truecallerLoginModel.d) && Intrinsics.d(this.e, truecallerLoginModel.e) && Intrinsics.d(this.f, truecallerLoginModel.f) && Intrinsics.d(this.g, truecallerLoginModel.g) && Intrinsics.d(this.h, truecallerLoginModel.h) && Intrinsics.d(this.i, truecallerLoginModel.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f5196a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("TruecallerLoginModel(payload=", this.f5196a, ", signature=", this.b, ", signatureAlgorithm=");
            cb0.t(sbE, this.c, ", uid=", this.d, ", phoneNumber=");
            cb0.t(sbE, this.e, ", countryCode=", this.f, ", firstName=");
            cb0.t(sbE, this.g, ", lastName=", this.h, ", emailId=");
            return vo1.p(sbE, this.i, ")");
        }
    }
}
