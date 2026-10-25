package defpackage;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.retain.RetainedValuesStoreRegistryKt;
import app.chalo.ads.UnifiedAdSlot;
import app.chalo.behaviour.policy.ReportProblemPathOverride;
import app.chalo.behaviour.policy.ReportProblemPathOverride$WebView$$serializer;
import app.chalo.behaviour.policy.ReportProblemPathOverride$WhatsApp$$serializer;
import app.chalo.features.reportproblem.ReportProblemCollection;
import app.chalo.features.reportproblem.ReportProblemFeatureCategory;
import app.chalo.features.reportproblem.ReportProblemFeatureCategory$$serializer;
import app.chalo.features.reportproblem.ReportProblemFeatureProblem;
import app.chalo.features.reportproblem.ReportProblemFeatureProblem$$serializer;
import app.chalo.homescreen.data.model.app.RegularBusPageSectionType;
import app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel;
import app.chalo.models.validation.RegularBusSlBleConfig;
import app.chalo.models.validation.RegularBusSoundBasedValidationConfig;
import app.chalo.premiumbus.data.models.app.ReservationType;
import app.chalo.ridefeedback.data.api.RideFeedbackRequestApiModel;
import app.chalo.ridefeedback.data.app.RideFeedbackBookingData;
import app.chalo.ridefeedback.data.app.RideFeedbackEntryPoint;
import app.chalo.ridefeedback.data.app.RideFeedbackTriggerType;
import app.chalo.ridehailing.data.api.request.RideHailingBookingFeedbackRequestApiModel;
import app.chalo.ridehailing.data.api.response.RideHailingBookingFeedbackResponseApiModel;
import app.chalo.ridehailing.data.api.response.RideHailingBookingFeedbackResultApiModel$$serializer;
import app.chalo.ridehailing.data.app.RideHailingRemoteConfigModel;
import app.chalo.ridehailing.data.app.RideHailingVehicleCategory;
import app.chalo.ridehailing.data.app.RideHailingVehicleDetailsAppModel;
import app.chalo.ridehailing.data.app.UserFeedbackRatingConfigData$$serializer;
import app.chalo.scenes.args.ReportProblemArgs;
import app.chalo.superpass.data.models.entities.RejectionStatus;
import app.chalo.superpass.data.models.entities.RideRollOverBannerCta;
import app.chalo.superpass.data.models.entities.RideRollOverBannerCtaActionType;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.compose.resources.DefaultAndroidResourceReader;
import org.jetbrains.compose.resources.ResourceEnvironmentKt;
import org.jetbrains.compose.resources.ResourceReaderKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x11 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19978a;

    public /* synthetic */ x11(int i) {
        this.f19978a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19978a) {
            case 0:
                RegularBusSectionWidgetAppModel.RegularBusFooterSection.Companion companion = RegularBusSectionWidgetAppModel.RegularBusFooterSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 1:
                RegularBusSectionWidgetAppModel.RegularBusUnifiedAdSection.Companion companion2 = RegularBusSectionWidgetAppModel.RegularBusUnifiedAdSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 2:
                RegularBusSectionWidgetAppModel.RegularBusUnifiedAdSection.Companion companion3 = RegularBusSectionWidgetAppModel.RegularBusUnifiedAdSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 3:
                RegularBusSectionWidgetAppModel.RegularBusUnifiedAdSection.Companion companion4 = RegularBusSectionWidgetAppModel.RegularBusUnifiedAdSection.INSTANCE;
                return EnumsKt.b("app.chalo.ads.UnifiedAdSlot", UnifiedAdSlot.values());
            case 4:
                RegularBusSectionWidgetAppModel.TicketPassesSection.Companion companion5 = RegularBusSectionWidgetAppModel.TicketPassesSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 5:
                RegularBusSectionWidgetAppModel.TicketPassesSection.Companion companion6 = RegularBusSectionWidgetAppModel.TicketPassesSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageSectionType", RegularBusPageSectionType.values());
            case 6:
                RegularBusSlBleConfig.Companion companion7 = RegularBusSlBleConfig.INSTANCE;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 7:
                RegularBusSoundBasedValidationConfig.Companion companion8 = RegularBusSoundBasedValidationConfig.INSTANCE;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 8:
                return RejectionStatus._init_$_anonymous_();
            case 9:
                ReportProblemArgs.Companion companion9 = ReportProblemArgs.INSTANCE;
                StringSerializer stringSerializer = StringSerializer.f18170a;
                return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
            case 10:
                ReportProblemArgs.Companion companion10 = ReportProblemArgs.INSTANCE;
                return new ArrayListSerializer(ReportProblemFeatureCategory$$serializer.f2760a);
            case 11:
                ReportProblemCollection.Companion companion11 = ReportProblemCollection.INSTANCE;
                return new ArrayListSerializer(ReportProblemFeatureCategory$$serializer.f2760a);
            case 12:
                ReportProblemFeatureCategory.Companion companion12 = ReportProblemFeatureCategory.Companion;
                return new ArrayListSerializer(ReportProblemFeatureProblem$$serializer.f2763a);
            case 13:
                ReportProblemFeatureProblem.Companion companion13 = ReportProblemFeatureProblem.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 14:
                ReportProblemPathOverride.Companion companion14 = ReportProblemPathOverride.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.behaviour.policy.ReportProblemPathOverride", Reflection.a(ReportProblemPathOverride.class), new KClass[]{Reflection.a(ReportProblemPathOverride.FreshChat.class), Reflection.a(ReportProblemPathOverride.WebView.class), Reflection.a(ReportProblemPathOverride.WhatsApp.class)}, new KSerializer[]{new ObjectSerializer("freshChat", ReportProblemPathOverride.FreshChat.INSTANCE, new Annotation[0]), ReportProblemPathOverride$WebView$$serializer.f1036a, ReportProblemPathOverride$WhatsApp$$serializer.f1037a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 15:
                return new ObjectSerializer("freshChat", ReportProblemPathOverride.FreshChat.INSTANCE, new Annotation[0]);
            case 16:
                return ReservationType._init_$_anonymous_();
            case 17:
                return ResourceEnvironmentKt.f18782a;
            case 18:
                ProvidableCompositionLocal providableCompositionLocal = ResourceReaderKt.f18785a;
                return DefaultAndroidResourceReader.f18773a;
            case 19:
                return RetainedValuesStoreRegistryKt.retainRetainedValuesStoreRegistry$lambda$0$0();
            case 20:
                RideFeedbackBookingData.Companion companion15 = RideFeedbackBookingData.INSTANCE;
                return RideFeedbackTriggerType.INSTANCE.serializer();
            case 21:
                RideFeedbackBookingData.Companion companion16 = RideFeedbackBookingData.INSTANCE;
                return RideFeedbackEntryPoint.INSTANCE.serializer();
            case 22:
                return RideFeedbackEntryPoint._init_$_anonymous_();
            case 23:
                RideFeedbackRequestApiModel.Companion companion17 = RideFeedbackRequestApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 24:
                return RideFeedbackTriggerType._init_$_anonymous_();
            case 25:
                RideHailingBookingFeedbackRequestApiModel.Companion companion18 = RideHailingBookingFeedbackRequestApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 26:
                RideHailingBookingFeedbackResponseApiModel.Companion companion19 = RideHailingBookingFeedbackResponseApiModel.INSTANCE;
                return new ArrayListSerializer(RideHailingBookingFeedbackResultApiModel$$serializer.f9103a);
            case 27:
                RideHailingRemoteConfigModel.Companion companion20 = RideHailingRemoteConfigModel.INSTANCE;
                return new ArrayListSerializer(UserFeedbackRatingConfigData$$serializer.f9120a);
            case 28:
                RideHailingVehicleDetailsAppModel.Companion companion21 = RideHailingVehicleDetailsAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.ridehailing.data.app.RideHailingVehicleCategory", RideHailingVehicleCategory.values());
            default:
                RideRollOverBannerCta.Companion companion22 = RideRollOverBannerCta.Companion;
                return RideRollOverBannerCtaActionType.INSTANCE.serializer();
        }
    }
}
