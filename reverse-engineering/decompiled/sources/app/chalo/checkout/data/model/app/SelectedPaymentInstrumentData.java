package app.chalo.checkout.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.p41;
import defpackage.r30;
import defpackage.vo1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData;", "", "Companion", "UpiData", "WalletData", "NetBankingData", "CardData", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$CardData;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$NetBankingData;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$UpiData;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$WalletData;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class SelectedPaymentInstrumentData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1330a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p41(28));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<SelectedPaymentInstrumentData> serializer() {
            return (KSerializer) SelectedPaymentInstrumentData.f1330a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$UpiData;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData;", "Companion", "IntentFlow", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$UpiData$IntentFlow;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class UpiData extends SelectedPaymentInstrumentData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p41(29));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$UpiData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$UpiData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<UpiData> serializer() {
                return (KSerializer) UpiData.b.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$UpiData$IntentFlow;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$UpiData;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class IntentFlow extends UpiData {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$UpiData$IntentFlow$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$UpiData$IntentFlow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<IntentFlow> serializer() {
                    return SelectedPaymentInstrumentData$UpiData$IntentFlow$$serializer.f1333a;
                }
            }

            public /* synthetic */ IntentFlow(int i, String str) {
                if (1 == (i & 1)) {
                    this.c = str;
                } else {
                    PluginExceptionsKt.b(SelectedPaymentInstrumentData$UpiData$IntentFlow$$serializer.f1333a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof IntentFlow) && Intrinsics.d(this.c, ((IntentFlow) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return vo1.B("IntentFlow(packageName=", this.c, ")");
            }

            public IntentFlow(String packageName) {
                Intrinsics.i(packageName, "packageName");
                this.c = packageName;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$CardData;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CardData extends SelectedPaymentInstrumentData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$CardData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$CardData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CardData> serializer() {
                return SelectedPaymentInstrumentData$CardData$$serializer.f1331a;
            }
        }

        public /* synthetic */ CardData(int i, String str, String str2, String str3, String str4) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(SelectedPaymentInstrumentData$CardData$$serializer.f1331a.getDescriptor(), i, 15);
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
            if (!(obj instanceof CardData)) {
                return false;
            }
            CardData cardData = (CardData) obj;
            return Intrinsics.d(this.b, cardData.b) && Intrinsics.d(this.c, cardData.c) && Intrinsics.d(this.d, cardData.d) && Intrinsics.d(this.e, cardData.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            return r30.i(dd.e("CardData(cardCvv=", this.b, ", number=", this.c, ", expiry="), this.d, ", name=", this.e, ")");
        }

        public CardData(String str, String str2, String str3, String str4) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$NetBankingData;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NetBankingData extends SelectedPaymentInstrumentData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$NetBankingData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$NetBankingData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NetBankingData> serializer() {
                return SelectedPaymentInstrumentData$NetBankingData$$serializer.f1332a;
            }
        }

        public /* synthetic */ NetBankingData(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(SelectedPaymentInstrumentData$NetBankingData$$serializer.f1332a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetBankingData) && Intrinsics.d(this.b, ((NetBankingData) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("NetBankingData(bankCode=", this.b, ")");
        }

        public NetBankingData(String bankCode) {
            Intrinsics.i(bankCode, "bankCode");
            this.b = bankCode;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$WalletData;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class WalletData extends SelectedPaymentInstrumentData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$WalletData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/SelectedPaymentInstrumentData$WalletData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<WalletData> serializer() {
                return SelectedPaymentInstrumentData$WalletData$$serializer.f1334a;
            }
        }

        public /* synthetic */ WalletData(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(SelectedPaymentInstrumentData$WalletData$$serializer.f1334a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WalletData) && Intrinsics.d(this.b, ((WalletData) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("WalletData(walletName=", this.b, ")");
        }

        public WalletData(String walletName) {
            Intrinsics.i(walletName, "walletName");
            this.b = walletName;
        }
    }
}
