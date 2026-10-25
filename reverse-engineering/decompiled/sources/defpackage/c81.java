package defpackage;

import android.telephony.TelephonyManager;
import androidx.datastore.core.DataStore;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.deeplink.DeepLinkConsentManager;
import app.chalo.features.fcmtoken.FcmTokenFeature;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.instantticket.data.localsource.InstantTicketLocalDataSource;
import app.chalo.instantticket.data.remotesource.InstantTicketRemoteDataSource;
import app.chalo.login.AndroidCountryPhoneNumberConfigProvider;
import app.chalo.login.UserCountryPhoneNumberConfigProvider;
import app.chalo.login.data.remote.LoginRemoteDataSource;
import app.chalo.login.di.SharedLoginModule_androidKt$platformLoginModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.login.di.SharedLoginModule_androidKt$platformLoginModule$lambda$0$$inlined$factoryOf$2;
import app.chalo.login.di.SharedLoginModule_androidKt$platformLoginModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.login.di.SharedLoginModule_androidKt$platformLoginModule$lambda$0$$inlined$factoryOf$default$2;
import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.login.phonenumberhint.PhoneNumberHintHandlerProvider;
import app.chalo.login.phonenumberhint.PhoneNumberHintHandlerSetter;
import app.chalo.login.smsautoread.AndroidSmsAutoReader;
import app.chalo.login.smsautoread.SmsAutoReader;
import app.chalo.login.smsautoread.SmsBroadcastReceiver;
import app.chalo.metro.local.MetroLocalDataSource;
import app.chalo.metro.remote.MetroRemoteDataSource;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.network.NetworkManager;
import app.chalo.network.NetworkManagerImpl;
import app.chalo.network.config.NetworkConfig;
import app.chalo.network.di.SharedNetworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.network.di.SharedNetworkModuleKt$commonModule$lambda$0$$inlined$singleOf$1;
import app.chalo.network.di.SharedNetworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1;
import app.chalo.network.di.SharedNetworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$2;
import app.chalo.network.di.SharedNetworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$3;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.network.mock.ApiSourceAwareRequestDispatcher;
import app.chalo.network.mock.ApiSourceState;
import app.chalo.network.mock.LocalOverrideMockApiRuntimeState;
import app.chalo.network.mock.MockApiLocalOverrideResolver;
import app.chalo.network.mock.MockApiRouteCatalog;
import app.chalo.network.mock.MockApiRouteVariantState;
import app.chalo.network.rest.ChaloRestClient;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedComponent;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedUIStateFactory;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent;
import app.chalo.onboarding.cityprovider.CityChangeOperationTracker;
import app.chalo.onboarding.cityprovider.CityProviderImpl;
import app.chalo.onboarding.cityprovider.PostCityChangeOperationExecutor;
import app.chalo.onboarding.cityprovider.ProcessCityChangeUseCase;
import app.chalo.onboarding.cityprovider.UpdateCurrentCityUseCase;
import app.chalo.onboarding.cityselection.ui.CitySelectionComponent;
import app.chalo.onboarding.cityselection.ui.CitySelectionUIStateFactory;
import app.chalo.onboarding.di.SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.onboarding.di.SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2;
import app.chalo.onboarding.di.SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3;
import app.chalo.onboarding.di.SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4;
import app.chalo.onboarding.di.SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5;
import app.chalo.onboarding.di.SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6;
import app.chalo.onboarding.di.SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7;
import app.chalo.onboarding.di.SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8;
import app.chalo.onboarding.di.SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9;
import app.chalo.onboarding.di.SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$singleOf$1;
import app.chalo.onboarding.di.SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$singleOf$2;
import app.chalo.onboarding.di.SharedOnboardingModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManager;
import app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManagerImpl;
import app.chalo.onboarding.languageselection.LanguageSelectionComponent;
import app.chalo.onboarding.languageselection.splitinstallhandler.AndroidSplitInstallHandler;
import app.chalo.onboarding.languageselection.splitinstallhandler.SplitInstallHandler;
import app.chalo.onboarding.splash.SplashScreenComponent;
import app.chalo.onboarding.splash.orchestrator.AndroidSplashOrchestrator;
import app.chalo.onboarding.splash.orchestrator.SplashFlowOrchestrator;
import app.chalo.onboarding.splash.orchestrator.SplashOperations;
import app.chalo.premiumbus.data.local.PremiumBusLocalDataSource;
import app.chalo.premiumbus.data.remote.PremiumBusRemoteDataSource;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.userprofile.data.local.UserProfileLocalDataSource;
import app.chalo.userprofile.data.repository.UserProfileRepository;
import app.chalo.userprofile.domain.AccountSettingsInteractor;
import app.chalo.userprofile.domain.ConvertBitmapImageToByteArrayUseCase;
import app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c81 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11263a;

    public /* synthetic */ c81(int i) {
        this.f11263a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f11263a;
        int i2 = 14;
        int i3 = 17;
        int i4 = 16;
        int i5 = 19;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                BeanDefinition factoryOf = (BeanDefinition) obj;
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(UserProfileLocalDataSource.class), factoryOf.f);
                break;
            case 1:
                BeanDefinition factoryOf2 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf2, "$this$factoryOf");
                factoryOf2.f = CollectionsKt.d0(Reflection.a(UserProfileRepository.class), factoryOf2.f);
                break;
            case 2:
                BeanDefinition factoryOf3 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf3, "$this$factoryOf");
                factoryOf3.f = CollectionsKt.d0(Reflection.a(LoginRemoteDataSource.class), factoryOf3.f);
                break;
            case 3:
                BeanDefinition singleOf = (BeanDefinition) obj;
                Intrinsics.i(singleOf, "$this$singleOf");
                singleOf.f = CollectionsKt.d0(Reflection.a(DpdpaConsentManager.class), singleOf.f);
                break;
            case 4:
                BeanDefinition singleOf2 = (BeanDefinition) obj;
                Intrinsics.i(singleOf2, "$this$singleOf");
                singleOf2.f = CollectionsKt.d0(Reflection.a(DeepLinkConsentManager.class), singleOf2.f);
                break;
            case 5:
                BeanDefinition singleOf3 = (BeanDefinition) obj;
                Intrinsics.i(singleOf3, "$this$singleOf");
                singleOf3.f = CollectionsKt.d0(Reflection.a(UserProfileDetailsProvider.class), singleOf3.f);
                singleOf3.g = true;
                break;
            case 6:
                BeanDefinition factoryOf4 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf4, "$this$factoryOf");
                factoryOf4.f = CollectionsKt.d0(Reflection.a(AccountSettingsInteractor.class), factoryOf4.f);
                break;
            case 7:
                BeanDefinition singleOf4 = (BeanDefinition) obj;
                Intrinsics.i(singleOf4, "$this$singleOf");
                OptionDSLKt.a(singleOf4, CollectionsKt.S(Reflection.a(PhoneNumberHintHandlerProvider.class), Reflection.a(PhoneNumberHintHandlerSetter.class)));
                break;
            case 8:
                BeanDefinition singleOf5 = (BeanDefinition) obj;
                Intrinsics.i(singleOf5, "$this$singleOf");
                singleOf5.f = CollectionsKt.d0(Reflection.a(FcmTokenFeature.class), singleOf5.f);
                break;
            case 9:
                BeanDefinition singleOf6 = (BeanDefinition) obj;
                Intrinsics.i(singleOf6, "$this$singleOf");
                singleOf6.f = CollectionsKt.d0(Reflection.a(UserProfilingHooksRuleEngine.class), singleOf6.f);
                break;
            case 10:
                Module module = (Module) obj;
                Intrinsics.i(module, "$this$module");
                StringQualifier stringQualifier = new StringQualifier("user_details_datastore.preferences_pb");
                b81 b81Var = new b81(13);
                Kind kind = Kind.Singleton;
                EmptyList emptyList = EmptyList.f17557a;
                ClassReference classReferenceA = Reflection.a(DataStore.class);
                StringQualifier stringQualifier2 = ScopeRegistry.e;
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier2, classReferenceA, stringQualifier, b81Var, kind, emptyList), module), "user_profiling_rule_engine.preferences_pb"), new b81(i2), kind, emptyList), module));
                SharedLoginModule_androidKt$platformLoginModule$lambda$0$$inlined$factoryOf$default$1 sharedLoginModule_androidKt$platformLoginModule$lambda$0$$inlined$factoryOf$default$1 = new SharedLoginModule_androidKt$platformLoginModule$lambda$0$$inlined$factoryOf$default$1();
                Kind kind2 = Kind.Factory;
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier2, Reflection.a(ConvertBitmapImageToByteArrayUseCase.class), null, sharedLoginModule_androidKt$platformLoginModule$lambda$0$$inlined$factoryOf$default$1, kind2, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier2, Reflection.a(SmsBroadcastReceiver.class), null, new SharedLoginModule_androidKt$platformLoginModule$lambda$0$$inlined$factoryOf$default$2(), kind2, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier2, Reflection.a(AndroidSmsAutoReader.class), null, new SharedLoginModule_androidKt$platformLoginModule$lambda$0$$inlined$factoryOf$1(), kind2, emptyList), module)), new c81(11));
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(TelephonyManager.class), null, new b81(15), kind, emptyList), module));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier2, Reflection.a(AndroidCountryPhoneNumberConfigProvider.class), null, new SharedLoginModule_androidKt$platformLoginModule$lambda$0$$inlined$factoryOf$2(), kind2, emptyList), module)), new c81(12));
                break;
            case 11:
                BeanDefinition factoryOf5 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf5, "$this$factoryOf");
                factoryOf5.f = CollectionsKt.d0(Reflection.a(SmsAutoReader.class), factoryOf5.f);
                break;
            case 12:
                BeanDefinition factoryOf6 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf6, "$this$factoryOf");
                factoryOf6.f = CollectionsKt.d0(Reflection.a(UserCountryPhoneNumberConfigProvider.class), factoryOf6.f);
                break;
            case 13:
                Module module2 = (Module) obj;
                Intrinsics.i(module2, "$this$module");
                b81 b81Var2 = new b81(i4);
                Kind kind3 = Kind.Factory;
                EmptyList emptyList2 = EmptyList.f17557a;
                ClassReference classReferenceA2 = Reflection.a(NetworkConfig.class);
                StringQualifier stringQualifier3 = ScopeRegistry.e;
                new KoinDefinition(module2, i71.w(new BeanDefinition(stringQualifier3, classReferenceA2, null, b81Var2, kind3, emptyList2), module2));
                SharedNetworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1 sharedNetworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1 = new SharedNetworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1();
                Kind kind4 = Kind.Singleton;
                OptionDSLKt.c(new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(MockApiLocalOverrideResolver.class), null, sharedNetworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1, kind4, emptyList2), module2)), null);
                new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(ApiSourceState.class), null, new b81(i3), kind4, emptyList2), module2));
                new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(LocalOverrideMockApiRuntimeState.class), null, new b81(18), kind4, emptyList2), module2));
                new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(MockApiRouteVariantState.class), null, new b81(i5), kind4, emptyList2), module2));
                OptionDSLKt.c(new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(MockApiRouteCatalog.class), null, new SharedNetworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$2(), kind4, emptyList2), module2)), null);
                OptionDSLKt.c(new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(ApiSourceAwareRequestDispatcher.class), null, new SharedNetworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$3(), kind4, emptyList2), module2)), null);
                OptionDSLKt.c(new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(NetworkManagerImpl.class), null, new SharedNetworkModuleKt$commonModule$lambda$0$$inlined$singleOf$1(), kind4, emptyList2), module2)), new c81(i2));
                new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(ChaloRestClient.class), i71.n(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(ChaloRestClient.class), i71.n(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(ChaloRestClient.class), new StringQualifier("lowPriority"), new b81(20), kind4, emptyList2), module2), "mediumPriority"), new b81(21), kind4, emptyList2), module2), "highPriority"), new b81(22), kind4, emptyList2), module2));
                OptionDSLKt.c(new KoinDefinition(module2, i71.w(new BeanDefinition(stringQualifier3, Reflection.a(GenericNetworkExceptionMapper.class), null, new SharedNetworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1(), kind3, emptyList2), module2)), null);
                break;
            case 14:
                BeanDefinition singleOf7 = (BeanDefinition) obj;
                Intrinsics.i(singleOf7, "$this$singleOf");
                singleOf7.f = CollectionsKt.d0(Reflection.a(NetworkManager.class), singleOf7.f);
                break;
            case 15:
                Module module3 = (Module) obj;
                Intrinsics.i(module3, "$this$module");
                b81 b81Var3 = new b81(23);
                Kind kind5 = Kind.Factory;
                EmptyList emptyList3 = EmptyList.f17557a;
                ClassReference classReferenceA3 = Reflection.a(SplashOperations.class);
                StringQualifier stringQualifier4 = ScopeRegistry.e;
                new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, classReferenceA3, null, b81Var3, kind5, emptyList3), module3));
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(LanguageSelectionComponent.class), null, new SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1(), kind5, emptyList3), module3)), null);
                new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(SplashScreenComponent.class), null, new b81(24), kind5, emptyList3), module3));
                c81 c81Var = new c81(i4);
                SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$singleOf$1 sharedOnboardingModuleKt$commonModule$lambda$0$$inlined$singleOf$1 = new SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$singleOf$1();
                Kind kind6 = Kind.Singleton;
                OptionDSLKt.c(new KoinDefinition(module3, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(CityProviderImpl.class), null, sharedOnboardingModuleKt$commonModule$lambda$0$$inlined$singleOf$1, kind6, emptyList3), module3)), c81Var);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(UpdateCurrentCityUseCase.class), null, new SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2(), kind5, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(ProcessCityChangeUseCase.class), null, new SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3(), kind5, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(PostCityChangeOperationExecutor.class), null, new SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4(), kind5, emptyList3), module3)), null);
                new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(CityChangeOperationTracker.class), null, new b81(25), kind5, emptyList3), module3));
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(CityLocationSelectionComponent.class), null, new SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5(), kind5, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(CitySelectionUIStateFactory.class), null, new SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6(), kind5, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(CitySelectionComponent.class), null, new SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7(), kind5, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(CityDiscontinuedUIStateFactory.class), null, new SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8(), kind5, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(CityDiscontinuedComponent.class), null, new SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9(), kind5, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(OnboardingBackgroundOperationManagerImpl.class), null, new SharedOnboardingModuleKt$commonModule$lambda$0$$inlined$singleOf$2(), kind6, emptyList3), module3)), new c81(i3));
                break;
            case 16:
                BeanDefinition singleOf8 = (BeanDefinition) obj;
                Intrinsics.i(singleOf8, "$this$singleOf");
                singleOf8.f = CollectionsKt.d0(Reflection.a(CityProvider.class), singleOf8.f);
                singleOf8.g = true;
                break;
            case 17:
                BeanDefinition singleOf9 = (BeanDefinition) obj;
                Intrinsics.i(singleOf9, "$this$singleOf");
                singleOf9.f = CollectionsKt.d0(Reflection.a(OnboardingBackgroundOperationManager.class), singleOf9.f);
                break;
            case 18:
                Module module4 = (Module) obj;
                Intrinsics.i(module4, "$this$module");
                b81 b81Var4 = new b81(26);
                Kind kind7 = Kind.Factory;
                EmptyList emptyList4 = EmptyList.f17557a;
                ClassReference classReferenceA4 = Reflection.a(SplitInstallManager.class);
                StringQualifier stringQualifier5 = ScopeRegistry.e;
                new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, classReferenceA4, null, b81Var4, kind7, emptyList4), module4));
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(AndroidSplitInstallHandler.class), null, new SharedOnboardingModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1(), kind7, emptyList4), module4)), new c81(i5));
                new KoinDefinition(module4, i71.m(new BeanDefinition(stringQualifier5, Reflection.a(DataStore.class), new StringQualifier("app_open_daily_store.preferences_pb"), new b81(27), Kind.Singleton, emptyList4), module4));
                DefinitionBindingKt.a(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(AndroidSplashOrchestrator.class), null, new b81(28), kind7, emptyList4), module4)), Reflection.a(SplashFlowOrchestrator.class));
                break;
            case 19:
                BeanDefinition factoryOf7 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf7, "$this$factoryOf");
                factoryOf7.f = CollectionsKt.d0(Reflection.a(SplitInstallHandler.class), factoryOf7.f);
                break;
            case 20:
                BeanDefinition factoryOf8 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf8, "$this$factoryOf");
                factoryOf8.f = CollectionsKt.d0(Reflection.a(PremiumBusLocalDataSource.class), factoryOf8.f);
                break;
            case 21:
                BeanDefinition factoryOf9 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf9, "$this$factoryOf");
                factoryOf9.f = CollectionsKt.d0(Reflection.a(PremiumBusRemoteDataSource.class), factoryOf9.f);
                break;
            case 22:
                BeanDefinition factoryOf10 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf10, "$this$factoryOf");
                factoryOf10.f = CollectionsKt.d0(Reflection.a(MetroRepository.class), factoryOf10.f);
                break;
            case 23:
                BeanDefinition factoryOf11 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf11, "$this$factoryOf");
                factoryOf11.f = CollectionsKt.d0(Reflection.a(PremiumBusRepository.class), factoryOf11.f);
                break;
            case 24:
                BeanDefinition factoryOf12 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf12, "$this$factoryOf");
                factoryOf12.f = CollectionsKt.d0(Reflection.a(InstantTicketLocalDataSource.class), factoryOf12.f);
                break;
            case 25:
                BeanDefinition factoryOf13 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf13, "$this$factoryOf");
                factoryOf13.f = CollectionsKt.d0(Reflection.a(InstantTicketRemoteDataSource.class), factoryOf13.f);
                break;
            case 26:
                BeanDefinition factoryOf14 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf14, "$this$factoryOf");
                factoryOf14.f = CollectionsKt.d0(Reflection.a(InstantTicketRepository.class), factoryOf14.f);
                break;
            case 27:
                BeanDefinition factoryOf15 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf15, "$this$factoryOf");
                factoryOf15.f = CollectionsKt.d0(Reflection.a(ProductBookingHelper.class), factoryOf15.f);
                break;
            case 28:
                BeanDefinition factoryOf16 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf16, "$this$factoryOf");
                factoryOf16.f = CollectionsKt.d0(Reflection.a(MetroRemoteDataSource.class), factoryOf16.f);
                break;
            default:
                BeanDefinition factoryOf17 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf17, "$this$factoryOf");
                factoryOf17.f = CollectionsKt.d0(Reflection.a(MetroLocalDataSource.class), factoryOf17.f);
                break;
        }
        return unit;
    }
}
