package app.chalo.homescreen.data.model.app;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.a70;
import defpackage.b3;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel;", "", "Companion", "PlotlineWidgetSection", "HomeTabHooksSection", "TicketPassesSection", "HomeFooterSection", "GamBannerAdSection", "AdsterUnifiedAdSection", "ImageResourceSection", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$AdsterUnifiedAdSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$GamBannerAdSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$HomeFooterSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$HomeTabHooksSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$ImageResourceSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$PlotlineWidgetSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$TicketPassesSection;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class HomePageSectionWidgetAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;
    public static final Object f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3739a;
    public final int b;
    public final HomePageSectionType c;
    public final boolean d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$AdsterUnifiedAdSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class AdsterUnifiedAdSection extends HomePageSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] k;
        public final String g;
        public final int h;
        public final HomePageSectionType i;
        public final boolean j;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$AdsterUnifiedAdSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$AdsterUnifiedAdSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<AdsterUnifiedAdSection> serializer() {
                return HomePageSectionWidgetAppModel$AdsterUnifiedAdSection$$serializer.f3740a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            k = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new a70(7)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new a70(8)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AdsterUnifiedAdSection(int i, String str, int i2, HomePageSectionType homePageSectionType, boolean z, String str2, int i3, HomePageSectionType homePageSectionType2, boolean z2) {
            super(str, i2, homePageSectionType, z);
            if (255 != (i & 255)) {
                PluginExceptionsKt.b(HomePageSectionWidgetAppModel$AdsterUnifiedAdSection$$serializer.f3740a.getDescriptor(), i, 255);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = homePageSectionType2;
            this.j = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdsterUnifiedAdSection)) {
                return false;
            }
            AdsterUnifiedAdSection adsterUnifiedAdSection = (AdsterUnifiedAdSection) obj;
            return Intrinsics.d(this.g, adsterUnifiedAdSection.g) && this.h == adsterUnifiedAdSection.h && this.i == adsterUnifiedAdSection.i && this.j == adsterUnifiedAdSection.j;
        }

        public final int hashCode() {
            return ((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "AdsterUnifiedAdSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdsterUnifiedAdSection(String widgetSectionId, int i, HomePageSectionType widgetSectionType, boolean z) {
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<HomePageSectionWidgetAppModel> serializer() {
            return (KSerializer) HomePageSectionWidgetAppModel.f.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$GamBannerAdSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GamBannerAdSection extends HomePageSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final HomePageSectionType i;
        public final boolean j;
        public final GamBannerAdSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$GamBannerAdSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$GamBannerAdSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GamBannerAdSection> serializer() {
                return HomePageSectionWidgetAppModel$GamBannerAdSection$$serializer.f3741a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new a70(9)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new a70(10)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GamBannerAdSection(int i, String str, int i2, HomePageSectionType homePageSectionType, boolean z, String str2, int i3, HomePageSectionType homePageSectionType2, boolean z2, GamBannerAdSectionAppModel gamBannerAdSectionAppModel) {
            super(str, i2, homePageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(HomePageSectionWidgetAppModel$GamBannerAdSection$$serializer.f3741a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = homePageSectionType2;
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
        public GamBannerAdSection(String widgetSectionId, int i, HomePageSectionType widgetSectionType, boolean z, GamBannerAdSectionAppModel gamBannerAdSectionAppModel) {
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$HomeFooterSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class HomeFooterSection extends HomePageSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final HomePageSectionType i;
        public final boolean j;
        public final FooterSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$HomeFooterSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$HomeFooterSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<HomeFooterSection> serializer() {
                return HomePageSectionWidgetAppModel$HomeFooterSection$$serializer.f3742a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new a70(11)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new a70(12)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HomeFooterSection(int i, String str, int i2, HomePageSectionType homePageSectionType, boolean z, String str2, int i3, HomePageSectionType homePageSectionType2, boolean z2, FooterSectionAppModel footerSectionAppModel) {
            super(str, i2, homePageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(HomePageSectionWidgetAppModel$HomeFooterSection$$serializer.f3742a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = homePageSectionType2;
            this.j = z2;
            this.k = footerSectionAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomeFooterSection)) {
                return false;
            }
            HomeFooterSection homeFooterSection = (HomeFooterSection) obj;
            return Intrinsics.d(this.g, homeFooterSection.g) && this.h == homeFooterSection.h && this.i == homeFooterSection.i && this.j == homeFooterSection.j && Intrinsics.d(this.k, homeFooterSection.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + ((((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "HomeFooterSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", sectionShouldHighlight=");
            sbM.append(this.j);
            sbM.append(", footerSectionAppModel=");
            sbM.append(this.k);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeFooterSection(String widgetSectionId, int i, HomePageSectionType widgetSectionType, boolean z, FooterSectionAppModel footerSectionAppModel) {
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$HomeTabHooksSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class HomeTabHooksSection extends HomePageSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final HomePageSectionType i;
        public final HomeTabHooksSectionAppModel j;
        public final boolean k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$HomeTabHooksSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$HomeTabHooksSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<HomeTabHooksSection> serializer() {
                return HomePageSectionWidgetAppModel$HomeTabHooksSection$$serializer.f3743a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new a70(13)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new a70(14)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HomeTabHooksSection(int i, String str, int i2, HomePageSectionType homePageSectionType, boolean z, String str2, int i3, HomePageSectionType homePageSectionType2, HomeTabHooksSectionAppModel homeTabHooksSectionAppModel, boolean z2) {
            super(str, i2, homePageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(HomePageSectionWidgetAppModel$HomeTabHooksSection$$serializer.f3743a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = homePageSectionType2;
            this.j = homeTabHooksSectionAppModel;
            this.k = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomeTabHooksSection)) {
                return false;
            }
            HomeTabHooksSection homeTabHooksSection = (HomeTabHooksSection) obj;
            return Intrinsics.d(this.g, homeTabHooksSection.g) && this.h == homeTabHooksSection.h && this.i == homeTabHooksSection.i && Intrinsics.d(this.j, homeTabHooksSection.j) && this.k == homeTabHooksSection.k;
        }

        public final int hashCode() {
            return ((this.j.hashCode() + ((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31)) * 31) + (this.k ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "HomeTabHooksSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", homeTabHooksSectionAppModel=");
            sbM.append(this.j);
            sbM.append(", sectionShouldHighlight=");
            return b3.g(")", sbM, this.k);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeTabHooksSection(String widgetSectionId, int i, HomePageSectionType widgetSectionType, HomeTabHooksSectionAppModel homeTabHooksSectionAppModel, boolean z) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = homeTabHooksSectionAppModel;
            this.k = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$ImageResourceSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ImageResourceSection extends HomePageSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final HomePageSectionType i;
        public final boolean j;
        public final ImageResourceSectionAppModel k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$ImageResourceSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$ImageResourceSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ImageResourceSection> serializer() {
                return HomePageSectionWidgetAppModel$ImageResourceSection$$serializer.f3744a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new a70(15)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new a70(16)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ImageResourceSection(int i, String str, int i2, HomePageSectionType homePageSectionType, boolean z, String str2, int i3, HomePageSectionType homePageSectionType2, boolean z2, ImageResourceSectionAppModel imageResourceSectionAppModel) {
            super(str, i2, homePageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(HomePageSectionWidgetAppModel$ImageResourceSection$$serializer.f3744a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = homePageSectionType2;
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
        public ImageResourceSection(String widgetSectionId, int i, HomePageSectionType widgetSectionType, boolean z, ImageResourceSectionAppModel imageResourceSectionAppModel) {
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$PlotlineWidgetSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PlotlineWidgetSection extends HomePageSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final HomePageSectionType i;
        public final PlotlineWidgetSectionAppModel j;
        public final boolean k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$PlotlineWidgetSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$PlotlineWidgetSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PlotlineWidgetSection> serializer() {
                return HomePageSectionWidgetAppModel$PlotlineWidgetSection$$serializer.f3745a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new a70(17)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new a70(18)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PlotlineWidgetSection(int i, String str, int i2, HomePageSectionType homePageSectionType, boolean z, String str2, int i3, HomePageSectionType homePageSectionType2, PlotlineWidgetSectionAppModel plotlineWidgetSectionAppModel, boolean z2) {
            super(str, i2, homePageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(HomePageSectionWidgetAppModel$PlotlineWidgetSection$$serializer.f3745a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = homePageSectionType2;
            this.j = plotlineWidgetSectionAppModel;
            this.k = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlotlineWidgetSection)) {
                return false;
            }
            PlotlineWidgetSection plotlineWidgetSection = (PlotlineWidgetSection) obj;
            return Intrinsics.d(this.g, plotlineWidgetSection.g) && this.h == plotlineWidgetSection.h && this.i == plotlineWidgetSection.i && Intrinsics.d(this.j, plotlineWidgetSection.j) && this.k == plotlineWidgetSection.k;
        }

        public final int hashCode() {
            return ((this.j.hashCode() + ((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31)) * 31) + (this.k ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "PlotlineWidgetSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", plotlineWidgetSectionAppModel=");
            sbM.append(this.j);
            sbM.append(", sectionShouldHighlight=");
            return b3.g(")", sbM, this.k);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlotlineWidgetSection(String widgetSectionId, int i, HomePageSectionType widgetSectionType, PlotlineWidgetSectionAppModel plotlineWidgetSectionAppModel, boolean z) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = plotlineWidgetSectionAppModel;
            this.k = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$TicketPassesSection;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class TicketPassesSection extends HomePageSectionWidgetAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] l;
        public final String g;
        public final int h;
        public final HomePageSectionType i;
        public final CardSectionAppModel j;
        public final boolean k;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$TicketPassesSection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$TicketPassesSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<TicketPassesSection> serializer() {
                return HomePageSectionWidgetAppModel$TicketPassesSection$$serializer.f3746a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            l = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new a70(19)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new a70(20)), null, null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TicketPassesSection(int i, String str, int i2, HomePageSectionType homePageSectionType, boolean z, String str2, int i3, HomePageSectionType homePageSectionType2, CardSectionAppModel cardSectionAppModel, boolean z2) {
            super(str, i2, homePageSectionType, z);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.b(HomePageSectionWidgetAppModel$TicketPassesSection$$serializer.f3746a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
                throw null;
            }
            this.g = str2;
            this.h = i3;
            this.i = homePageSectionType2;
            this.j = cardSectionAppModel;
            this.k = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketPassesSection)) {
                return false;
            }
            TicketPassesSection ticketPassesSection = (TicketPassesSection) obj;
            return Intrinsics.d(this.g, ticketPassesSection.g) && this.h == ticketPassesSection.h && this.i == ticketPassesSection.i && Intrinsics.d(this.j, ticketPassesSection.j) && this.k == ticketPassesSection.k;
        }

        public final int hashCode() {
            return ((this.j.hashCode() + ((this.i.hashCode() + (((this.g.hashCode() * 31) + this.h) * 31)) * 31)) * 31) + (this.k ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbM = xs.m(this.h, "TicketPassesSection(widgetSectionId=", this.g, ", widgetSectionPriority=", ", widgetSectionType=");
            sbM.append(this.i);
            sbM.append(", cardSectionAppModel=");
            sbM.append(this.j);
            sbM.append(", sectionShouldHighlight=");
            return b3.g(")", sbM, this.k);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketPassesSection(String widgetSectionId, int i, HomePageSectionType widgetSectionType, CardSectionAppModel cardSectionAppModel, boolean z) {
            super(widgetSectionId, i, widgetSectionType, z, 0);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.g = widgetSectionId;
            this.h = i;
            this.i = widgetSectionType;
            this.j = cardSectionAppModel;
            this.k = z;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new a70(5)), null};
        f = LazyKt.a(lazyThreadSafetyMode, new a70(6));
    }

    public /* synthetic */ HomePageSectionWidgetAppModel(String str, int i, HomePageSectionType homePageSectionType, boolean z) {
        this.f3739a = str;
        this.b = i;
        this.c = homePageSectionType;
        this.d = z;
    }

    public static final /* synthetic */ void a(HomePageSectionWidgetAppModel homePageSectionWidgetAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, homePageSectionWidgetAppModel.f3739a);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, homePageSectionWidgetAppModel.b);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) e[2].getValue(), homePageSectionWidgetAppModel.c);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, homePageSectionWidgetAppModel.d);
    }

    public HomePageSectionWidgetAppModel(String str, int i, HomePageSectionType homePageSectionType, boolean z, int i2) {
        this.f3739a = str;
        this.b = i;
        this.c = homePageSectionType;
        this.d = z;
    }
}
