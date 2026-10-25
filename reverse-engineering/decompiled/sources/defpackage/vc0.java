package defpackage;

import androidx.compose.runtime.ProvidableCompositionLocal;
import app.chalo.behaviour.policy.LanguagePolicyOverride;
import app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable;
import app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable$Yes$$serializer;
import app.chalo.core.database.tableadapters.LastRideInfoTableAdapter;
import app.chalo.core.database.tableadapters.LastRideInfoTableAdapter$lastRideInfoAdapter$2$1;
import app.chalo.features.language.data.Language;
import app.chalo.features.language.data.LanguageSelectionSourceType;
import app.chalo.juspay.JuspayErrorResultType;
import app.chalo.kyc.min.ui.minkycotp.KycErrorBottomSheetData;
import app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType;
import app.chalo.scenes.args.LanguageSelectionArgs;
import coil3.network.ktor3.internal.KtorNetworkClient;
import io.github.alexzhirkevich.compottie.internal.effects.BlurEffect;
import io.github.alexzhirkevich.compottie.internal.effects.BlurEffect$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.DropShadowEffect;
import io.github.alexzhirkevich.compottie.internal.effects.DropShadowEffect$$serializer;
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
import io.github.alexzhirkevich.compottie.internal.effects.FillEffect$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffect;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffect$Unsupported$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffect$Unsupported$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0;
import io.github.alexzhirkevich.compottie.internal.effects.TintEffect;
import io.github.alexzhirkevich.compottie.internal.effects.TintEffect$$serializer;
import io.github.alexzhirkevich.keight.js.interpreter.LexerKt;
import io.github.alexzhirkevich.keight.js.interpreter.Token;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.HttpClientJvmKt;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineFactory;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Job;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.ObjectSerializer;
import org.koin.compose.ComposeContextWrapper;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19823a;

    public /* synthetic */ vc0(int i) {
        this.f19823a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        int i = this.f19823a;
        GlobalContext globalContext = GlobalContext.f18817a;
        switch (i) {
            case 0:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.SdkURLRedirectionError", JuspayErrorResultType.SdkURLRedirectionError.INSTANCE, new Annotation[0]);
            case 1:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.ServerError", JuspayErrorResultType.ServerError.INSTANCE, new Annotation[0]);
            case 2:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.TransactionFailedAtPg", JuspayErrorResultType.TransactionFailedAtPg.INSTANCE, new Annotation[0]);
            case 3:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.TransactionStatusAwaiting", JuspayErrorResultType.TransactionStatusAwaiting.INSTANCE, new Annotation[0]);
            case 4:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.Unavailable", JuspayErrorResultType.Unavailable.INSTANCE, new Annotation[0]);
            case 5:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.UnsupportedFeature", JuspayErrorResultType.UnsupportedFeature.INSTANCE, new Annotation[0]);
            case 6:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.UserBackPress", JuspayErrorResultType.UserBackPress.INSTANCE, new Annotation[0]);
            case 7:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.UserBasedError", JuspayErrorResultType.UserBasedError.INSTANCE, new Annotation[0]);
            case 8:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.WrongBusinessLogic", JuspayErrorResultType.WrongBusinessLogic.INSTANCE, new Annotation[0]);
            case 9:
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
            case 10:
                return new SecureRandom();
            case 11:
                return KeyStore.getInstance("AndroidKeyStore");
            case 12:
                ProvidableCompositionLocal providableCompositionLocal = KoinApplicationKt.f18813a;
                return new ComposeContextWrapper(globalContext.a(), new vc0(15));
            case 13:
                ProvidableCompositionLocal providableCompositionLocal2 = KoinApplicationKt.f18813a;
                return new ComposeContextWrapper(globalContext.a().c.d, new vc0(14));
            case 14:
                ProvidableCompositionLocal providableCompositionLocal3 = KoinApplicationKt.f18813a;
                return globalContext.a().c.d;
            case 15:
                ProvidableCompositionLocal providableCompositionLocal4 = KoinApplicationKt.f18813a;
                return globalContext.a();
            case 16:
                ProvidableCompositionLocal providableCompositionLocal5 = KoinApplicationKt.f18813a;
                return globalContext.a();
            case 17:
                ProvidableCompositionLocal providableCompositionLocal6 = KoinApplicationKt.f18813a;
                return globalContext.a().c.d;
            case 18:
                HttpClientEngineFactory engineFactory = HttpClientJvmKt.f16612a;
                Intrinsics.i(engineFactory, "engineFactory");
                HttpClientConfig httpClientConfig = new HttpClientConfig();
                HttpClientEngine httpClientEngineA = engineFactory.a(httpClientConfig.d);
                HttpClient httpClient = new HttpClient(httpClientEngineA, httpClientConfig, true);
                CoroutineContext.Element element = httpClient.d.get(Job.Key.f17732a);
                Intrinsics.f(element);
                ((Job) element).w(new e40(httpClientEngineA, 20));
                return new KtorNetworkClient(httpClient);
            case 19:
                KycErrorBottomSheetData.Companion companion = KycErrorBottomSheetData.Companion;
                return EnumsKt.b("app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType", KycErrorPositiveCtaType.values());
            case 20:
                return Language._init_$_anonymous_();
            case 21:
                LanguagePolicyOverride.Companion companion2 = LanguagePolicyOverride.INSTANCE;
                return new ArrayListSerializer(Language.INSTANCE.serializer());
            case 22:
                LanguageSelectionArgs.Companion companion3 = LanguageSelectionArgs.Companion;
                return EnumsKt.b("app.chalo.features.language.data.LanguageSelectionSourceType", LanguageSelectionSourceType.values());
            case 23:
                Lazy lazy = LastRideInfoTableAdapter.f2117a;
                return new LastRideInfoTableAdapter$lastRideInfoAdapter$2$1();
            case 24:
                LayerEffect.Companion companion4 = LayerEffect.INSTANCE;
                ClassReference classReferenceA = Reflection.a(LayerEffect.class);
                KClass[] kClassArr = {Reflection.a(BlurEffect.class), Reflection.a(DropShadowEffect.class), Reflection.a(FillEffect.class), Reflection.a(LayerEffect.Unsupported.class), Reflection.a(TintEffect.class)};
                KSerializer[] kSerializerArr = {BlurEffect$$serializer.f16194a, DropShadowEffect$$serializer.f16195a, FillEffect$$serializer.f16213a, LayerEffect$Unsupported$$serializer.f16215a, TintEffect$$serializer.f16218a};
                Annotation[] annotationArr = {new LayerEffect$Unsupported$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0()};
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("io.github.alexzhirkevich.compottie.internal.effects.LayerEffect", classReferenceA, kClassArr, kSerializerArr);
                sealedClassSerializer.b = ArraysKt.e(annotationArr);
                return sealedClassSerializer;
            case 25:
                LayerEffect.Unsupported.Companion companion5 = LayerEffect.Unsupported.INSTANCE;
                ClassReference classReferenceA2 = Reflection.a(EffectValue.class);
                KClass[] kClassArr2 = {Reflection.a(EffectValue.Angle.class), Reflection.a(EffectValue.CheckBox.class), Reflection.a(EffectValue.Color.class), Reflection.a(EffectValue.DropDown.class), Reflection.a(EffectValue.Layer.class), Reflection.a(EffectValue.Point.class), Reflection.a(EffectValue.Slider.class), Reflection.a(EffectValue.Unsupported.class)};
                KSerializer[] kSerializerArr2 = {EffectValue$Angle$$serializer.f16197a, EffectValue$CheckBox$$serializer.f16199a, EffectValue$Color$$serializer.f16201a, EffectValue$DropDown$$serializer.f16204a, EffectValue$Layer$$serializer.f16206a, EffectValue$Point$$serializer.f16208a, EffectValue$Slider$$serializer.f16210a, EffectValue$Unsupported$$serializer.f16212a};
                Annotation[] annotationArr2 = {new LayerEffect$Unsupported$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0()};
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("io.github.alexzhirkevich.compottie.internal.effects.EffectValue", classReferenceA2, kClassArr2, kSerializerArr2);
                sealedClassSerializer2.b = ArraysKt.e(annotationArr2);
                return new ArrayListSerializer(sealedClassSerializer2);
            case 26:
                return Unit.f17538a;
            case 27:
                Set set = LexerKt.f16446a;
                EnumEntries<Token.Identifier.Keyword> entries = Token.Identifier.Keyword.getEntries();
                int iG = MapsKt.g(CollectionsKt.v(entries, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG >= 16 ? iG : 16);
                for (Token.Identifier.Keyword keyword : entries) {
                    linkedHashMap.put(keyword.getIdentifier(), keyword);
                }
                return linkedHashMap;
            case 28:
                Set set2 = LexerKt.f16446a;
                EnumEntries<Token.Identifier.Reserved> entries2 = Token.Identifier.Reserved.getEntries();
                int iG2 = MapsKt.g(CollectionsKt.v(entries2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iG2 >= 16 ? iG2 : 16);
                for (Token.Identifier.Reserved reserved : entries2) {
                    linkedHashMap2.put(reserved.getIdentifier(), reserved);
                }
                return linkedHashMap2;
            default:
                LiveSeatAvailabilityApplicable.Companion companion6 = LiveSeatAvailabilityApplicable.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable", Reflection.a(LiveSeatAvailabilityApplicable.class), new KClass[]{Reflection.a(LiveSeatAvailabilityApplicable.No.class), Reflection.a(LiveSeatAvailabilityApplicable.Yes.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable.No", LiveSeatAvailabilityApplicable.No.INSTANCE, new Annotation[0]), LiveSeatAvailabilityApplicable$Yes$$serializer.f1708a});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
        }
    }
}
