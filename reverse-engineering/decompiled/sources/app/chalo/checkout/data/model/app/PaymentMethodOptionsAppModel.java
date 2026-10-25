package app.chalo.checkout.data.model.app;

import defpackage.xp0;
import java.util.ArrayList;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel;", "", "Companion", "ChaloPay", "ClosedLoopWallet", "JuspayTurboUpi", "RazorPayPaymentMethodOption", "InaiPaymentMethodOption", "PhonePePaymentMethodOption", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$ChaloPay;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$ClosedLoopWallet;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$JuspayTurboUpi;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class PaymentMethodOptionsAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1297a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(10));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<PaymentMethodOptionsAppModel> serializer() {
            return (KSerializer) PaymentMethodOptionsAppModel.f1297a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel;", "Companion", "Generic", "Card", "LazyPay", "Cash", "UPI", "Wallet", "NetBanking", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Card;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Cash;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$LazyPay;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$NetBanking;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$UPI;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Wallet;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class InaiPaymentMethodOption extends PaymentMethodOptionsAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(11));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<InaiPaymentMethodOption> serializer() {
                return (KSerializer) InaiPaymentMethodOption.b.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Card;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Card extends InaiPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final PaymentDisplayDetailsAppModel c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Card$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Card;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<Card> serializer() {
                    return PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Card$$serializer.f1300a;
                }
            }

            public /* synthetic */ Card(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel) {
                if (1 == (i & 1)) {
                    this.c = paymentDisplayDetailsAppModel;
                } else {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Card$$serializer.f1300a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.Inai.Card.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Card) && Intrinsics.d(this.c, ((Card) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "Card(methodDisplayDetails=" + this.c + ")";
            }

            public Card(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel) {
                this.c = paymentDisplayDetailsAppModel;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Cash;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Cash extends InaiPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final PaymentDisplayDetailsAppModel c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Cash$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Cash;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<Cash> serializer() {
                    return PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Cash$$serializer.f1301a;
                }
            }

            public /* synthetic */ Cash(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel) {
                if (1 == (i & 1)) {
                    this.c = paymentDisplayDetailsAppModel;
                } else {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Cash$$serializer.f1301a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.Inai.Cash.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Cash) && Intrinsics.d(this.c, ((Cash) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "Cash(methodDisplayDetails=" + this.c + ")";
            }

            public Cash(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel) {
                this.c = paymentDisplayDetailsAppModel;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Generic extends InaiPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final PaymentDisplayDetailsAppModel c;
            public final String d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<Generic> serializer() {
                    return PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$$serializer.f1302a;
                }
            }

            public /* synthetic */ Generic(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, String str) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$$serializer.f1302a.getDescriptor(), i, 3);
                    throw null;
                }
                this.c = paymentDisplayDetailsAppModel;
                this.d = str;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getD() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) obj;
                return Intrinsics.d(this.c, generic.c) && Intrinsics.d(this.d, generic.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "Generic(methodDisplayDetails=" + this.c + ", paymentMethodCode=" + this.d + ")";
            }

            public Generic(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, String paymentMethodCode) {
                Intrinsics.i(paymentMethodCode, "paymentMethodCode");
                this.c = paymentDisplayDetailsAppModel;
                this.d = paymentMethodCode;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$LazyPay;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class LazyPay extends InaiPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final PaymentDisplayDetailsAppModel c;
            public final PaymentMethodEligibilityDetails d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$LazyPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$LazyPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<LazyPay> serializer() {
                    return PaymentMethodOptionsAppModel$InaiPaymentMethodOption$LazyPay$$serializer.f1303a;
                }
            }

            public /* synthetic */ LazyPay(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, PaymentMethodEligibilityDetails paymentMethodEligibilityDetails) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$InaiPaymentMethodOption$LazyPay$$serializer.f1303a.getDescriptor(), i, 3);
                    throw null;
                }
                this.c = paymentDisplayDetailsAppModel;
                this.d = paymentMethodEligibilityDetails;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.Inai.Lazypay.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LazyPay)) {
                    return false;
                }
                LazyPay lazyPay = (LazyPay) obj;
                return Intrinsics.d(this.c, lazyPay.c) && Intrinsics.d(this.d, lazyPay.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "LazyPay(methodDisplayDetails=" + this.c + ", methodEligibility=" + this.d + ")";
            }

            public LazyPay(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, PaymentMethodEligibilityDetails paymentMethodEligibilityDetails) {
                this.c = paymentDisplayDetailsAppModel;
                this.d = paymentMethodEligibilityDetails;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$NetBanking;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class NetBanking extends InaiPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(12))};
            public final PaymentDisplayDetailsAppModel c;
            public final List d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$NetBanking$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$NetBanking;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<NetBanking> serializer() {
                    return PaymentMethodOptionsAppModel$InaiPaymentMethodOption$NetBanking$$serializer.f1304a;
                }
            }

            public /* synthetic */ NetBanking(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, List list) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$InaiPaymentMethodOption$NetBanking$$serializer.f1304a.getDescriptor(), i, 3);
                    throw null;
                }
                this.c = paymentDisplayDetailsAppModel;
                this.d = list;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.Inai.NetBanking.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NetBanking)) {
                    return false;
                }
                NetBanking netBanking = (NetBanking) obj;
                return Intrinsics.d(this.c, netBanking.c) && Intrinsics.d(this.d, netBanking.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "NetBanking(methodDisplayDetails=" + this.c + ", paymentInstruments=" + this.d + ")";
            }

            public NetBanking(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, List paymentInstruments) {
                Intrinsics.i(paymentInstruments, "paymentInstruments");
                this.c = paymentDisplayDetailsAppModel;
                this.d = paymentInstruments;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$UPI;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class UPI extends InaiPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(13))};
            public final PaymentDisplayDetailsAppModel c;
            public final List d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$UPI$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$UPI;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<UPI> serializer() {
                    return PaymentMethodOptionsAppModel$InaiPaymentMethodOption$UPI$$serializer.f1305a;
                }
            }

            public /* synthetic */ UPI(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, List list) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$InaiPaymentMethodOption$UPI$$serializer.f1305a.getDescriptor(), i, 3);
                    throw null;
                }
                this.c = paymentDisplayDetailsAppModel;
                this.d = list;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.Inai.Upi.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UPI)) {
                    return false;
                }
                UPI upi = (UPI) obj;
                return Intrinsics.d(this.c, upi.c) && Intrinsics.d(this.d, upi.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "UPI(methodDisplayDetails=" + this.c + ", paymentInstruments=" + this.d + ")";
            }

            public UPI(PaymentDisplayDetailsAppModel methodDisplayDetails, List paymentInstruments) {
                Intrinsics.i(methodDisplayDetails, "methodDisplayDetails");
                Intrinsics.i(paymentInstruments, "paymentInstruments");
                this.c = methodDisplayDetails;
                this.d = paymentInstruments;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Wallet;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Wallet extends InaiPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(14))};
            public final PaymentDisplayDetailsAppModel c;
            public final List d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Wallet$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Wallet;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<Wallet> serializer() {
                    return PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Wallet$$serializer.f1306a;
                }
            }

            public /* synthetic */ Wallet(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, List list) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Wallet$$serializer.f1306a.getDescriptor(), i, 3);
                    throw null;
                }
                this.c = paymentDisplayDetailsAppModel;
                this.d = list;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.Inai.Wallet.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Wallet)) {
                    return false;
                }
                Wallet wallet = (Wallet) obj;
                return Intrinsics.d(this.c, wallet.c) && Intrinsics.d(this.d, wallet.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "Wallet(methodDisplayDetails=" + this.c + ", paymentInstruments=" + this.d + ")";
            }

            public Wallet(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, List paymentInstruments) {
                Intrinsics.i(paymentInstruments, "paymentInstruments");
                this.c = paymentDisplayDetailsAppModel;
                this.d = paymentInstruments;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel;", "Companion", "Card", "UPI", "NetBanking", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$Card;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$NetBanking;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$UPI;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class PhonePePaymentMethodOption extends PaymentMethodOptionsAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(15));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<PhonePePaymentMethodOption> serializer() {
                return (KSerializer) PhonePePaymentMethodOption.b.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$Card;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Card extends PhonePePaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final PaymentDisplayDetailsAppModel c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$Card$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$Card;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<Card> serializer() {
                    return PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$Card$$serializer.f1308a;
                }
            }

            public /* synthetic */ Card(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel) {
                if (1 == (i & 1)) {
                    this.c = paymentDisplayDetailsAppModel;
                } else {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$Card$$serializer.f1308a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.PhonePe.Card.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Card) && Intrinsics.d(this.c, ((Card) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "Card(methodDisplayDetails=" + this.c + ")";
            }

            public Card(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel) {
                this.c = paymentDisplayDetailsAppModel;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$NetBanking;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class NetBanking extends PhonePePaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(16))};
            public final PaymentDisplayDetailsAppModel c;
            public final List d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$NetBanking$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$NetBanking;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<NetBanking> serializer() {
                    return PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$NetBanking$$serializer.f1309a;
                }
            }

            public /* synthetic */ NetBanking(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, List list) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$NetBanking$$serializer.f1309a.getDescriptor(), i, 3);
                    throw null;
                }
                this.c = paymentDisplayDetailsAppModel;
                this.d = list;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.PhonePe.NetBanking.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NetBanking)) {
                    return false;
                }
                NetBanking netBanking = (NetBanking) obj;
                return Intrinsics.d(this.c, netBanking.c) && Intrinsics.d(this.d, netBanking.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "NetBanking(methodDisplayDetails=" + this.c + ", paymentInstruments=" + this.d + ")";
            }

            public NetBanking(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, ArrayList arrayList) {
                this.c = paymentDisplayDetailsAppModel;
                this.d = arrayList;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$UPI;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class UPI extends PhonePePaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(17))};
            public final PaymentDisplayDetailsAppModel c;
            public final List d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$UPI$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$UPI;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<UPI> serializer() {
                    return PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$UPI$$serializer.f1310a;
                }
            }

            public /* synthetic */ UPI(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, List list) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$UPI$$serializer.f1310a.getDescriptor(), i, 3);
                    throw null;
                }
                this.c = paymentDisplayDetailsAppModel;
                this.d = list;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.PhonePe.Upi.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UPI)) {
                    return false;
                }
                UPI upi = (UPI) obj;
                return Intrinsics.d(this.c, upi.c) && Intrinsics.d(this.d, upi.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "UPI(methodDisplayDetails=" + this.c + ", paymentInstruments=" + this.d + ")";
            }

            public UPI(PaymentDisplayDetailsAppModel methodDisplayDetails, List paymentInstruments) {
                Intrinsics.i(methodDisplayDetails, "methodDisplayDetails");
                Intrinsics.i(paymentInstruments, "paymentInstruments");
                this.c = methodDisplayDetails;
                this.d = paymentInstruments;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel;", "Companion", "LazyPay", "Card", "Cash", "UPI", "Wallet", "NetBanking", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Card;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Cash;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$LazyPay;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$NetBanking;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$UPI;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Wallet;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class RazorPayPaymentMethodOption extends PaymentMethodOptionsAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(18));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<RazorPayPaymentMethodOption> serializer() {
                return (KSerializer) RazorPayPaymentMethodOption.b.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Card;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Card extends RazorPayPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final PaymentDisplayDetailsAppModel c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Card$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Card;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<Card> serializer() {
                    return PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Card$$serializer.f1311a;
                }
            }

            public /* synthetic */ Card(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel) {
                if (1 == (i & 1)) {
                    this.c = paymentDisplayDetailsAppModel;
                } else {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Card$$serializer.f1311a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.RazorPay.Card.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Card) && Intrinsics.d(this.c, ((Card) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "Card(methodDisplayDetails=" + this.c + ")";
            }

            public Card(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel) {
                this.c = paymentDisplayDetailsAppModel;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Cash;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Cash extends RazorPayPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final PaymentDisplayDetailsAppModel c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Cash$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Cash;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<Cash> serializer() {
                    return PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Cash$$serializer.f1312a;
                }
            }

            public /* synthetic */ Cash(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel) {
                if (1 == (i & 1)) {
                    this.c = paymentDisplayDetailsAppModel;
                } else {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Cash$$serializer.f1312a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.RazorPay.Cash.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Cash) && Intrinsics.d(this.c, ((Cash) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "Cash(methodDisplayDetails=" + this.c + ")";
            }

            public Cash(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel) {
                this.c = paymentDisplayDetailsAppModel;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$LazyPay;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class LazyPay extends RazorPayPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final PaymentDisplayDetailsAppModel c;
            public final PaymentMethodEligibilityDetails d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$LazyPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$LazyPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<LazyPay> serializer() {
                    return PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$LazyPay$$serializer.f1313a;
                }
            }

            public /* synthetic */ LazyPay(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, PaymentMethodEligibilityDetails paymentMethodEligibilityDetails) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$LazyPay$$serializer.f1313a.getDescriptor(), i, 3);
                    throw null;
                }
                this.c = paymentDisplayDetailsAppModel;
                this.d = paymentMethodEligibilityDetails;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.RazorPay.Lazypay.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LazyPay)) {
                    return false;
                }
                LazyPay lazyPay = (LazyPay) obj;
                return Intrinsics.d(this.c, lazyPay.c) && Intrinsics.d(this.d, lazyPay.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "LazyPay(methodDisplayDetails=" + this.c + ", methodEligibility=" + this.d + ")";
            }

            public LazyPay(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, PaymentMethodEligibilityDetails paymentMethodEligibilityDetails) {
                this.c = paymentDisplayDetailsAppModel;
                this.d = paymentMethodEligibilityDetails;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$NetBanking;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class NetBanking extends RazorPayPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(19))};
            public final PaymentDisplayDetailsAppModel c;
            public final List d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$NetBanking$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$NetBanking;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<NetBanking> serializer() {
                    return PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$NetBanking$$serializer.f1314a;
                }
            }

            public /* synthetic */ NetBanking(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, List list) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$NetBanking$$serializer.f1314a.getDescriptor(), i, 3);
                    throw null;
                }
                this.c = paymentDisplayDetailsAppModel;
                this.d = list;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.RazorPay.NetBanking.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NetBanking)) {
                    return false;
                }
                NetBanking netBanking = (NetBanking) obj;
                return Intrinsics.d(this.c, netBanking.c) && Intrinsics.d(this.d, netBanking.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "NetBanking(methodDisplayDetails=" + this.c + ", paymentInstruments=" + this.d + ")";
            }

            public NetBanking(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, List paymentInstruments) {
                Intrinsics.i(paymentInstruments, "paymentInstruments");
                this.c = paymentDisplayDetailsAppModel;
                this.d = paymentInstruments;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$UPI;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class UPI extends RazorPayPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(20))};
            public final PaymentDisplayDetailsAppModel c;
            public final List d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$UPI$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$UPI;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<UPI> serializer() {
                    return PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$UPI$$serializer.f1315a;
                }
            }

            public /* synthetic */ UPI(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, List list) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$UPI$$serializer.f1315a.getDescriptor(), i, 3);
                    throw null;
                }
                this.c = paymentDisplayDetailsAppModel;
                this.d = list;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.RazorPay.Upi.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UPI)) {
                    return false;
                }
                UPI upi = (UPI) obj;
                return Intrinsics.d(this.c, upi.c) && Intrinsics.d(this.d, upi.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "UPI(methodDisplayDetails=" + this.c + ", paymentInstruments=" + this.d + ")";
            }

            public UPI(PaymentDisplayDetailsAppModel methodDisplayDetails, List paymentInstruments) {
                Intrinsics.i(methodDisplayDetails, "methodDisplayDetails");
                Intrinsics.i(paymentInstruments, "paymentInstruments");
                this.c = methodDisplayDetails;
                this.d = paymentInstruments;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Wallet;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Wallet extends RazorPayPaymentMethodOption {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(21))};
            public final PaymentDisplayDetailsAppModel c;
            public final List d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Wallet$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Wallet;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<Wallet> serializer() {
                    return PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Wallet$$serializer.f1316a;
                }
            }

            public /* synthetic */ Wallet(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, List list) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Wallet$$serializer.f1316a.getDescriptor(), i, 3);
                    throw null;
                }
                this.c = paymentDisplayDetailsAppModel;
                this.d = list;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentDisplayDetailsAppModel getC() {
                return this.c;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: b */
            public final ProviderDetailsAppModel getC() {
                return null;
            }

            @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
            /* JADX INFO: renamed from: c */
            public final String getD() {
                return CheckoutPaymentMethod.RazorPay.Wallet.INSTANCE.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Wallet)) {
                    return false;
                }
                Wallet wallet = (Wallet) obj;
                return Intrinsics.d(this.c, wallet.c) && Intrinsics.d(this.d, wallet.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "Wallet(methodDisplayDetails=" + this.c + ", paymentInstruments=" + this.d + ")";
            }

            public Wallet(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, List paymentInstruments) {
                Intrinsics.i(paymentInstruments, "paymentInstruments");
                this.c = paymentDisplayDetailsAppModel;
                this.d = paymentInstruments;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract PaymentDisplayDetailsAppModel getC();

    /* JADX INFO: renamed from: b */
    public abstract ProviderDetailsAppModel getC();

    /* JADX INFO: renamed from: c */
    public abstract String getD();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$ChaloPay;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ChaloPay extends PaymentMethodOptionsAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final PaymentDisplayDetailsAppModel b;
        public final ProviderDetailsAppModel c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$ChaloPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$ChaloPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ChaloPay> serializer() {
                return PaymentMethodOptionsAppModel$ChaloPay$$serializer.f1298a;
            }
        }

        public /* synthetic */ ChaloPay(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, ProviderDetailsAppModel providerDetailsAppModel) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(PaymentMethodOptionsAppModel$ChaloPay$$serializer.f1298a.getDescriptor(), i, 3);
                throw null;
            }
            this.b = paymentDisplayDetailsAppModel;
            this.c = providerDetailsAppModel;
        }

        @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentDisplayDetailsAppModel getC() {
            return this.b;
        }

        @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ProviderDetailsAppModel getC() {
            return this.c;
        }

        @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
        /* JADX INFO: renamed from: c */
        public final String getD() {
            CheckoutPaymentMethod.ChaloPay.INSTANCE.getClass();
            return "chalopay";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChaloPay)) {
                return false;
            }
            ChaloPay chaloPay = (ChaloPay) obj;
            return Intrinsics.d(this.b, chaloPay.b) && Intrinsics.d(this.c, chaloPay.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            ProviderDetailsAppModel providerDetailsAppModel = this.c;
            return iHashCode + (providerDetailsAppModel == null ? 0 : providerDetailsAppModel.hashCode());
        }

        public final String toString() {
            return "ChaloPay(methodDisplayDetails=" + this.b + ", methodProviderInfo=" + this.c + ")";
        }

        public ChaloPay(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, ProviderDetailsAppModel providerDetailsAppModel) {
            this.b = paymentDisplayDetailsAppModel;
            this.c = providerDetailsAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$ClosedLoopWallet;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ClosedLoopWallet extends PaymentMethodOptionsAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final PaymentDisplayDetailsAppModel b;
        public final ProviderDetailsAppModel c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$ClosedLoopWallet$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$ClosedLoopWallet;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ClosedLoopWallet> serializer() {
                return PaymentMethodOptionsAppModel$ClosedLoopWallet$$serializer.f1299a;
            }
        }

        public /* synthetic */ ClosedLoopWallet(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, ProviderDetailsAppModel providerDetailsAppModel) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(PaymentMethodOptionsAppModel$ClosedLoopWallet$$serializer.f1299a.getDescriptor(), i, 3);
                throw null;
            }
            this.b = paymentDisplayDetailsAppModel;
            this.c = providerDetailsAppModel;
        }

        @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentDisplayDetailsAppModel getC() {
            return this.b;
        }

        @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ProviderDetailsAppModel getC() {
            return this.c;
        }

        @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
        /* JADX INFO: renamed from: c */
        public final String getD() {
            CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE.getClass();
            return "cldw";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClosedLoopWallet)) {
                return false;
            }
            ClosedLoopWallet closedLoopWallet = (ClosedLoopWallet) obj;
            return Intrinsics.d(this.b, closedLoopWallet.b) && Intrinsics.d(this.c, closedLoopWallet.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            ProviderDetailsAppModel providerDetailsAppModel = this.c;
            return iHashCode + (providerDetailsAppModel == null ? 0 : providerDetailsAppModel.hashCode());
        }

        public final String toString() {
            return "ClosedLoopWallet(methodDisplayDetails=" + this.b + ", methodProviderInfo=" + this.c + ")";
        }

        public ClosedLoopWallet(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, ProviderDetailsAppModel providerDetailsAppModel) {
            this.b = paymentDisplayDetailsAppModel;
            this.c = providerDetailsAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$JuspayTurboUpi;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class JuspayTurboUpi extends PaymentMethodOptionsAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final PaymentDisplayDetailsAppModel b;
        public final ProviderDetailsAppModel c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$JuspayTurboUpi$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$JuspayTurboUpi;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<JuspayTurboUpi> serializer() {
                return PaymentMethodOptionsAppModel$JuspayTurboUpi$$serializer.f1307a;
            }
        }

        public /* synthetic */ JuspayTurboUpi(int i, PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, ProviderDetailsAppModel providerDetailsAppModel) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(PaymentMethodOptionsAppModel$JuspayTurboUpi$$serializer.f1307a.getDescriptor(), i, 3);
                throw null;
            }
            this.b = paymentDisplayDetailsAppModel;
            this.c = providerDetailsAppModel;
        }

        @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentDisplayDetailsAppModel getC() {
            return this.b;
        }

        @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ProviderDetailsAppModel getC() {
            return this.c;
        }

        @Override // app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel
        /* JADX INFO: renamed from: c */
        public final String getD() {
            CheckoutPaymentMethod.JuspayTurboUpi.INSTANCE.getClass();
            return "juspayTurboUpi";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JuspayTurboUpi)) {
                return false;
            }
            JuspayTurboUpi juspayTurboUpi = (JuspayTurboUpi) obj;
            return Intrinsics.d(this.b, juspayTurboUpi.b) && Intrinsics.d(this.c, juspayTurboUpi.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            ProviderDetailsAppModel providerDetailsAppModel = this.c;
            return iHashCode + (providerDetailsAppModel == null ? 0 : providerDetailsAppModel.hashCode());
        }

        public final String toString() {
            return "JuspayTurboUpi(methodDisplayDetails=" + this.b + ", methodProviderInfo=" + this.c + ")";
        }

        public JuspayTurboUpi(PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel, ProviderDetailsAppModel providerDetailsAppModel) {
            this.b = paymentDisplayDetailsAppModel;
            this.c = providerDetailsAppModel;
        }
    }
}
