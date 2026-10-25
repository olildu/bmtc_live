package app.chalo.juspay;

import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.r30;
import defpackage.uc0;
import defpackage.vo1;
import defpackage.xs;
import java.util.List;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload;", "", "Companion", "InitiateSDK", "GetUpiSessionToken", "OnBoardingAndPay", "Management", "UpiUiScanPay", "UpdateAuth", "Unknown", "Lapp/chalo/juspay/JusPayResponsePayload$GetUpiSessionToken;", "Lapp/chalo/juspay/JusPayResponsePayload$InitiateSDK;", "Lapp/chalo/juspay/JusPayResponsePayload$Management;", "Lapp/chalo/juspay/JusPayResponsePayload$OnBoardingAndPay;", "Lapp/chalo/juspay/JusPayResponsePayload$Unknown;", "Lapp/chalo/juspay/JusPayResponsePayload$UpdateAuth;", "Lapp/chalo/juspay/JusPayResponsePayload$UpiUiScanPay;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class JusPayResponsePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(6));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3990a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayResponsePayload;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<JusPayResponsePayload> serializer() {
            return (KSerializer) JusPayResponsePayload.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$GetUpiSessionToken;", "Lapp/chalo/juspay/JusPayResponsePayload;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GetUpiSessionToken extends JusPayResponsePayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l = {null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(7))};
        public final String c;
        public final String d;
        public final Boolean e;
        public final Boolean f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final List k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$GetUpiSessionToken$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayResponsePayload$GetUpiSessionToken;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GetUpiSessionToken> serializer() {
                return JusPayResponsePayload$GetUpiSessionToken$$serializer.f3991a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetUpiSessionToken(int i, String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, String str6, String str7, List list) {
            super(str);
            if (1023 != (i & 1023)) {
                PluginExceptionsKt.b(JusPayResponsePayload$GetUpiSessionToken$$serializer.f3991a.getDescriptor(), i, 1023);
                throw null;
            }
            this.c = str2;
            this.d = str3;
            this.e = bool;
            this.f = bool2;
            this.g = str4;
            this.h = str5;
            this.i = str6;
            this.j = str7;
            this.k = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetUpiSessionToken)) {
                return false;
            }
            GetUpiSessionToken getUpiSessionToken = (GetUpiSessionToken) obj;
            return Intrinsics.d(this.c, getUpiSessionToken.c) && Intrinsics.d(this.d, getUpiSessionToken.d) && Intrinsics.d(this.e, getUpiSessionToken.e) && Intrinsics.d(this.f, getUpiSessionToken.f) && Intrinsics.d(this.g, getUpiSessionToken.g) && Intrinsics.d(this.h, getUpiSessionToken.h) && Intrinsics.d(this.i, getUpiSessionToken.i) && Intrinsics.d(this.j, getUpiSessionToken.j) && Intrinsics.d(this.k, getUpiSessionToken.k);
        }

        public final int hashCode() {
            String str = this.c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.e;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str3 = this.g;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.h;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.i;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.j;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            List list = this.k;
            return iHashCode8 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("GetUpiSessionToken(action=", this.c, ", status=", this.d, ", isDeviceBound=");
            hq0.u(sbE, this.e, ", isDeviceActivated=", this.f, ", prefix=");
            cb0.t(sbE, this.g, ", customerMobileNumber=", this.h, ", deviceFingerPrint=");
            cb0.t(sbE, this.i, ", otherInfo=", this.j, ", vpaAccounts=");
            return xs.l(sbE, this.k, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$InitiateSDK;", "Lapp/chalo/juspay/JusPayResponsePayload;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class InitiateSDK extends JusPayResponsePayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$InitiateSDK$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayResponsePayload$InitiateSDK;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<InitiateSDK> serializer() {
                return JusPayResponsePayload$InitiateSDK$$serializer.f3992a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ InitiateSDK(int i, String str, String str2, String str3) {
            super(str);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(JusPayResponsePayload$InitiateSDK$$serializer.f3992a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitiateSDK)) {
                return false;
            }
            InitiateSDK initiateSDK = (InitiateSDK) obj;
            return Intrinsics.d(this.c, initiateSDK.c) && Intrinsics.d(this.d, initiateSDK.d);
        }

        public final int hashCode() {
            String str = this.c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return vo1.o("InitiateSDK(action=", this.c, ", status=", this.d, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$Management;", "Lapp/chalo/juspay/JusPayResponsePayload;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Management extends JusPayResponsePayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$Management$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayResponsePayload$Management;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Management> serializer() {
                return JusPayResponsePayload$Management$$serializer.f3993a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Management(int i, String str, String str2, String str3) {
            super(str);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(JusPayResponsePayload$Management$$serializer.f3993a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Management)) {
                return false;
            }
            Management management = (Management) obj;
            return Intrinsics.d(this.c, management.c) && Intrinsics.d(this.d, management.d);
        }

        public final int hashCode() {
            String str = this.c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return vo1.o("Management(action=", this.c, ", status=", this.d, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$OnBoardingAndPay;", "Lapp/chalo/juspay/JusPayResponsePayload;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class OnBoardingAndPay extends JusPayResponsePayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final OnBoardingAndPaySelectedAccountResponse h;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$OnBoardingAndPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayResponsePayload$OnBoardingAndPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<OnBoardingAndPay> serializer() {
                return JusPayResponsePayload$OnBoardingAndPay$$serializer.f3994a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OnBoardingAndPay(int i, String str, String str2, String str3, String str4, String str5, String str6, OnBoardingAndPaySelectedAccountResponse onBoardingAndPaySelectedAccountResponse) {
            super(str);
            if (127 != (i & 127)) {
                PluginExceptionsKt.b(JusPayResponsePayload$OnBoardingAndPay$$serializer.f3994a.getDescriptor(), i, 127);
                throw null;
            }
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = onBoardingAndPaySelectedAccountResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBoardingAndPay)) {
                return false;
            }
            OnBoardingAndPay onBoardingAndPay = (OnBoardingAndPay) obj;
            return Intrinsics.d(this.c, onBoardingAndPay.c) && Intrinsics.d(this.d, onBoardingAndPay.d) && Intrinsics.d(this.e, onBoardingAndPay.e) && Intrinsics.d(this.f, onBoardingAndPay.f) && Intrinsics.d(this.g, onBoardingAndPay.g) && Intrinsics.d(this.h, onBoardingAndPay.h);
        }

        public final int hashCode() {
            String str = this.c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.g;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            OnBoardingAndPaySelectedAccountResponse onBoardingAndPaySelectedAccountResponse = this.h;
            return iHashCode5 + (onBoardingAndPaySelectedAccountResponse != null ? onBoardingAndPaySelectedAccountResponse.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("OnBoardingAndPay(action=", this.c, ", txnUuid=", this.d, ", status=");
            cb0.t(sbE, this.e, ", orderId=", this.f, ", accountRefId=");
            sbE.append(this.g);
            sbE.append(", selectedAccount=");
            sbE.append(this.h);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$Unknown;", "Lapp/chalo/juspay/JusPayResponsePayload;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class Unknown extends JusPayResponsePayload {
        public static final Unknown INSTANCE = new Unknown();
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(8));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<Unknown> serializer() {
            return (KSerializer) c.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$UpdateAuth;", "Lapp/chalo/juspay/JusPayResponsePayload;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class UpdateAuth extends JusPayResponsePayload {
        public static final UpdateAuth INSTANCE = new UpdateAuth();
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(9));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<UpdateAuth> serializer() {
            return (KSerializer) c.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$UpiUiScanPay;", "Lapp/chalo/juspay/JusPayResponsePayload;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UpiUiScanPay extends JusPayResponsePayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayResponsePayload$UpiUiScanPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayResponsePayload$UpiUiScanPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<UpiUiScanPay> serializer() {
                return JusPayResponsePayload$UpiUiScanPay$$serializer.f3995a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UpiUiScanPay(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            super(str);
            if (2047 != (i & 2047)) {
                PluginExceptionsKt.b(JusPayResponsePayload$UpiUiScanPay$$serializer.f3995a.getDescriptor(), i, 2047);
                throw null;
            }
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = str9;
            this.k = str10;
            this.l = str11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpiUiScanPay)) {
                return false;
            }
            UpiUiScanPay upiUiScanPay = (UpiUiScanPay) obj;
            return Intrinsics.d(this.c, upiUiScanPay.c) && Intrinsics.d(this.d, upiUiScanPay.d) && Intrinsics.d(this.e, upiUiScanPay.e) && Intrinsics.d(this.f, upiUiScanPay.f) && Intrinsics.d(this.g, upiUiScanPay.g) && Intrinsics.d(this.h, upiUiScanPay.h) && Intrinsics.d(this.i, upiUiScanPay.i) && Intrinsics.d(this.j, upiUiScanPay.j) && Intrinsics.d(this.k, upiUiScanPay.k) && Intrinsics.d(this.l, upiUiScanPay.l);
        }

        public final int hashCode() {
            String str = this.c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.g;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.h;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.i;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.j;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.k;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.l;
            return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("UpiUiScanPay(action=", this.c, ", status=", this.d, ", gatewayTransactionId=");
            cb0.t(sbE, this.e, ", gatewayResponseMessage=", this.f, ", gatewayResponseCode=");
            cb0.t(sbE, this.g, ", actionPerformed=", this.h, ", accountReferenceId=");
            cb0.t(sbE, this.i, ", payeeName=", this.j, ", amount=");
            return r30.i(sbE, this.k, ", transactionTimestamp=", this.l, ")");
        }
    }

    public JusPayResponsePayload() {
        this.f3990a = null;
    }

    public /* synthetic */ JusPayResponsePayload(String str) {
        this.f3990a = str;
    }
}
