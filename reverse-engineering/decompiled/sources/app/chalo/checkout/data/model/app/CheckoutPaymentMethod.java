package app.chalo.checkout.data.model.app;

import androidx.webkit.Profile;
import defpackage.go;
import defpackage.ul;
import defpackage.vo1;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod;", "", "Companion", "Inai", "RazorPay", "PhonePe", "ChaloPay", "ClosedLoopWallet", "JuspayTurboUpi", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$ChaloPay;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$ClosedLoopWallet;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$JuspayTurboUpi;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class CheckoutPaymentMethod {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1276a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(25));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$ChaloPay;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class ChaloPay extends CheckoutPaymentMethod {
        public static final ChaloPay INSTANCE = new ChaloPay();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(26));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ChaloPay> serializer() {
            return (KSerializer) b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$ClosedLoopWallet;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class ClosedLoopWallet extends CheckoutPaymentMethod {
        public static final ClosedLoopWallet INSTANCE = new ClosedLoopWallet();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(27));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ClosedLoopWallet> serializer() {
            return (KSerializer) b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<CheckoutPaymentMethod> serializer() {
            return (KSerializer) CheckoutPaymentMethod.f1276a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$JuspayTurboUpi;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class JuspayTurboUpi extends CheckoutPaymentMethod {
        public static final JuspayTurboUpi INSTANCE = new JuspayTurboUpi();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(5));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<JuspayTurboUpi> serializer() {
            return (KSerializer) b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod;", "Companion", "Card", "Upi", "NetBanking", "Unknown", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe$Card;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe$NetBanking;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe$Unknown;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe$Upi;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class PhonePe extends CheckoutPaymentMethod {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(6));
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe$Card;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Card extends PhonePe {
            public static final Card INSTANCE = new Card("card");
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(7));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Card> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<PhonePe> serializer() {
                return (KSerializer) PhonePe.c.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe$NetBanking;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class NetBanking extends PhonePe {
            public static final NetBanking INSTANCE = new NetBanking("netbanking");
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(8));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<NetBanking> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe$Unknown;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Unknown extends PhonePe {
            public static final Unknown INSTANCE = new Unknown("unknown");
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(9));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Unknown> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe$Upi;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$PhonePe;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Upi extends PhonePe {
            public static final Upi INSTANCE = new Upi(PaymentConstants.WIDGET_UPI);
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(10));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Upi> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        public PhonePe(String str) {
            this.b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod;", "Companion", "Card", "Upi", "Wallet", "NetBanking", "Cash", "Lazypay", "Unknown", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Card;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Cash;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Lazypay;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$NetBanking;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Unknown;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Upi;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Wallet;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class RazorPay extends CheckoutPaymentMethod {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(11));
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Card;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Card extends RazorPay {
            public static final Card INSTANCE = new Card("card");
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(12));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Card> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Cash;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Cash extends RazorPay {
            public static final Cash INSTANCE = new Cash("cash");
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(13));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Cash> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<RazorPay> serializer() {
                return (KSerializer) RazorPay.c.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Lazypay;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Lazypay extends RazorPay {
            public static final Lazypay INSTANCE = new Lazypay("lazypay");
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(14));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Lazypay> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$NetBanking;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class NetBanking extends RazorPay {
            public static final NetBanking INSTANCE = new NetBanking("netbanking");
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(15));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<NetBanking> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Unknown;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Unknown extends RazorPay {
            public static final Unknown INSTANCE = new Unknown("unknown");
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(16));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Unknown> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Upi;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Upi extends RazorPay {
            public static final Upi INSTANCE = new Upi(PaymentConstants.WIDGET_UPI);
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(17));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Upi> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay$Wallet;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$RazorPay;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Wallet extends RazorPay {
            public static final Wallet INSTANCE = new Wallet("wallet");
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(18));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Wallet> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        public RazorPay(String str) {
            this.b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod;", "Companion", "Card", "Upi", "Wallet", "NetBanking", "Cash", "Lazypay", Profile.DEFAULT_PROFILE_NAME, "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Card;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Cash;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Default;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Lazypay;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$NetBanking;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Upi;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Wallet;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class Inai extends CheckoutPaymentMethod {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(28));
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Card;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Card extends Inai {
            public static final Card INSTANCE = new Card("card", 0);
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(29));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Card> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Cash;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Cash extends Inai {
            public static final Cash INSTANCE = new Cash("cash", 0);
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(0));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Cash> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Inai> serializer() {
                return (KSerializer) Inai.c.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Default;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai;", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Default extends Inai {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Default$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Default;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<Default> serializer() {
                    return CheckoutPaymentMethod$Inai$Default$$serializer.f1277a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Default(int i, String str, String str2) {
                super(str);
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(CheckoutPaymentMethod$Inai$Default$$serializer.f1277a.getDescriptor(), i, 3);
                    throw null;
                }
                this.d = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Default) && Intrinsics.d(this.d, ((Default) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return vo1.B("Default(newPaymentMethodCode=", this.d, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Default(String newPaymentMethodCode) {
                super(newPaymentMethodCode, 0);
                Intrinsics.i(newPaymentMethodCode, "newPaymentMethodCode");
                this.d = newPaymentMethodCode;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Lazypay;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Lazypay extends Inai {
            public static final Lazypay INSTANCE = new Lazypay("lazypay", 0);
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(1));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Lazypay> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$NetBanking;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class NetBanking extends Inai {
            public static final NetBanking INSTANCE = new NetBanking("netbanking", 0);
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(2));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<NetBanking> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Upi;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Upi extends Inai {
            public static final Upi INSTANCE = new Upi(PaymentConstants.WIDGET_UPI, 0);
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(3));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Upi> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai$Wallet;", "Lapp/chalo/checkout/data/model/app/CheckoutPaymentMethod$Inai;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class Wallet extends Inai {
            public static final Wallet INSTANCE = new Wallet("wallet", 0);
            public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(4));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<Wallet> serializer() {
                return (KSerializer) d.getValue();
            }
        }

        public /* synthetic */ Inai(String str) {
            this.b = str;
        }

        public Inai(String str, int i) {
            this.b = str;
        }
    }
}
