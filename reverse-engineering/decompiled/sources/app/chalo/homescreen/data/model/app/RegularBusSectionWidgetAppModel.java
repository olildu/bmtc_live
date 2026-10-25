package app.chalo.homescreen.data.model.app;

import androidx.core.app.FrameMetricsAggregator;
import app.chalo.ads.UnifiedAdSlot;
import defpackage.b3;
import defpackage.u01;
import defpackage.x11;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0002\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "", "Companion", "PlotlineWidgetSection", "QuickPaymentsSection", "TicketPassesSection", "NearbyBusesSection", "NearbyStopsSection", "FAQSection", "RegularBusFooterSection", "DividerSection", "GamBannerAdSection", "RegularBusUnifiedAdSection", "ImageResourceSection", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$DividerSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$FAQSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$GamBannerAdSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$ImageResourceSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$NearbyBusesSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$NearbyStopsSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$PlotlineWidgetSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$QuickPaymentsSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$RegularBusFooterSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$RegularBusUnifiedAdSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$TicketPassesSection;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class RegularBusSectionWidgetAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;
    public static final Object f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3797a;
    public final int b;
    public final RegularBusPageSectionType c;
    public final boolean d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<RegularBusSectionWidgetAppModel> serializer() {
            return (KSerializer) RegularBusSectionWidgetAppModel.f.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$DividerSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class DividerSection extends RegularBusSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] k;
        public final String g;
        public final int h;
        public final RegularBusPageSectionType i;
        public final boolean j;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$DividerSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$DividerSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<DividerSection> serializer() {
                return RegularBusSectionWidgetAppModel$DividerSection$$serializer.f3798a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            k = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new u01(13)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new u01(14)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DividerSection(int i, String str, int i2, RegularBusPageSectionType regularBusPageSectionType, boolean z, String str2, int i3, RegularBusPageSectionType regularBusPageSectionType2, boolean z2) {
            super(str, i2, regularBusPageSectionType, z);
            if (255 != (i & 255)) {
                PluginExceptionsKt.b(RegularBusSectionWidgetAppModel$DividerSection$$serializer.f3798a.getDescriptor(), i, 255);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = regularBusPageSectionType2;
            this.j = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DividerSection)) {
                return false;
            }
            DividerSection dividerSection = (DividerSection) obj;
            return Intrinsics.d(this.g, dividerSection.g) && this.h == dividerSection.h && this.i == dividerSection.i && this.j == dividerSection.j;
        }

        public final int hashCode() {
            return ((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "DividerSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DividerSection(String widgetSectionId, int i, RegularBusPageSectionType widgetSectionType, boolean z) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$FAQSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class FAQSection extends RegularBusSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final RegularBusPageSectionType i;
        public final FAQSectionAppModel j;
        public final boolean k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$FAQSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$FAQSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<FAQSection> serializer() {
                return RegularBusSectionWidgetAppModel$FAQSection$$serializer.f3799a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new u01(15)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new u01(16)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FAQSection(int i, String str, int i2, RegularBusPageSectionType regularBusPageSectionType, boolean z, String str2, int i3, RegularBusPageSectionType regularBusPageSectionType2, FAQSectionAppModel fAQSectionAppModel, boolean z2) {
            super(str, i2, regularBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(RegularBusSectionWidgetAppModel$FAQSection$$serializer.f3799a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = regularBusPageSectionType2;
            this.j = fAQSectionAppModel;
            this.k = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FAQSection)) {
                return false;
            }
            FAQSection fAQSection = (FAQSection) obj;
            return Intrinsics.d(this.g, fAQSection.g) && this.h == fAQSection.h && this.i == fAQSection.i && Intrinsics.d(this.j, fAQSection.j) && this.k == fAQSection.k;
        }

        public final int hashCode() {
            return ((this.j.hashCode() + ((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31)) * 31) + (this.k ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "FAQSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", faqSectionAppModel=");
            sbM.append(this.j);
            sbM.append(", sectionShouldHighlight=");
            return b3.g(")", sbM, this.k);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FAQSection(String widgetSectionId, int i, RegularBusPageSectionType widgetSectionType, FAQSectionAppModel fAQSectionAppModel, boolean z) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = fAQSectionAppModel;
            this.k = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$GamBannerAdSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GamBannerAdSection extends RegularBusSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final RegularBusPageSectionType i;
        public final boolean j;
        public final GamBannerAdSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$GamBannerAdSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$GamBannerAdSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GamBannerAdSection> serializer() {
                return RegularBusSectionWidgetAppModel$GamBannerAdSection$$serializer.f3800a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new u01(17)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new u01(18)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GamBannerAdSection(int i, String str, int i2, RegularBusPageSectionType regularBusPageSectionType, boolean z, String str2, int i3, RegularBusPageSectionType regularBusPageSectionType2, boolean z2, GamBannerAdSectionAppModel gamBannerAdSectionAppModel) {
            super(str, i2, regularBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(RegularBusSectionWidgetAppModel$GamBannerAdSection$$serializer.f3800a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = regularBusPageSectionType2;
            this.j = z2;
            this.k = gamBannerAdSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GamBannerAdSection)) {
                return false;
            }
            GamBannerAdSection gamBannerAdSection = (GamBannerAdSection) obj;
            return Intrinsics.d(this.g, gamBannerAdSection.g) && this.h == gamBannerAdSection.h && this.i == gamBannerAdSection.i && this.j == gamBannerAdSection.j && Intrinsics.d(this.k, gamBannerAdSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "GamBannerAdSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", gamBannerAdSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GamBannerAdSection(String widgetSectionId, int i, RegularBusPageSectionType widgetSectionType, boolean z, GamBannerAdSectionAppModel gamBannerAdSectionAppModel) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
            this.k = gamBannerAdSectionAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$ImageResourceSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ImageResourceSection extends RegularBusSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final RegularBusPageSectionType i;
        public final boolean j;
        public final ImageResourceSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$ImageResourceSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$ImageResourceSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ImageResourceSection> serializer() {
                return RegularBusSectionWidgetAppModel$ImageResourceSection$$serializer.f3801a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new u01(19)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new u01(20)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ImageResourceSection(int i, String str, int i2, RegularBusPageSectionType regularBusPageSectionType, boolean z, String str2, int i3, RegularBusPageSectionType regularBusPageSectionType2, boolean z2, ImageResourceSectionAppModel imageResourceSectionAppModel) {
            super(str, i2, regularBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(RegularBusSectionWidgetAppModel$ImageResourceSection$$serializer.f3801a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = regularBusPageSectionType2;
            this.j = z2;
            this.k = imageResourceSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageResourceSection)) {
                return false;
            }
            ImageResourceSection imageResourceSection = (ImageResourceSection) obj;
            return Intrinsics.d(this.g, imageResourceSection.g) && this.h == imageResourceSection.h && this.i == imageResourceSection.i && this.j == imageResourceSection.j && Intrinsics.d(this.k, imageResourceSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "ImageResourceSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", imageResourceSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageResourceSection(String widgetSectionId, int i, RegularBusPageSectionType widgetSectionType, boolean z, ImageResourceSectionAppModel imageResourceSectionAppModel) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
            this.k = imageResourceSectionAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$NearbyBusesSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NearbyBusesSection extends RegularBusSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final RegularBusPageSectionType i;
        public final boolean j;
        public final NearbyBusesSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$NearbyBusesSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$NearbyBusesSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NearbyBusesSection> serializer() {
                return RegularBusSectionWidgetAppModel$NearbyBusesSection$$serializer.f3802a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new u01(21)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new u01(22)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NearbyBusesSection(int i, String str, int i2, RegularBusPageSectionType regularBusPageSectionType, boolean z, String str2, int i3, RegularBusPageSectionType regularBusPageSectionType2, boolean z2, NearbyBusesSectionAppModel nearbyBusesSectionAppModel) {
            super(str, i2, regularBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(RegularBusSectionWidgetAppModel$NearbyBusesSection$$serializer.f3802a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = regularBusPageSectionType2;
            this.j = z2;
            this.k = nearbyBusesSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyBusesSection)) {
                return false;
            }
            NearbyBusesSection nearbyBusesSection = (NearbyBusesSection) obj;
            return Intrinsics.d(this.g, nearbyBusesSection.g) && this.h == nearbyBusesSection.h && this.i == nearbyBusesSection.i && this.j == nearbyBusesSection.j && Intrinsics.d(this.k, nearbyBusesSection.k);
        }

        public final int hashCode() {
            return this.k.f3766a.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "NearbyBusesSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", nearbyBusesSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NearbyBusesSection(String widgetSectionId, int i, RegularBusPageSectionType widgetSectionType, boolean z, NearbyBusesSectionAppModel nearbyBusesSectionAppModel) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
            this.k = nearbyBusesSectionAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$NearbyStopsSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NearbyStopsSection extends RegularBusSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final RegularBusPageSectionType i;
        public final boolean j;
        public final NearbyStopsSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$NearbyStopsSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$NearbyStopsSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NearbyStopsSection> serializer() {
                return RegularBusSectionWidgetAppModel$NearbyStopsSection$$serializer.f3803a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new u01(23)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new u01(24)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NearbyStopsSection(int i, String str, int i2, RegularBusPageSectionType regularBusPageSectionType, boolean z, String str2, int i3, RegularBusPageSectionType regularBusPageSectionType2, boolean z2, NearbyStopsSectionAppModel nearbyStopsSectionAppModel) {
            super(str, i2, regularBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(RegularBusSectionWidgetAppModel$NearbyStopsSection$$serializer.f3803a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = regularBusPageSectionType2;
            this.j = z2;
            this.k = nearbyStopsSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyStopsSection)) {
                return false;
            }
            NearbyStopsSection nearbyStopsSection = (NearbyStopsSection) obj;
            return Intrinsics.d(this.g, nearbyStopsSection.g) && this.h == nearbyStopsSection.h && this.i == nearbyStopsSection.i && this.j == nearbyStopsSection.j && Intrinsics.d(this.k, nearbyStopsSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "NearbyStopsSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", nearbyStopsSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NearbyStopsSection(String widgetSectionId, int i, RegularBusPageSectionType widgetSectionType, boolean z, NearbyStopsSectionAppModel nearbyStopsSectionAppModel) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
            this.k = nearbyStopsSectionAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$PlotlineWidgetSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PlotlineWidgetSection extends RegularBusSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final RegularBusPageSectionType i;
        public final boolean j;
        public final PlotlineWidgetSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$PlotlineWidgetSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$PlotlineWidgetSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PlotlineWidgetSection> serializer() {
                return RegularBusSectionWidgetAppModel$PlotlineWidgetSection$$serializer.f3804a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new u01(25)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new u01(26)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PlotlineWidgetSection(int i, String str, int i2, RegularBusPageSectionType regularBusPageSectionType, boolean z, String str2, int i3, RegularBusPageSectionType regularBusPageSectionType2, boolean z2, PlotlineWidgetSectionAppModel plotlineWidgetSectionAppModel) {
            super(str, i2, regularBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(RegularBusSectionWidgetAppModel$PlotlineWidgetSection$$serializer.f3804a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = regularBusPageSectionType2;
            this.j = z2;
            this.k = plotlineWidgetSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlotlineWidgetSection)) {
                return false;
            }
            PlotlineWidgetSection plotlineWidgetSection = (PlotlineWidgetSection) obj;
            return Intrinsics.d(this.g, plotlineWidgetSection.g) && this.h == plotlineWidgetSection.h && this.i == plotlineWidgetSection.i && this.j == plotlineWidgetSection.j && Intrinsics.d(this.k, plotlineWidgetSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "PlotlineWidgetSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", plotlineWidgetSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlotlineWidgetSection(String widgetSectionId, int i, RegularBusPageSectionType widgetSectionType, boolean z, PlotlineWidgetSectionAppModel plotlineWidgetSectionAppModel) {
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$QuickPaymentsSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class QuickPaymentsSection extends RegularBusSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final RegularBusPageSectionType i;
        public final boolean j;
        public final QuickPaymentsSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$QuickPaymentsSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$QuickPaymentsSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<QuickPaymentsSection> serializer() {
                return RegularBusSectionWidgetAppModel$QuickPaymentsSection$$serializer.f3805a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new u01(27)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new u01(28)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ QuickPaymentsSection(int i, String str, int i2, RegularBusPageSectionType regularBusPageSectionType, boolean z, String str2, int i3, RegularBusPageSectionType regularBusPageSectionType2, boolean z2, QuickPaymentsSectionAppModel quickPaymentsSectionAppModel) {
            super(str, i2, regularBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(RegularBusSectionWidgetAppModel$QuickPaymentsSection$$serializer.f3805a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = regularBusPageSectionType2;
            this.j = z2;
            this.k = quickPaymentsSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickPaymentsSection)) {
                return false;
            }
            QuickPaymentsSection quickPaymentsSection = (QuickPaymentsSection) obj;
            return Intrinsics.d(this.g, quickPaymentsSection.g) && this.h == quickPaymentsSection.h && this.i == quickPaymentsSection.i && this.j == quickPaymentsSection.j && Intrinsics.d(this.k, quickPaymentsSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "QuickPaymentsSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", quickPaymentsSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuickPaymentsSection(String widgetSectionId, int i, RegularBusPageSectionType widgetSectionType, boolean z, QuickPaymentsSectionAppModel quickPaymentsSectionAppModel) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
            this.k = quickPaymentsSectionAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$RegularBusFooterSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class RegularBusFooterSection extends RegularBusSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final RegularBusPageSectionType i;
        public final boolean j;
        public final FooterSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$RegularBusFooterSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$RegularBusFooterSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<RegularBusFooterSection> serializer() {
                return RegularBusSectionWidgetAppModel$RegularBusFooterSection$$serializer.f3806a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new u01(29)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new x11(0)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegularBusFooterSection(int i, String str, int i2, RegularBusPageSectionType regularBusPageSectionType, boolean z, String str2, int i3, RegularBusPageSectionType regularBusPageSectionType2, boolean z2, FooterSectionAppModel footerSectionAppModel) {
            super(str, i2, regularBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(RegularBusSectionWidgetAppModel$RegularBusFooterSection$$serializer.f3806a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = regularBusPageSectionType2;
            this.j = z2;
            this.k = footerSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegularBusFooterSection)) {
                return false;
            }
            RegularBusFooterSection regularBusFooterSection = (RegularBusFooterSection) obj;
            return Intrinsics.d(this.g, regularBusFooterSection.g) && this.h == regularBusFooterSection.h && this.i == regularBusFooterSection.i && this.j == regularBusFooterSection.j && Intrinsics.d(this.k, regularBusFooterSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "RegularBusFooterSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", footerSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegularBusFooterSection(String widgetSectionId, int i, RegularBusPageSectionType widgetSectionType, boolean z, FooterSectionAppModel footerSectionAppModel) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
            this.k = footerSectionAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$TicketPassesSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class TicketPassesSection extends RegularBusSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final RegularBusPageSectionType i;
        public final boolean j;
        public final CardSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$TicketPassesSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$TicketPassesSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<TicketPassesSection> serializer() {
                return RegularBusSectionWidgetAppModel$TicketPassesSection$$serializer.f3808a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new x11(4)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new x11(5)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TicketPassesSection(int i, String str, int i2, RegularBusPageSectionType regularBusPageSectionType, boolean z, String str2, int i3, RegularBusPageSectionType regularBusPageSectionType2, boolean z2, CardSectionAppModel cardSectionAppModel) {
            super(str, i2, regularBusPageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(RegularBusSectionWidgetAppModel$TicketPassesSection$$serializer.f3808a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = regularBusPageSectionType2;
            this.j = z2;
            this.k = cardSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketPassesSection)) {
                return false;
            }
            TicketPassesSection ticketPassesSection = (TicketPassesSection) obj;
            return Intrinsics.d(this.g, ticketPassesSection.g) && this.h == ticketPassesSection.h && this.i == ticketPassesSection.i && this.j == ticketPassesSection.j && Intrinsics.d(this.k, ticketPassesSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "TicketPassesSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", cardSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketPassesSection(String widgetSectionId, int i, RegularBusPageSectionType widgetSectionType, boolean z, CardSectionAppModel cardSectionAppModel) {
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

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new u01(11)), null};
        f = LazyKt.a(lazyThreadSafetyMode, new u01(12));
    }

    public /* synthetic */ RegularBusSectionWidgetAppModel(String str, int i, RegularBusPageSectionType regularBusPageSectionType, boolean z) {
        this.f3797a = str;
        this.b = i;
        this.c = regularBusPageSectionType;
        this.d = z;
    }

    public static final /* synthetic */ void a(RegularBusSectionWidgetAppModel regularBusSectionWidgetAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, regularBusSectionWidgetAppModel.f3797a);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, regularBusSectionWidgetAppModel.b);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) e[2].getValue(), regularBusSectionWidgetAppModel.c);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, regularBusSectionWidgetAppModel.d);
    }

    public RegularBusSectionWidgetAppModel(String str, int i, RegularBusPageSectionType regularBusPageSectionType, boolean z, int i2) {
        this.f3797a = str;
        this.b = i;
        this.c = regularBusPageSectionType;
        this.d = z;
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$RegularBusUnifiedAdSection;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class RegularBusUnifiedAdSection extends RegularBusSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final RegularBusPageSectionType i;
        public final boolean j;
        public final UnifiedAdSlot k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$RegularBusUnifiedAdSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$RegularBusUnifiedAdSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<RegularBusUnifiedAdSection> serializer() {
                return RegularBusSectionWidgetAppModel$RegularBusUnifiedAdSection$$serializer.f3807a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new x11(1)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new x11(2)), null, LazyKt.a(lazyThreadSafetyMode, new x11(3))};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegularBusUnifiedAdSection(int i, String str, int i2, RegularBusPageSectionType regularBusPageSectionType, boolean z, String str2, int i3, RegularBusPageSectionType regularBusPageSectionType2, boolean z2, UnifiedAdSlot unifiedAdSlot) {
            super(str, i2, regularBusPageSectionType, z);
            if (255 != (i & 255)) {
                PluginExceptionsKt.b(RegularBusSectionWidgetAppModel$RegularBusUnifiedAdSection$$serializer.f3807a.getDescriptor(), i, 255);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = regularBusPageSectionType2;
            this.j = z2;
            if ((i & 256) == 0) {
                this.k = UnifiedAdSlot.REGULAR_BUS_INLINE_ADAPTIVE;
            } else {
                this.k = unifiedAdSlot;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegularBusUnifiedAdSection)) {
                return false;
            }
            RegularBusUnifiedAdSection regularBusUnifiedAdSection = (RegularBusUnifiedAdSection) obj;
            return Intrinsics.d(this.g, regularBusUnifiedAdSection.g) && this.h == regularBusUnifiedAdSection.h && this.i == regularBusUnifiedAdSection.i && this.j == regularBusUnifiedAdSection.j && this.k == regularBusUnifiedAdSection.k;
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "RegularBusUnifiedAdSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", unifiedAdSlot=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegularBusUnifiedAdSection(String widgetSectionId, int i, RegularBusPageSectionType widgetSectionType, boolean z, UnifiedAdSlot unifiedAdSlot) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            Intrinsics.i(unifiedAdSlot, "unifiedAdSlot");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = z;
            this.k = unifiedAdSlot;
        }
    }
}
