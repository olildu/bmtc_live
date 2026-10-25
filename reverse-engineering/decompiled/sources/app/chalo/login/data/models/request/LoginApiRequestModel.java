package app.chalo.login.data.models.request;

import defpackage.cb0;
import defpackage.dd;
import defpackage.hf0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.vo1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.JsonClassDiscriminator;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@JsonClassDiscriminator(discriminator = "AuthType")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/login/data/models/request/LoginApiRequestModel;", "", "Companion", "TruecallerLoginApiRequestModel", "PhoneAuthLoginApiRequestModel", "Lapp/chalo/login/data/models/request/LoginApiRequestModel$PhoneAuthLoginApiRequestModel;", "Lapp/chalo/login/data/models/request/LoginApiRequestModel$TruecallerLoginApiRequestModel;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class LoginApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5202a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hf0(17));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/data/models/request/LoginApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/login/data/models/request/LoginApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<LoginApiRequestModel> serializer() {
            return (KSerializer) LoginApiRequestModel.f5202a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/login/data/models/request/LoginApiRequestModel$PhoneAuthLoginApiRequestModel;", "Lapp/chalo/login/data/models/request/LoginApiRequestModel;", "Companion", "$serializer", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    @SerialName
    public static final /* data */ class PhoneAuthLoginApiRequestModel extends LoginApiRequestModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/data/models/request/LoginApiRequestModel$PhoneAuthLoginApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/login/data/models/request/LoginApiRequestModel$PhoneAuthLoginApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PhoneAuthLoginApiRequestModel> serializer() {
                return LoginApiRequestModel$PhoneAuthLoginApiRequestModel$$serializer.f5203a;
            }
        }

        public /* synthetic */ PhoneAuthLoginApiRequestModel(int i, String str, String str2, String str3, String str4, String str5) {
            if (31 != (i & 31)) {
                PluginExceptionsKt.b(LoginApiRequestModel$PhoneAuthLoginApiRequestModel$$serializer.f5203a.getDescriptor(), i, 31);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneAuthLoginApiRequestModel)) {
                return false;
            }
            PhoneAuthLoginApiRequestModel phoneAuthLoginApiRequestModel = (PhoneAuthLoginApiRequestModel) obj;
            return Intrinsics.d(this.b, phoneAuthLoginApiRequestModel.b) && Intrinsics.d(this.c, phoneAuthLoginApiRequestModel.c) && Intrinsics.d(this.d, phoneAuthLoginApiRequestModel.d) && Intrinsics.d(this.e, phoneAuthLoginApiRequestModel.e) && Intrinsics.d(this.f, phoneAuthLoginApiRequestModel.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + nf1.e(nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("PhoneAuthLoginApiRequestModel(deviceId=", this.b, ", mobileNumber=", this.c, ", countryCode=");
            cb0.t(sbE, this.d, ", otp=", this.e, ", refNo=");
            return vo1.p(sbE, this.f, ")");
        }

        public PhoneAuthLoginApiRequestModel(String deviceId, String mobileNumber, String countryCode, String str, String refNo) {
            Intrinsics.i(deviceId, "deviceId");
            Intrinsics.i(mobileNumber, "mobileNumber");
            Intrinsics.i(countryCode, "countryCode");
            Intrinsics.i(refNo, "refNo");
            this.b = deviceId;
            this.c = mobileNumber;
            this.d = countryCode;
            this.e = str;
            this.f = refNo;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/login/data/models/request/LoginApiRequestModel$TruecallerLoginApiRequestModel;", "Lapp/chalo/login/data/models/request/LoginApiRequestModel;", "Companion", "$serializer", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    @SerialName
    public static final /* data */ class TruecallerLoginApiRequestModel extends LoginApiRequestModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/data/models/request/LoginApiRequestModel$TruecallerLoginApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/login/data/models/request/LoginApiRequestModel$TruecallerLoginApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<TruecallerLoginApiRequestModel> serializer() {
                return LoginApiRequestModel$TruecallerLoginApiRequestModel$$serializer.f5204a;
            }
        }

        public /* synthetic */ TruecallerLoginApiRequestModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            if (1023 != (i & 1023)) {
                PluginExceptionsKt.b(LoginApiRequestModel$TruecallerLoginApiRequestModel$$serializer.f5204a.getDescriptor(), i, 1023);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = str9;
            this.k = str10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TruecallerLoginApiRequestModel)) {
                return false;
            }
            TruecallerLoginApiRequestModel truecallerLoginApiRequestModel = (TruecallerLoginApiRequestModel) obj;
            return Intrinsics.d(this.b, truecallerLoginApiRequestModel.b) && Intrinsics.d(this.c, truecallerLoginApiRequestModel.c) && Intrinsics.d(this.d, truecallerLoginApiRequestModel.d) && Intrinsics.d(this.e, truecallerLoginApiRequestModel.e) && Intrinsics.d(this.f, truecallerLoginApiRequestModel.f) && Intrinsics.d(this.g, truecallerLoginApiRequestModel.g) && Intrinsics.d(this.h, truecallerLoginApiRequestModel.h) && Intrinsics.d(this.i, truecallerLoginApiRequestModel.i) && Intrinsics.d(this.j, truecallerLoginApiRequestModel.j) && Intrinsics.d(this.k, truecallerLoginApiRequestModel.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("TruecallerLoginApiRequestModel(deviceId=", this.b, ", payload=", this.c, ", signature=");
            cb0.t(sbE, this.d, ", signatureAlgorithm=", this.e, ", uid=");
            cb0.t(sbE, this.f, ", mobileNumber=", this.g, ", countryCode=");
            cb0.t(sbE, this.h, ", firstName=", this.i, ", lastName=");
            return r30.i(sbE, this.j, ", emailId=", this.k, ")");
        }

        public TruecallerLoginApiRequestModel(String deviceId, String str, String str2, String str3, String str4, String str5, String countryCode, String str6, String str7, String str8) {
            Intrinsics.i(deviceId, "deviceId");
            Intrinsics.i(countryCode, "countryCode");
            this.b = deviceId;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = countryCode;
            this.i = str6;
            this.j = str7;
            this.k = str8;
        }
    }
}
