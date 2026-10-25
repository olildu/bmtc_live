package app.chalo.homescreen.data.model.app;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.ji;
import defpackage.sf;
import defpackage.xs;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel;", "", "Companion", "PlotlineSection", "PremiumBusProductPurchaseSection", "CustomerSupportSection", "TicketsPassesSection", "Unknown", "PassPurchaseSection", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$CustomerSupportSection;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$PassPurchaseSection;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$PlotlineSection;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$PremiumBusProductPurchaseSection;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$TicketsPassesSection;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$Unknown;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class ChaloBusWidgetSectionAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;
    public static final Object f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3725a;
    public final int b;
    public final ChaloBusPageSectionType c;
    public final boolean d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ChaloBusWidgetSectionAppModel> serializer() {
            return (KSerializer) ChaloBusWidgetSectionAppModel.f.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$CustomerSupportSection;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CustomerSupportSection extends ChaloBusWidgetSectionAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final ChaloBusPageSectionType i;
        public final boolean j;
        public final CardSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$CustomerSupportSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$CustomerSupportSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CustomerSupportSection> serializer() {
                return ChaloBusWidgetSectionAppModel$CustomerSupportSection$$serializer.f3726a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new sf(26)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new sf(27)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CustomerSupportSection(int i, String str, int i2, ChaloBusPageSectionType chaloBusPageSectionType, boolean z, String str2, int i3, ChaloBusPageSectionType chaloBusPageSectionType2, boolean z2, CardSectionAppModel cardSectionAppModel) {
            super(str, i2, chaloBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(ChaloBusWidgetSectionAppModel$CustomerSupportSection$$serializer.f3726a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = chaloBusPageSectionType2;
            this.j = z2;
            this.k = cardSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomerSupportSection)) {
                return false;
            }
            CustomerSupportSection customerSupportSection = (CustomerSupportSection) obj;
            return Intrinsics.d(this.g, customerSupportSection.g) && this.h == customerSupportSection.h && this.i == customerSupportSection.i && this.j == customerSupportSection.j && Intrinsics.d(this.k, customerSupportSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "CustomerSupportSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", cardSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomerSupportSection(String widgetSectionId, int i, ChaloBusPageSectionType widgetSectionType, boolean z, CardSectionAppModel cardSectionAppModel) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
            this.k = cardSectionAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$PassPurchaseSection;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassPurchaseSection extends ChaloBusWidgetSectionAppModel {
        public final String g;
        public final int h;
        public final ChaloBusPageSectionType i;
        public final boolean j;
        public final CardSectionAppModel k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PassPurchaseSection(String widgetSectionId, int i, ChaloBusPageSectionType widgetSectionType, boolean z, CardSectionAppModel cardSectionAppModel) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
            this.k = cardSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassPurchaseSection)) {
                return false;
            }
            PassPurchaseSection passPurchaseSection = (PassPurchaseSection) obj;
            return Intrinsics.d(this.g, passPurchaseSection.g) && this.h == passPurchaseSection.h && this.i == passPurchaseSection.i && this.j == passPurchaseSection.j && Intrinsics.d(this.k, passPurchaseSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "PassPurchaseSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", cardSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$PlotlineSection;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PlotlineSection extends ChaloBusWidgetSectionAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final ChaloBusPageSectionType i;
        public final boolean j;
        public final PlotlineWidgetSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$PlotlineSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$PlotlineSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PlotlineSection> serializer() {
                return ChaloBusWidgetSectionAppModel$PlotlineSection$$serializer.f3727a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new sf(28)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new sf(29)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PlotlineSection(int i, String str, int i2, ChaloBusPageSectionType chaloBusPageSectionType, boolean z, String str2, int i3, ChaloBusPageSectionType chaloBusPageSectionType2, boolean z2, PlotlineWidgetSectionAppModel plotlineWidgetSectionAppModel) {
            super(str, i2, chaloBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(ChaloBusWidgetSectionAppModel$PlotlineSection$$serializer.f3727a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = chaloBusPageSectionType2;
            this.j = z2;
            this.k = plotlineWidgetSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlotlineSection)) {
                return false;
            }
            PlotlineSection plotlineSection = (PlotlineSection) obj;
            return Intrinsics.d(this.g, plotlineSection.g) && this.h == plotlineSection.h && this.i == plotlineSection.i && this.j == plotlineSection.j && Intrinsics.d(this.k, plotlineSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "PlotlineSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", plotlineWidgetSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlotlineSection(String widgetSectionId, int i, ChaloBusPageSectionType widgetSectionType, boolean z, PlotlineWidgetSectionAppModel plotlineWidgetSectionAppModel) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
            this.k = plotlineWidgetSectionAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$PremiumBusProductPurchaseSection;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PremiumBusProductPurchaseSection extends ChaloBusWidgetSectionAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final ChaloBusPageSectionType i;
        public final boolean j;
        public final ProductPurchaseSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$PremiumBusProductPurchaseSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$PremiumBusProductPurchaseSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PremiumBusProductPurchaseSection> serializer() {
                return ChaloBusWidgetSectionAppModel$PremiumBusProductPurchaseSection$$serializer.f3728a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new ji(0)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new ji(1)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PremiumBusProductPurchaseSection(int i, String str, int i2, ChaloBusPageSectionType chaloBusPageSectionType, boolean z, String str2, int i3, ChaloBusPageSectionType chaloBusPageSectionType2, boolean z2, ProductPurchaseSectionAppModel productPurchaseSectionAppModel) {
            super(str, i2, chaloBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(ChaloBusWidgetSectionAppModel$PremiumBusProductPurchaseSection$$serializer.f3728a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = chaloBusPageSectionType2;
            this.j = z2;
            this.k = productPurchaseSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBusProductPurchaseSection)) {
                return false;
            }
            PremiumBusProductPurchaseSection premiumBusProductPurchaseSection = (PremiumBusProductPurchaseSection) obj;
            return Intrinsics.d(this.g, premiumBusProductPurchaseSection.g) && this.h == premiumBusProductPurchaseSection.h && this.i == premiumBusProductPurchaseSection.i && this.j == premiumBusProductPurchaseSection.j && Intrinsics.d(this.k, premiumBusProductPurchaseSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "PremiumBusProductPurchaseSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", premiumBusProductPurchaseSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PremiumBusProductPurchaseSection(String widgetSectionId, int i, ChaloBusPageSectionType widgetSectionType, boolean z, ProductPurchaseSectionAppModel productPurchaseSectionAppModel) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
            this.k = productPurchaseSectionAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$TicketsPassesSection;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class TicketsPassesSection extends ChaloBusWidgetSectionAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final ChaloBusPageSectionType i;
        public final boolean j;
        public final CardSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$TicketsPassesSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$TicketsPassesSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<TicketsPassesSection> serializer() {
                return ChaloBusWidgetSectionAppModel$TicketsPassesSection$$serializer.f3729a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new ji(2)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new ji(3)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TicketsPassesSection(int i, String str, int i2, ChaloBusPageSectionType chaloBusPageSectionType, boolean z, String str2, int i3, ChaloBusPageSectionType chaloBusPageSectionType2, boolean z2, CardSectionAppModel cardSectionAppModel) {
            super(str, i2, chaloBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(ChaloBusWidgetSectionAppModel$TicketsPassesSection$$serializer.f3729a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = chaloBusPageSectionType2;
            this.j = z2;
            this.k = cardSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketsPassesSection)) {
                return false;
            }
            TicketsPassesSection ticketsPassesSection = (TicketsPassesSection) obj;
            return Intrinsics.d(this.g, ticketsPassesSection.g) && this.h == ticketsPassesSection.h && this.i == ticketsPassesSection.i && this.j == ticketsPassesSection.j && Intrinsics.d(this.k, ticketsPassesSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "TicketsPassesSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", cardSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketsPassesSection(String widgetSectionId, int i, ChaloBusPageSectionType widgetSectionType, boolean z, CardSectionAppModel cardSectionAppModel) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
            this.k = cardSectionAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$Unknown;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Unknown extends ChaloBusWidgetSectionAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] k;
        public final String g;
        public final int h;
        public final ChaloBusPageSectionType i;
        public final boolean j;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$Unknown$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/ChaloBusWidgetSectionAppModel$Unknown;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Unknown> serializer() {
                return ChaloBusWidgetSectionAppModel$Unknown$$serializer.f3730a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            k = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new ji(4)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new ji(5)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Unknown(int i, String str, int i2, ChaloBusPageSectionType chaloBusPageSectionType, boolean z, String str2, int i3, ChaloBusPageSectionType chaloBusPageSectionType2, boolean z2) {
            super(str, i2, chaloBusPageSectionType, z);
            if (255 != (i & 255)) {
                PluginExceptionsKt.b(ChaloBusWidgetSectionAppModel$Unknown$$serializer.f3730a.getDescriptor(), i, 255);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = chaloBusPageSectionType2;
            this.j = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) obj;
            return Intrinsics.d(this.g, unknown.g) && this.h == unknown.h && this.i == unknown.i && this.j == unknown.j;
        }

        public final int hashCode() {
            return ((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "Unknown(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String widgetSectionId, int i, ChaloBusPageSectionType widgetSectionType, boolean z) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new sf(24)), null};
        f = LazyKt.a(lazyThreadSafetyMode, new sf(25));
    }

    public /* synthetic */ ChaloBusWidgetSectionAppModel(String str, int i, ChaloBusPageSectionType chaloBusPageSectionType, boolean z) {
        this.f3725a = str;
        this.b = i;
        this.c = chaloBusPageSectionType;
        this.d = z;
    }

    public static final /* synthetic */ void a(ChaloBusWidgetSectionAppModel chaloBusWidgetSectionAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, chaloBusWidgetSectionAppModel.f3725a);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, chaloBusWidgetSectionAppModel.b);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) e[2].getValue(), chaloBusWidgetSectionAppModel.c);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, chaloBusWidgetSectionAppModel.d);
    }

    public ChaloBusWidgetSectionAppModel(String str, int i, ChaloBusPageSectionType chaloBusPageSectionType, boolean z, int i2) {
        this.f3725a = str;
        this.b = i;
        this.c = chaloBusPageSectionType;
        this.d = z;
    }
}
