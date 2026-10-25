package app.chalo.juspay;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.uc0;
import defpackage.uf0;
import defpackage.vo1;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType;", "", "Companion", "InitiateSDK", "UpiSessionToken", "OnBoardingAndPay", "Management", "UpiUiScanPay", "Unknown", "UpdateAuth", "Lapp/chalo/juspay/JusPayResultDataType$InitiateSDK;", "Lapp/chalo/juspay/JusPayResultDataType$Management;", "Lapp/chalo/juspay/JusPayResultDataType$OnBoardingAndPay;", "Lapp/chalo/juspay/JusPayResultDataType$Unknown;", "Lapp/chalo/juspay/JusPayResultDataType$UpdateAuth;", "Lapp/chalo/juspay/JusPayResultDataType$UpiSessionToken;", "Lapp/chalo/juspay/JusPayResultDataType$UpiUiScanPay;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class JusPayResultDataType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3997a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(11));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayResultDataType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<JusPayResultDataType> serializer() {
            return (KSerializer) JusPayResultDataType.f3997a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$Unknown;", "Lapp/chalo/juspay/JusPayResultDataType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Unknown extends JusPayResultDataType {
        public static final Unknown INSTANCE = new Unknown();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(15));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 986586351;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<Unknown> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "Unknown";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$UpdateAuth;", "Lapp/chalo/juspay/JusPayResultDataType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UpdateAuth extends JusPayResultDataType {
        public static final UpdateAuth INSTANCE = new UpdateAuth();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(16));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UpdateAuth);
        }

        public final int hashCode() {
            return -524251316;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<UpdateAuth> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "UpdateAuth";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$InitiateSDK;", "Lapp/chalo/juspay/JusPayResultDataType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class InitiateSDK extends JusPayResultDataType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(12))};
        public final JusPaySDKInitiateStatus b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$InitiateSDK$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayResultDataType$InitiateSDK;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<InitiateSDK> serializer() {
                return JusPayResultDataType$InitiateSDK$$serializer.f3998a;
            }
        }

        public /* synthetic */ InitiateSDK(int i, JusPaySDKInitiateStatus jusPaySDKInitiateStatus) {
            if (1 == (i & 1)) {
                this.b = jusPaySDKInitiateStatus;
            } else {
                PluginExceptionsKt.b(JusPayResultDataType$InitiateSDK$$serializer.f3998a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiateSDK) && this.b == ((InitiateSDK) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "InitiateSDK(sdkInitiateStatus=" + this.b + ")";
        }

        public InitiateSDK(JusPaySDKInitiateStatus sdkInitiateStatus) {
            Intrinsics.i(sdkInitiateStatus, "sdkInitiateStatus");
            this.b = sdkInitiateStatus;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$Management;", "Lapp/chalo/juspay/JusPayResultDataType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Management extends JusPayResultDataType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(13))};
        public final JusPayManagementStatus b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$Management$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayResultDataType$Management;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Management> serializer() {
                return JusPayResultDataType$Management$$serializer.f3999a;
            }
        }

        public /* synthetic */ Management(int i, JusPayManagementStatus jusPayManagementStatus) {
            if (1 == (i & 1)) {
                this.b = jusPayManagementStatus;
            } else {
                PluginExceptionsKt.b(JusPayResultDataType$Management$$serializer.f3999a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Management) && this.b == ((Management) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Management(status=" + this.b + ")";
        }

        public Management(JusPayManagementStatus status) {
            Intrinsics.i(status, "status");
            this.b = status;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$OnBoardingAndPay;", "Lapp/chalo/juspay/JusPayResultDataType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class OnBoardingAndPay extends JusPayResultDataType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] g = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(14)), null, null, null};
        public final String b;
        public final JusPayTransactionStatus c;
        public final String d;
        public final String e;
        public final OnBoardingAndPaySelectedAccount f;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$OnBoardingAndPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayResultDataType$OnBoardingAndPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<OnBoardingAndPay> serializer() {
                return JusPayResultDataType$OnBoardingAndPay$$serializer.f4000a;
            }
        }

        public /* synthetic */ OnBoardingAndPay(int i, String str, JusPayTransactionStatus jusPayTransactionStatus, String str2, String str3, OnBoardingAndPaySelectedAccount onBoardingAndPaySelectedAccount) {
            if (31 != (i & 31)) {
                PluginExceptionsKt.b(JusPayResultDataType$OnBoardingAndPay$$serializer.f4000a.getDescriptor(), i, 31);
                throw null;
            }
            this.b = str;
            this.c = jusPayTransactionStatus;
            this.d = str2;
            this.e = str3;
            this.f = onBoardingAndPaySelectedAccount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBoardingAndPay)) {
                return false;
            }
            OnBoardingAndPay onBoardingAndPay = (OnBoardingAndPay) obj;
            return Intrinsics.d(this.b, onBoardingAndPay.b) && this.c == onBoardingAndPay.c && Intrinsics.d(this.d, onBoardingAndPay.d) && Intrinsics.d(this.e, onBoardingAndPay.e) && Intrinsics.d(this.f, onBoardingAndPay.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + nf1.e(nf1.e((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnBoardingAndPay(transactionId=");
            sb.append(this.b);
            sb.append(", status=");
            sb.append(this.c);
            sb.append(", orderId=");
            cb0.t(sb, this.d, ", accountRefId=", this.e, ", selectedAccount=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }

        public OnBoardingAndPay(String str, JusPayTransactionStatus status, String str2, String str3, OnBoardingAndPaySelectedAccount onBoardingAndPaySelectedAccount) {
            Intrinsics.i(status, "status");
            this.b = str;
            this.c = status;
            this.d = str2;
            this.e = str3;
            this.f = onBoardingAndPaySelectedAccount;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$UpiSessionToken;", "Lapp/chalo/juspay/JusPayResultDataType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UpiSessionToken extends JusPayResultDataType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] h;
        public final JusPayUpiSessionStatus b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final String f;
        public final List g;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$UpiSessionToken$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayResultDataType$UpiSessionToken;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<UpiSessionToken> serializer() {
                return JusPayResultDataType$UpiSessionToken$$serializer.f4001a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            h = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new uc0(17)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new uc0(18))};
        }

        public /* synthetic */ UpiSessionToken(int i, JusPayUpiSessionStatus jusPayUpiSessionStatus, boolean z, boolean z2, String str, String str2, List list) {
            if (63 != (i & 63)) {
                PluginExceptionsKt.b(JusPayResultDataType$UpiSessionToken$$serializer.f4001a.getDescriptor(), i, 63);
                throw null;
            }
            this.b = jusPayUpiSessionStatus;
            this.c = z;
            this.d = z2;
            this.e = str;
            this.f = str2;
            this.g = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpiSessionToken)) {
                return false;
            }
            UpiSessionToken upiSessionToken = (UpiSessionToken) obj;
            return this.b == upiSessionToken.b && this.c == upiSessionToken.c && this.d == upiSessionToken.d && Intrinsics.d(this.e, upiSessionToken.e) && Intrinsics.d(this.f, upiSessionToken.f) && Intrinsics.d(this.g, upiSessionToken.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + nf1.e(nf1.e(((((this.b.hashCode() * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31, 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpiSessionToken(upiSessionStatus=");
            sb.append(this.b);
            sb.append(", isDeviceBound=");
            sb.append(this.c);
            sb.append(", isDeviceActivated=");
            pk0.x(", requestIdPrefix=", this.e, ", mobileNumber=", sb, this.d);
            return uf0.p(this.f, ", upiAccounts=", ")", sb, this.g);
        }

        public UpiSessionToken(JusPayUpiSessionStatus upiSessionStatus, boolean z, boolean z2, String str, String str2, List upiAccounts) {
            Intrinsics.i(upiSessionStatus, "upiSessionStatus");
            Intrinsics.i(upiAccounts, "upiAccounts");
            this.b = upiSessionStatus;
            this.c = z;
            this.d = z2;
            this.e = str;
            this.f = str2;
            this.g = upiAccounts;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$UpiUiScanPay;", "Lapp/chalo/juspay/JusPayResultDataType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UpiUiScanPay extends JusPayResultDataType {

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

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayResultDataType$UpiUiScanPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayResultDataType$UpiUiScanPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<UpiUiScanPay> serializer() {
                return JusPayResultDataType$UpiUiScanPay$$serializer.f4002a;
            }
        }

        public /* synthetic */ UpiUiScanPay(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(JusPayResultDataType$UpiUiScanPay$$serializer.f4002a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpiUiScanPay)) {
                return false;
            }
            UpiUiScanPay upiUiScanPay = (UpiUiScanPay) obj;
            return Intrinsics.d(this.b, upiUiScanPay.b) && Intrinsics.d(this.c, upiUiScanPay.c) && Intrinsics.d(this.d, upiUiScanPay.d) && Intrinsics.d(this.e, upiUiScanPay.e) && Intrinsics.d(this.f, upiUiScanPay.f) && Intrinsics.d(this.g, upiUiScanPay.g) && Intrinsics.d(this.h, upiUiScanPay.h) && Intrinsics.d(this.i, upiUiScanPay.i) && Intrinsics.d(this.j, upiUiScanPay.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("UpiUiScanPay(transactionId=", this.b, ", status=", this.c, ", amount=");
            cb0.t(sbE, this.d, ", payeeName=", this.e, ", accountRefId=");
            cb0.t(sbE, this.f, ", actionPerformed=", this.g, ", gatewayResponseCode=");
            cb0.t(sbE, this.h, ", gatewayResponseMessage=", this.i, ", transactionTimestamp=");
            return vo1.p(sbE, this.j, ")");
        }

        public UpiUiScanPay(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = str9;
        }
    }
}
