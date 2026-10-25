package defpackage;

import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.material3.DefaultShortNavigationBarOverride;
import androidx.compose.material3.ShapesKt;
import app.chalo.citydata.data.model.api.response.RouteTimeTableOldApiModel$$serializer;
import app.chalo.citydata.data.model.api.response.ShortTripOldApiModel;
import app.chalo.citydata.data.model.app.RouteTiming;
import app.chalo.citydata.data.model.app.ShortTripTimingAppModel;
import app.chalo.ncmc.data.apiresponsemodel.SemiClosedCardActivePassApiResponse$$serializer;
import app.chalo.ncmc.data.apiresponsemodel.SemiClosedCardInfoApiResponse;
import app.chalo.ncmc.data.appmodel.SemiClosedCardActivePassAppModel$$serializer;
import app.chalo.ncmc.data.appmodel.SemiClosedCardInfo;
import app.chalo.network.utils.SecureJNI;
import app.chalo.premiumbus.data.models.api.response.SlotSearchRequestApiModel;
import app.chalo.premiumbus.data.models.app.SlotSearchRequestAppModel;
import app.chalo.productbooking.common.data.models.app.response.PBBulkBookingAvailableSlotsTripAppResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.app.response.SlotAvailableOnDateInfo;
import app.chalo.scenes.args.SosArgs;
import app.chalo.sos.official.SosOfficialContactConfigApiModel;
import app.chalo.sos.official.SosOfficialContactEligibilityApiModel;
import app.chalo.sos.official.SosOfficialContactEntryApiModel$$serializer;
import app.chalo.uistate.dialog.DateAvailabilityStatus;
import coil3.util.Collections_jvmCommonKt;
import coil3.util.DecoderServiceLoaderTarget;
import coil3.util.FetcherServiceLoaderTarget;
import coil3.util.ServiceLoaderComponentRegistry;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffect;
import io.github.alexzhirkevich.compottie.internal.helpers.BooleanIntSerializer;
import io.github.alexzhirkevich.compottie.internal.helpers.Mask$$serializer;
import io.github.alexzhirkevich.compottie.internal.helpers.StrokeDash$$serializer;
import io.github.alexzhirkevich.compottie.internal.layers.ShapeLayer;
import io.github.alexzhirkevich.compottie.internal.layers.ShapeLayer$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0;
import io.github.alexzhirkevich.compottie.internal.layers.SolidColorLayer;
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
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z61 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20170a;

    public /* synthetic */ z61(int i) {
        this.f20170a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20170a) {
            case 0:
                return SelectionContainerKt.SelectionContainer$lambda$5$0();
            case 1:
                return SelectionRegistrarKt.LocalSelectionRegistrar$lambda$0();
            case 2:
                SemiClosedCardInfo.Companion companion = SemiClosedCardInfo.INSTANCE;
                return new ArrayListSerializer(SemiClosedCardActivePassAppModel$$serializer.f6156a);
            case 3:
                SemiClosedCardInfoApiResponse.Companion companion2 = SemiClosedCardInfoApiResponse.Companion;
                return new ArrayListSerializer(SemiClosedCardActivePassApiResponse$$serializer.f6106a);
            case 4:
                Lazy lazy = ServiceLoaderComponentRegistry.f11620a;
                return Collections_jvmCommonKt.a(SequencesKt.q(SequencesKt.b(ServiceLoader.load(FetcherServiceLoaderTarget.class, FetcherServiceLoaderTarget.class.getClassLoader()).iterator())));
            case 5:
                Lazy lazy2 = ServiceLoaderComponentRegistry.f11620a;
                return Collections_jvmCommonKt.a(SequencesKt.q(SequencesKt.b(ServiceLoader.load(DecoderServiceLoaderTarget.class, DecoderServiceLoaderTarget.class.getClassLoader()).iterator())));
            case 6:
                ShapeLayer.Companion companion3 = ShapeLayer.Companion;
                return new BooleanIntSerializer();
            case 7:
                ShapeLayer.Companion companion4 = ShapeLayer.Companion;
                return new ArrayListSerializer(LayerEffect.INSTANCE.serializer());
            case 8:
                ShapeLayer.Companion companion5 = ShapeLayer.Companion;
                return new BooleanIntSerializer();
            case 9:
                ShapeLayer.Companion companion6 = ShapeLayer.Companion;
                return new ArrayListSerializer(Mask$$serializer.f16239a);
            case 10:
                ShapeLayer.Companion companion7 = ShapeLayer.Companion;
                ClassReference classReferenceA = Reflection.a(Shape.class);
                KClass[] kClassArr = {Reflection.a(EllipseShape.class), Reflection.a(FillShape.class), Reflection.a(GradientFillShape.class), Reflection.a(GradientStrokeShape.class), Reflection.a(GroupShape.class), Reflection.a(MergePathsShape.class), Reflection.a(PathShape.class), Reflection.a(PolystarShape.class), Reflection.a(RectShape.class), Reflection.a(RepeaterShape.class), Reflection.a(RoundShape.class), Reflection.a(Shape.Unsupported.class), Reflection.a(SolidStrokeShape.class), Reflection.a(TransformShape.class), Reflection.a(TrimPathShape.class)};
                KSerializer[] kSerializerArr = {EllipseShape$$serializer.f16294a, FillShape$$serializer.f16296a, GradientFillShape$$serializer.f16298a, GradientStrokeShape$$serializer.f16299a, GroupShape$$serializer.f16301a, MergePathsShape$$serializer.f16309a, PathShape$$serializer.f16312a, PolystarShape$$serializer.f16314a, RectShape$$serializer.f16316a, RepeaterShape$$serializer.f16318a, RoundShape$$serializer.f16320a, Shape$Unsupported$$serializer.f16322a, SolidStrokeShape$$serializer.f16323a, TransformShape$$serializer.f16326a, TrimPathShape$$serializer.f16328a};
                Annotation[] annotationArr = {new ShapeLayer$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0()};
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("io.github.alexzhirkevich.compottie.internal.shapes.Shape", classReferenceA, kClassArr, kSerializerArr);
                sealedClassSerializer.b = ArraysKt.e(annotationArr);
                return new ArrayListSerializer(sealedClassSerializer);
            case 11:
                return ShapesKt.LocalShapes$lambda$0();
            case 12:
                return SecureJNI.INSTANCE.getVaultKey();
            case 13:
                return DefaultShortNavigationBarOverride.INSTANCE;
            case 14:
                ShortTripOldApiModel.Companion companion8 = ShortTripOldApiModel.Companion;
                return new ArrayListSerializer(RouteTimeTableOldApiModel$$serializer.f1685a);
            case 15:
                ShortTripTimingAppModel.Companion companion9 = ShortTripTimingAppModel.Companion;
                return new ArrayListSerializer(RouteTiming.INSTANCE.serializer());
            case 16:
                SlotAvailableOnDateInfo.Companion companion10 = SlotAvailableOnDateInfo.INSTANCE;
                return EnumsKt.b("app.chalo.uistate.dialog.DateAvailabilityStatus", DateAvailabilityStatus.values());
            case 17:
                SlotAvailableOnDateInfo.Companion companion11 = SlotAvailableOnDateInfo.INSTANCE;
                return new ArrayListSerializer(PBBulkBookingAvailableSlotsTripAppResponseModel$$serializer.f8237a);
            case 18:
                SlotSearchRequestApiModel.Companion companion12 = SlotSearchRequestApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 19:
                SlotSearchRequestAppModel.Companion companion13 = SlotSearchRequestAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 20:
                return Unit.f17538a;
            case 21:
                SolidColorLayer.Companion companion14 = SolidColorLayer.Companion;
                return new BooleanIntSerializer();
            case 22:
                SolidColorLayer.Companion companion15 = SolidColorLayer.Companion;
                return new BooleanIntSerializer();
            case 23:
                SolidColorLayer.Companion companion16 = SolidColorLayer.Companion;
                return new ArrayListSerializer(Mask$$serializer.f16239a);
            case 24:
                SolidColorLayer.Companion companion17 = SolidColorLayer.Companion;
                return new ArrayListSerializer(LayerEffect.INSTANCE.serializer());
            case 25:
                SolidStrokeShape.Companion companion18 = SolidStrokeShape.Companion;
                return new ArrayListSerializer(StrokeDash$$serializer.f16246a);
            case 26:
                SosArgs.Companion companion19 = SosArgs.INSTANCE;
                StringSerializer stringSerializer = StringSerializer.f18170a;
                return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
            case 27:
                SosOfficialContactConfigApiModel.Companion companion20 = SosOfficialContactConfigApiModel.INSTANCE;
                return new ArrayListSerializer(SosOfficialContactEntryApiModel$$serializer.f9455a);
            case 28:
                SosOfficialContactEligibilityApiModel.Companion companion21 = SosOfficialContactEligibilityApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            default:
                SosOfficialContactEligibilityApiModel.Companion companion22 = SosOfficialContactEligibilityApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
        }
    }
}
