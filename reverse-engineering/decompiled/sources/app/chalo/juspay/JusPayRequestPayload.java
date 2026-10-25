package app.chalo.juspay;

import defpackage.b3;
import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.uc0;
import defpackage.vo1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload;", "", "Companion", "InitiateSDK", "GetUpiSessionToken", "OnBoardingAndPay", "UpdateSessionToken", "UpiUiScanPay", "Management", "Lapp/chalo/juspay/JusPayRequestPayload$GetUpiSessionToken;", "Lapp/chalo/juspay/JusPayRequestPayload$InitiateSDK;", "Lapp/chalo/juspay/JusPayRequestPayload$Management;", "Lapp/chalo/juspay/JusPayRequestPayload$OnBoardingAndPay;", "Lapp/chalo/juspay/JusPayRequestPayload$UpdateSessionToken;", "Lapp/chalo/juspay/JusPayRequestPayload$UpiUiScanPay;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class JusPayRequestPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3982a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(5));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayRequestPayload;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<JusPayRequestPayload> serializer() {
            return (KSerializer) JusPayRequestPayload.f3982a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$GetUpiSessionToken;", "Lapp/chalo/juspay/JusPayRequestPayload;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GetUpiSessionToken extends JusPayRequestPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$GetUpiSessionToken$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayRequestPayload$GetUpiSessionToken;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GetUpiSessionToken> serializer() {
                return JusPayRequestPayload$GetUpiSessionToken$$serializer.f3983a;
            }
        }

        public /* synthetic */ GetUpiSessionToken(int i, String str, String str2, String str3, String str4) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(JusPayRequestPayload$GetUpiSessionToken$$serializer.f3983a.getDescriptor(), i, 15);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetUpiSessionToken)) {
                return false;
            }
            GetUpiSessionToken getUpiSessionToken = (GetUpiSessionToken) obj;
            return Intrinsics.d(this.b, getUpiSessionToken.b) && Intrinsics.d(this.c, getUpiSessionToken.c) && Intrinsics.d(this.d, getUpiSessionToken.d) && Intrinsics.d(this.e, getUpiSessionToken.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            return r30.i(dd.e("GetUpiSessionToken(merchantKeyId=", this.b, ", signature=", this.c, ", signaturePayload="), this.d, ", action=", this.e, ")");
        }

        public GetUpiSessionToken(String merchantKeyId, String signature, String signaturePayload, String action) {
            Intrinsics.i(merchantKeyId, "merchantKeyId");
            Intrinsics.i(signature, "signature");
            Intrinsics.i(signaturePayload, "signaturePayload");
            Intrinsics.i(action, "action");
            this.b = merchantKeyId;
            this.c = signature;
            this.d = signaturePayload;
            this.e = action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$InitiateSDK;", "Lapp/chalo/juspay/JusPayRequestPayload;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class InitiateSDK extends JusPayRequestPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final Boolean h;
        public final String i;
        public final Integer j;
        public final Boolean k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$InitiateSDK$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayRequestPayload$InitiateSDK;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<InitiateSDK> serializer() {
                return JusPayRequestPayload$InitiateSDK$$serializer.f3984a;
            }
        }

        public /* synthetic */ InitiateSDK(int i, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, Integer num, Boolean bool2) {
            if (1023 != (i & 1023)) {
                PluginExceptionsKt.b(JusPayRequestPayload$InitiateSDK$$serializer.f3984a.getDescriptor(), i, 1023);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = bool;
            this.i = str7;
            this.j = num;
            this.k = bool2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitiateSDK)) {
                return false;
            }
            InitiateSDK initiateSDK = (InitiateSDK) obj;
            return Intrinsics.d(this.b, initiateSDK.b) && Intrinsics.d(this.c, initiateSDK.c) && Intrinsics.d(this.d, initiateSDK.d) && Intrinsics.d(this.e, initiateSDK.e) && Intrinsics.d(this.f, initiateSDK.f) && Intrinsics.d(this.g, initiateSDK.g) && Intrinsics.d(this.h, initiateSDK.h) && Intrinsics.d(this.i, initiateSDK.i) && Intrinsics.d(this.j, initiateSDK.j) && Intrinsics.d(this.k, initiateSDK.k);
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
            Boolean bool = this.h;
            int iHashCode = (iE + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.i;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.j;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool2 = this.k;
            return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("InitiateSDK(signature=", this.b, ", signaturePayload=", this.c, ", action=");
            cb0.t(sbE, this.d, ", merchantKeyId=", this.e, ", issuingPsp=");
            cb0.t(sbE, this.f, ", clientId=", this.g, ", merchantLoader=");
            hq0.t(this.h, ", environment=", this.i, ", logLevel=", sbE);
            sbE.append(this.j);
            sbE.append(", shouldCreateCustomer=");
            sbE.append(this.k);
            sbE.append(")");
            return sbE.toString();
        }

        public InitiateSDK(String signature, String signaturePayload, String action, String merchantKeyId, String issuingPsp, String clientId, Boolean bool, String str, Integer num, Boolean bool2) {
            Intrinsics.i(signature, "signature");
            Intrinsics.i(signaturePayload, "signaturePayload");
            Intrinsics.i(action, "action");
            Intrinsics.i(merchantKeyId, "merchantKeyId");
            Intrinsics.i(issuingPsp, "issuingPsp");
            Intrinsics.i(clientId, "clientId");
            this.b = signature;
            this.c = signaturePayload;
            this.d = action;
            this.e = merchantKeyId;
            this.f = issuingPsp;
            this.g = clientId;
            this.h = bool;
            this.i = str;
            this.j = num;
            this.k = bool2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$OnBoardingAndPay;", "Lapp/chalo/juspay/JusPayRequestPayload;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class OnBoardingAndPay extends JusPayRequestPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final Boolean g;
        public final String h;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$OnBoardingAndPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayRequestPayload$OnBoardingAndPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<OnBoardingAndPay> serializer() {
                return JusPayRequestPayload$OnBoardingAndPay$$serializer.f3986a;
            }
        }

        public /* synthetic */ OnBoardingAndPay(int i, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
            if (127 != (i & 127)) {
                PluginExceptionsKt.b(JusPayRequestPayload$OnBoardingAndPay$$serializer.f3986a.getDescriptor(), i, 127);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = bool;
            this.h = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBoardingAndPay)) {
                return false;
            }
            OnBoardingAndPay onBoardingAndPay = (OnBoardingAndPay) obj;
            return Intrinsics.d(this.b, onBoardingAndPay.b) && Intrinsics.d(this.c, onBoardingAndPay.c) && Intrinsics.d(this.d, onBoardingAndPay.d) && Intrinsics.d(this.e, onBoardingAndPay.e) && Intrinsics.d(this.f, onBoardingAndPay.f) && Intrinsics.d(this.g, onBoardingAndPay.g) && Intrinsics.d(this.h, onBoardingAndPay.h);
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
            String str = this.f;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.g;
            return this.h.hashCode() + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("OnBoardingAndPay(signature=", this.b, ", signaturePayload=", this.c, ", action=");
            cb0.t(sbE, this.d, ", merchantKeyId=", this.e, ", accountRefId=");
            gf.v(this.g, this.f, ", showStatusScreen=", ", paymentMethod=", sbE);
            return vo1.p(sbE, this.h, ")");
        }

        public OnBoardingAndPay(String signature, String signaturePayload, String action, String merchantKeyId, String str, Boolean bool) {
            Intrinsics.i(signature, "signature");
            Intrinsics.i(signaturePayload, "signaturePayload");
            Intrinsics.i(action, "action");
            Intrinsics.i(merchantKeyId, "merchantKeyId");
            this.b = signature;
            this.c = signaturePayload;
            this.d = action;
            this.e = merchantKeyId;
            this.f = str;
            this.g = bool;
            this.h = "UPI_INAPP";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$UpdateSessionToken;", "Lapp/chalo/juspay/JusPayRequestPayload;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UpdateSessionToken extends JusPayRequestPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$UpdateSessionToken$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayRequestPayload$UpdateSessionToken;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<UpdateSessionToken> serializer() {
                return JusPayRequestPayload$UpdateSessionToken$$serializer.f3987a;
            }
        }

        public /* synthetic */ UpdateSessionToken(int i, String str, String str2, String str3, String str4) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(JusPayRequestPayload$UpdateSessionToken$$serializer.f3987a.getDescriptor(), i, 15);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateSessionToken)) {
                return false;
            }
            UpdateSessionToken updateSessionToken = (UpdateSessionToken) obj;
            return Intrinsics.d(this.b, updateSessionToken.b) && Intrinsics.d(this.c, updateSessionToken.c) && Intrinsics.d(this.d, updateSessionToken.d) && Intrinsics.d(this.e, updateSessionToken.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            return r30.i(dd.e("UpdateSessionToken(merchantKeyId=", this.b, ", signature=", this.c, ", signaturePayload="), this.d, ", action=", this.e, ")");
        }

        public UpdateSessionToken(String merchantKeyId, String signature, String signaturePayload, String action) {
            Intrinsics.i(merchantKeyId, "merchantKeyId");
            Intrinsics.i(signature, "signature");
            Intrinsics.i(signaturePayload, "signaturePayload");
            Intrinsics.i(action, "action");
            this.b = merchantKeyId;
            this.c = signature;
            this.d = signaturePayload;
            this.e = action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$UpiUiScanPay;", "Lapp/chalo/juspay/JusPayRequestPayload;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UpiUiScanPay extends JusPayRequestPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final Boolean h;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$UpiUiScanPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayRequestPayload$UpiUiScanPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<UpiUiScanPay> serializer() {
                return JusPayRequestPayload$UpiUiScanPay$$serializer.f3988a;
            }
        }

        public /* synthetic */ UpiUiScanPay(int i, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(JusPayRequestPayload$UpiUiScanPay$$serializer.f3988a.getDescriptor(), i, 15);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            if ((i & 16) == 0) {
                this.f = null;
            } else {
                this.f = str5;
            }
            if ((i & 32) == 0) {
                this.g = null;
            } else {
                this.g = str6;
            }
            if ((i & 64) == 0) {
                this.h = null;
            } else {
                this.h = bool;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpiUiScanPay)) {
                return false;
            }
            UpiUiScanPay upiUiScanPay = (UpiUiScanPay) obj;
            return Intrinsics.d(this.b, upiUiScanPay.b) && Intrinsics.d(this.c, upiUiScanPay.c) && Intrinsics.d(this.d, upiUiScanPay.d) && Intrinsics.d(this.e, upiUiScanPay.e) && Intrinsics.d(this.f, upiUiScanPay.f) && Intrinsics.d(this.g, upiUiScanPay.g) && Intrinsics.d(this.h, upiUiScanPay.h);
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
            String str = this.f;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.g;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.h;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("UpiUiScanPay(merchantKeyId=", this.b, ", signature=", this.c, ", signaturePayload=");
            cb0.t(sbE, this.d, ", action=", this.e, ", urlData=");
            cb0.t(sbE, this.f, ", entryType=", this.g, ", showStatusScreen=");
            sbE.append(this.h);
            sbE.append(")");
            return sbE.toString();
        }

        public UpiUiScanPay(String merchantKeyId, String signature, String signaturePayload, String action, String str, Boolean bool) {
            Intrinsics.i(merchantKeyId, "merchantKeyId");
            Intrinsics.i(signature, "signature");
            Intrinsics.i(signaturePayload, "signaturePayload");
            Intrinsics.i(action, "action");
            this.b = merchantKeyId;
            this.c = signature;
            this.d = signaturePayload;
            this.e = action;
            this.f = null;
            this.g = str;
            this.h = bool;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$Management;", "Lapp/chalo/juspay/JusPayRequestPayload;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Management extends JusPayRequestPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayload$Management$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayRequestPayload$Management;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Management> serializer() {
                return JusPayRequestPayload$Management$$serializer.f3985a;
            }
        }

        public Management(String merchantKeyId, String signature, String signaturePayload, String action) {
            Intrinsics.i(merchantKeyId, "merchantKeyId");
            Intrinsics.i(signature, "signature");
            Intrinsics.i(signaturePayload, "signaturePayload");
            Intrinsics.i(action, "action");
            this.b = merchantKeyId;
            this.c = signature;
            this.d = signaturePayload;
            this.e = action;
            this.f = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Management)) {
                return false;
            }
            Management management = (Management) obj;
            return Intrinsics.d(this.b, management.b) && Intrinsics.d(this.c, management.c) && Intrinsics.d(this.d, management.d) && Intrinsics.d(this.e, management.e) && this.f == management.f;
        }

        public final int hashCode() {
            return nf1.e(nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e) + (this.f ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Management(merchantKeyId=", this.b, ", signature=", this.c, ", signaturePayload=");
            cb0.t(sbE, this.d, ", action=", this.e, ", shouldExitOnDeregister=");
            return b3.g(")", sbE, this.f);
        }

        public /* synthetic */ Management(String str, String str2, int i, String str3, String str4, boolean z) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(JusPayRequestPayload$Management$$serializer.f3985a.getDescriptor(), i, 15);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            if ((i & 16) == 0) {
                this.f = true;
            } else {
                this.f = z;
            }
        }
    }
}
