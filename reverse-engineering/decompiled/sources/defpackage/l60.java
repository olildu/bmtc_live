package defpackage;

import androidx.compose.ui.graphics.Paint;
import app.chalo.data.ProductBookingBranding;
import app.chalo.instantticket.data.model.api.response.FareBreakupApiModel$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.GroupTicketJourneyLeg;
import app.chalo.livetracking.tripplanner.data.models.app.GroupTicketJourneyLeg$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.GroupTicketJourneyModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.multimodalticket.data.model.GroupTicketLegFareDetailEntityModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketBookingFareRequestApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketBookingFareResponseApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketCategoriesApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketCategoriesApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderLegApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderMetroLineOverviewApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderMetroLineOverviewApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderPassengerDetailApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderRequestApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderStopApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketCreateOrderTripDetailApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketJourneyOverviewItemApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketJourneyOverviewItemApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketLegApiModelSerializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketLegBreakupApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketLegBreakupApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketLegFareDetailApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketLegFareDetailApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketMetroTripDetailsApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketStopDetailsApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryLegApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryMetroLineOverviewApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryMetroLineOverviewApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryPassengerDetailApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryRequestApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryResponseApiModel;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryStopApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketSummaryTripDetailApiModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketFareBreakupApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.entity.FareBreakupEntityModel$$serializer;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.args.GroupTicketBookingLeg;
import app.chalo.scenes.args.GroupTicketBookingLeg$$serializer;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import app.chalo.scenes.args.GroupTicketMetroLineOverview;
import app.chalo.scenes.args.GroupTicketPassengerDetail$$serializer;
import app.chalo.scenes.args.GroupTicketStop$$serializer;
import app.chalo.scenes.args.GroupTicketTripDetail;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffectsState;
import io.github.alexzhirkevich.compottie.internal.helpers.StrokeDash$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.EllipseShape;
import io.github.alexzhirkevich.compottie.internal.shapes.EllipseShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.FillShape;
import io.github.alexzhirkevich.compottie.internal.shapes.FillShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.GradientFillShape;
import io.github.alexzhirkevich.compottie.internal.shapes.GradientFillShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.GradientStrokeShape;
import io.github.alexzhirkevich.compottie.internal.shapes.GradientStrokeShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.GroupShape;
import io.github.alexzhirkevich.compottie.internal.shapes.GroupShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.GroupShape$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0;
import io.github.alexzhirkevich.compottie.internal.shapes.MergePathsShape;
import io.github.alexzhirkevich.compottie.internal.shapes.MergePathsShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.PathShape;
import io.github.alexzhirkevich.compottie.internal.shapes.PathShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.PolystarShape;
import io.github.alexzhirkevich.compottie.internal.shapes.PolystarShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.RectShape;
import io.github.alexzhirkevich.compottie.internal.shapes.RectShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.RepeaterShape;
import io.github.alexzhirkevich.compottie.internal.shapes.RepeaterShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.RoundShape;
import io.github.alexzhirkevich.compottie.internal.shapes.RoundShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.Shape;
import io.github.alexzhirkevich.compottie.internal.shapes.Shape$Unsupported$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.SolidStrokeShape;
import io.github.alexzhirkevich.compottie.internal.shapes.SolidStrokeShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.TransformShape;
import io.github.alexzhirkevich.compottie.internal.shapes.TransformShape$$serializer;
import io.github.alexzhirkevich.compottie.internal.shapes.TrimPathShape;
import io.github.alexzhirkevich.compottie.internal.shapes.TrimPathShape$$serializer;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18284a;

    public /* synthetic */ l60(int i) {
        this.f18284a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18284a) {
            case 0:
                GradientFillShape.Companion companion = GradientFillShape.INSTANCE;
                return new PolymorphicSerializer(Reflection.a(Paint.class), new Annotation[0]);
            case 1:
                GradientFillShape.Companion companion2 = GradientFillShape.INSTANCE;
                return new LayerEffectsState();
            case 2:
                GradientStrokeShape.Companion companion3 = GradientStrokeShape.INSTANCE;
                return new ArrayListSerializer(StrokeDash$$serializer.f16246a);
            case 3:
                GroupShape.Companion companion4 = GroupShape.INSTANCE;
                ClassReference classReferenceA = Reflection.a(Shape.class);
                KClass[] kClassArr = {Reflection.a(EllipseShape.class), Reflection.a(FillShape.class), Reflection.a(GradientFillShape.class), Reflection.a(GradientStrokeShape.class), Reflection.a(GroupShape.class), Reflection.a(MergePathsShape.class), Reflection.a(PathShape.class), Reflection.a(PolystarShape.class), Reflection.a(RectShape.class), Reflection.a(RepeaterShape.class), Reflection.a(RoundShape.class), Reflection.a(Shape.Unsupported.class), Reflection.a(SolidStrokeShape.class), Reflection.a(TransformShape.class), Reflection.a(TrimPathShape.class)};
                KSerializer[] kSerializerArr = {EllipseShape$$serializer.f16294a, FillShape$$serializer.f16296a, GradientFillShape$$serializer.f16298a, GradientStrokeShape$$serializer.f16299a, GroupShape$$serializer.f16301a, MergePathsShape$$serializer.f16309a, PathShape$$serializer.f16312a, PolystarShape$$serializer.f16314a, RectShape$$serializer.f16316a, RepeaterShape$$serializer.f16318a, RoundShape$$serializer.f16320a, Shape$Unsupported$$serializer.f16322a, SolidStrokeShape$$serializer.f16323a, TransformShape$$serializer.f16326a, TrimPathShape$$serializer.f16328a};
                Annotation[] annotationArr = {new GroupShape$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0()};
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("io.github.alexzhirkevich.compottie.internal.shapes.Shape", classReferenceA, kClassArr, kSerializerArr);
                sealedClassSerializer.b = ArraysKt.e(annotationArr);
                return new ArrayListSerializer(sealedClassSerializer);
            case 4:
                GroupTicketBookingFareRequestApiModel.Companion companion5 = GroupTicketBookingFareRequestApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketLegApiModelSerializer.c);
            case 5:
                GroupTicketBookingFareResponseApiModel.Companion companion6 = GroupTicketBookingFareResponseApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketCategoriesApiModel$$serializer.f5807a);
            case 6:
                GroupTicketBookingLeg.Companion companion7 = GroupTicketBookingLeg.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 7:
                GroupTicketBookingLeg.Companion companion8 = GroupTicketBookingLeg.INSTANCE;
                return GroupTicketTripDetail.INSTANCE.serializer();
            case 8:
                GroupTicketBookingLeg.Companion companion9 = GroupTicketBookingLeg.INSTANCE;
                return ProductBookingBranding.INSTANCE.serializer();
            case 9:
                GroupTicketBookingSummaryArgs.Companion companion10 = GroupTicketBookingSummaryArgs.INSTANCE;
                return new ArrayListSerializer(GroupTicketPassengerDetail$$serializer.f9259a);
            case 10:
                GroupTicketBookingSummaryArgs.Companion companion11 = GroupTicketBookingSummaryArgs.INSTANCE;
                return new ArrayListSerializer(GroupTicketBookingLeg$$serializer.f9253a);
            case 11:
                GroupTicketBookingSummaryArgs.Companion companion12 = GroupTicketBookingSummaryArgs.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 12:
                GroupTicketCategoriesApiModel.Companion companion13 = GroupTicketCategoriesApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketLegBreakupApiModel$$serializer.f5827a);
            case 13:
                GroupTicketCreateOrderMetroLineOverviewApiModel.Companion companion14 = GroupTicketCreateOrderMetroLineOverviewApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketCreateOrderStopApiModel$$serializer.f5817a);
            case 14:
                GroupTicketCreateOrderRequestApiModel.Companion companion15 = GroupTicketCreateOrderRequestApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketCreateOrderPassengerDetailApiModel$$serializer.f5813a);
            case 15:
                GroupTicketCreateOrderRequestApiModel.Companion companion16 = GroupTicketCreateOrderRequestApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketCreateOrderLegApiModel$$serializer.f5809a);
            case 16:
                GroupTicketCreateOrderTripDetailApiModel.Companion companion17 = GroupTicketCreateOrderTripDetailApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketCreateOrderMetroLineOverviewApiModel$$serializer.f5811a);
            case 17:
                GroupTicketJourneyLeg.Companion companion18 = GroupTicketJourneyLeg.INSTANCE;
                return TripPlannerLegAppModel.INSTANCE.serializer();
            case 18:
                GroupTicketJourneyModel.Companion companion19 = GroupTicketJourneyModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketJourneyLeg$$serializer.f4652a);
            case 19:
                GroupTicketJourneyOverviewItemApiModel.Companion companion20 = GroupTicketJourneyOverviewItemApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketStopDetailsApiModel$$serializer.f5833a);
            case 20:
                GroupTicketLegBreakupApiModel.Companion companion21 = GroupTicketLegBreakupApiModel.INSTANCE;
                return new ArrayListSerializer(GenericMobileTicketFareBreakupApiResponseModel$$serializer.f8121a);
            case 21:
                GroupTicketLegFareDetailApiModel.Companion companion22 = GroupTicketLegFareDetailApiModel.INSTANCE;
                return new ArrayListSerializer(FareBreakupApiModel$$serializer.f3862a);
            case 22:
                GroupTicketLegFareDetailEntityModel.Companion companion23 = GroupTicketLegFareDetailEntityModel.INSTANCE;
                return new ArrayListSerializer(FareBreakupEntityModel$$serializer.f8242a);
            case 23:
                GroupTicketMetroLineOverview.Companion companion24 = GroupTicketMetroLineOverview.INSTANCE;
                return new ArrayListSerializer(GroupTicketStop$$serializer.f9261a);
            case 24:
                GroupTicketMetroTripDetailsApiModel.Companion companion25 = GroupTicketMetroTripDetailsApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketJourneyOverviewItemApiModel$$serializer.f5821a);
            case 25:
                GroupTicketSummaryMetroLineOverviewApiModel.Companion companion26 = GroupTicketSummaryMetroLineOverviewApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketSummaryStopApiModel$$serializer.f5845a);
            case 26:
                GroupTicketSummaryRequestApiModel.Companion companion27 = GroupTicketSummaryRequestApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketSummaryPassengerDetailApiModel$$serializer.f5839a);
            case 27:
                GroupTicketSummaryRequestApiModel.Companion companion28 = GroupTicketSummaryRequestApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketSummaryLegApiModel$$serializer.f5835a);
            case 28:
                GroupTicketSummaryResponseApiModel.Companion companion29 = GroupTicketSummaryResponseApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketLegFareDetailApiModel$$serializer.f5829a);
            default:
                GroupTicketSummaryTripDetailApiModel.Companion companion30 = GroupTicketSummaryTripDetailApiModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketSummaryMetroLineOverviewApiModel$$serializer.f5837a);
        }
    }
}
