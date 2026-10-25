package app.chalo.homescreen.data.model.app;

import defpackage.b3;
import defpackage.hz0;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData;", "", "Companion", "PayForTicket", "Passes", "CardRecharge", "Metro", "ImageResource", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$CardRecharge;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$ImageResource;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$Metro;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$Passes;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$PayForTicket;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class QuickPaymentsSectionData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3787a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(7));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<QuickPaymentsSectionData> serializer() {
            return (KSerializer) QuickPaymentsSectionData.f3787a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$CardRecharge;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CardRecharge extends QuickPaymentsSectionData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final RechargeCardAppModel b;
        public final boolean c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$CardRecharge$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$CardRecharge;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CardRecharge> serializer() {
                return QuickPaymentsSectionData$CardRecharge$$serializer.f3788a;
            }
        }

        public /* synthetic */ CardRecharge(int i, RechargeCardAppModel rechargeCardAppModel, boolean z) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(QuickPaymentsSectionData$CardRecharge$$serializer.f3788a.getDescriptor(), i, 1);
                throw null;
            }
            this.b = rechargeCardAppModel;
            if ((i & 2) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardRecharge)) {
                return false;
            }
            CardRecharge cardRecharge = (CardRecharge) obj;
            return Intrinsics.d(this.b, cardRecharge.b) && this.c == cardRecharge.c;
        }

        public final int hashCode() {
            return (this.b.hashCode() * 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            return "CardRecharge(rechargeCardData=" + this.b + ", isFullWidth=" + this.c + ")";
        }

        public CardRecharge(RechargeCardAppModel rechargeCardAppModel, boolean z) {
            this.b = rechargeCardAppModel;
            this.c = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$Metro;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Metro extends QuickPaymentsSectionData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final MetroCardAppModel b;
        public final boolean c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$Metro$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$Metro;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Metro> serializer() {
                return QuickPaymentsSectionData$Metro$$serializer.f3790a;
            }
        }

        public /* synthetic */ Metro(int i, MetroCardAppModel metroCardAppModel, boolean z) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(QuickPaymentsSectionData$Metro$$serializer.f3790a.getDescriptor(), i, 1);
                throw null;
            }
            this.b = metroCardAppModel;
            if ((i & 2) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metro)) {
                return false;
            }
            Metro metro = (Metro) obj;
            return Intrinsics.d(this.b, metro.b) && this.c == metro.c;
        }

        public final int hashCode() {
            return (this.b.hashCode() * 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            return "Metro(metroCardData=" + this.b + ", isFullWidth=" + this.c + ")";
        }

        public Metro(MetroCardAppModel metroCardAppModel, boolean z) {
            this.b = metroCardAppModel;
            this.c = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$Passes;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Passes extends QuickPaymentsSectionData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(9)), null};
        public final ProductPurchaseSectionAppModel b;
        public final RegularBusPageFeature c;
        public final boolean d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$Passes$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$Passes;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Passes> serializer() {
                return QuickPaymentsSectionData$Passes$$serializer.f3791a;
            }
        }

        public /* synthetic */ Passes(int i, ProductPurchaseSectionAppModel productPurchaseSectionAppModel, RegularBusPageFeature regularBusPageFeature, boolean z) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(QuickPaymentsSectionData$Passes$$serializer.f3791a.getDescriptor(), i, 3);
                throw null;
            }
            this.b = productPurchaseSectionAppModel;
            this.c = regularBusPageFeature;
            if ((i & 4) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Passes)) {
                return false;
            }
            Passes passes = (Passes) obj;
            return Intrinsics.d(this.b, passes.b) && this.c == passes.c && this.d == passes.d;
        }

        public final int hashCode() {
            return ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31) + (this.d ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Passes(passesSectionData=");
            sb.append(this.b);
            sb.append(", featureType=");
            sb.append(this.c);
            sb.append(", isFullWidth=");
            return b3.g(")", sb, this.d);
        }

        public Passes(ProductPurchaseSectionAppModel productPurchaseSectionAppModel, RegularBusPageFeature featureType, boolean z) {
            Intrinsics.i(featureType, "featureType");
            this.b = productPurchaseSectionAppModel;
            this.c = featureType;
            this.d = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$PayForTicket;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PayForTicket extends QuickPaymentsSectionData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final PayForTicketCardAppModel b;
        public final boolean c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$PayForTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$PayForTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PayForTicket> serializer() {
                return QuickPaymentsSectionData$PayForTicket$$serializer.f3792a;
            }
        }

        public /* synthetic */ PayForTicket(int i, PayForTicketCardAppModel payForTicketCardAppModel, boolean z) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(QuickPaymentsSectionData$PayForTicket$$serializer.f3792a.getDescriptor(), i, 1);
                throw null;
            }
            this.b = payForTicketCardAppModel;
            if ((i & 2) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayForTicket)) {
                return false;
            }
            PayForTicket payForTicket = (PayForTicket) obj;
            return Intrinsics.d(this.b, payForTicket.b) && this.c == payForTicket.c;
        }

        public final int hashCode() {
            return (this.b.hashCode() * 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            return "PayForTicket(payForTicketCardData=" + this.b + ", isFullWidth=" + this.c + ")";
        }

        public PayForTicket(PayForTicketCardAppModel payForTicketCardAppModel, boolean z) {
            this.b = payForTicketCardAppModel;
            this.c = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$ImageResource;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ImageResource extends QuickPaymentsSectionData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(8)), null};
        public final ImageResourceSectionAppModel b;
        public final RegularBusPageFeature c;
        public final boolean d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$ImageResource$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$ImageResource;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ImageResource> serializer() {
                return QuickPaymentsSectionData$ImageResource$$serializer.f3789a;
            }
        }

        public ImageResource(ImageResourceSectionAppModel imageResourceSectionAppModel, RegularBusPageFeature featureType) {
            Intrinsics.i(featureType, "featureType");
            this.b = imageResourceSectionAppModel;
            this.c = featureType;
            this.d = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageResource)) {
                return false;
            }
            ImageResource imageResource = (ImageResource) obj;
            return Intrinsics.d(this.b, imageResource.b) && this.c == imageResource.c && this.d == imageResource.d;
        }

        public final int hashCode() {
            return ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31) + (this.d ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageResource(imageResource=");
            sb.append(this.b);
            sb.append(", featureType=");
            sb.append(this.c);
            sb.append(", isFullWidth=");
            return b3.g(")", sb, this.d);
        }

        public /* synthetic */ ImageResource(int i, ImageResourceSectionAppModel imageResourceSectionAppModel, RegularBusPageFeature regularBusPageFeature, boolean z) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(QuickPaymentsSectionData$ImageResource$$serializer.f3789a.getDescriptor(), i, 3);
                throw null;
            }
            this.b = imageResourceSectionAppModel;
            this.c = regularBusPageFeature;
            if ((i & 4) == 0) {
                this.d = true;
            } else {
                this.d = z;
            }
        }
    }
}
