package app.chalo.models.validation;

import app.chalo.utils.ChaloWalletOrderIdUtils;
import defpackage.vo1;
import defpackage.yn1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct;", "", "Companion", "SuperPassProduct", "MobileTicketProduct", "QuickpayProduct", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct;", "Lapp/chalo/models/validation/ValidationProduct$QuickpayProduct;", "Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class ValidationProduct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5710a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(9));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static ValidationProduct a(String productType, String productSubtype, String bookingId, String str, Long l) {
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubtype, "productSubtype");
            Intrinsics.i(bookingId, "bookingId");
            switch (productType.hashCode()) {
                case -1066391653:
                    if (!productType.equals("quickpay") || !productSubtype.equals("quickpay")) {
                        return null;
                    }
                    if (bookingId.length() != 0) {
                        return new QuickpayProduct.QuickpayValidation(bookingId);
                    }
                    if (str == null || l == null) {
                        return null;
                    }
                    return new QuickpayProduct.QuickpayValidation(ChaloWalletOrderIdUtils.a(l.longValue(), str));
                case -677570684:
                    if (productType.equals("singleJourneyTicket") && productSubtype.equals("singleJourneyTicket")) {
                        return new MobileTicketProduct.SingleJourneyTicketValidation(bookingId);
                    }
                    return null;
                case -332983764:
                    if (!productType.equals("superPass")) {
                        return null;
                    }
                    if (productSubtype.equals("magicPass")) {
                        return new SuperPassProduct.MagicPassValidation(bookingId);
                    }
                    if (productSubtype.equals("rideBasedPass")) {
                        return new SuperPassProduct.RideBasedPassValidation(bookingId);
                    }
                    return null;
                case 1897752142:
                    if (!productType.equals("mobileTicket")) {
                        return null;
                    }
                    switch (productSubtype.hashCode()) {
                        case -2092080864:
                            if (productSubtype.equals("multiModalTicket")) {
                                return new MobileTicketProduct.MultiModalGroupTicketValidation(bookingId);
                            }
                            return null;
                        case -1555788335:
                            if (productSubtype.equals("premiumReserveTicket")) {
                                return new MobileTicketProduct.PremiumReserveTicketValidation(bookingId);
                            }
                            return null;
                        case -1128067707:
                            if (productSubtype.equals("metroTicket")) {
                                return new MobileTicketProduct.MetroTicketValidation(bookingId);
                            }
                            return null;
                        case 342216781:
                            if (productSubtype.equals("instantTicket")) {
                                return new MobileTicketProduct.InstantTicketValidation(bookingId);
                            }
                            return null;
                        case 1066108746:
                            if (productSubtype.equals("ondcTicket")) {
                                return new MobileTicketProduct.OndcTicketValidation(bookingId);
                            }
                            return null;
                        case 1216210951:
                            if (productSubtype.equals("ondcMetroTicket")) {
                                return new MobileTicketProduct.OndcMetroTicketValidation(bookingId);
                            }
                            return null;
                        default:
                            return null;
                    }
                default:
                    return null;
            }
        }

        public static /* synthetic */ ValidationProduct b(Companion companion, String str, String str2, String str3) {
            companion.getClass();
            return a(str, str2, str3, null, null);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ValidationProduct> serializer() {
            return (KSerializer) ValidationProduct.f5710a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct;", "Lapp/chalo/models/validation/ValidationProduct;", "Companion", "SingleJourneyTicketValidation", "InstantTicketValidation", "PremiumReserveTicketValidation", "OndcTicketValidation", "OndcMetroTicketValidation", "MetroTicketValidation", "MultiModalGroupTicketValidation", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$InstantTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$MetroTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$MultiModalGroupTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$OndcMetroTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$OndcTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$PremiumReserveTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$SingleJourneyTicketValidation;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class MobileTicketProduct extends ValidationProduct {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(10));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<MobileTicketProduct> serializer() {
                return (KSerializer) MobileTicketProduct.b.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$InstantTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class InstantTicketValidation extends MobileTicketProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$InstantTicketValidation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$InstantTicketValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<InstantTicketValidation> serializer() {
                    return ValidationProduct$MobileTicketProduct$InstantTicketValidation$$serializer.f5711a;
                }
            }

            public /* synthetic */ InstantTicketValidation(int i, String str) {
                if (1 == (i & 1)) {
                    this.c = str;
                } else {
                    PluginExceptionsKt.b(ValidationProduct$MobileTicketProduct$InstantTicketValidation$$serializer.f5711a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.models.validation.ValidationProduct
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getC() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InstantTicketValidation) && Intrinsics.d(this.c, ((InstantTicketValidation) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return vo1.B("InstantTicketValidation(bookingId=", this.c, ")");
            }

            public InstantTicketValidation(String bookingId) {
                Intrinsics.i(bookingId, "bookingId");
                this.c = bookingId;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$MetroTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class MetroTicketValidation extends MobileTicketProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$MetroTicketValidation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$MetroTicketValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<MetroTicketValidation> serializer() {
                    return ValidationProduct$MobileTicketProduct$MetroTicketValidation$$serializer.f5712a;
                }
            }

            public /* synthetic */ MetroTicketValidation(int i, String str) {
                if (1 == (i & 1)) {
                    this.c = str;
                } else {
                    PluginExceptionsKt.b(ValidationProduct$MobileTicketProduct$MetroTicketValidation$$serializer.f5712a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.models.validation.ValidationProduct
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getC() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MetroTicketValidation) && Intrinsics.d(this.c, ((MetroTicketValidation) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return vo1.B("MetroTicketValidation(bookingId=", this.c, ")");
            }

            public MetroTicketValidation(String bookingId) {
                Intrinsics.i(bookingId, "bookingId");
                this.c = bookingId;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$MultiModalGroupTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class MultiModalGroupTicketValidation extends MobileTicketProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$MultiModalGroupTicketValidation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$MultiModalGroupTicketValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<MultiModalGroupTicketValidation> serializer() {
                    return ValidationProduct$MobileTicketProduct$MultiModalGroupTicketValidation$$serializer.f5713a;
                }
            }

            public /* synthetic */ MultiModalGroupTicketValidation(int i, String str) {
                if (1 == (i & 1)) {
                    this.c = str;
                } else {
                    PluginExceptionsKt.b(ValidationProduct$MobileTicketProduct$MultiModalGroupTicketValidation$$serializer.f5713a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.models.validation.ValidationProduct
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getC() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MultiModalGroupTicketValidation) && Intrinsics.d(this.c, ((MultiModalGroupTicketValidation) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return vo1.B("MultiModalGroupTicketValidation(bookingId=", this.c, ")");
            }

            public MultiModalGroupTicketValidation(String bookingId) {
                Intrinsics.i(bookingId, "bookingId");
                this.c = bookingId;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$OndcMetroTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class OndcMetroTicketValidation extends MobileTicketProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$OndcMetroTicketValidation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$OndcMetroTicketValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<OndcMetroTicketValidation> serializer() {
                    return ValidationProduct$MobileTicketProduct$OndcMetroTicketValidation$$serializer.f5714a;
                }
            }

            public /* synthetic */ OndcMetroTicketValidation(int i, String str) {
                if (1 == (i & 1)) {
                    this.c = str;
                } else {
                    PluginExceptionsKt.b(ValidationProduct$MobileTicketProduct$OndcMetroTicketValidation$$serializer.f5714a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.models.validation.ValidationProduct
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getC() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OndcMetroTicketValidation) && Intrinsics.d(this.c, ((OndcMetroTicketValidation) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return vo1.B("OndcMetroTicketValidation(bookingId=", this.c, ")");
            }

            public OndcMetroTicketValidation(String bookingId) {
                Intrinsics.i(bookingId, "bookingId");
                this.c = bookingId;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$OndcTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class OndcTicketValidation extends MobileTicketProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$OndcTicketValidation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$OndcTicketValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<OndcTicketValidation> serializer() {
                    return ValidationProduct$MobileTicketProduct$OndcTicketValidation$$serializer.f5715a;
                }
            }

            public /* synthetic */ OndcTicketValidation(int i, String str) {
                if (1 == (i & 1)) {
                    this.c = str;
                } else {
                    PluginExceptionsKt.b(ValidationProduct$MobileTicketProduct$OndcTicketValidation$$serializer.f5715a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.models.validation.ValidationProduct
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getC() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OndcTicketValidation) && Intrinsics.d(this.c, ((OndcTicketValidation) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return vo1.B("OndcTicketValidation(bookingId=", this.c, ")");
            }

            public OndcTicketValidation(String bookingId) {
                Intrinsics.i(bookingId, "bookingId");
                this.c = bookingId;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$PremiumReserveTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class PremiumReserveTicketValidation extends MobileTicketProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$PremiumReserveTicketValidation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$PremiumReserveTicketValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<PremiumReserveTicketValidation> serializer() {
                    return ValidationProduct$MobileTicketProduct$PremiumReserveTicketValidation$$serializer.f5716a;
                }
            }

            public /* synthetic */ PremiumReserveTicketValidation(int i, String str) {
                if (1 == (i & 1)) {
                    this.c = str;
                } else {
                    PluginExceptionsKt.b(ValidationProduct$MobileTicketProduct$PremiumReserveTicketValidation$$serializer.f5716a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.models.validation.ValidationProduct
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getC() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumReserveTicketValidation) && Intrinsics.d(this.c, ((PremiumReserveTicketValidation) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return vo1.B("PremiumReserveTicketValidation(bookingId=", this.c, ")");
            }

            public PremiumReserveTicketValidation(String bookingId) {
                Intrinsics.i(bookingId, "bookingId");
                this.c = bookingId;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$SingleJourneyTicketValidation;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class SingleJourneyTicketValidation extends MobileTicketProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$SingleJourneyTicketValidation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$MobileTicketProduct$SingleJourneyTicketValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<SingleJourneyTicketValidation> serializer() {
                    return ValidationProduct$MobileTicketProduct$SingleJourneyTicketValidation$$serializer.f5717a;
                }
            }

            public /* synthetic */ SingleJourneyTicketValidation(int i, String str) {
                if (1 == (i & 1)) {
                    this.c = str;
                } else {
                    PluginExceptionsKt.b(ValidationProduct$MobileTicketProduct$SingleJourneyTicketValidation$$serializer.f5717a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.models.validation.ValidationProduct
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getC() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SingleJourneyTicketValidation) && Intrinsics.d(this.c, ((SingleJourneyTicketValidation) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return vo1.B("SingleJourneyTicketValidation(bookingId=", this.c, ")");
            }

            public SingleJourneyTicketValidation(String bookingId) {
                Intrinsics.i(bookingId, "bookingId");
                this.c = bookingId;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$QuickpayProduct;", "Lapp/chalo/models/validation/ValidationProduct;", "Companion", "QuickpayValidation", "Lapp/chalo/models/validation/ValidationProduct$QuickpayProduct$QuickpayValidation;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class QuickpayProduct extends ValidationProduct {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(11));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$QuickpayProduct$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$QuickpayProduct;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<QuickpayProduct> serializer() {
                return (KSerializer) QuickpayProduct.b.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$QuickpayProduct$QuickpayValidation;", "Lapp/chalo/models/validation/ValidationProduct$QuickpayProduct;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class QuickpayValidation extends QuickpayProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$QuickpayProduct$QuickpayValidation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$QuickpayProduct$QuickpayValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<QuickpayValidation> serializer() {
                    return ValidationProduct$QuickpayProduct$QuickpayValidation$$serializer.f5718a;
                }
            }

            public /* synthetic */ QuickpayValidation(int i, String str) {
                if (1 == (i & 1)) {
                    this.c = str;
                } else {
                    PluginExceptionsKt.b(ValidationProduct$QuickpayProduct$QuickpayValidation$$serializer.f5718a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.models.validation.ValidationProduct
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getC() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof QuickpayValidation) && Intrinsics.d(this.c, ((QuickpayValidation) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return vo1.B("QuickpayValidation(orderId=", this.c, ")");
            }

            public QuickpayValidation(String orderId) {
                Intrinsics.i(orderId, "orderId");
                this.c = orderId;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct;", "Lapp/chalo/models/validation/ValidationProduct;", "Companion", "RideBasedPassValidation", "MagicPassValidation", "Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct$MagicPassValidation;", "Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct$RideBasedPassValidation;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class SuperPassProduct extends ValidationProduct {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(12));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<SuperPassProduct> serializer() {
                return (KSerializer) SuperPassProduct.b.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct$MagicPassValidation;", "Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class MagicPassValidation extends SuperPassProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct$MagicPassValidation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct$MagicPassValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<MagicPassValidation> serializer() {
                    return ValidationProduct$SuperPassProduct$MagicPassValidation$$serializer.f5719a;
                }
            }

            public /* synthetic */ MagicPassValidation(int i, String str) {
                if (1 == (i & 1)) {
                    this.c = str;
                } else {
                    PluginExceptionsKt.b(ValidationProduct$SuperPassProduct$MagicPassValidation$$serializer.f5719a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.models.validation.ValidationProduct
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getC() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MagicPassValidation) && Intrinsics.d(this.c, ((MagicPassValidation) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return vo1.B("MagicPassValidation(bookingId=", this.c, ")");
            }

            public MagicPassValidation(String bookingId) {
                Intrinsics.i(bookingId, "bookingId");
                this.c = bookingId;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct$RideBasedPassValidation;", "Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class RideBasedPassValidation extends SuperPassProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct$RideBasedPassValidation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProduct$SuperPassProduct$RideBasedPassValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<RideBasedPassValidation> serializer() {
                    return ValidationProduct$SuperPassProduct$RideBasedPassValidation$$serializer.f5720a;
                }
            }

            public /* synthetic */ RideBasedPassValidation(int i, String str) {
                if (1 == (i & 1)) {
                    this.c = str;
                } else {
                    PluginExceptionsKt.b(ValidationProduct$SuperPassProduct$RideBasedPassValidation$$serializer.f5720a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            @Override // app.chalo.models.validation.ValidationProduct
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getC() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RideBasedPassValidation) && Intrinsics.d(this.c, ((RideBasedPassValidation) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return vo1.B("RideBasedPassValidation(bookingId=", this.c, ")");
            }

            public RideBasedPassValidation(String bookingId) {
                Intrinsics.i(bookingId, "bookingId");
                this.c = bookingId;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String getC();
}
