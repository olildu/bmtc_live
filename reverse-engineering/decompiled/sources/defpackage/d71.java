package defpackage;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.datastore.core.DataStore;
import app.chalo.ads.ExitInterstitialConfigProvider;
import app.chalo.analytics.AnalyticsManager;
import app.chalo.analytics.AndroidAnalyticsSystemHelper;
import app.chalo.analytics.di.SharedAnalyticsModuleKt$sharedModule$lambda$0$$inlined$singleOf$default$1;
import app.chalo.analytics.di.SharedAnalyticsModuleKt$sharedModule$lambda$0$$inlined$singleOf$default$2;
import app.chalo.analytics.di.SharedAnalyticsModule_androidKt$platformModule$lambda$0$$inlined$singleOf$1;
import app.chalo.analytics.di.SharedAnalyticsModule_androidKt$platformModule$lambda$0$$inlined$singleOf$2;
import app.chalo.analytics.eventcredits.MixpanelEventsCreditsResolver;
import app.chalo.analytics.mixpanel.MixpanelPropertiesProvider;
import app.chalo.analytics.sender.AndroidAnalyticsSendersProvider;
import app.chalo.analytics.sender.AndroidMixpanelAnalyticsSender;
import app.chalo.analytics.senders.AnalyticsSendersProvider;
import app.chalo.analytics.senders.FirebaseAnalyticsSender;
import app.chalo.analytics.utils.AnalyticsSystemHelper;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.deeplink.DeepLinkAppOpenTracker;
import app.chalo.deeplink.DeepLinkPendingStore;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chaloconfig.data.ChaloConfigRepository;
import app.chalo.features.chaloconfig.data.remote.ChaloConfigRemoteDataSource;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.features.chalotime.data.ChaloTimeRepository;
import app.chalo.features.chalotime.data.remote.ChaloTimeRemoteDataSource;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.fileupload.picker.ImagePickerProvider;
import app.chalo.fileupload.picker.ImagePickerSetter;
import app.chalo.login.LoginAuthNavigationGuard;
import app.chalo.network.NetworkCrashlyticsLogger;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.permissions.handler.PermissionHandlerSetter;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerializersCacheKt;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.SerializerCache;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d71 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15435a;

    public /* synthetic */ d71(int i) {
        this.f15435a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15435a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                return SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter$lambda$1((AnimationVector2D) obj);
            case 1:
                return SelectionRegistrarImpl.Saver$lambda$1(((Long) obj).longValue());
            case 2:
                return Boolean.valueOf(obj == null);
            case 3:
                ArraysKt.j(null, obj);
                throw null;
            case 4:
                KClass it = (KClass) obj;
                SerializerCache serializerCache = SerializersCacheKt.f18094a;
                Intrinsics.i(it, "it");
                KSerializer kSerializerC = SerializersKt.c(it);
                if (kSerializerC != null) {
                    return kSerializerC;
                }
                if (PlatformKt.c(it)) {
                    return new PolymorphicSerializer(it);
                }
                return null;
            case 5:
                KClass it2 = (KClass) obj;
                SerializerCache serializerCache2 = SerializersCacheKt.f18094a;
                Intrinsics.i(it2, "it");
                KSerializer kSerializerC2 = SerializersKt.c(it2);
                if (kSerializerC2 == null) {
                    kSerializerC2 = PlatformKt.c(it2) ? new PolymorphicSerializer(it2) : null;
                }
                if (kSerializerC2 != null) {
                    return BuiltinSerializersKt.c(kSerializerC2);
                }
                return null;
            case 6:
                Intrinsics.i((String) obj, "<unused var>");
                return unit;
            case 7:
                Intrinsics.i((String) obj, "<unused var>");
                return unit;
            case 8:
                Module module = (Module) obj;
                Intrinsics.i(module, "$this$module");
                h61 h61Var = new h61(4);
                Kind kind = Kind.Singleton;
                EmptyList emptyList = EmptyList.f17557a;
                ClassReference classReferenceA = Reflection.a(AnalyticsManager.class);
                StringQualifier stringQualifier = ScopeRegistry.e;
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, classReferenceA, null, h61Var, kind, emptyList), module));
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(FirebaseAnalyticsSender.class), null, new SharedAnalyticsModuleKt$sharedModule$lambda$0$$inlined$singleOf$default$1(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(MixpanelEventsCreditsResolver.class), null, new SharedAnalyticsModuleKt$sharedModule$lambda$0$$inlined$singleOf$default$2(), kind, emptyList), module)), null);
                return unit;
            case 9:
                Module module2 = (Module) obj;
                Intrinsics.i(module2, "$this$module");
                StringQualifier stringQualifier2 = new StringQualifier("analytics.preferences_pb");
                h61 h61Var2 = new h61(5);
                Kind kind2 = Kind.Singleton;
                EmptyList emptyList2 = EmptyList.f17557a;
                ClassReference classReferenceA2 = Reflection.a(DataStore.class);
                StringQualifier stringQualifier3 = ScopeRegistry.e;
                new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, classReferenceA2, stringQualifier2, h61Var2, kind2, emptyList2), module2));
                OptionDSLKt.c(new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(AndroidAnalyticsSendersProvider.class), null, new SharedAnalyticsModule_androidKt$platformModule$lambda$0$$inlined$singleOf$1(), kind2, emptyList2), module2)), new d71(10));
                DefinitionBindingKt.a(new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(AndroidMixpanelAnalyticsSender.class), null, new h61(6), kind2, emptyList2), module2)), Reflection.a(MixpanelPropertiesProvider.class));
                OptionDSLKt.c(new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(AndroidAnalyticsSystemHelper.class), null, new SharedAnalyticsModule_androidKt$platformModule$lambda$0$$inlined$singleOf$2(), kind2, emptyList2), module2)), new d71(11));
                return unit;
            case 10:
                BeanDefinition singleOf = (BeanDefinition) obj;
                Intrinsics.i(singleOf, "$this$singleOf");
                singleOf.f = CollectionsKt.d0(Reflection.a(AnalyticsSendersProvider.class), singleOf.f);
                return unit;
            case 11:
                BeanDefinition singleOf2 = (BeanDefinition) obj;
                Intrinsics.i(singleOf2, "$this$singleOf");
                singleOf2.f = CollectionsKt.d0(Reflection.a(AnalyticsSystemHelper.class), singleOf2.f);
                return unit;
            case 12:
                BeanDefinition factoryOf = (BeanDefinition) obj;
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(LoginAuthNavigationGuard.class), factoryOf.f);
                return unit;
            case 13:
                BeanDefinition singleOf3 = (BeanDefinition) obj;
                Intrinsics.i(singleOf3, "$this$singleOf");
                singleOf3.f = CollectionsKt.d0(Reflection.a(DeepLinkAppOpenTracker.class), singleOf3.f);
                return unit;
            case 14:
                BeanDefinition singleOf4 = (BeanDefinition) obj;
                Intrinsics.i(singleOf4, "$this$singleOf");
                singleOf4.f = CollectionsKt.d0(Reflection.a(DeepLinkPendingStore.class), singleOf4.f);
                return unit;
            case 15:
                BeanDefinition singleOf5 = (BeanDefinition) obj;
                Intrinsics.i(singleOf5, "$this$singleOf");
                singleOf5.f = CollectionsKt.d0(Reflection.a(StringProvider.class), singleOf5.f);
                return unit;
            case 16:
                BeanDefinition singleOf6 = (BeanDefinition) obj;
                Intrinsics.i(singleOf6, "$this$singleOf");
                singleOf6.f = CollectionsKt.d0(Reflection.a(BasicInfoContract.class), singleOf6.f);
                return unit;
            case 17:
                BeanDefinition factoryOf2 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf2, "$this$factoryOf");
                factoryOf2.f = CollectionsKt.d0(Reflection.a(ChaloConfigRemoteDataSource.class), factoryOf2.f);
                return unit;
            case 18:
                BeanDefinition factoryOf3 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf3, "$this$factoryOf");
                factoryOf3.f = CollectionsKt.d0(Reflection.a(ChaloConfigRepository.class), factoryOf3.f);
                return unit;
            case 19:
                BeanDefinition singleOf7 = (BeanDefinition) obj;
                Intrinsics.i(singleOf7, "$this$singleOf");
                singleOf7.f = CollectionsKt.d0(Reflection.a(ChaloConfigFeature.class), singleOf7.f);
                return unit;
            case 20:
                BeanDefinition singleOf8 = (BeanDefinition) obj;
                Intrinsics.i(singleOf8, "$this$singleOf");
                singleOf8.f = CollectionsKt.d0(Reflection.a(ExitInterstitialConfigProvider.class), singleOf8.f);
                return unit;
            case 21:
                BeanDefinition factoryOf4 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf4, "$this$factoryOf");
                factoryOf4.f = CollectionsKt.d0(Reflection.a(ChaloTimeRemoteDataSource.class), factoryOf4.f);
                return unit;
            case 22:
                BeanDefinition factoryOf5 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf5, "$this$factoryOf");
                factoryOf5.f = CollectionsKt.d0(Reflection.a(ChaloTimeRepository.class), factoryOf5.f);
                return unit;
            case 23:
                BeanDefinition singleOf9 = (BeanDefinition) obj;
                Intrinsics.i(singleOf9, "$this$singleOf");
                singleOf9.f = CollectionsKt.d0(Reflection.a(ChaloTimeProvider.class), singleOf9.f);
                return unit;
            case 24:
                BeanDefinition singleOf10 = (BeanDefinition) obj;
                Intrinsics.i(singleOf10, "$this$singleOf");
                OptionDSLKt.a(singleOf10, CollectionsKt.S(Reflection.a(PermissionHandlerProvider.class), Reflection.a(PermissionHandlerSetter.class)));
                return unit;
            case 25:
                BeanDefinition singleOf11 = (BeanDefinition) obj;
                Intrinsics.i(singleOf11, "$this$singleOf");
                OptionDSLKt.a(singleOf11, CollectionsKt.S(Reflection.a(CrashlyticsLogger.class), Reflection.a(NetworkCrashlyticsLogger.class)));
                return unit;
            case 26:
                BeanDefinition singleOf12 = (BeanDefinition) obj;
                Intrinsics.i(singleOf12, "$this$singleOf");
                OptionDSLKt.a(singleOf12, CollectionsKt.S(Reflection.a(ImagePickerProvider.class), Reflection.a(ImagePickerSetter.class)));
                return unit;
            case 27:
                BeanDefinition factoryOf6 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf6, "$this$factoryOf");
                factoryOf6.f = CollectionsKt.d0(Reflection.a(TimeUtilsContract.class), factoryOf6.f);
                return unit;
            case 28:
                BeanDefinition factoryOf7 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf7, "$this$factoryOf");
                factoryOf7.f = CollectionsKt.d0(Reflection.a(CurrencyFeature.class), factoryOf7.f);
                return unit;
            default:
                BeanDefinition factoryOf8 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf8, "$this$factoryOf");
                factoryOf8.f = CollectionsKt.d0(Reflection.a(ProductInfoContract.class), factoryOf8.f);
                return unit;
        }
    }
}
