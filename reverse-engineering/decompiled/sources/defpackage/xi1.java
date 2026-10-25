package defpackage;

import androidx.compose.animation.core.TransitionKt;
import androidx.compose.material3.TopAppBarDefaults;
import app.chalo.chalobususerprofile.data.model.TimingVariability;
import app.chalo.constants.Source;
import app.chalo.core.database.tableadapters.TicketTableAdapter;
import app.chalo.core.database.tableadapters.TicketTableAdapter$mTicketConfigurationAdapter$2$1;
import app.chalo.core.database.tableadapters.TicketTableAdapter$mticketTripReceiptAdapter$2$1;
import app.chalo.core.database.tableadapters.TicketTableAdapter$userProfileAdapter$2$1;
import app.chalo.homescreen.data.model.app.TicketsPageSectionType;
import app.chalo.homescreen.data.model.app.TicketsPassesAppModel;
import app.chalo.homescreen.data.model.app.TicketsPassesSectionWidgetAppModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsCustomStopMarkerInfo$$serializer;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsCustomStopTagInfo$$serializer;
import app.chalo.livetracking.routedetails.data.model.ui.TrackingAdditionalFeatures;
import app.chalo.scenes.args.TitoRideDetailsArgs;
import app.chalo.stoptripdetails.data.model.api.FrequencyDataArrayApiModel$$serializer;
import app.chalo.stoptripdetails.data.model.api.TrimSummaryRequiredFields;
import app.chalo.stoptripdetails.data.model.api.TripApiModel;
import app.chalo.ticketvalidation.QRValidationStatus;
import app.chalo.ticketvalidation.TicketQrSchemaType;
import app.chalo.ticketvalidation.TicketValidationInfoEntity;
import app.chalo.ticketvalidation.TicketValidationMetaInfo;
import app.chalo.ticketvalidation.TicketValidationType;
import app.chalo.tito.data.model.TitoValidationCityWiseConfig;
import app.chalo.tito.data.model.TitoValidationCityWiseConfigData;
import app.chalo.tito.data.model.TitoValidationCityWiseConfigData$$serializer;
import app.chalo.tito.data.model.TitoValidationConfigData;
import app.chalo.tito.data.model.TitoValidationConfigData$$serializer;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import app.chalo.usecase.FeedbackTags$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Angle$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$CheckBox$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Color$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$DropDown$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Layer$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Point$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Slider$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Unsupported$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.TintEffect;
import io.github.alexzhirkevich.compottie.internal.effects.TintEffect$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0;
import io.github.alexzhirkevich.compottie.internal.helpers.BooleanIntSerializer;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.datetime.serializers.TimeBasedDateTimeUnitSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xi1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20024a;

    public /* synthetic */ xi1(int i) {
        this.f20024a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 6;
        switch (this.f20024a) {
            case 0:
                Lazy lazy = TicketTableAdapter.f2124a;
                return new TicketTableAdapter$userProfileAdapter$2$1();
            case 1:
                Lazy lazy2 = TicketTableAdapter.f2124a;
                return new TicketTableAdapter$mTicketConfigurationAdapter$2$1();
            case 2:
                Lazy lazy3 = TicketTableAdapter.f2124a;
                return new TicketTableAdapter$mticketTripReceiptAdapter$2$1();
            case 3:
                TicketValidationInfoEntity.Companion companion = TicketValidationInfoEntity.INSTANCE;
                return EnumsKt.b("app.chalo.ticketvalidation.TicketValidationType", TicketValidationType.values());
            case 4:
                TicketValidationInfoEntity.Companion companion2 = TicketValidationInfoEntity.INSTANCE;
                return EnumsKt.b("app.chalo.ticketvalidation.QRValidationStatus", QRValidationStatus.values());
            case 5:
                TicketValidationMetaInfo.Companion companion3 = TicketValidationMetaInfo.INSTANCE;
                return TicketQrSchemaType.INSTANCE.serializer();
            case 6:
                TicketsPassesAppModel.Companion companion4 = TicketsPassesAppModel.INSTANCE;
                return TicketsPassesSectionWidgetAppModel.INSTANCE.serializer();
            case 7:
                TicketsPassesSectionWidgetAppModel.Companion companion5 = TicketsPassesSectionWidgetAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.TicketsPageSectionType", TicketsPageSectionType.values());
            case 8:
                TicketsPassesSectionWidgetAppModel.Companion companion6 = TicketsPassesSectionWidgetAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.homescreen.data.model.app.TicketsPassesSectionWidgetAppModel", Reflection.a(TicketsPassesSectionWidgetAppModel.class), new KClass[0], new KSerializer[0]);
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 9:
                TimeBasedDateTimeUnitSerializer timeBasedDateTimeUnitSerializer = TimeBasedDateTimeUnitSerializer.f18074a;
                return SerialDescriptorsKt.c("kotlinx.datetime.TimeBased", new SerialDescriptor[0], new wi1(i));
            case 10:
                return "Invalid timezone format";
            case 11:
                return TimingVariability._init_$_anonymous_();
            case 12:
                TintEffect.Companion companion7 = TintEffect.INSTANCE;
                ClassReference classReferenceA = Reflection.a(EffectValue.class);
                KClass[] kClassArr = {Reflection.a(EffectValue.Angle.class), Reflection.a(EffectValue.CheckBox.class), Reflection.a(EffectValue.Color.class), Reflection.a(EffectValue.DropDown.class), Reflection.a(EffectValue.Layer.class), Reflection.a(EffectValue.Point.class), Reflection.a(EffectValue.Slider.class), Reflection.a(EffectValue.Unsupported.class)};
                KSerializer[] kSerializerArr = {EffectValue$Angle$$serializer.f16197a, EffectValue$CheckBox$$serializer.f16199a, EffectValue$Color$$serializer.f16201a, EffectValue$DropDown$$serializer.f16204a, EffectValue$Layer$$serializer.f16206a, EffectValue$Point$$serializer.f16208a, EffectValue$Slider$$serializer.f16210a, EffectValue$Unsupported$$serializer.f16212a};
                Annotation[] annotationArr = {new TintEffect$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0()};
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("io.github.alexzhirkevich.compottie.internal.effects.EffectValue", classReferenceA, kClassArr, kSerializerArr);
                sealedClassSerializer2.b = ArraysKt.e(annotationArr);
                return new ArrayListSerializer(sealedClassSerializer2);
            case 13:
                TintEffect.Companion companion8 = TintEffect.INSTANCE;
                return new BooleanIntSerializer();
            case 14:
                TitoRideDetailsArgs.Companion companion9 = TitoRideDetailsArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 15:
                TitoValidationCityWiseConfig.Companion companion10 = TitoValidationCityWiseConfig.INSTANCE;
                return new ArrayListSerializer(TitoValidationCityWiseConfigData$$serializer.f9643a);
            case 16:
                TitoValidationCityWiseConfigData.Companion companion11 = TitoValidationCityWiseConfigData.Companion;
                return new ArrayListSerializer(TitoValidationConfigData$$serializer.f9645a);
            case 17:
                TitoValidationConfigData.Companion companion12 = TitoValidationConfigData.INSTANCE;
                return new ArrayListSerializer(FeedbackTags$$serializer.f10173a);
            case 18:
                return TitoValidationStatus._init_$_anonymous_();
            case 19:
                return Boolean.valueOf(TopAppBarDefaults.exitUntilCollapsedScrollBehavior$lambda$10$lambda$9());
            case 20:
                return Boolean.valueOf(TopAppBarDefaults.enterAlwaysScrollBehavior$lambda$7$lambda$6());
            case 21:
                return Boolean.valueOf(TopAppBarDefaults.pinnedScrollBehavior$lambda$2$lambda$1());
            case 22:
                return Boolean.valueOf(TopAppBarDefaults.enterAlwaysScrollBehavior$lambda$5$lambda$4());
            case 23:
                TrackingAdditionalFeatures.Companion companion13 = TrackingAdditionalFeatures.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 24:
                TrackingAdditionalFeatures.Companion companion14 = TrackingAdditionalFeatures.INSTANCE;
                return new ArrayListSerializer(RouteDetailsCustomStopMarkerInfo$$serializer.f4402a);
            case 25:
                TrackingAdditionalFeatures.Companion companion15 = TrackingAdditionalFeatures.INSTANCE;
                return new ArrayListSerializer(RouteDetailsCustomStopTagInfo$$serializer.f4404a);
            case 26:
                return TransitionKt.SeekableStateObserver_delegate$lambda$0();
            case 27:
                TrimSummaryRequiredFields.Companion companion16 = TrimSummaryRequiredFields.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a);
            case 28:
                TripApiModel.Companion companion17 = TripApiModel.INSTANCE;
                return new ArrayListSerializer(FrequencyDataArrayApiModel$$serializer.f9472a);
            default:
                TripApiModel.Companion companion18 = TripApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
        }
    }
}
