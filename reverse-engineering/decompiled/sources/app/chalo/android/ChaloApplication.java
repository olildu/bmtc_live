package app.chalo.android;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.work.Configuration;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.core.init.ApplicationInitManager;
import app.chalo.di.SharedBaseModuleKt;
import app.chalo.home.di.SharedHomeModuleKt;
import app.chalo.productbooking.di.SharedProductBookingModuleKt;
import app.chalo.providers.lottieassetprovider.ActiveLottieType;
import app.chalo.providers.lottieassetprovider.BrandLottieType;
import app.chalo.uistate.color.palette.ActiveChaloColorPalette;
import app.chalo.uistate.color.palette.BrandColorPalette;
import com.freshchat.consumer.sdk.Freshchat;
import defpackage.a81;
import defpackage.c81;
import defpackage.d71;
import defpackage.e81;
import defpackage.h81;
import defpackage.i4;
import defpackage.n4;
import defpackage.n71;
import defpackage.on;
import defpackage.q71;
import defpackage.sf;
import defpackage.t;
import defpackage.v71;
import defpackage.z21;
import defpackage.z71;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.error.KoinApplicationAlreadyStartedException;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.EmptyLogger;
import org.koin.core.logger.Level;
import org.koin.core.module.Module;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/android/ChaloApplication;", "Landroid/app/Application;", "Lorg/koin/core/component/KoinComponent;", "Landroidx/work/Configuration$Provider;", "<init>", "()V", "androidApp_bmtcPrimaryRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ChaloApplication extends Application implements KoinComponent, Configuration.Provider {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f900a = LazyKt.b(new i4(this, 21));
    public final Object b;
    public final Object c;
    public final Lazy d;

    public ChaloApplication() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.b = LazyKt.a(lazyThreadSafetyMode, new Function0<ApplicationInitManager>() { // from class: app.chalo.android.ChaloApplication$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f901a).d(Reflection.a(ApplicationInitManager.class), null, null);
            }
        });
        this.c = LazyKt.a(lazyThreadSafetyMode, new Function0<SdkIntegrationPolicyManager>() { // from class: app.chalo.android.ChaloApplication$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f902a).d(Reflection.a(SdkIntegrationPolicyManager.class), null, null);
            }
        });
        this.d = LazyKt.b(new sf(14));
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    @Override // androidx.work.Configuration.Provider
    public final Configuration getWorkManagerConfiguration() {
        Configuration configurationBuild = new Configuration.Builder().setMinimumLoggingLevel(4).build();
        Intrinsics.h(configurationBuild, "build(...)");
        return configurationBuild;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.app.Application
    public final void onCreate() {
        KoinApplication koinApplication;
        super.onCreate();
        AppCompatDelegate.setDefaultNightMode(1);
        AndroidDependencyFactory platformDependencyFactory = (AndroidDependencyFactory) this.f900a.getValue();
        Module selectedBrandModule = SelectedBrandKt.f942a;
        Intrinsics.i(platformDependencyFactory, "platformDependencyFactory");
        Intrinsics.i(selectedBrandModule, "selectedBrandModule");
        Module module = new Module();
        z21 z21Var = new z21(platformDependencyFactory, 29);
        Module module2 = new Module();
        z21Var.invoke(module2);
        int i = 16;
        q71 q71Var = new q71(i);
        Module module3 = new Module();
        q71Var.invoke(module3);
        CollectionsKt.k(module.e, new Module[]{module2, module3});
        Module module4 = new Module();
        int i2 = 13;
        c81 c81Var = new c81(i2);
        Module module5 = new Module();
        c81Var.invoke(module5);
        t tVar = new t(22);
        Module module6 = new Module();
        tVar.invoke(module6);
        CollectionsKt.k(module4.e, new Module[]{module5, module6});
        Module module7 = new Module();
        Module module8 = new Module();
        SharedBaseModuleKt.a(module8);
        int i3 = 25;
        n71 n71Var = new n71(i3);
        Module module9 = new Module();
        n71Var.invoke(module9);
        CollectionsKt.k(module7.e, new Module[]{module8, module9});
        Module module10 = new Module();
        a81 a81Var = new a81(23);
        Module module11 = new Module();
        a81Var.invoke(module11);
        c81 c81Var2 = new c81(10);
        Module module12 = new Module();
        c81Var2.invoke(module12);
        CollectionsKt.k(module10.e, new Module[]{module11, module12});
        Module module13 = new Module();
        c81 c81Var3 = new c81(15);
        Module module14 = new Module();
        c81Var3.invoke(module14);
        c81 c81Var4 = new c81(18);
        Module module15 = new Module();
        c81Var4.invoke(module15);
        CollectionsKt.k(module13.e, new Module[]{module14, module15});
        Module module16 = new Module();
        d71 d71Var = new d71(8);
        Module module17 = new Module();
        d71Var.invoke(module17);
        int i4 = 9;
        d71 d71Var2 = new d71(i4);
        Module module18 = new Module();
        d71Var2.invoke(module18);
        CollectionsKt.k(module16.e, new Module[]{module17, module18});
        e81 e81Var = new e81(i3);
        Module module19 = new Module();
        e81Var.invoke(module19);
        Module module20 = new Module();
        e81 e81Var2 = new e81(i4);
        Module module21 = new Module();
        e81Var2.invoke(module21);
        e81 e81Var3 = new e81(i2);
        Module module22 = new Module();
        e81Var3.invoke(module22);
        CollectionsKt.k(module20.e, new Module[]{module21, module22});
        Module module23 = new Module();
        h81 h81Var = new h81(2);
        Module module24 = new Module();
        h81Var.invoke(module24);
        h81 h81Var2 = new h81(i);
        Module module25 = new Module();
        h81Var2.invoke(module25);
        CollectionsKt.k(module23.e, new Module[]{module24, module25});
        Module module26 = new Module();
        h81 h81Var3 = new h81(17);
        Module module27 = new Module();
        h81Var3.invoke(module27);
        CollectionsKt.k(module26.e, new Module[]{module27, new Module()});
        Module module28 = new Module();
        on onVar = new on(18);
        Module module29 = new Module();
        onVar.invoke(module29);
        on onVar2 = new on(27);
        Module module30 = new Module();
        onVar2.invoke(module30);
        CollectionsKt.k(module28.e, new Module[]{module29, module30});
        Module module31 = new Module();
        a81 a81Var2 = new a81(4);
        Module module32 = new Module();
        a81Var2.invoke(module32);
        a81 a81Var3 = new a81(22);
        Module module33 = new Module();
        a81Var3.invoke(module33);
        CollectionsKt.k(module31.e, new Module[]{module32, module33});
        Module module34 = new Module();
        Module module35 = new Module();
        SharedHomeModuleKt.a(module35);
        z71 z71Var = new z71(28);
        Module module36 = new Module();
        z71Var.invoke(module36);
        CollectionsKt.k(module34.e, new Module[]{module35, module36});
        Module module37 = new Module();
        a81 a81Var4 = new a81(1);
        Module module38 = new Module();
        a81Var4.invoke(module38);
        CollectionsKt.k(module37.e, new Module[]{module38});
        Module module39 = new Module();
        q71 q71Var2 = new q71(18);
        Module module40 = new Module();
        q71Var2.invoke(module40);
        v71 v71Var = new v71(12);
        Module module41 = new Module();
        v71Var.invoke(module41);
        CollectionsKt.k(module39.e, new Module[]{module40, module41});
        Module module42 = new Module();
        Module module43 = new Module();
        SharedProductBookingModuleKt.c(module43);
        e81 e81Var4 = new e81(8);
        Module module44 = new Module();
        e81Var4.invoke(module44);
        CollectionsKt.k(module42.e, new Module[]{module43, module44});
        q71 q71Var3 = new q71(8);
        Module module45 = new Module();
        q71Var3.invoke(module45);
        Module module46 = new Module();
        e81 e81Var5 = new e81(17);
        Module module47 = new Module();
        e81Var5.invoke(module47);
        e81 e81Var6 = new e81(23);
        Module module48 = new Module();
        e81Var6.invoke(module48);
        CollectionsKt.k(module46.e, new Module[]{module47, module48});
        List listS = CollectionsKt.S(module, module4, module7, module10, module13, module16, module19, module20, module23, module26, module28, module31, module34, module37, module39, module42, module45, module46);
        List listR = CollectionsKt.R(selectedBrandModule);
        synchronized (GlobalContext.f18817a) {
            koinApplication = new KoinApplication();
            if (GlobalContext.b != null) {
                throw new KoinApplicationAlreadyStartedException("A Koin Application has already been started");
            }
            Koin koin = koinApplication.f18816a;
            GlobalContext.b = koin;
            EmptyLogger emptyLogger = koin.f18815a;
            Level level = Level.INFO;
            if (emptyLogger.f18823a.compareTo(level) <= 0) {
                EmptyLogger emptyLogger2 = koin.f18815a;
                emptyLogger2.getClass();
                emptyLogger2.c(level, "[init] declare Android Context");
            }
            Module module49 = new Module();
            SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(ScopeRegistry.e, Reflection.a(Application.class), null, new n4(this, 24), Kind.Singleton, EmptyList.f17557a));
            module49.a(singleInstanceFactory);
            DefinitionBindingKt.a(new KoinDefinition(module49, singleInstanceFactory), Reflection.a(Context.class));
            koin.d(CollectionsKt.R(module49), true);
            koinApplication.a(CollectionsKt.c0(listR, listS));
            koinApplication.f18816a.b();
        }
        ActiveChaloColorPalette.f9930a = (BrandColorPalette) koinApplication.f18816a.c.d.b(Reflection.a(BrandColorPalette.class));
        ActiveLottieType.f8861a = (BrandLottieType) koinApplication.f18816a.c.d.d(Reflection.a(BrandLottieType.class), null, null);
        ((ApplicationInitManager) this.b.getValue()).b();
        SdkIntegrationPolicyManager sdkIntegrationPolicyManager = (SdkIntegrationPolicyManager) this.c.getValue();
        Intrinsics.i(sdkIntegrationPolicyManager, "sdkIntegrationPolicyManager");
        if (sdkIntegrationPolicyManager.f1078a.d) {
            LocalBroadcastManager.getInstance(this).registerReceiver((BroadcastReceiver) this.d.getValue(), new IntentFilter(Freshchat.FRESHCHAT_USER_RESTORE_ID_GENERATED));
        }
    }

    @Override // android.app.Application
    public final void onTerminate() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver((BroadcastReceiver) this.d.getValue());
        super.onTerminate();
    }
}
