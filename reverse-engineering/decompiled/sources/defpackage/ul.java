package defpackage;

import android.os.Looper;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import app.chalo.checkout.data.model.app.CheckoutPaymentMethod;
import app.chalo.checkout.data.model.app.CheckoutPaymentMethod$Inai$Default$$serializer;
import app.chalo.compose.theme.ChaloColor;
import app.chalo.compose.theme.ChaloDimens;
import app.chalo.compose.theme.ChaloElevation;
import app.chalo.compose.theme.ChaloShape;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.data.ChaloTextDataAppModel;
import app.chalo.features.checkout.CheckoutAnalyticsData;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponse;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponse$Error$$serializer;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponse$Success$$serializer;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponseErrorType;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponseErrorType$ConnectionError$$serializer;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponseErrorType$GenericError$$serializer;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.CheckoutArgs;
import app.chalo.scenes.args.CheckoutCardArgs;
import app.chalo.scenes.args.CheckoutInaiArgs;
import app.chalo.scenes.args.CheckoutNetBankingArgs;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.scenes.args.CheckoutPaymentMainArgs$$serializer;
import app.chalo.scenes.args.CheckoutPhonePeArgs;
import app.chalo.scenes.args.CheckoutPostPaymentArgs;
import app.chalo.scenes.args.CheckoutPostPaymentArgs$$serializer;
import app.chalo.scenes.args.CheckoutRazorpayArgs;
import app.chalo.scenes.args.CheckoutUpiArgs;
import app.chalo.scenes.args.CheckoutWalletArgs;
import app.chalo.scenes.args.CustomUrlCheckoutArgs;
import app.chalo.scenes.args.CustomUrlCheckoutArgs$$serializer;
import com.arkivanov.decompose.mainthread.CheckMainThreadKt;
import io.github.alexzhirkevich.compottie.internal.assets.CharacterData;
import io.github.alexzhirkevich.compottie.internal.assets.CharacterPath;
import io.github.alexzhirkevich.compottie.internal.assets.CharacterPath$Shapes$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0;
import io.github.alexzhirkevich.compottie.internal.assets.CharacterPathSerializer;
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
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.CharDirectionality;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ul implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19756a;

    public /* synthetic */ ul(int i) {
        this.f19756a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19756a) {
            case 0:
                ChaloSocketRequest.Companion companion = ChaloSocketRequest.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 1:
                ChaloSocketResponse.Companion companion2 = ChaloSocketResponse.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponse", Reflection.a(ChaloSocketResponse.class), new KClass[]{Reflection.a(ChaloSocketResponse.Error.class), Reflection.a(ChaloSocketResponse.Success.class)}, new KSerializer[]{ChaloSocketResponse$Error$$serializer.f4244a, ChaloSocketResponse$Success$$serializer.f4245a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 2:
                ChaloSocketResponse.Error.Companion companion3 = ChaloSocketResponse.Error.INSTANCE;
                return ChaloSocketResponseErrorType.INSTANCE.serializer();
            case 3:
                ChaloSocketResponseErrorType.Companion companion4 = ChaloSocketResponseErrorType.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponseErrorType", Reflection.a(ChaloSocketResponseErrorType.class), new KClass[]{Reflection.a(ChaloSocketResponseErrorType.AckNotReceived.class), Reflection.a(ChaloSocketResponseErrorType.ConnectionError.class), Reflection.a(ChaloSocketResponseErrorType.GenericError.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponseErrorType.AckNotReceived", ChaloSocketResponseErrorType.AckNotReceived.INSTANCE, new Annotation[0]), ChaloSocketResponseErrorType$ConnectionError$$serializer.f4247a, ChaloSocketResponseErrorType$GenericError$$serializer.f4248a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 4:
                return new ObjectSerializer("app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponseErrorType.AckNotReceived", ChaloSocketResponseErrorType.AckNotReceived.INSTANCE, new Annotation[0]);
            case 5:
                ChaloTextDataAppModel.Companion companion5 = ChaloTextDataAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 6:
                ChaloTextDataAppModel.Companion companion6 = ChaloTextDataAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 7:
                Lazy lazy = ChaloThemeHelper.f1920a;
                return new ChaloDimens();
            case 8:
                Lazy lazy2 = ChaloThemeHelper.f1920a;
                return new ChaloElevation(0.0f, 0.0f, 63);
            case 9:
                ProvidableCompositionLocal providableCompositionLocal = ChaloThemeKt.f1921a;
                return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            case 10:
                ProvidableCompositionLocal providableCompositionLocal2 = ChaloThemeKt.f1921a;
                Color.Companion companion7 = Color.INSTANCE;
                return new ChaloColor(companion7.m4641getUnspecified0d7_KjU(), companion7.m4641getUnspecified0d7_KjU(), companion7.m4641getUnspecified0d7_KjU(), companion7.m4641getUnspecified0d7_KjU(), companion7.m4641getUnspecified0d7_KjU(), companion7.m4641getUnspecified0d7_KjU(), companion7.m4641getUnspecified0d7_KjU(), companion7.m4641getUnspecified0d7_KjU(), companion7.m4641getUnspecified0d7_KjU(), companion7.m4641getUnspecified0d7_KjU(), companion7.m4641getUnspecified0d7_KjU(), -28622);
            case 11:
                ProvidableCompositionLocal providableCompositionLocal3 = ChaloThemeKt.f1921a;
                Dp.Companion companion8 = Dp.INSTANCE;
                return new ChaloElevation(companion8.m7298getUnspecifiedD9Ej5fM(), companion8.m7298getUnspecifiedD9Ej5fM(), 58);
            case 12:
                ProvidableCompositionLocal providableCompositionLocal4 = ChaloThemeKt.f1921a;
                Dp.Companion companion9 = Dp.INSTANCE;
                return new ChaloShape(RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(companion9.m7298getUnspecifiedD9Ej5fM()), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(companion9.m7298getUnspecifiedD9Ej5fM()), 1017);
            case 13:
                ProvidableCompositionLocal providableCompositionLocal5 = ChaloThemeKt.f1921a;
                return new ChaloDimens();
            case 14:
                return ChaloTransitMode._init_$_anonymous_();
            case 15:
                return CharDirectionality.directionalityMap_delegate$lambda$0();
            case 16:
                CharacterData.Companion companion10 = CharacterData.INSTANCE;
                return new CharacterPathSerializer();
            case 17:
                CharacterPath.Shapes.Companion companion11 = CharacterPath.Shapes.INSTANCE;
                ClassReference classReferenceA = Reflection.a(Shape.class);
                KClass[] kClassArr = {Reflection.a(EllipseShape.class), Reflection.a(FillShape.class), Reflection.a(GradientFillShape.class), Reflection.a(GradientStrokeShape.class), Reflection.a(GroupShape.class), Reflection.a(MergePathsShape.class), Reflection.a(PathShape.class), Reflection.a(PolystarShape.class), Reflection.a(RectShape.class), Reflection.a(RepeaterShape.class), Reflection.a(RoundShape.class), Reflection.a(Shape.Unsupported.class), Reflection.a(SolidStrokeShape.class), Reflection.a(TransformShape.class), Reflection.a(TrimPathShape.class)};
                KSerializer[] kSerializerArr = {EllipseShape$$serializer.f16294a, FillShape$$serializer.f16296a, GradientFillShape$$serializer.f16298a, GradientStrokeShape$$serializer.f16299a, GroupShape$$serializer.f16301a, MergePathsShape$$serializer.f16309a, PathShape$$serializer.f16312a, PolystarShape$$serializer.f16314a, RectShape$$serializer.f16316a, RepeaterShape$$serializer.f16318a, RoundShape$$serializer.f16320a, Shape$Unsupported$$serializer.f16322a, SolidStrokeShape$$serializer.f16323a, TransformShape$$serializer.f16326a, TrimPathShape$$serializer.f16328a};
                Annotation[] annotationArr = {new CharacterPath$Shapes$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0()};
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("io.github.alexzhirkevich.compottie.internal.shapes.Shape", classReferenceA, kClassArr, kSerializerArr);
                sealedClassSerializer3.b = ArraysKt.e(annotationArr);
                return new ArrayListSerializer(sealedClassSerializer3);
            case 18:
                Lazy lazy3 = CheckMainThreadKt.f12340a;
                try {
                    return Long.valueOf(Looper.getMainLooper().getThread().getId());
                } catch (Exception unused) {
                    return null;
                }
            case 19:
                CheckoutAnalyticsData.Companion companion12 = CheckoutAnalyticsData.INSTANCE;
                StringSerializer stringSerializer = StringSerializer.f18170a;
                return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
            case 20:
                CheckoutArgs.Companion companion13 = CheckoutArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer4 = new SealedClassSerializer("app.chalo.scenes.args.CheckoutArgs", Reflection.a(CheckoutArgs.class), new KClass[]{Reflection.a(CheckoutCardArgs.class), Reflection.a(CheckoutInaiArgs.class), Reflection.a(CheckoutNetBankingArgs.class), Reflection.a(CheckoutPaymentMainArgs.class), Reflection.a(CheckoutPhonePeArgs.class), Reflection.a(CheckoutPostPaymentArgs.class), Reflection.a(CheckoutRazorpayArgs.class), Reflection.a(CheckoutUpiArgs.class), Reflection.a(CheckoutWalletArgs.class), Reflection.a(CustomUrlCheckoutArgs.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.scenes.args.CheckoutCardArgs", CheckoutCardArgs.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.scenes.args.CheckoutInaiArgs", CheckoutInaiArgs.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.scenes.args.CheckoutNetBankingArgs", CheckoutNetBankingArgs.INSTANCE, new Annotation[0]), CheckoutPaymentMainArgs$$serializer.f9237a, new ObjectSerializer("app.chalo.scenes.args.CheckoutPhonePeArgs", CheckoutPhonePeArgs.INSTANCE, new Annotation[0]), CheckoutPostPaymentArgs$$serializer.f9238a, new ObjectSerializer("app.chalo.scenes.args.CheckoutRazorpayArgs", CheckoutRazorpayArgs.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.scenes.args.CheckoutUpiArgs", CheckoutUpiArgs.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.scenes.args.CheckoutWalletArgs", CheckoutWalletArgs.INSTANCE, new Annotation[0]), CustomUrlCheckoutArgs$$serializer.f9244a});
                sealedClassSerializer4.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer4;
            case 21:
                return new ObjectSerializer("app.chalo.scenes.args.CheckoutCardArgs", CheckoutCardArgs.INSTANCE, new Annotation[0]);
            case 22:
                return new ObjectSerializer("app.chalo.scenes.args.CheckoutInaiArgs", CheckoutInaiArgs.INSTANCE, new Annotation[0]);
            case 23:
                return new ObjectSerializer("app.chalo.scenes.args.CheckoutNetBankingArgs", CheckoutNetBankingArgs.INSTANCE, new Annotation[0]);
            case 24:
                CheckoutPaymentData.Companion companion14 = CheckoutPaymentData.INSTANCE;
                return OrderPaymentProviderInfoAppModel.INSTANCE.serializer();
            case 25:
                CheckoutPaymentMethod.Companion companion15 = CheckoutPaymentMethod.INSTANCE;
                SealedClassSerializer sealedClassSerializer5 = new SealedClassSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod", Reflection.a(CheckoutPaymentMethod.class), new KClass[]{Reflection.a(CheckoutPaymentMethod.ChaloPay.class), Reflection.a(CheckoutPaymentMethod.ClosedLoopWallet.class), Reflection.a(CheckoutPaymentMethod.Inai.Card.class), Reflection.a(CheckoutPaymentMethod.Inai.Cash.class), Reflection.a(CheckoutPaymentMethod.Inai.Default.class), Reflection.a(CheckoutPaymentMethod.Inai.Lazypay.class), Reflection.a(CheckoutPaymentMethod.Inai.NetBanking.class), Reflection.a(CheckoutPaymentMethod.Inai.Upi.class), Reflection.a(CheckoutPaymentMethod.Inai.Wallet.class), Reflection.a(CheckoutPaymentMethod.JuspayTurboUpi.class), Reflection.a(CheckoutPaymentMethod.PhonePe.Card.class), Reflection.a(CheckoutPaymentMethod.PhonePe.NetBanking.class), Reflection.a(CheckoutPaymentMethod.PhonePe.Unknown.class), Reflection.a(CheckoutPaymentMethod.PhonePe.Upi.class), Reflection.a(CheckoutPaymentMethod.RazorPay.Card.class), Reflection.a(CheckoutPaymentMethod.RazorPay.Cash.class), Reflection.a(CheckoutPaymentMethod.RazorPay.Lazypay.class), Reflection.a(CheckoutPaymentMethod.RazorPay.NetBanking.class), Reflection.a(CheckoutPaymentMethod.RazorPay.Unknown.class), Reflection.a(CheckoutPaymentMethod.RazorPay.Upi.class), Reflection.a(CheckoutPaymentMethod.RazorPay.Wallet.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.ChaloPay", CheckoutPaymentMethod.ChaloPay.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.ClosedLoopWallet", CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Card", CheckoutPaymentMethod.Inai.Card.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Cash", CheckoutPaymentMethod.Inai.Cash.INSTANCE, new Annotation[0]), CheckoutPaymentMethod$Inai$Default$$serializer.f1277a, new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Lazypay", CheckoutPaymentMethod.Inai.Lazypay.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.NetBanking", CheckoutPaymentMethod.Inai.NetBanking.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Upi", CheckoutPaymentMethod.Inai.Upi.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Wallet", CheckoutPaymentMethod.Inai.Wallet.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.JuspayTurboUpi", CheckoutPaymentMethod.JuspayTurboUpi.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe.Card", CheckoutPaymentMethod.PhonePe.Card.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe.NetBanking", CheckoutPaymentMethod.PhonePe.NetBanking.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe.Unknown", CheckoutPaymentMethod.PhonePe.Unknown.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.PhonePe.Upi", CheckoutPaymentMethod.PhonePe.Upi.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Card", CheckoutPaymentMethod.RazorPay.Card.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Cash", CheckoutPaymentMethod.RazorPay.Cash.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Lazypay", CheckoutPaymentMethod.RazorPay.Lazypay.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.NetBanking", CheckoutPaymentMethod.RazorPay.NetBanking.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Unknown", CheckoutPaymentMethod.RazorPay.Unknown.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Upi", CheckoutPaymentMethod.RazorPay.Upi.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.RazorPay.Wallet", CheckoutPaymentMethod.RazorPay.Wallet.INSTANCE, new Annotation[0])});
                sealedClassSerializer5.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer5;
            case 26:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.ChaloPay", CheckoutPaymentMethod.ChaloPay.INSTANCE, new Annotation[0]);
            case 27:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.ClosedLoopWallet", CheckoutPaymentMethod.ClosedLoopWallet.INSTANCE, new Annotation[0]);
            case 28:
                CheckoutPaymentMethod.Inai.Companion companion16 = CheckoutPaymentMethod.Inai.INSTANCE;
                SealedClassSerializer sealedClassSerializer6 = new SealedClassSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai", Reflection.a(CheckoutPaymentMethod.Inai.class), new KClass[]{Reflection.a(CheckoutPaymentMethod.Inai.Card.class), Reflection.a(CheckoutPaymentMethod.Inai.Cash.class), Reflection.a(CheckoutPaymentMethod.Inai.Default.class), Reflection.a(CheckoutPaymentMethod.Inai.Lazypay.class), Reflection.a(CheckoutPaymentMethod.Inai.NetBanking.class), Reflection.a(CheckoutPaymentMethod.Inai.Upi.class), Reflection.a(CheckoutPaymentMethod.Inai.Wallet.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Card", CheckoutPaymentMethod.Inai.Card.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Cash", CheckoutPaymentMethod.Inai.Cash.INSTANCE, new Annotation[0]), CheckoutPaymentMethod$Inai$Default$$serializer.f1277a, new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Lazypay", CheckoutPaymentMethod.Inai.Lazypay.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.NetBanking", CheckoutPaymentMethod.Inai.NetBanking.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Upi", CheckoutPaymentMethod.Inai.Upi.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Wallet", CheckoutPaymentMethod.Inai.Wallet.INSTANCE, new Annotation[0])});
                sealedClassSerializer6.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer6;
            default:
                return new ObjectSerializer("app.chalo.checkout.data.model.app.CheckoutPaymentMethod.Inai.Card", CheckoutPaymentMethod.Inai.Card.INSTANCE, new Annotation[0]);
        }
    }
}
