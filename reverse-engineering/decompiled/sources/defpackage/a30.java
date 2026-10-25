package defpackage;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Paint;
import app.chalo.home.data.model.api.response.BannerDataResponseApiModel$$serializer;
import app.chalo.home.data.model.api.response.FetchBannerResponseApiModel;
import app.chalo.home.data.model.app.response.BannerDataResponseAppModel$$serializer;
import app.chalo.home.data.model.app.response.FetchBannerResponseAppModel;
import app.chalo.instantticket.data.model.api.request.FareRequestFilters;
import app.chalo.instantticket.data.model.api.request.FareRequestFilters$InstantTicketFilter$$serializer;
import app.chalo.instantticket.data.model.api.request.FareRequestFilters$OndcTicketFilter$$serializer;
import app.chalo.instantticket.data.model.api.request.FareRequestFilters$PremiumReserveTicketFilter$$serializer;
import app.chalo.instantticket.data.model.api.request.FetchMobileTicketFareRequestApiModel;
import app.chalo.instantticket.data.model.api.response.FetchMobileTicketFareResponseApiModel;
import app.chalo.instantticket.data.model.api.response.PassengerDetailApiModel$$serializer;
import app.chalo.instantticket.ui.faredetails.FareDetailsScreenType;
import app.chalo.instantticket.ui.faredetails.FareDetailsScreenType$ONDCTicket$$serializer;
import app.chalo.ncmc.domain.FetchChaloCardRechargeConfigurationFailureReason;
import app.chalo.ncmc.domain.FetchChaloCardTransactionsFailureReason;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.FareBreakupItem$$serializer;
import app.chalo.premiumbus.data.FareBreakupComponentWrapper$$serializer;
import app.chalo.premiumbus.data.FareInfoAppModel;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel$$serializer;
import app.chalo.premiumbus.data.models.api.response.SeatInfoApiModel$$serializer;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel$$serializer;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.data.models.app.FareDetailsRouteData;
import app.chalo.productbooking.common.data.models.app.ProductBookingSpecialFeature$$serializer;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.superpass.data.models.entities.FareBreakupComponent$$serializer;
import app.chalo.superpass.data.models.entities.FareInfo;
import app.chalo.usecase.FeedbackConfig;
import app.chalo.usecase.FeedbackData;
import app.chalo.usecase.FeedbackData$$serializer;
import app.chalo.usecase.FeedbackTags$$serializer;
import chalo_app_kmm.shared.chalo_base.generated.resources.Font0_commonMainKt;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Angle$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$CheckBox$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Color$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$DropDown$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Layer$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Point$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Slider$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Unsupported$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.FillEffect;
import io.github.alexzhirkevich.compottie.internal.effects.FillEffect$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffectsState;
import io.github.alexzhirkevich.compottie.internal.helpers.BooleanIntSerializer;
import io.github.alexzhirkevich.compottie.internal.shapes.FillShape;
import io.ktor.http.FileContentTypeKt;
import io.ktor.http.MimesKt;
import io.ktor.util.CaseInsensitiveMap;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.compose.resources.FontResource;
import org.jetbrains.compose.resources.ResourceItem;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157a;

    public /* synthetic */ a30(int i) {
        this.f157a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 7;
        switch (this.f157a) {
            case 0:
                FareDetailsData.Companion companion = FareDetailsData.INSTANCE;
                return new ArrayListSerializer(ProductBookingSpecialFeature$$serializer.f8198a);
            case 1:
                FareDetailsData.Companion companion2 = FareDetailsData.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 2:
                FareDetailsData.Companion companion3 = FareDetailsData.INSTANCE;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 3:
                FareDetailsData.Companion companion4 = FareDetailsData.INSTANCE;
                return new ArrayListSerializer(SeatInfoAppModel$$serializer.f7123a);
            case 4:
                FareDetailsRouteData.Companion companion5 = FareDetailsRouteData.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 5:
                FareDetailsScreenType.Companion companion6 = FareDetailsScreenType.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.instantticket.ui.faredetails.FareDetailsScreenType", Reflection.a(FareDetailsScreenType.class), new KClass[]{Reflection.a(FareDetailsScreenType.InstantTicket.class), Reflection.a(FareDetailsScreenType.ONDCTicket.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.instantticket.ui.faredetails.FareDetailsScreenType.InstantTicket", FareDetailsScreenType.InstantTicket.INSTANCE, new Annotation[0]), FareDetailsScreenType$ONDCTicket$$serializer.f3909a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 6:
                return new ObjectSerializer("app.chalo.instantticket.ui.faredetails.FareDetailsScreenType.InstantTicket", FareDetailsScreenType.InstantTicket.INSTANCE, new Annotation[0]);
            case 7:
                FareInfo.Companion companion7 = FareInfo.INSTANCE;
                return new ArrayListSerializer(FareBreakupComponent$$serializer.f9544a);
            case 8:
                app.chalo.premiumbus.bulkbookingridedetails.data.model.api.FareInfo.Companion companion8 = app.chalo.premiumbus.bulkbookingridedetails.data.model.api.FareInfo.INSTANCE;
                return new ArrayListSerializer(FareBreakupItem$$serializer.f6875a);
            case 9:
                FareInfoAppModel.Companion companion9 = FareInfoAppModel.INSTANCE;
                return new ArrayListSerializer(FareBreakupComponentWrapper$$serializer.f6947a);
            case 10:
                FareRequestFilters.Companion companion10 = FareRequestFilters.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.instantticket.data.model.api.request.FareRequestFilters", Reflection.a(FareRequestFilters.class), new KClass[]{Reflection.a(FareRequestFilters.InstantTicketFilter.class), Reflection.a(FareRequestFilters.OndcTicketFilter.class), Reflection.a(FareRequestFilters.PremiumReserveTicketFilter.class)}, new KSerializer[]{FareRequestFilters$InstantTicketFilter$$serializer.f3846a, FareRequestFilters$OndcTicketFilter$$serializer.f3847a, FareRequestFilters$PremiumReserveTicketFilter$$serializer.f3848a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 11:
                FeedbackConfig.Companion companion11 = FeedbackConfig.INSTANCE;
                return new ArrayListSerializer(FeedbackData$$serializer.f10170a);
            case 12:
                FeedbackData.Companion companion12 = FeedbackData.Companion;
                IntSerializer intSerializer = IntSerializer.f18146a;
                return new PairSerializer(intSerializer, intSerializer);
            case 13:
                FeedbackData.Companion companion13 = FeedbackData.Companion;
                return new ArrayListSerializer(FeedbackTags$$serializer.f10173a);
            case 14:
                FetchBannerResponseApiModel.Companion companion14 = FetchBannerResponseApiModel.INSTANCE;
                return new ArrayListSerializer(BannerDataResponseApiModel$$serializer.f2919a);
            case 15:
                FetchBannerResponseAppModel.Companion companion15 = FetchBannerResponseAppModel.INSTANCE;
                return new ArrayListSerializer(BannerDataResponseAppModel$$serializer.f2952a);
            case 16:
                return FetchChaloCardRechargeConfigurationFailureReason._init_$_anonymous_();
            case 17:
                return FetchChaloCardTransactionsFailureReason._init_$_anonymous_();
            case 18:
                FetchMobileTicketFareRequestApiModel.Companion companion16 = FetchMobileTicketFareRequestApiModel.INSTANCE;
                return new ArrayListSerializer(SeatInfoApiModel$$serializer.f7063a);
            case 19:
                FetchMobileTicketFareResponseApiModel.Companion companion17 = FetchMobileTicketFareResponseApiModel.INSTANCE;
                return new ArrayListSerializer(PassengerDetailApiModel$$serializer.f3874a);
            case 20:
                FetchMobileTicketFareResponseApiModel.Companion companion18 = FetchMobileTicketFareResponseApiModel.INSTANCE;
                return new ArrayListSerializer(ApplicableRuleApiResponseModel$$serializer.f7015a);
            case 21:
                Lazy lazy = FileContentTypeKt.f16792a;
                CaseInsensitiveMap caseInsensitiveMap = new CaseInsensitiveMap();
                caseInsensitiveMap.putAll(FileContentTypeKt.a(CollectionsKt.o((List) MimesKt.f16805a.getValue())));
                return caseInsensitiveMap;
            case 22:
                Lazy lazy2 = FileContentTypeKt.f16792a;
                return FileContentTypeKt.a(SequencesKt.m(CollectionsKt.o((List) MimesKt.f16805a.getValue()), new z20(i)));
            case 23:
                FillEffect.Companion companion19 = FillEffect.INSTANCE;
                ClassReference classReferenceA = Reflection.a(EffectValue.class);
                KClass[] kClassArr = {Reflection.a(EffectValue.Angle.class), Reflection.a(EffectValue.CheckBox.class), Reflection.a(EffectValue.Color.class), Reflection.a(EffectValue.DropDown.class), Reflection.a(EffectValue.Layer.class), Reflection.a(EffectValue.Point.class), Reflection.a(EffectValue.Slider.class), Reflection.a(EffectValue.Unsupported.class)};
                KSerializer[] kSerializerArr = {EffectValue$Angle$$serializer.f16197a, EffectValue$CheckBox$$serializer.f16199a, EffectValue$Color$$serializer.f16201a, EffectValue$DropDown$$serializer.f16204a, EffectValue$Layer$$serializer.f16206a, EffectValue$Point$$serializer.f16208a, EffectValue$Slider$$serializer.f16210a, EffectValue$Unsupported$$serializer.f16212a};
                Annotation[] annotationArr = {new FillEffect$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0()};
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("io.github.alexzhirkevich.compottie.internal.effects.EffectValue", classReferenceA, kClassArr, kSerializerArr);
                sealedClassSerializer3.b = ArraysKt.e(annotationArr);
                return new ArrayListSerializer(sealedClassSerializer3);
            case 24:
                FillEffect.Companion companion20 = FillEffect.INSTANCE;
                return new BooleanIntSerializer();
            case 25:
                FillShape.Companion companion21 = FillShape.INSTANCE;
                return Rect.INSTANCE.getZero();
            case 26:
                FillShape.Companion companion22 = FillShape.INSTANCE;
                return new PolymorphicSerializer(Reflection.a(Paint.class), new Annotation[0]);
            case 27:
                FillShape.Companion companion23 = FillShape.INSTANCE;
                return new LayerEffectsState();
            case 28:
                FillShape.Companion companion24 = FillShape.INSTANCE;
                return new LayerEffectsState();
            default:
                Lazy lazy3 = Font0_commonMainKt.f11293a;
                return new FontResource("font:notosansbold", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/font/notosansbold.ttf", -1L, -1L)));
        }
    }
}
