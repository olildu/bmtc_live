package defpackage;

import androidx.core.app.FrameMetricsAggregator;
import androidx.datastore.preferences.core.Preferences;
import app.chalo.login.data.exceptions.LoginVerificationFailedException;
import app.chalo.login.data.exceptions.UserConsentStatusFetchFailedException;
import app.chalo.login.data.exceptions.UserConsentUpdateFailedException;
import app.chalo.login.ui.LoginLoadingPurpose;
import app.chalo.login.ui.otp.LoginOtpEnterDataState;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionDataState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoDataState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoMissingFieldError;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoSnackBarType;
import app.chalo.network.model.GenericChaloErrorResponse;
import io.github.alexzhirkevich.compottie.internal.LottieJsonKt;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedColor;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedGradient;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedNumber;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedShape;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedVector2;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedVectorN;
import io.github.alexzhirkevich.compottie.internal.assets.ImageAsset;
import io.github.alexzhirkevich.compottie.internal.assets.LottieAsset;
import io.github.alexzhirkevich.compottie.internal.assets.PrecompositionAsset;
import io.github.alexzhirkevich.compottie.internal.effects.BlurEffect;
import io.github.alexzhirkevich.compottie.internal.effects.DropShadowEffect;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue;
import io.github.alexzhirkevich.compottie.internal.effects.FillEffect;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffect;
import io.github.alexzhirkevich.compottie.internal.effects.TintEffect;
import io.github.alexzhirkevich.compottie.internal.layers.ImageLayer;
import io.github.alexzhirkevich.compottie.internal.layers.Layer;
import io.github.alexzhirkevich.compottie.internal.layers.NullLayer;
import io.github.alexzhirkevich.compottie.internal.layers.PrecompositionLayer;
import io.github.alexzhirkevich.compottie.internal.layers.ShapeLayer;
import io.github.alexzhirkevich.compottie.internal.layers.SolidColorLayer;
import io.github.alexzhirkevich.compottie.internal.layers.TextLayer;
import io.github.alexzhirkevich.compottie.internal.shapes.EllipseShape;
import io.github.alexzhirkevich.compottie.internal.shapes.FillShape;
import io.github.alexzhirkevich.compottie.internal.shapes.GradientFillShape;
import io.github.alexzhirkevich.compottie.internal.shapes.GradientStrokeShape;
import io.github.alexzhirkevich.compottie.internal.shapes.GroupShape;
import io.github.alexzhirkevich.compottie.internal.shapes.MergePathsShape;
import io.github.alexzhirkevich.compottie.internal.shapes.PathShape;
import io.github.alexzhirkevich.compottie.internal.shapes.PolystarShape;
import io.github.alexzhirkevich.compottie.internal.shapes.RectShape;
import io.github.alexzhirkevich.compottie.internal.shapes.RepeaterShape;
import io.github.alexzhirkevich.compottie.internal.shapes.RoundShape;
import io.github.alexzhirkevich.compottie.internal.shapes.Shape;
import io.github.alexzhirkevich.compottie.internal.shapes.SolidStrokeShape;
import io.github.alexzhirkevich.compottie.internal.shapes.TransformShape;
import io.github.alexzhirkevich.compottie.internal.shapes.TrimPathShape;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.modules.PolymorphicModuleBuilder;
import kotlinx.serialization.modules.SerializersModuleBuilder;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ag0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285a;

    public /* synthetic */ ag0(int i) {
        this.f285a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f285a) {
            case 0:
                return LoginOtpEnterDataState.a((LoginOtpEnterDataState) obj, null, false, null, false, 0L, false, null, null, null, null, 2045);
            case 1:
                return LoginOtpEnterDataState.a((LoginOtpEnterDataState) obj, null, true, LoginLoadingPurpose.VERIFYING_LOGIN, false, 0L, false, null, null, null, null, 2041);
            case 2:
                return LoginOtpEnterDataState.a((LoginOtpEnterDataState) obj, null, false, null, true, 0L, false, null, null, null, null, 2029);
            case 3:
                return LoginOtpEnterDataState.a((LoginOtpEnterDataState) obj, null, false, null, false, 0L, false, null, null, null, null, 2045);
            case 4:
                return LoginOtpEnterDataState.a((LoginOtpEnterDataState) obj, null, false, null, false, 0L, false, null, null, null, null, 2045);
            case 5:
                return LoginOtpEnterDataState.a((LoginOtpEnterDataState) obj, null, false, null, false, 0L, false, null, null, null, null, 2045);
            case 6:
                return LoginOtpEnterDataState.a((LoginOtpEnterDataState) obj, null, false, null, false, 0L, false, null, null, null, null, 2045);
            case 7:
                return LoginOtpEnterDataState.a((LoginOtpEnterDataState) obj, null, false, null, false, 0L, false, null, null, null, null, 2045);
            case 8:
                return LoginOtpEnterDataState.a((LoginOtpEnterDataState) obj, null, false, null, false, 0L, false, null, null, null, null, 2045);
            case 9:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new UserConsentStatusFetchFailedException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 10:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new UserConsentUpdateFailedException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 11:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                return new LoginVerificationFailedException(genericChaloErrorResponse3, genericChaloErrorResponse3 != null ? genericChaloErrorResponse3.b : null);
            case 12:
                JsonBuilder Json = (JsonBuilder) obj;
                Lazy lazy = LottieJsonKt.f16127a;
                Intrinsics.i(Json, "$this$Json");
                Json.c = true;
                Json.d = true;
                Json.k = true;
                SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
                PolymorphicModuleBuilder polymorphicModuleBuilder = new PolymorphicModuleBuilder(Reflection.a(Layer.class));
                polymorphicModuleBuilder.c(Reflection.a(ShapeLayer.class), ShapeLayer.INSTANCE.serializer());
                polymorphicModuleBuilder.c(Reflection.a(NullLayer.class), NullLayer.INSTANCE.serializer());
                polymorphicModuleBuilder.c(Reflection.a(ImageLayer.class), ImageLayer.INSTANCE.serializer());
                polymorphicModuleBuilder.c(Reflection.a(PrecompositionLayer.class), PrecompositionLayer.INSTANCE.serializer());
                polymorphicModuleBuilder.c(Reflection.a(TextLayer.class), TextLayer.INSTANCE.serializer());
                polymorphicModuleBuilder.c(Reflection.a(SolidColorLayer.class), SolidColorLayer.INSTANCE.serializer());
                polymorphicModuleBuilder.b(new ag0(13));
                polymorphicModuleBuilder.a(serializersModuleBuilder);
                PolymorphicModuleBuilder polymorphicModuleBuilder2 = new PolymorphicModuleBuilder(Reflection.a(LottieAsset.class));
                polymorphicModuleBuilder2.c(Reflection.a(ImageAsset.class), ImageAsset.INSTANCE.serializer());
                polymorphicModuleBuilder2.c(Reflection.a(PrecompositionAsset.class), PrecompositionAsset.INSTANCE.serializer());
                polymorphicModuleBuilder2.b(new ag0(14));
                polymorphicModuleBuilder2.a(serializersModuleBuilder);
                PolymorphicModuleBuilder polymorphicModuleBuilder3 = new PolymorphicModuleBuilder(Reflection.a(Shape.class));
                polymorphicModuleBuilder3.c(Reflection.a(EllipseShape.class), EllipseShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(FillShape.class), FillShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(GradientFillShape.class), GradientFillShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(GradientStrokeShape.class), GradientStrokeShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(GroupShape.class), GroupShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(MergePathsShape.class), MergePathsShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(PathShape.class), PathShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(PolystarShape.class), PolystarShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(RectShape.class), RectShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(RepeaterShape.class), RepeaterShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(RoundShape.class), RoundShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(SolidStrokeShape.class), SolidStrokeShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(TransformShape.class), TransformShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.c(Reflection.a(TrimPathShape.class), TrimPathShape.INSTANCE.serializer());
                polymorphicModuleBuilder3.b(new ag0(15));
                polymorphicModuleBuilder3.a(serializersModuleBuilder);
                PolymorphicModuleBuilder polymorphicModuleBuilder4 = new PolymorphicModuleBuilder(Reflection.a(LayerEffect.class));
                polymorphicModuleBuilder4.c(Reflection.a(BlurEffect.class), BlurEffect.INSTANCE.serializer());
                polymorphicModuleBuilder4.c(Reflection.a(FillEffect.class), FillEffect.INSTANCE.serializer());
                polymorphicModuleBuilder4.c(Reflection.a(TintEffect.class), TintEffect.INSTANCE.serializer());
                polymorphicModuleBuilder4.c(Reflection.a(DropShadowEffect.class), DropShadowEffect.INSTANCE.serializer());
                polymorphicModuleBuilder4.b(new ag0(16));
                polymorphicModuleBuilder4.a(serializersModuleBuilder);
                PolymorphicModuleBuilder polymorphicModuleBuilder5 = new PolymorphicModuleBuilder(Reflection.a(EffectValue.class));
                polymorphicModuleBuilder5.c(Reflection.a(EffectValue.Angle.class), EffectValue.Angle.INSTANCE.serializer());
                polymorphicModuleBuilder5.c(Reflection.a(EffectValue.CheckBox.class), EffectValue.CheckBox.INSTANCE.serializer());
                polymorphicModuleBuilder5.c(Reflection.a(EffectValue.Color.class), EffectValue.Color.INSTANCE.serializer());
                polymorphicModuleBuilder5.c(Reflection.a(EffectValue.DropDown.class), EffectValue.DropDown.INSTANCE.serializer());
                polymorphicModuleBuilder5.c(Reflection.a(EffectValue.Layer.class), EffectValue.Layer.INSTANCE.serializer());
                polymorphicModuleBuilder5.c(Reflection.a(EffectValue.Point.class), EffectValue.Point.INSTANCE.serializer());
                polymorphicModuleBuilder5.c(Reflection.a(EffectValue.Slider.class), EffectValue.Slider.INSTANCE.serializer());
                polymorphicModuleBuilder5.b(new ag0(17));
                polymorphicModuleBuilder5.a(serializersModuleBuilder);
                PolymorphicModuleBuilder polymorphicModuleBuilder6 = new PolymorphicModuleBuilder(Reflection.a(AnimatedColor.class));
                polymorphicModuleBuilder6.c(Reflection.a(AnimatedColor.Default.class), AnimatedColor.Default.INSTANCE.serializer());
                polymorphicModuleBuilder6.c(Reflection.a(AnimatedColor.Animated.class), AnimatedColor.Animated.INSTANCE.serializer());
                polymorphicModuleBuilder6.c(Reflection.a(AnimatedColor.Slottable.class), AnimatedColor.Slottable.INSTANCE.serializer());
                polymorphicModuleBuilder6.a(serializersModuleBuilder);
                PolymorphicModuleBuilder polymorphicModuleBuilder7 = new PolymorphicModuleBuilder(Reflection.a(AnimatedGradient.class));
                polymorphicModuleBuilder7.c(Reflection.a(AnimatedGradient.Default.class), AnimatedGradient.Default.INSTANCE.serializer());
                polymorphicModuleBuilder7.c(Reflection.a(AnimatedGradient.Animated.class), AnimatedGradient.Animated.INSTANCE.serializer());
                polymorphicModuleBuilder7.c(Reflection.a(AnimatedGradient.Slottable.class), AnimatedGradient.Slottable.INSTANCE.serializer());
                polymorphicModuleBuilder7.a(serializersModuleBuilder);
                PolymorphicModuleBuilder polymorphicModuleBuilder8 = new PolymorphicModuleBuilder(Reflection.a(AnimatedShape.class));
                polymorphicModuleBuilder8.c(Reflection.a(AnimatedShape.Default.class), AnimatedShape.Default.INSTANCE.serializer());
                polymorphicModuleBuilder8.c(Reflection.a(AnimatedShape.Animated.class), AnimatedShape.Animated.INSTANCE.serializer());
                polymorphicModuleBuilder8.c(Reflection.a(AnimatedShape.Slottable.class), AnimatedShape.Slottable.INSTANCE.serializer());
                polymorphicModuleBuilder8.a(serializersModuleBuilder);
                PolymorphicModuleBuilder polymorphicModuleBuilder9 = new PolymorphicModuleBuilder(Reflection.a(AnimatedNumber.class));
                polymorphicModuleBuilder9.c(Reflection.a(AnimatedNumber.Default.class), AnimatedNumber.Default.INSTANCE.serializer());
                polymorphicModuleBuilder9.c(Reflection.a(AnimatedNumber.Animated.class), AnimatedNumber.Animated.INSTANCE.serializer());
                polymorphicModuleBuilder9.c(Reflection.a(AnimatedNumber.Slottable.class), AnimatedNumber.Slottable.INSTANCE.serializer());
                polymorphicModuleBuilder9.a(serializersModuleBuilder);
                PolymorphicModuleBuilder polymorphicModuleBuilder10 = new PolymorphicModuleBuilder(Reflection.a(AnimatedVector2.class));
                polymorphicModuleBuilder10.c(Reflection.a(AnimatedVector2.Default.class), AnimatedVector2.Default.INSTANCE.serializer());
                polymorphicModuleBuilder10.c(Reflection.a(AnimatedVector2.Animated.class), AnimatedVector2.Animated.INSTANCE.serializer());
                polymorphicModuleBuilder10.c(Reflection.a(AnimatedVector2.Split.class), AnimatedVector2.Split.INSTANCE.serializer());
                polymorphicModuleBuilder10.c(Reflection.a(AnimatedVector2.Slottable.class), AnimatedVector2.Slottable.INSTANCE.serializer());
                polymorphicModuleBuilder10.a(serializersModuleBuilder);
                PolymorphicModuleBuilder polymorphicModuleBuilder11 = new PolymorphicModuleBuilder(Reflection.a(AnimatedVectorN.class));
                polymorphicModuleBuilder11.c(Reflection.a(AnimatedVectorN.Default.class), AnimatedVectorN.Default.INSTANCE.serializer());
                polymorphicModuleBuilder11.c(Reflection.a(AnimatedVectorN.Animated.class), AnimatedVectorN.Animated.INSTANCE.serializer());
                polymorphicModuleBuilder11.a(serializersModuleBuilder);
                Json.n = serializersModuleBuilder.f();
                return Unit.f17538a;
            case 13:
                Lazy lazy2 = LottieJsonKt.f16127a;
                return NullLayer.INSTANCE.serializer();
            case 14:
                Lazy lazy3 = LottieJsonKt.f16127a;
                return LottieAsset.Unsupported.INSTANCE.serializer();
            case 15:
                Lazy lazy4 = LottieJsonKt.f16127a;
                return Shape.Unsupported.INSTANCE.serializer();
            case 16:
                Lazy lazy5 = LottieJsonKt.f16127a;
                return LayerEffect.Unsupported.INSTANCE.serializer();
            case 17:
                Lazy lazy6 = LottieJsonKt.f16127a;
                return EffectValue.Unsupported.INSTANCE.serializer();
            case 18:
                MTicketPassengerSelectionDataState it = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it, "it");
                return MTicketPassengerSelectionDataState.a(it, null, null, null, false, null, null, null, false, false, MTicketTripInfoSnackBarType.FetchingFareDetails.f5779a, null, false, null, null, null, false, 65023);
            case 19:
                MTicketPassengerSelectionDataState it2 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key2 = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it2, "it");
                return MTicketPassengerSelectionDataState.a(it2, null, null, null, false, null, null, null, false, true, null, null, false, null, null, null, false, 65151);
            case 20:
                MTicketPassengerSelectionDataState it3 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key3 = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it3, "it");
                return MTicketPassengerSelectionDataState.a(it3, null, null, null, false, null, null, null, false, false, null, null, true, null, null, null, false, 63487);
            case 21:
                MTicketPassengerSelectionDataState it4 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key4 = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it4, "it");
                return MTicketPassengerSelectionDataState.a(it4, null, null, null, false, null, null, null, false, false, MTicketTripInfoSnackBarType.FareFetchFailed.f5778a, null, false, null, null, null, false, 65023);
            case 22:
                MTicketPassengerSelectionDataState it5 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key5 = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it5, "it");
                return MTicketPassengerSelectionDataState.a(it5, null, null, null, false, null, null, null, true, false, null, null, false, null, null, null, false, 65407);
            case 23:
                MTicketPassengerSelectionDataState it6 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key6 = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it6, "it");
                return MTicketPassengerSelectionDataState.a(it6, null, null, null, false, null, null, null, false, false, null, null, false, null, null, null, false, 63487);
            case 24:
                MTicketPassengerSelectionDataState it7 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key7 = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it7, "it");
                return MTicketPassengerSelectionDataState.a(it7, null, null, null, false, null, null, null, true, false, null, null, false, null, null, null, false, 65407);
            case 25:
                MTicketPassengerSelectionDataState it8 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key8 = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it8, "it");
                return MTicketPassengerSelectionDataState.a(it8, null, null, null, false, null, null, null, false, false, null, null, false, null, null, null, !it8.p, 32767);
            case 26:
                MTicketPassengerSelectionDataState it9 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key9 = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it9, "it");
                return MTicketPassengerSelectionDataState.a(it9, null, null, null, false, null, null, null, true, false, null, null, false, null, null, null, false, 65407);
            case 27:
                MTicketPassengerSelectionDataState it10 = (MTicketPassengerSelectionDataState) obj;
                Preferences.Key key10 = MTicketPassengerSelectionComponent.D;
                Intrinsics.i(it10, "it");
                return MTicketPassengerSelectionDataState.a(it10, null, null, null, false, null, null, null, false, false, null, null, false, null, null, null, false, 65407);
            case 28:
                return MTicketPassengerSelectionDataState.a((MTicketPassengerSelectionDataState) obj, null, null, null, false, null, null, null, false, false, null, null, false, null, null, null, false, 49151);
            default:
                MTicketTripInfoDataState it11 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it11, "it");
                return MTicketTripInfoDataState.a(it11, null, null, null, null, null, false, null, null, MTicketTripInfoMissingFieldError.ROUTE, FrameMetricsAggregator.EVERY_DURATION);
        }
    }
}
