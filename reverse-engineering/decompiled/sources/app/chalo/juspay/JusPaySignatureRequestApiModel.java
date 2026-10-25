package app.chalo.juspay;

import defpackage.dd;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel;", "", "Companion", "OnboardingAndPay", "GetUpiSessionToken", "InitiateSDK", "UpdateSessionToken", "Management", "UpiUiScanPay", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel$GetUpiSessionToken;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel$InitiateSDK;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel$Management;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel$OnboardingAndPay;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel$UpdateSessionToken;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel$UpiUiScanPay;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class JusPaySignatureRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(19));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4017a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<JusPaySignatureRequestApiModel> serializer() {
            return (KSerializer) JusPaySignatureRequestApiModel.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$GetUpiSessionToken;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GetUpiSessionToken extends JusPaySignatureRequestApiModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$GetUpiSessionToken$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel$GetUpiSessionToken;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GetUpiSessionToken> serializer() {
                return JusPaySignatureRequestApiModel$GetUpiSessionToken$$serializer.f4018a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetUpiSessionToken(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(JusPaySignatureRequestApiModel$GetUpiSessionToken$$serializer.f4018a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetUpiSessionToken) && Intrinsics.d(this.c, ((GetUpiSessionToken) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("GetUpiSessionToken(city=", this.c, ")");
        }

        public GetUpiSessionToken(String str) {
            super(JusPayAction.GetUpiSessionToken.getActionName(), 0);
            this.c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$InitiateSDK;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class InitiateSDK extends JusPaySignatureRequestApiModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$InitiateSDK$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel$InitiateSDK;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<InitiateSDK> serializer() {
                return JusPaySignatureRequestApiModel$InitiateSDK$$serializer.f4019a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ InitiateSDK(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(JusPaySignatureRequestApiModel$InitiateSDK$$serializer.f4019a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiateSDK) && Intrinsics.d(this.c, ((InitiateSDK) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("InitiateSDK(city=", this.c, ")");
        }

        public InitiateSDK(String str) {
            super(JusPayAction.Initiate.getActionName(), 0);
            this.c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$Management;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Management extends JusPaySignatureRequestApiModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$Management$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel$Management;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Management> serializer() {
                return JusPaySignatureRequestApiModel$Management$$serializer.f4020a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Management(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(JusPaySignatureRequestApiModel$Management$$serializer.f4020a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Management) && Intrinsics.d(this.c, ((Management) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("Management(city=", this.c, ")");
        }

        public Management(String str) {
            super(JusPayAction.Management.getActionName(), 0);
            this.c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$OnboardingAndPay;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class OnboardingAndPay extends JusPaySignatureRequestApiModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final String d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$OnboardingAndPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel$OnboardingAndPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<OnboardingAndPay> serializer() {
                return JusPaySignatureRequestApiModel$OnboardingAndPay$$serializer.f4021a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OnboardingAndPay(int i, String str, String str2, String str3, String str4) {
            super(str);
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(JusPaySignatureRequestApiModel$OnboardingAndPay$$serializer.f4021a.getDescriptor(), i, 15);
                throw null;
            }
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnboardingAndPay)) {
                return false;
            }
            OnboardingAndPay onboardingAndPay = (OnboardingAndPay) obj;
            return Intrinsics.d(this.c, onboardingAndPay.c) && Intrinsics.d(this.d, onboardingAndPay.d) && Intrinsics.d(this.e, onboardingAndPay.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + nf1.e(this.c.hashCode() * 31, 31, this.d);
        }

        public final String toString() {
            return vo1.p(dd.e("OnboardingAndPay(amount=", this.c, ", chaloOrderId=", this.d, ", city="), this.e, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnboardingAndPay(String amount, String chaloOrderId, String str) {
            super(JusPayAction.OnBoardingAndPay.getActionName(), 0);
            Intrinsics.i(amount, "amount");
            Intrinsics.i(chaloOrderId, "chaloOrderId");
            this.c = amount;
            this.d = chaloOrderId;
            this.e = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$UpdateSessionToken;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UpdateSessionToken extends JusPaySignatureRequestApiModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$UpdateSessionToken$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel$UpdateSessionToken;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<UpdateSessionToken> serializer() {
                return JusPaySignatureRequestApiModel$UpdateSessionToken$$serializer.f4022a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UpdateSessionToken(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(JusPaySignatureRequestApiModel$UpdateSessionToken$$serializer.f4022a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSessionToken) && Intrinsics.d(this.c, ((UpdateSessionToken) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("UpdateSessionToken(city=", this.c, ")");
        }

        public UpdateSessionToken(String str) {
            super(JusPayAction.UpdateAuth.getActionName(), 0);
            this.c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$UpiUiScanPay;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UpiUiScanPay extends JusPaySignatureRequestApiModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPaySignatureRequestApiModel$UpiUiScanPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPaySignatureRequestApiModel$UpiUiScanPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<UpiUiScanPay> serializer() {
                return JusPaySignatureRequestApiModel$UpiUiScanPay$$serializer.f4023a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UpiUiScanPay(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(JusPaySignatureRequestApiModel$UpiUiScanPay$$serializer.f4023a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpiUiScanPay) && Intrinsics.d(this.c, ((UpiUiScanPay) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("UpiUiScanPay(city=", this.c, ")");
        }

        public UpiUiScanPay(String str) {
            super(JusPayAction.UpiUiScanPay.getActionName(), 0);
            this.c = str;
        }
    }

    public /* synthetic */ JusPaySignatureRequestApiModel(String str) {
        this.f4017a = str;
    }

    public JusPaySignatureRequestApiModel(String str, int i) {
        this.f4017a = str;
    }
}
