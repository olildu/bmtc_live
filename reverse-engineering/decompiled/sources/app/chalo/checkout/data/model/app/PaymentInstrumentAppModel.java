package app.chalo.checkout.data.model.app;

import defpackage.b3;
import defpackage.nf1;
import defpackage.xp0;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel;", "", "Companion", "NetBankingPaymentInstrumentAppModel", "UPIPaymentInstrumentAppModel", "WalletPaymentInstrumentAppModel", "Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel;", "Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel;", "Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$WalletPaymentInstrumentAppModel;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class PaymentInstrumentAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(8));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentDisplayDetailsAppModel f1291a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<PaymentInstrumentAppModel> serializer() {
            return (KSerializer) PaymentInstrumentAppModel.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel;", "Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NetBankingPaymentInstrumentAppModel extends PaymentInstrumentAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final PaymentDisplayDetailsAppModel c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NetBankingPaymentInstrumentAppModel> serializer() {
                return PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel$$serializer.f1292a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NetBankingPaymentInstrumentAppModel(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel2, String str) {
            super(paymentDisplayDetailsAppModel);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(PaymentInstrumentAppModel$NetBankingPaymentInstrumentAppModel$$serializer.f1292a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = paymentDisplayDetailsAppModel2;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetBankingPaymentInstrumentAppModel)) {
                return false;
            }
            NetBankingPaymentInstrumentAppModel netBankingPaymentInstrumentAppModel = (NetBankingPaymentInstrumentAppModel) obj;
            return Intrinsics.d(this.c, netBankingPaymentInstrumentAppModel.c) && Intrinsics.d(this.d, netBankingPaymentInstrumentAppModel.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "NetBankingPaymentInstrumentAppModel(displayDetails=" + this.c + ", bankCode=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetBankingPaymentInstrumentAppModel(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, String bankCode) {
            super(0, paymentDisplayDetailsAppModel);
            Intrinsics.i(bankCode, "bankCode");
            this.c = paymentDisplayDetailsAppModel;
            this.d = bankCode;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel;", "Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UPIPaymentInstrumentAppModel extends PaymentInstrumentAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final PaymentDisplayDetailsAppModel c;
        public final String d;
        public final boolean e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<UPIPaymentInstrumentAppModel> serializer() {
                return PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer.f1293a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UPIPaymentInstrumentAppModel(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel2, String str, boolean z) {
            super(paymentDisplayDetailsAppModel);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer.f1293a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = paymentDisplayDetailsAppModel2;
            this.d = str;
            if ((i & 8) == 0) {
                this.e = false;
            } else {
                this.e = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UPIPaymentInstrumentAppModel)) {
                return false;
            }
            UPIPaymentInstrumentAppModel uPIPaymentInstrumentAppModel = (UPIPaymentInstrumentAppModel) obj;
            return Intrinsics.d(this.c, uPIPaymentInstrumentAppModel.c) && Intrinsics.d(this.d, uPIPaymentInstrumentAppModel.d) && this.e == uPIPaymentInstrumentAppModel.e;
        }

        public final int hashCode() {
            return nf1.e(this.c.hashCode() * 31, 31, this.d) + (this.e ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UPIPaymentInstrumentAppModel(displayDetails=");
            sb.append(this.c);
            sb.append(", packageName=");
            sb.append(this.d);
            sb.append(", hasNativeInstalledAppIcon=");
            return b3.g(")", sb, this.e);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UPIPaymentInstrumentAppModel(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, String packageName, boolean z) {
            super(0, paymentDisplayDetailsAppModel);
            Intrinsics.i(packageName, "packageName");
            this.c = paymentDisplayDetailsAppModel;
            this.d = packageName;
            this.e = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$WalletPaymentInstrumentAppModel;", "Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class WalletPaymentInstrumentAppModel extends PaymentInstrumentAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final PaymentDisplayDetailsAppModel c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$WalletPaymentInstrumentAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$WalletPaymentInstrumentAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<WalletPaymentInstrumentAppModel> serializer() {
                return PaymentInstrumentAppModel$WalletPaymentInstrumentAppModel$$serializer.f1294a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WalletPaymentInstrumentAppModel(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel2, String str) {
            super(paymentDisplayDetailsAppModel);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(PaymentInstrumentAppModel$WalletPaymentInstrumentAppModel$$serializer.f1294a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = paymentDisplayDetailsAppModel2;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WalletPaymentInstrumentAppModel)) {
                return false;
            }
            WalletPaymentInstrumentAppModel walletPaymentInstrumentAppModel = (WalletPaymentInstrumentAppModel) obj;
            return Intrinsics.d(this.c, walletPaymentInstrumentAppModel.c) && Intrinsics.d(this.d, walletPaymentInstrumentAppModel.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "WalletPaymentInstrumentAppModel(displayDetails=" + this.c + ", walletId=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WalletPaymentInstrumentAppModel(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, String walletId) {
            super(0, paymentDisplayDetailsAppModel);
            Intrinsics.i(walletId, "walletId");
            this.c = paymentDisplayDetailsAppModel;
            this.d = walletId;
        }
    }

    public PaymentInstrumentAppModel(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel) {
        this.f1291a = paymentDisplayDetailsAppModel;
    }

    public /* synthetic */ PaymentInstrumentAppModel(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel) {
        this.f1291a = paymentDisplayDetailsAppModel;
    }
}
