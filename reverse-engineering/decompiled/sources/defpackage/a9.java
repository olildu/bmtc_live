package defpackage;

import androidx.compose.foundation.text.BasicText_androidKt;
import app.chalo.constants.Source;
import app.chalo.location.LatLngSerializer;
import app.chalo.models.BasicCityInfoAppModel;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.bookinghelp.BookingHelpCityWiseRemoteConfigApiModel;
import app.chalo.models.bookinghelp.BookingHelpCityWiseRemoteConfigApiModel$$serializer;
import app.chalo.models.bookinghelp.BookingHelpFaq;
import app.chalo.models.bookinghelp.BookingHelpFaq$$serializer;
import app.chalo.models.bookinghelp.BookingHelpFaqActionType;
import app.chalo.models.bookinghelp.BookingHelpFaqGroupType;
import app.chalo.models.bookinghelp.BookingHelpFaqRemoteConfigApiModel;
import app.chalo.models.bookinghelp.BookingHelpFaqRemoteConfigApiModel$$serializer;
import app.chalo.models.bookinghelp.BookingHelpRemoteConfigApiModel;
import app.chalo.models.validation.BleValidationArgs;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.providers.cityprovider.impl.data.models.api.BasicCityDataApiModel;
import app.chalo.providers.cityprovider.impl.data.models.api.BasicCityDataApiModel$$serializer;
import app.chalo.providers.cityprovider.impl.data.models.api.BasicCityInfoApiModel;
import app.chalo.scenes.args.BookingCancellationTarget;
import app.chalo.scenes.args.BookingCancellationTarget$DirectMetro$$serializer;
import app.chalo.scenes.args.BookingCancellationTarget$Ondc$$serializer;
import app.chalo.scenes.args.BookingHelpArgs;
import app.chalo.scenes.args.BookingSuccessArgs;
import io.github.alexzhirkevich.compottie.internal.animation.BezierCoordinateSerializer;
import io.github.alexzhirkevich.compottie.internal.animation.BezierInterpolation;
import io.github.alexzhirkevich.compottie.internal.animation.BezierKeyframe;
import io.github.alexzhirkevich.compottie.internal.animation.BezierSerializer;
import io.github.alexzhirkevich.compottie.internal.effects.BlurEffect;
import io.github.alexzhirkevich.compottie.internal.effects.BlurEffect$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Angle$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$CheckBox$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Color$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$DropDown$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Layer$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Point$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Slider$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Unsupported$$serializer;
import io.github.alexzhirkevich.compottie.internal.helpers.Bezier;
import io.github.alexzhirkevich.compottie.internal.helpers.BooleanIntSerializer;
import io.ktor.http.content.BlockingBridgeKt;
import java.lang.annotation.Annotation;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174a;

    public /* synthetic */ a9(int i) {
        this.f174a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f174a) {
            case 0:
                BasicCityDataApiModel.Companion companion = BasicCityDataApiModel.Companion;
                return new ArrayListSerializer(new ArrayListSerializer(DoubleSerializer.f18137a));
            case 1:
                BasicCityInfoApiModel.Companion companion2 = BasicCityInfoApiModel.Companion;
                return new ArrayListSerializer(BasicCityDataApiModel$$serializer.f8835a);
            case 2:
                BasicCityInfoAppModel.Companion companion3 = BasicCityInfoAppModel.INSTANCE;
                return new ArrayListSerializer(LatLngSerializer.f5136a);
            case 3:
                return UUID.randomUUID();
            case 4:
                return BasicText_androidKt.LocalBackgroundTextMeasurementExecutor$lambda$0();
            case 5:
                Bezier.Companion companion4 = Bezier.Companion;
                return new ArrayListSerializer(new ArrayListSerializer(FloatSerializer.f18142a));
            case 6:
                Bezier.Companion companion5 = Bezier.Companion;
                return new ArrayListSerializer(new ArrayListSerializer(FloatSerializer.f18142a));
            case 7:
                Bezier.Companion companion6 = Bezier.Companion;
                return new ArrayListSerializer(new ArrayListSerializer(FloatSerializer.f18142a));
            case 8:
                BezierInterpolation.Companion companion7 = BezierInterpolation.INSTANCE;
                return new BezierCoordinateSerializer();
            case 9:
                BezierInterpolation.Companion companion8 = BezierInterpolation.INSTANCE;
                return new BezierCoordinateSerializer();
            case 10:
                BezierKeyframe.Companion companion9 = BezierKeyframe.Companion;
                return new BezierSerializer();
            case 11:
                BezierKeyframe.Companion companion10 = BezierKeyframe.Companion;
                return new BezierSerializer();
            case 12:
                BezierKeyframe.Companion companion11 = BezierKeyframe.Companion;
                return new BooleanIntSerializer();
            case 13:
                BleValidationArgs.Companion companion12 = BleValidationArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 14:
                BleValidationArgs.Companion companion13 = BleValidationArgs.INSTANCE;
                return ValidationProduct.INSTANCE.serializer();
            case 15:
                BleValidationArgs.Companion companion14 = BleValidationArgs.INSTANCE;
                return ValidationProcessFlowDetails.INSTANCE.serializer();
            case 16:
                Lazy lazy = BlockingBridgeKt.f16837a;
                try {
                    return Class.forName("io.ktor.utils.io.jvm.javaio.PollersKt").getMethod("isParkingAllowed", null);
                } catch (Throwable unused) {
                    return null;
                }
            case 17:
                BlurEffect.Companion companion15 = BlurEffect.Companion;
                ClassReference classReferenceA = Reflection.a(EffectValue.class);
                KClass[] kClassArr = {Reflection.a(EffectValue.Angle.class), Reflection.a(EffectValue.CheckBox.class), Reflection.a(EffectValue.Color.class), Reflection.a(EffectValue.DropDown.class), Reflection.a(EffectValue.Layer.class), Reflection.a(EffectValue.Point.class), Reflection.a(EffectValue.Slider.class), Reflection.a(EffectValue.Unsupported.class)};
                KSerializer[] kSerializerArr = {EffectValue$Angle$$serializer.f16197a, EffectValue$CheckBox$$serializer.f16199a, EffectValue$Color$$serializer.f16201a, EffectValue$DropDown$$serializer.f16204a, EffectValue$Layer$$serializer.f16206a, EffectValue$Point$$serializer.f16208a, EffectValue$Slider$$serializer.f16210a, EffectValue$Unsupported$$serializer.f16212a};
                Annotation[] annotationArr = {new BlurEffect$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0()};
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("io.github.alexzhirkevich.compottie.internal.effects.EffectValue", classReferenceA, kClassArr, kSerializerArr);
                sealedClassSerializer.b = ArraysKt.e(annotationArr);
                return new ArrayListSerializer(sealedClassSerializer);
            case 18:
                BlurEffect.Companion companion16 = BlurEffect.Companion;
                return new BooleanIntSerializer();
            case 19:
                BookableSuperPassConfiguration.Companion companion17 = BookableSuperPassConfiguration.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 20:
                BookingCancellationTarget.Companion companion18 = BookingCancellationTarget.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.scenes.args.BookingCancellationTarget", Reflection.a(BookingCancellationTarget.class), new KClass[]{Reflection.a(BookingCancellationTarget.DirectMetro.class), Reflection.a(BookingCancellationTarget.Ondc.class)}, new KSerializer[]{BookingCancellationTarget$DirectMetro$$serializer.f9224a, BookingCancellationTarget$Ondc$$serializer.f9225a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 21:
                BookingHelpArgs.Companion companion19 = BookingHelpArgs.Companion;
                return new ArrayListSerializer(BookingHelpFaq$$serializer.f5607a);
            case 22:
                BookingHelpArgs.Companion companion20 = BookingHelpArgs.Companion;
                return BookingCancellationTarget.INSTANCE.serializer();
            case 23:
                BookingHelpCityWiseRemoteConfigApiModel.Companion companion21 = BookingHelpCityWiseRemoteConfigApiModel.INSTANCE;
                return new ArrayListSerializer(BookingHelpFaqRemoteConfigApiModel$$serializer.f5609a);
            case 24:
                BookingHelpFaq.Companion companion22 = BookingHelpFaq.INSTANCE;
                return EnumsKt.b("app.chalo.models.bookinghelp.BookingHelpFaqActionType", BookingHelpFaqActionType.values());
            case 25:
                BookingHelpFaq.Companion companion23 = BookingHelpFaq.INSTANCE;
                return EnumsKt.b("app.chalo.models.bookinghelp.BookingHelpFaqGroupType", BookingHelpFaqGroupType.values());
            case 26:
                BookingHelpFaqRemoteConfigApiModel.Companion companion24 = BookingHelpFaqRemoteConfigApiModel.Companion;
                return EnumsKt.b("app.chalo.models.bookinghelp.BookingHelpFaqActionType", BookingHelpFaqActionType.values());
            case 27:
                BookingHelpFaqRemoteConfigApiModel.Companion companion25 = BookingHelpFaqRemoteConfigApiModel.Companion;
                return EnumsKt.b("app.chalo.models.bookinghelp.BookingHelpFaqGroupType", BookingHelpFaqGroupType.values());
            case 28:
                BookingHelpRemoteConfigApiModel.Companion companion26 = BookingHelpRemoteConfigApiModel.INSTANCE;
                return new ArrayListSerializer(BookingHelpCityWiseRemoteConfigApiModel$$serializer.f5604a);
            default:
                BookingSuccessArgs.Companion companion27 = BookingSuccessArgs.INSTANCE;
                return Source.INSTANCE.serializer();
        }
    }
}
