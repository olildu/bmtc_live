package defpackage;

import app.chalo.core.database.columnadapters.RefundInfoColumnAdapter;
import app.chalo.core.database.columnadapters.RefundInfoColumnAdapter$refundInfoAppAdapter$2$1;
import app.chalo.core.database.columnadapters.RefundInfoColumnAdapter$refundInfoEntityAdapter$2$1;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.data.RefundStatus;
import app.chalo.homescreen.data.model.app.RechargeCardAppModel;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import app.chalo.homescreen.data.model.app.RegularBusPageSectionType;
import app.chalo.homescreen.data.model.app.RegularBusScreenConfigAppModel;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel$DividerSection$$serializer;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel$FAQSection$$serializer;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel$GamBannerAdSection$$serializer;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel$ImageResourceSection$$serializer;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel$NearbyBusesSection$$serializer;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel$NearbyStopsSection$$serializer;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel$PlotlineWidgetSection$$serializer;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel$QuickPaymentsSection$$serializer;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel$RegularBusFooterSection$$serializer;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel$RegularBusUnifiedAdSection$$serializer;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel$TicketPassesSection$$serializer;
import app.chalo.models.validation.RegularBusProductAndValidationMethod$$serializer;
import app.chalo.models.validation.RegularBusProductAndValidationMethodsForCity;
import app.chalo.models.validation.RegularBusProductAndValidationMethodsForCity$$serializer;
import app.chalo.models.validation.RegularBusProductValidationMethodsConfig;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.recent.model.app.RecentLocationPairAppModel;
import app.chalo.recent.model.app.RecentLocationPairAppModel$$serializer;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel$$serializer;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.recent.model.app.RecentTripAppModel$$serializer;
import app.chalo.recent.model.app.RecentsType;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u01 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19704a;

    public /* synthetic */ u01(int i) {
        this.f19704a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19704a) {
            case 0:
                RecentTripAppModel.Companion companion = RecentTripAppModel.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 1:
                RecentsType.Companion companion2 = RecentsType.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.recent.model.app.RecentsType", Reflection.a(RecentsType.class), new KClass[]{Reflection.a(RecentLocationPairAppModel.class), Reflection.a(RecentPlaceAppModel.class), Reflection.a(RecentTripAppModel.class)}, new KSerializer[]{RecentLocationPairAppModel$$serializer.f8997a, RecentPlaceAppModel$$serializer.f9002a, RecentTripAppModel$$serializer.f9004a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 2:
                RechargeCardAppModel.Companion companion3 = RechargeCardAppModel.Companion;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 3:
                RechargeCardAppModel.Companion companion4 = RechargeCardAppModel.Companion;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageFeature", RegularBusPageFeature.values());
            case 4:
                RefundInfoAppModel.Companion companion5 = RefundInfoAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.data.RefundStatus", RefundStatus.values());
            case 5:
                Lazy lazy = RefundInfoColumnAdapter.f2049a;
                return new RefundInfoColumnAdapter$refundInfoEntityAdapter$2$1();
            case 6:
                Lazy lazy2 = RefundInfoColumnAdapter.f2049a;
                return new RefundInfoColumnAdapter$refundInfoAppAdapter$2$1();
            case 7:
                RefundInfoEntityModel.Companion companion6 = RefundInfoEntityModel.INSTANCE;
                return EnumsKt.b("app.chalo.data.RefundStatus", RefundStatus.values());
            case 8:
                RegularBusProductAndValidationMethodsForCity.Companion companion7 = RegularBusProductAndValidationMethodsForCity.INSTANCE;
                return new ArrayListSerializer(RegularBusProductAndValidationMethod$$serializer.f5697a);
            case 9:
                RegularBusProductValidationMethodsConfig.Companion companion8 = RegularBusProductValidationMethodsConfig.INSTANCE;
                return new ArrayListSerializer(RegularBusProductAndValidationMethodsForCity$$serializer.f5699a);
            case 10:
                RegularBusScreenConfigAppModel.Companion companion9 = RegularBusScreenConfigAppModel.INSTANCE;
                return new ArrayListSerializer(RegularBusSectionWidgetAppModel.INSTANCE.serializer());
            case 11:
                RegularBusSectionWidgetAppModel.Companion companion10 = RegularBusSectionWidgetAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 12:
                RegularBusSectionWidgetAppModel.Companion companion11 = RegularBusSectionWidgetAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel", Reflection.a(RegularBusSectionWidgetAppModel.class), new KClass[]{Reflection.a(RegularBusSectionWidgetAppModel.DividerSection.class), Reflection.a(RegularBusSectionWidgetAppModel.FAQSection.class), Reflection.a(RegularBusSectionWidgetAppModel.GamBannerAdSection.class), Reflection.a(RegularBusSectionWidgetAppModel.ImageResourceSection.class), Reflection.a(RegularBusSectionWidgetAppModel.NearbyBusesSection.class), Reflection.a(RegularBusSectionWidgetAppModel.NearbyStopsSection.class), Reflection.a(RegularBusSectionWidgetAppModel.PlotlineWidgetSection.class), Reflection.a(RegularBusSectionWidgetAppModel.QuickPaymentsSection.class), Reflection.a(RegularBusSectionWidgetAppModel.RegularBusFooterSection.class), Reflection.a(RegularBusSectionWidgetAppModel.RegularBusUnifiedAdSection.class), Reflection.a(RegularBusSectionWidgetAppModel.TicketPassesSection.class)}, new KSerializer[]{RegularBusSectionWidgetAppModel$DividerSection$$serializer.f3798a, RegularBusSectionWidgetAppModel$FAQSection$$serializer.f3799a, RegularBusSectionWidgetAppModel$GamBannerAdSection$$serializer.f3800a, RegularBusSectionWidgetAppModel$ImageResourceSection$$serializer.f3801a, RegularBusSectionWidgetAppModel$NearbyBusesSection$$serializer.f3802a, RegularBusSectionWidgetAppModel$NearbyStopsSection$$serializer.f3803a, RegularBusSectionWidgetAppModel$PlotlineWidgetSection$$serializer.f3804a, RegularBusSectionWidgetAppModel$QuickPaymentsSection$$serializer.f3805a, RegularBusSectionWidgetAppModel$RegularBusFooterSection$$serializer.f3806a, RegularBusSectionWidgetAppModel$RegularBusUnifiedAdSection$$serializer.f3807a, RegularBusSectionWidgetAppModel$TicketPassesSection$$serializer.f3808a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 13:
                RegularBusSectionWidgetAppModel.DividerSection.Companion companion12 = RegularBusSectionWidgetAppModel.DividerSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 14:
                RegularBusSectionWidgetAppModel.DividerSection.Companion companion13 = RegularBusSectionWidgetAppModel.DividerSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 15:
                RegularBusSectionWidgetAppModel.FAQSection.Companion companion14 = RegularBusSectionWidgetAppModel.FAQSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 16:
                RegularBusSectionWidgetAppModel.FAQSection.Companion companion15 = RegularBusSectionWidgetAppModel.FAQSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 17:
                RegularBusSectionWidgetAppModel.GamBannerAdSection.Companion companion16 = RegularBusSectionWidgetAppModel.GamBannerAdSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 18:
                RegularBusSectionWidgetAppModel.GamBannerAdSection.Companion companion17 = RegularBusSectionWidgetAppModel.GamBannerAdSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 19:
                RegularBusSectionWidgetAppModel.ImageResourceSection.Companion companion18 = RegularBusSectionWidgetAppModel.ImageResourceSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 20:
                RegularBusSectionWidgetAppModel.ImageResourceSection.Companion companion19 = RegularBusSectionWidgetAppModel.ImageResourceSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 21:
                RegularBusSectionWidgetAppModel.NearbyBusesSection.Companion companion20 = RegularBusSectionWidgetAppModel.NearbyBusesSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 22:
                RegularBusSectionWidgetAppModel.NearbyBusesSection.Companion companion21 = RegularBusSectionWidgetAppModel.NearbyBusesSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 23:
                RegularBusSectionWidgetAppModel.NearbyStopsSection.Companion companion22 = RegularBusSectionWidgetAppModel.NearbyStopsSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 24:
                RegularBusSectionWidgetAppModel.NearbyStopsSection.Companion companion23 = RegularBusSectionWidgetAppModel.NearbyStopsSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 25:
                RegularBusSectionWidgetAppModel.PlotlineWidgetSection.Companion companion24 = RegularBusSectionWidgetAppModel.PlotlineWidgetSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 26:
                RegularBusSectionWidgetAppModel.PlotlineWidgetSection.Companion companion25 = RegularBusSectionWidgetAppModel.PlotlineWidgetSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 27:
                RegularBusSectionWidgetAppModel.QuickPaymentsSection.Companion companion26 = RegularBusSectionWidgetAppModel.QuickPaymentsSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 28:
                RegularBusSectionWidgetAppModel.QuickPaymentsSection.Companion companion27 = RegularBusSectionWidgetAppModel.QuickPaymentsSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            default:
                RegularBusSectionWidgetAppModel.RegularBusFooterSection.Companion companion28 = RegularBusSectionWidgetAppModel.RegularBusFooterSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
        }
    }
}
